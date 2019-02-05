package org.mobiletoolkit.android.extensions.android.content.sharedpreferences.delegates.internal

import org.mobiletoolkit.android.extensions.android.content.sharedpreferences.delegates.SharedPreferencesProvider
import org.mobiletoolkit.android.extensions.android.content.sharedpreferences.get
import org.mobiletoolkit.android.extensions.android.content.sharedpreferences.set
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * Created by Sebastian Owodzin on 04/02/2019.
 */
internal class BooleanProperty(
    private val key: String?,
    private val defaultValue: Boolean = false
) : ReadWriteProperty<SharedPreferencesProvider, Boolean> {

    override fun getValue(
        thisRef: SharedPreferencesProvider,
        property: KProperty<*>
    ): Boolean {
        val key = key ?: property.name
        return thisRef.sharedPreferences[key, defaultValue]
    }

    override fun setValue(
        thisRef: SharedPreferencesProvider,
        property: KProperty<*>,
        value: Boolean
    ) {
        val key = key ?: property.name
        thisRef.sharedPreferences[key] = value
    }
}

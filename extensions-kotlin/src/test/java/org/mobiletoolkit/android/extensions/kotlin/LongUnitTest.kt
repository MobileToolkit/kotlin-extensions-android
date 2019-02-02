package org.mobiletoolkit.android.extensions.kotlin

import kotlin.test.Test
import kotlin.test.assertEquals

class LongUnitTest {

    @Test
    fun toRanges() {
        assertEquals(
            listOf(
                0L..19L,
                20L..39L,
                40L..44L
            ), 44L.toRanges(20L)
        )

        assertEquals(
            listOf(
                0L..7L,
                8L..15L,
                16L..21L
            ), 21L.toRanges(8L)
        )
    }
}
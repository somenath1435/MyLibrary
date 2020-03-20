package org.somenath1435.mylibrarymodule

public class MathUtils {
    companion object {
        @JvmStatic
        fun add(a: Int, b: Int): Int {
            return a + b
        }

        @JvmStatic
        fun sub(a: Int, b: Int): Int {
            return a - b
        }

        @JvmStatic
        fun mul(a: Int, b: Int): Int {
            return a * b
        }

        @JvmStatic
        fun div(a: Int, b: Int): Int {
            return a / b
        }
    }
}
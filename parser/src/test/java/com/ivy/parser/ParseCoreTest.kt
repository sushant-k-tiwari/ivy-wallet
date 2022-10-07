package com.ivy.parser

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class ParseCoreTest : StringSpec({
    // region char
    listOf(
        'a' to "a",
        'b' to "b",
        'c' to "c"
    ).forEach { (char, text) ->
        "parse '$char' in \"$text\"" {
            val parser = char(char)

            val res = parser(text)

            res shouldBe success(ParseResult(value = char, leftover = ""))
        }
    }

    "parse 'a' in \"ab\" with leftover" {
        val parser = char('a')

        val res = parser("ab")

        res shouldBe success(ParseResult(value = 'a', leftover = "b"))
    }

    listOf(
        'a' to "",
        'b' to "a",
        'c' to "ac"
    ).forEach { (char, text) ->
        "fails to parse '$char' in \"$text\"" {
            val parser = char(char)

            val res = parser(text)

            res shouldBe failure()
        }
    }
    // endregion

    // region String

    // endregion
})
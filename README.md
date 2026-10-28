# Java Basics — Learning Repository

The first Java programs I wrote while learning the language. Each file is a small, self-contained console program built around one idea: a data type, a branch, a loop, a string method, an array.

Everything follows the same shape — a single `public class` with a `main` method, `java.util.Scanner` for input, `System.out.println` for output. All of it was written and run in **BlueJ**.

The sections below group the files by the concept they practise.

## File index

| File | Concept |
|---|---|
| [`grrd11.java`](grrd11.java) | Primitive types, implicit widening, concatenation |
| [`array.java`](array.java) | Scanner scaffolding |
| [`Vote.java`](Vote.java) | `if` / `else` |
| [`EveningEntry.java`](EveningEntry.java) | Modulo, even/odd test |
| [`WeatherSensor.java`](WeatherSensor.java) | `else if` ladder |
| [`Game.java`](Game.java) | Nested conditionals |
| [`leapyear.java`](leapyear.java) | Boolean operators |
| [`SatScore.java`](SatScore.java) | Multi-level branching, validation, `.equals()` |
| [`IfThenElse.java`](IfThenElse.java) | Digit extraction, place-value arithmetic |
| [`forloop.java`](forloop.java) | `while` loop with a flag |
| [`pallendrom.java`](pallendrom.java) | Reversing a number |
| [`ClimateResearch.java`](ClimateResearch.java) | `for` loop, accumulator counters |
| [`NonPalindrome.java`](NonPalindrome.java) | Reverse-counting loop, string building |
| [`Temp.java`](Temp.java) | Parallel arrays, 2D array, nested validation loop |
| [`stringhandlling.java`](stringhandlling.java) | `replaceAll`, `substring` |
| [`stringhandling.java`](stringhandling.java) | `charAt` |
| [`Frequency.java`](Frequency.java) | Word-frequency scaffolding |
| [`one_D_Array.java`](one_D_Array.java) | 1D array declaration |
| [`specialevent.java`](specialevent.java) | 2D array attendance tracker |

---

## 1. Variables, data types and operators

[`grrd11.java`](grrd11.java) is the starting point. A `float` and an `int` are declared, added, and printed.

- **Implicit widening.** `float sum = number1 + number2;` adds a `float` to an `int`. Java promotes the `int` automatically, so no cast is needed and the decimal part survives (`12.5`, not `12`).
- **String concatenation in `println`.** `+` between a string literal and a number converts the number to text. Every output message in this repo is built this way.

The `f` in `5.5f` matters: without it the literal is a `double`, and a `double` can't be assigned to a `float` without an explicit cast.

---

## 2. Taking input with Scanner

Almost every program starts with:

```java
Scanner sc = new Scanner(System.in);
```

[`array.java`](array.java) holds that line and nothing else — import, class, `main`, Scanner. It's the template every other program here was started from.

The three input methods used across the repo:

| Method | Reads | Used in |
|---|---|---|
| `sc.nextInt()` | a whole number | [`Vote.java`](Vote.java), [`leapyear.java`](leapyear.java) |
| `sc.nextDouble()` | a decimal number | [`ClimateResearch.java`](ClimateResearch.java), [`Temp.java`](Temp.java) |
| `sc.nextLine()` | a full line of text | [`NonPalindrome.java`](NonPalindrome.java), [`Frequency.java`](Frequency.java) |

**The `nextInt()` / `nextLine()` trap.** `nextInt()` reads the number but leaves the newline sitting in the input buffer, so the next `nextLine()` returns an empty string instead of waiting for the user. The fix is a throwaway `sc.nextLine()` straight after reading the number — [`SatScore.java`](SatScore.java) line 9, [`Temp.java`](Temp.java) lines 14 and 17. This was the first bug I had to debug rather than read about.

---

## 3. Conditionals

### Two-way branch

[`Vote.java`](Vote.java) reads an age and tests `age >= 18`. The smallest possible `if` / `else`.

[`EveningEntry.java`](EveningEntry.java) is a parking token checker built on the **modulo operator**: `token % 2 == 0` is the even/odd test. Modulo turns out to be the most reusable operator in the repo — it reappears in digit extraction and number reversal below.

### The else-if ladder

[`WeatherSensor.java`](WeatherSensor.java) classifies a temperature as Hot, neutral or Freezing with `if` → `else if` → `else`. Conditions are tested in order and execution stops at the first match, so the final `else` is the catch-all that makes the chain exhaustive.

### Nested conditionals

[`Game.java`](Game.java) compares two dice. The outer `if` handles the draw; its `else` contains a second `if` / `else` that decides the winner. Nesting asks a follow-up question only once the first answer has ruled out the simple case.

[`SatScore.java`](SatScore.java) is the deepest branching here, three levels:

1. **Validate first** — reject anything outside `0`–`1600` before doing further work.
2. **Fast accept** — 1500 or above is accepted outright.
3. **Fall back to subjects** — otherwise ask about Physics HL and Computer Science HL, read both grades, accept only if `CS == 7 && phy == 7`.

It also compares strings with `YorN.equals("Y")`, which is the correct way — see section 7.

### Compound conditions

[`leapyear.java`](leapyear.java) joins tests with `||` (OR). [`IfThenElse.java`](IfThenElse.java) uses `&&` (AND) for a range check: `x > 999 && x < 10000` is how you confirm a number has exactly four digits.

### Arithmetic inside a branch

[`IfThenElse.java`](IfThenElse.java) is the most involved conditional program. Once the PIN passes the four-digit check it:

- **Splits the number into digits** with integer division and modulo together. `(x / 1000) % 10` isolates the thousands digit, `(x / 100) % 10` the hundreds, and so on — integer division discards the remainder, `% 10` keeps only the last digit of what's left.
- **Encrypts each digit** by multiplying by a per-position weight and taking `% 10` so the result stays a single digit.
- **Reassembles the number** by multiplying each encrypted digit back by its place value: `(e1 * 1000) + (e2 * 100) + (e3 * 10) + e4`.

Taking a number apart and putting it back together is the same technique the palindrome program uses, in a different order.

---

## 4. Loops

### `while` — repeat until a condition changes

[`forloop.java`](forloop.java) is a password retry loop. The loop variable doubles as a flag: assigning `i = 4` on success falsifies the `while (i < 3)` condition and exits without a `break`.

[`pallendrom.java`](pallendrom.java) reverses a number, and it's the neatest logic in the repo:

```java
while (num > 0) {
    int remainder = num % 10;   // peel off the last digit
    num = num / 10;             // shrink the number by one digit
    n = (n * 10) + remainder;   // push that digit onto the reversed number
}
```

Each pass takes the last digit off `num` and pushes it onto the front of `n`. The loop terminates on its own because integer division drives `num` to `0`. Turning this into a true palindrome test means saving a copy of the original first, since the loop consumes `num` as it runs.

### `for` — repeat a known number of times

[`ClimateResearch.java`](ClimateResearch.java) reads temperatures for `n` days and classifies each one. The pattern that matters is **counters declared outside the loop**: `ND`, `MH`, `VHD` and `CD` are initialised to `0` before the loop, incremented inside it, printed after it. A variable declared inside the body would be destroyed and recreated on every pass, so the totals would never accumulate. This is the basis of every counting, summing and averaging program.

[`NonPalindrome.java`](NonPalindrome.java) uses a **reverse-counting loop**: `for (int i = word.length() - 1; i >= 0; i--)`. Starting at `length() - 1` and counting down to `0` walks a string backwards. The `- 1` is there because indexes start at `0`.

### Nested loops with validation

[`Temp.java`](Temp.java) runs a `for` loop over seven days with a `while` loop nested inside that re-prompts whenever the minimum entered exceeds the maximum. The `while` only executes when the input is wrong, so valid input passes straight through. Validation nested inside iteration is a shape that shows up constantly in real programs.

---

## 5. String handling

[`stringhandlling.java`](stringhandlling.java) covers two built-in `String` methods:

- `replaceAll("o", "")` replaces every match. Its first argument is a **regular expression**, not a plain string — `replace()` is the literal version.
- `substring(7, 8)` extracts from the start index up to **but not including** the end index. That exclusive upper bound catches everyone once.

Strings in

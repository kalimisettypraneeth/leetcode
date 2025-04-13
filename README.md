# Problem Solving

Welcome to my repository for problem-solving. This repository holds the in-depth analysis with diagrammatic representation of the concepts and approach on how to solve a problem. This repository also contains various tech solutions for LeetCode problems.

* Welcome to the Tutorial on Understanding Problem Solving!!!
* In this tutorial we will start off with what is the need of problem solving and how to think of an approach to achieve it.

### Let's understand what is problem solving!!!!

Assume that you are working on simple math problem which is causing you trouble to get a expected output.

We are not going to discuss on something very complex like calculus or probability now, because we are not trying to build AI system here :(

Let's Assume you have a task to apply your math fundamentals to solve the following ```(1 * 3) + 2 * 3 / 2```

If we take a look at the above expression, what does a typical human do???

* We straight away jump on to solve the problem just by reading from left to right direction
* We think of doing the following the steps
* multiplying `1 * 3` which gives 3 
* adding the result 3(1 * 3) to 2 which gives `5`
* multiplying the next result 5 with 3 which gives `15`
* divide the previous step result with 2 which is `7` (rounded-off to the integer)

#### Hurray !!! you solved the problem

## But wait, the solution is wrong, the result for `(1 * 3) + 2 * 3 / 2` is `6`

### Sit Back, Relax and think where did you go wrong !!
As we all studied in our schools that solving a math expression is not just `+, -, *, /` but also involves in applying the necessary rules.

### 🧮 Expression Evaluation Example

Given the expression:

We solve it using the **order of operations**, commonly remembered as:

- **PEMDAS** (used in the US)
    - **P** → Parentheses
    - **E** → Exponents
    - **MD** → Multiplication & Division (left to right)
    - **AS** → Addition & Subtraction (left to right)

Or:

- **BODMAS** (used in other regions)
    - **B** → Brackets
    - **O** → Orders (powers, roots)
    - **DM** → Division & Multiplication (left to right)
    - **AS** → Addition & Subtraction (left to right)

---

### 📝 Step-by-Step Solution

### 1. Parentheses
Solve the expression inside the parentheses first:

`(1 * 3) = 3`

#### New expression becomes:

`3 + 2 * 3 / 2`

---

### 2. Multiplication and Division (from left to right)

`2 * 3 = 6 `

`6 / 2 = 3`

#### New expression:

`3 + 3`

---

### 3. Addition

`3 + 3 = 6`

---

## ✅ Final Answer

## `6`

---

Similarly, any real-world application or usecase follows some rules to solve with most optimized approaches.

This repository helps you to understand and solve some general coding problems and how to implement better optimal solutions which gives the fault-free results.
# Clean Code Chapter 3

# Clean Code Chapter 3

Based on [Clean Code Chapter 3](https://learning.oreilly.com/library/view/clean-code-a/9780136083238/chapter03.xhtml)

## Introduction

How to make functions easy to read and understand? How can we make a function communicate its intent?

## Small

First rule of functions is that they should be small. It should fit in the screen! With a nice big monitor, about 150 characters on a line and a 100 lines.
Functions should ahrdly ever be 20 lines long.

## Blocks and Indenting

Functions small, that if, else, while statments and so on should be one line long. This implies that functions should not be large enough to hold nested structures.

## Do One Thing

Functions should do one thing. They should do it well, and do it only. That is a function.

## One Level of Abstraction per Function

Functions need to do one thing. So what is inside the function should have the same level of abstraction.

### The Stepdown Rule

So Write functions inside functions as the next level of abstraction.

## Switch Statements

```
public Money calculatePay(Employee e)

throws InvalidEmployeeType {
  switch (e.type) {
    case COMMISSIONED:
      return calculateCommissionedPay(e);

    case HOURLY:
      return calculateHourlyPay(e);

    case SALARIED:
      return calculateSalariedPay(e);

    default:
      throw new InvalidEmployeeType(e.type);
  }
}
```

Several problems in this funtion

1. It's too large, and grows when new employee are added.
2. Does more than one thing
3. Violate Single Responsibility Principle (SRP)
4. Violates Open Closed Principle (OCP)
   and so on...

So the Solution? Bury the switch statement in the basement of an abstract factory. Author actually thinks that switch should not appear, should be hidden behind an inheritance relationship so the system can't see them.

## Descriptive Names

Long descriptive name is better than short enigmatic name. Naminv convention helps, and spend time choosing name.

## Function Arguments

The less, the better. Ideal number of arguments for function is 0. Then 1, 2, and three should be avoided.
Arguments take a lot of conceptual power, and makes it harder to test.

### Common Monadic Forms

Mainly 2 reasons passing a single argumnet into function.
Asking a question about an argument, or operating on the argument, transforming it to something else and returning it.
Avoid using an output argument instead of a return value for transformation.

### Flag Arguments

They are ugly. It's terrible, only making the method complicated

### Dyadic Functions

Functions with two arguments, make it monadic function if possible.
`writeField(name)` is better to understand `writeField(outputStream, name)`. Of course they are cases like `Point p = new Point(0, 0)`, these are cases where arguments are ordered components of a single value.

### Triads

Just don't do it, use less arguments as possible. It's harder to understand.

### Argument Objects

Trying to use less agruments, sometimes you might use objects as arguments. Try it, it's worth it.

### Argument Lists

If variable arguments are identically treated, use a List! `String.format` function is actually dyadic.

```
public String format(String format, Object... args)
```

### Verbs and Keywords

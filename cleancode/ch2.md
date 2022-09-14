# Clean Code Chapter 2

Based on [Clean Code Chapter 2](https://learning.oreilly.com/library/view/clean-code-a/9780136083238/chapter02.xhtml#ch2lev1sec3)

## Introduction

We Name many things in software, such as variables, functions, arguments, so on. Because we do so much, we need some simple rules for creating good names
Make & Use

- Intenion-Revealing
- Pronounceable
- Searchable
- Solution Domain (CS terms, ...)
- Problem Domain

Names.

Avoid

- Disinformation
- Encodings
- Mental Mapping

And

- Make Meaningful Distinctions
- Make Meaningful Context
- Pick One Word per Concept

while do not

- use cute words
- pun
- Gratuitous Context

## Intetnion-Revealing Names

Names should reveal intent. Choosing good names takes time, but saves more later on so take care of names

```
  // name d reveals nothing here, where it was meant to be elapsed time in days
  int d;

  // Use something like
  int elpasedTimeInDays;
  int daysSinceCreation;
  ...
```

Choosing names that reveal intent makes it much easier & change the code.

## Avoid Disinformation

We should aboid leaving false clues that obscure the meaning of code. For example, `hp, aix` are poor names, they are names of Unix platforms or variants.

Simliarly, do not just refer specific data types care. The word list in `accoutnList` means something specific to programmers, If the container there is not list it leads to false conclusions. Just `accounts` would be better.

Also, beware using names that vary in small ways, such as `XYZControllerForEfficientHandlingOfStrings` and `XYZControllerForEfficientStorageOfStrings`. Now hotkey combination is ready with a list of possible completions, likely to select carelessly.

Another disinformative names would be using lower-case 'L' and upper-case 'O' as variable names, they look lik constants one and zero.

## Make Meaningful Distinctions

We often just name when we code solely just for the code to compile. For example, `class` exists so we use `klass`. Or meaningless number-series naming `(a1, a2, ..., an)`. These are Noninformative, No clue to author's intention!!

## Pronounceable Names

You can't discuss a variable with a name like `genymdhms(gerenation date, year, month, day, hour, minute, second)`. Variables like this make us spend time explaining it to new devvlopers what it is.

## Searchable Names

Single-letter names, numeric constants are hard to locate. Use seomthing like `MAX_CLASSES_PER_STUDENT`, easy to grep. Author's personal preference is that Single-letter names can ONLY be used a slocal variables inside short methods, such as for loops.

## Avoid Encodings

We already have enough encodings to deal with, following are the methods that were used are used now.

### Hungarian Notation

Convention where the name indicates intention or kind, and some types its type. Nowdays, it makes it harder to read the code.

### Member Prefixes

Don't use `_` anymore. Classes, functions should be small enough that you don't need them. Afterall, we get to ignore the prefix to see the meaningful part of the name, it's now an unseen clutter and marker of older codes.

### Interfaces and Implementations

Some special cases for encodings. For example, an abstract factory is needed as a interface and will be implemented by a concrete class. Simply Call the implemntation `ShapeFactoryImp` and the interface `ShapeFactory`.

## Avoid Mental Mapping

Other people who read your code should't have to mentally translate names into others they already know. Loop counter `i`, `j`, `k` were traditional used if scope is small and no conflicts exist. However, in other contexts single-letter is a very poor choice.

## Class Names, Method Names

Class & Objects should be somewhat like noun, noun phfrase like `Account`, `Customer`. Avoid word like `Manager`, `Data`, it should not be a verb.

On the other hand, methods should have verb, verb phrase names like `postPayment`, `deletePage`.

Predicates, mutators should be named according to javabean standard.

## Don't be Cute

Don't use slangs, colloquialisms like `whack` instead of `kill`.

## Pick One Word per Concept

It's confusing to have `fetch`, `retrieve`, `get` as equivalent methods of different classes. You can't remember which method names goes with which class. Otherwise, you would have to spend lot of time browsing through headers, code samples.

## Don't Pun

Extended from 'Pick One Word per Concept'. For example, you used `add` as a method in many classes, semantically equivalent. But, someone might use `add` not in the same sense as he/she consistently did. It would better to used some other name, for another purpose.

## Use Solution Domain Names

Programmer read your code. Use Computer Science Terms, algorithm, math and so on like `JobQueue`.

## Use Problem Domain Names

If non-programmer is reading your code, use names from problem domain. Programmer can then ask domain expert what it means

## Add Meaningful Context

For example, you're working on an address. It would be good to name it `addrState`, `addrCity`. Even better to make a class `Address`, where compilter knows the context.

## Don't Add Gratuitous Context

An application names "Gas Station Deluxe". Bad idea to add prefix `GSD` to every class, while you can just add G and make the IDE bring a list of classes in the system.
Shoter Names are better, as long as they are clear enough.

## Finally

Choosing Good names is hard, requiring good descriptive skills and a shared background. This is more of a teaching issue, where many people don't learn to do it very well.

Change names for better understanding, we don't really memorize the names of all the classes and methods. Use modern tools to deal with details!

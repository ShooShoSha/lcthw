# Lesson 1
So you've compiled a Java program, but nothing else happened. We didn't even execute (start, run) the application so it effectively transformed from a .java file into a .class file. What do these things mean?
// TODO explain a lot of things here

## Breaking HelloWorld.java down
Let's examine that HelloWorld.java file (copied here for ease of access):

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
The first line `public class HelloWorld {` has _a lot_ going on for a "simple" statement (logical line of code).

First we have the keyword `public`. Keywords are reserved words for a language that **cannot** be used in code (though there are exceptions, but more on that later). This _particular_ keyword defines what has access and it says that **everyone** is allowed to see this particular member (element of code). Another common access modifier (group of keywords that define access) is `private` (there are more, but let's focust on these for now).

Next, is another keyword `class`. Classes are what _define_ our code into discrete logical blocks. They also define the properties and abilities of **objects**. Objects, put simply, are the manifestations of classes and are used to describe how programmers solve problems. This all falls under a certain type of problem-solving and perspective called the object-oriented paradigm.

Then, we have our first **identifier** (which is a fancy word for a label or name of something in languages) `HelloWorld`. In this case, we are identifying our class with the name "HelloWorld".

Finally, we have an opening [curl bracket](https://en.wikipedia.org/wiki/Bracket) (sometimes called curly braces and on one occassion I've heard called a "moustache"). Lines of code (a.k.a. statements) are grouped together into logical sections called **blocks** between matching curly braces (an opening curly brace `{` matches only with one closing curly brace `}`).

From a larger perspective (and a little bit of formatting), we can see each of the braces match another:

```java
public class HelloWorld
{ // <- opening curly brace for a class called "HelloWorld"
    public static void main(String[] args)
    { // <- opening curly brace for this method called "main"
        System.out.println("Hello, World!");
    } // <- closing curly brace for "main" method
} // <- closing curly brace for class "HelloWorld"
```

### A comment about comments
In the reprinting of `HelloWorld` with aligned curly braces, we introduced these statements beginning with two forward slashes `//`. This is called a **line comment**. Essentially, these are lines that the compiler ignores and allows programmers (like you) to jot notes about what's happening, why you typed this statement, or really anything! Basically, when the compiler sees these slashes, it will ignore the _rest of the line_ (but not up to it from the current line).

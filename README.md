# NullPointerException in Java

This repository demonstrates a common programming error in Java: the NullPointerException.

The `bug.java` file contains code that leads to a NullPointerException. The `bugSolution.java` file shows how to fix this error.

## How to reproduce

1. Clone this repository.
2. Compile and run `bug.java`.
3. Observe the NullPointerException.

## Solution

The solution is to add a null check to prevent accessing members of a null object.  The corrected code is in `bugSolution.java`.
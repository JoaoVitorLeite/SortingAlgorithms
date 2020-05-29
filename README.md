# Sorting Algorithms

### Description

Implementation of classic sorting algorithms in Scala.

### About

Implementation of classic sorting algorithms that supports sorting using List of Int, Float, Double, Long and String (for String sorting is done in alphabetical order).

### Project Structure

```bash
src
|
+---.gitignore
|   build.sbt
|   LICENSE
|   README.md
|   tree.txt
|   
|                               
+---src
|   +---main
|   |   \---scala
|   |       \---sorting
|   |               Sort.scala
|   |               
|   \---test
|       \---scala
|           \---sorting
|                   SortingSuite.scala
|                   

```

### Compile

To compile the files it is necessary to be in the root directory(where 
the `build.sbt` file is), the use the `sbt compile` command. There were 45 tests performed.

### Test

To perform the tests it is necessary to be in the root 
directory(where the `build.sbt` file is), then use the `sbt test` 
command. The tests used FunSuite and assert's.

### IDE

The IDE used was [Intellij Idea](https://www.jetbrains.com/idea/).

### References

* [Link](https://en.wikipedia.org/wiki/Insertion_sort)
* [Link](https://en.wikipedia.org/wiki/Selection_algorithm)
* [Link](https://en.wikipedia.org/wiki/Merge_sort)
* [Link](https://en.wikipedia.org/wiki/Bubble_sort)
* [Link](https://en.wikipedia.org/wiki/Quicksort)

### License

The LICENSE used is [Apache-2.0](https://github.com/JoaoVitorLeite/SortingAlgorithms/blob/master/LICENSE).

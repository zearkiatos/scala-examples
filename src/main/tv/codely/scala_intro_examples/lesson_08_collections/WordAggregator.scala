package tv.codely.scala_intro_examples.lesson_08_collections

import scala.collection.immutable

final class WordAggregator {
  // @ToDo: Here you have your exercise!
  // @see tv.codely.scala_intro_examples.lesson_08_collections.WordAggregatorSpec
  def aggregateWords(text: String): Map[String, Int] = {
    if(text.isEmpty)
      Map.empty
    else
      text.trim.toLowerCase.split(" ")
        .groupBy(identity)
        .mapValues(_.length)
  }

  aggregateWords("Hi hi hi all")
}

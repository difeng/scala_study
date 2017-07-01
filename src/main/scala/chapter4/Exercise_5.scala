package chapter4

import java.io.File
import java.util.Scanner
import scala.collection.mutable
/**
  * Created by difeng on 2017/6/30.
  * 重复Exercise_2,这次使用java.util.TreeMap并使之适用于Scala Api
  */
object Exercise_5 {
  def main(args: Array[String]): Unit = {
    val in = new Scanner(new File("src/main/scala/chapter4/myfile.txt"))
    val countMap: mutable.TreeMap[String,Int] = new mutable.TreeMap[String,Int]()
    while (in.hasNext()) {
      val word = in.next()
      countMap(word) = countMap.getOrElse(word,0) + 1
    }
    countMap.foreach(println)
  }
}

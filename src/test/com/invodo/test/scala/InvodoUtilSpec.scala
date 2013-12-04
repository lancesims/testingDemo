package com.invodo.test.scala

/**
 * Created with IntelliJ IDEA.
 * User: lsims
 * Date: 11/26/13
 * Time: 1:46 PM
 * To change this template use File | Settings | File Templates.
 */

import org.scalatest.{FlatSpec, Matchers}
import org.scalatest._
import com.invodo.util.InvodoUtil

class InvodoUtilSpec extends FlatSpec with Matchers {

  //natural language specifications help describe what software should do in human language
  //natural language specs also help explain what software should be doing for better than code comments
  "The InvodoUtil reverseMe method" should "reverse a string" in {
    val iUtil = new InvodoUtil()
    iUtil.reverseMe("hello world") should be ("dlrow olleh")
    iUtil.reverseMe("hi there") should not be("hello world")
  }

  "The InvodoUtil removeWhitspace method" should "remove whitespace from a string" in {
    val iUtil = new InvodoUtil()
    iUtil.removeWhitespace(" h e l l o") should be ("hello")
  }


  "The InvodoUtil sum method" should "sum the values passed in an array" in {
    val iUtil = new InvodoUtil()
    iUtil.sum(Array(1,2,3)) should be (6)
    iUtil.sum(Array(10, 10, 32)) should not be(45)
  }

  //use this to talk about how designing this test helped realize that it shouldn't just check for hyphens
  "the InvodoUtil generateUUID method" should "return a UUID that does not contain any hyphens" in {
    val iUtil = new InvodoUtil()
    val uuid = iUtil.generateUUID()
    uuid should not contain("-")
    uuid.length should be(32)

    //comment
    val spcPattern = "^[a-zA-Z0-9]*$".r
    spcPattern.findFirstMatchIn(uuid) should not be(None)
  }
}

package com.invodo.util

import scala.util.matching.Regex
import java.util.Date

/**
 * Created with IntelliJ IDEA.
 * User: lsims
 * Date: 11/26/13
 * Time: 11:54 AM
 * To change this template use File | Settings | File Templates.
 */
class InvodoUtil {
  def reverseMe(str: String): String = {
    var result:String = ""
    if(str != null && !str.isEmpty()) str.reverse else ""
  }

  def removeWhitespace(str:String): String = {
    val pattern = "\\s".r
    //pattern.replaceFirstIn(str, "")
    pattern.replaceAllIn(str,"")
  }

  def sum(vals: Array[Int]):Int = {
    try{
      vals.foldLeft(0)((r,c) => r + c)
    }
    catch {
      case e: NumberFormatException =>
        println("bad database stuff happened")
        0
    }
  }

  def generateUUID():String = {
    val UUID = java.util.UUID.randomUUID()
    val regex = "-".r
    //regex.replaceAllIn(UUID.toString("_")
    //regex.replaceAllIn(UUID.toString(), "") + new Date().getTime()
    regex.replaceAllIn(UUID.toString,"")
  }
}

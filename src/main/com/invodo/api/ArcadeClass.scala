package com.invodo.api

import com.invodo.util.InvodoUtil

/**
 * Created with IntelliJ IDEA.
 * User: lsims
 * Date: 12/3/13
 * Time: 11:57 AM
 * To change this template use File | Settings | File Templates.
 */
class ArcadeClass {
  def doRegistration(clientId:String, importantParam:String):String = {
    val iUtil = new InvodoUtil()
    val scrubbedParam = iUtil.removeWhitespace(importantParam);
    //processing to make registration using whitespace
    "some string result"
  }

  def otherThing():String = {
    "cool"
  }
}

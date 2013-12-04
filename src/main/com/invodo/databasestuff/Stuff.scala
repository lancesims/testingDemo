package com.invodo.databasestuff

import com.invodo.util.InvodoUtil

/**
 * Created with IntelliJ IDEA.
 * User: lsims
 * Date: 12/3/13
 * Time: 11:45 AM
 * To change this template use File | Settings | File Templates.
 */
class Stuff {
  def doStuff(foo:String):String = {
    val iUtil = new InvodoUtil()
    val foo = iUtil.generateUUID()
      //insert a record that uses the uuid
      "some string result"
  }

  def doSomeOtherStuff(vals:Array[Int]):Unit = {
    val iUtil = new InvodoUtil()
    val sum = iUtil.sum(vals)

    //do lots of processing and use the sum

    //insert a database record with a uuid
    val uuid = iUtil.generateUUID()
  }
}

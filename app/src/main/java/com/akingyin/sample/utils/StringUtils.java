package com.akingyin.sample.utils;

/**
 * @author king
 * @version V1.0
 * @ Description:
 * @ Date 2018/3/15 18:00
 */

public class StringUtils {

  public   static  String   isEmpty(String   str){
    if(null == str || str.length() == 0){
      return "";
    }
    return  str;
  }
}

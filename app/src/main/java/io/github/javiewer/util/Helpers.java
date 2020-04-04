package io.github.javiewer.util;

public class Helpers {
  public static String stringNullOrElse(String a, String b) {
    if (a != "") {
      return a;
    }
    return b;
  }
}
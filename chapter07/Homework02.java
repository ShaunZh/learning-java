/*
 * @Description: 
 * @Author: Hexon
 * @Date: 2021-12-14 23:04:12
 * @LastEditors: Hexon
 * @LastEditTime: 2021-12-15 00:02:07
 */

public class Homework02 {
  public static void main(String[] args) {
    String[] arr = { "abc", "12", "ada2ew", "12asf24" };
    A02 a02 = new A02();
    int index = a02.find(arr, "ada2ew");
    System.out.println(index < -1 ? "未找到字符串" : ("字符串位置: " + index));
  }
}

class A02 {
  public int find(String[] arr, String str) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].equals(str)) {
        return i;
      }
    }
    return -1;
  }
}

public class Homework04 {
  public static void main(String[] args) {
    A04 a04 = new A04();
    int[] arr = { 12, 3, 42, 55, 6, 1, 'a' };
    int[] newArr = a04.copyArr(arr);
    for (int i = 0; i < newArr.length; i++) {
      if (newArr[i] != arr[i]) {
        System.out.println("不相等");
      }
    }
    System.out.println("相等");
  }

}
/*
 * @Description: 数组的复制
 * 
 * @Author: Hexon
 * 
 * @Date: 2021-12-15 22:59:01
 * 
 * @LastEditors: Hexon
 * 
 * @LastEditTime: 2021-12-15 23:02:30
 */

class A04 {
  public int[] copyArr(int[] arr) {
    int[] newArr = new int[arr.length];
    int i = 0;

    while (i < arr.length) {
      newArr[i] = arr[i];
      i++;
    }
    return newArr;
  }
}

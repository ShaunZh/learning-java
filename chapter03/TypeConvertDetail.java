/*
 * @Description: 
 * @Author: Hexon
 * @Date: 2021-12-01 23:28:49
 * @LastEditors: Hexon
 * @LastEditTime: 2021-12-01 23:52:39
 */

 public class TypeConvertDetail {
   public static void main(String[] args) {
     short s = 12;
     s = s - 9; // error，运算导致类型转换为int

     byte b = 10;
     b = b + 11; // error，
     b = (byte)(b + 11); // 正确强制类型转换

     char c = 'a';
     int i = 16;
     float d = .324F;
     double result = c + i + d; // 正确 运算后会转换为float类型，float赋值给double 没问题
     
     byte b = 16;
     short s = 14;
     short t = s + b; // byte、char和short参与的运算会自动提升为int类型，因此，此处将int 赋值给short 会报错
   }
 }

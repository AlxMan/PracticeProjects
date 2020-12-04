package model3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Model3Practice {

    //1.编程统计字符串"ABCD123!@#$%ab"中大写字母、小写字母、数字、其它字符的个数并打 印出来。
//    public static void chStatistical(String str) {
//        char[] ch = str.toCharArray();
//        int upperCount = 0;
//        int lowerCount = 0;
//        int numCount = 0;
//        int otherCount = 0;
//        for (int i = 0; i < ch.length; i++) {
//            if (ch[i] >= 65 && ch[i] <= 90) {
//                upperCount++;
//            } else if (ch[i] >= 97 && ch[i] <= 122) {
//                lowerCount++;
//            } else if (ch[i] >= 48 && ch[i] <= 57) {
//                numCount++;
//            } else {
//                otherCount++;
//            }
//        }
//        System.out.println("大写字母有:" + upperCount + "个");
//        System.out.println("小写字母有:" + lowerCount + "个");
//        System.out.println("数字有:" + numCount + "个");
//        System.out.println("其他字符有:" + otherCount + "个");
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入任意字符,将返回字符个数:");
//        String str = sc.nextLine();
//        chStatistical(str);
//    }
    //2.编程获取两个指定字符串中的最大相同子串。如： s1="asdafghjka", s2="aaasdfg" 他们的最大子串为"asd"将短的那个串进行长度依次递减的子串与较长的串比较。
//    public static void main(String[] args) {
//        String str1 = "asdafghjka";
//        String str2 = "aasdfg";
//        String maxSubString = getLongestSubString(str1, str2);
//        System.out.println(maxSubString);
//    }
//
//    private static String getLongestSubString(String str1, String str2) {
//        //1. 检查字符串是否相等或为空字符串
//        if(str1 == str2) return str1;
//        if(str1 == null || str2 == null || str1.length() == 0 || str2.length() == 0) return "";
//        //2. 找出较短串
//        String longStr = str1.length() >= str2.length() ? str1 : str2;
//        String shortStr = (longStr == str1) ? str2 : str1;
//        //3. 由长到短遍历短串
//        for(int i = 0; i < shortStr.length(); i++) {
//            for(int j = 0, k = shortStr.length() - i; k < shortStr.length() + 1; j++, k++) {
//                String rst = shortStr.substring(j, k);
//                if(longStr.contains(rst)) return rst;
//            }
//        }
//        return "";
//    }
    //3.准备一个 HashMap 集合，统计字符串"123,456,789,123,456"中每个数字字符串出现的次数并打印出来
//    public static void main(String[] args) {
//        String str1 = "123,456,789,123,456";
//        Map<String, Integer> rst = new HashMap<String, Integer>();
//
//        for(String str : str1.split(",")) {
//
//            Integer integer = rst.get(str);
//            rst.put(str, (integer == null ? 0 : integer) + 1);
//        }
//
//        System.out.println(rst);
//
//    }

}

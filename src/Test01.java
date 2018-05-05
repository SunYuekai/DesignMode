/**
 * @author Yuekai.sun
 * @create 2018-04-16 上午11:32
 **/
public class Test01



{


    public static void main(String[] args) {


        String str1 = "中国";
        String str2 = "人";
        String str3 = str1 + str2;
        String str4 = "中国人";
        System.out.println(str4 == str3);
        String str5  = (str1 + str2).intern();
        System.out.println(str5 == str4);


    }
}


import java.util.*;

 public class OTP
{
    static String generateOTP(int len)
    {
        // Using numeric values
        String numbers = "0123456789";

        // Using random method
        Random random_number = new Random();

        char[] otp = new char[len];
        String str = "";

        for (int i = 0; i < len; i++)
        {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
            otp[i] = numbers.charAt(random_number.nextInt(numbers.length()));
            str+= otp[i];
        }
        return str;
    }
    public static boolean otpVerification(String OTP, String genOTP){
        if(OTP.equals(genOTP)) return true;
        return false;
    }
    public static void main(String[] args)
    {
        int length = 6;
        System.out.println(generateOTP(length));
    }
}

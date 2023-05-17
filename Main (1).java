/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Random;
public class Main
{

    public static void main(String[] args) {
        int otpLength = 6; // Length of the OTP
        String generatedOTP = generateOTP(otpLength);
        System.out.println("Generated OTP: " + generatedOTP);
    }
    
    public static String generateOTP(int otpLength) {
        StringBuilder otp = new StringBuilder();
        Random random = new Random();
        
        for (int i = 0; i < otpLength; i++) {
            int digit = random.nextInt(10); // Generate a random digit (0-9)
            otp.append(digit);
        }
        
        return otp.toString();
    }
}

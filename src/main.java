import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int birthday;
        int birthmonth;
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************************************");
        System.out.println("Horoscope Program : ");
        String horoscopes = "1.Capricorn : December 22- January 21\n"
                + "2.Aquarius : January 22 – February 19\n"
                + "3.Pisces : February 20 – March 20\n"
                + "4.Aries : March 21- April 20\n"
                + "5.Taurus : April 21 – May 21\n"
                + "6.Gemini : May 22 – June 22\n"
                + "7.Cancer : June 23 – July 22\n"
                + "8.Leo : July 23 – August 22\n"
                + "9.Virgo : August 23 – September 22\n"
                + "10.Libra : September 23 – October 22\n"
                + "11.Scorpio : October 23 – November 21\n"
                + "12.Sagittarius : November 22 – December 21";
        System.out.println(horoscopes);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Please Enter Your Birth Day : ");
        birthday = scanner.nextInt();
        System.out.print("Please Enter Your Birth Month : ");
        birthmonth = scanner.nextInt();
        if (birthmonth == 12) { 
            if (birthday>=22 && birthday<=31) {
                System.out.println("You are a Capricorn "+birthday+"."+birthmonth);
            }
            else if(birthday<22 && birthday>=1){
                System.out.println("You Are a Sagittarius "+birthday+"."+birthmonth);
            }
            else if(birthday>31 || birthday<1) {
                System.out.println("Unvalid Values for this month");
            }  
        }
        else if (birthmonth == 1) {
            if(birthday>=22&& birthday<=31){
                System.out.println("You Are a Aquarius "+birthday+"."+birthmonth);
            }
            else if (birthday<22 && birthday>=1){
                System.out.println("You Are a Capricorn "+birthday+"."+birthmonth);
            }
            else if(birthday>31 || birthday<1) {
                System.out.println("Unvalid Values for this month");
            }  
            
        }
        else if (birthmonth == 2) {
            if (birthday>=20 && birthday<=29) {
                System.out.println("You Are a Pisces "+birthday+"."+birthmonth);
            }
            else if(birthday<20 && birthday>=1){
                System.out.println("You Are a Aquarius "+birthday+"."+birthmonth);
            }
            else if(birthday>29 || birthday<1) {
                System.out.println("Unvalid Values for this month");
            }  
        }
        else if (birthmonth == 3) {
            if (birthday>=21 && birthday<=31) {
                System.out.println("You Are a Aries "+birthday+"."+birthmonth);
            }
            else if(birthday<21 && birthday>=1){
                System.out.println("You Are a Pisces "+birthday+"."+birthmonth);
            }
            else if(birthday>31 || birthday<1) {
                System.out.println("Unvalid Values for this month");
            }  
        }
        else if (birthmonth == 4) {
            if (birthday>=21 && birthday<=30) {
                System.out.println("You Are a Taurus "+birthday+"."+birthmonth);
            }
            else if(birthday<21 && birthday>=1){
                System.out.println("You Are a Aries "+birthday+"."+birthmonth);
            }
            else if(birthday>30 || birthday<1) {
                System.out.println("Unvalid Values for this month");
            }  
        }
        else if (birthmonth == 5) {
            if (birthday>=22 && birthday<=31) {
                System.out.println("You Are a Gemini "+birthday+"."+birthmonth);
            }
            else if(birthday<22 && birthday>=1){
                System.out.println("You Are a Taurus "+birthday+"."+birthmonth);
            }
            else if(birthday>31 || birthday<1) {
                System.out.println("Unvalid Values for this month");
            }  
        }
        else if (birthmonth == 6) {
            if (birthday>=23 && birthday<30) {
                System.out.println("You Are a Cancer "+birthday+"."+birthmonth);
            }
            else if(birthday<23 && birthday>=1){
                System.out.println("You Are a Gemini "+birthday+"."+birthmonth);
            }
            else if(birthday>30 || birthday<1) {
                System.out.println("Unvalid Values for this month");
            }  
        }
        else if (birthmonth == 7) {
            if (birthday>=23 && birthday<=31) {
                System.out.println("You Are a Leo "+birthday+"."+birthmonth);
            }
            else if(birthday<23 && birthday>=1){
                System.out.println("You Are a Cancer "+birthday+"."+birthmonth);
            }
            else if(birthday>31 || birthday<1) {
                System.out.println("Unvalid Values for this month");
            }  
        }
        else if (birthmonth == 8) {
            if (birthday>=23 && birthday<=31) {
                System.out.println("You Are a Virgo "+birthday+"."+birthmonth);
            }
            else if(birthday<23 && birthday>=1){
                System.out.println("You Are a Leo "+birthday+"."+birthmonth);
            }
            else if(birthday>31 || birthday<1) {
                System.out.println("Unvalid Values for this month");
            }  
        }
        else if (birthmonth == 9) {
            if (birthday>=23 && birthday<=30) {
                System.out.println("You Are a Libra "+birthday+"."+birthmonth);
            }
            else if(birthday<23 && birthday>=1){
                System.out.println("You Are a Virgo "+birthday+"."+birthmonth);
            }
            else if(birthday>30 || birthday<1) {
                System.out.println("Unvalid Values for this month");
            }  
        }
        else if (birthmonth == 10) {
            if (birthday>=23 && birthday<=31) {
                System.out.println("You Are a Scorpio "+birthday+"."+birthmonth);
            }
            else if(birthday<23 && birthday>=1){
                System.out.println("You Are a Libra "+birthday+"."+birthmonth);
            }
            else if(birthday>31 || birthday<1) {
                System.out.println("Unvalid Values for this month");
            }  
        }
        else if (birthmonth == 11) {
            if (birthday>=22 && birthday<=30) {
                System.out.println("You Are a Sagittarius "+birthday+"."+birthmonth);
            }
            else if(birthday<22 && birthday>=1){
                System.out.println("You Are a Scorpio "+birthday+"."+birthmonth);
            }
            else if(birthday>30 || birthday<1) {
                System.out.println("Unvalid Values for this month");
            }  
        }
        else{
            System.out.println("Unvalid BirthMonth");
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Closing The Program...");
        System.out.println("****************************************************");

}
}


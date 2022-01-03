package day18.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        System.out.print("주민번호 : ");
        String jumin = sc.next();

        String ju1 = jumin.substring(0, 6);
        System.out.println("앞자리 : " + ju1);

        String ju2 = jumin.substring(7);
        System.out.println("뒷자리 : " + ju2);

        LocalDateTime localDateTime = LocalDateTime.now(); // 시간
        int nowyear = localDateTime.getYear();
        int age = 0;
        int alyear = 1900;
        String juyear = jumin.substring(0,2);
        int allyear = Integer.parseInt(juyear + alyear);

        age = nowyear - allyear;

        String jumonth = jumin.substring(2,4);
        String judays = jumin.substring(4,6);

        String sexx;
        char sex = jumin.charAt(7);
        if (sex == 1) {
            sexx = "남자";
        } else {
            sexx = "여자";
        }

        System.out.printf("%s년도 %d월 %d일생 %s세 %d", allyear, jumonth, judays, age, sexx);
        */  // 내가 한거


        System.out.print("주민번호: ");
        String ssn = sc.next();
        String[] data = ssn.split("-");
        System.out.println("앞자리: " + data[0]);
        System.out.println("뒷자리: " + data[1]);

        int year = Integer.parseInt(ssn.substring(0, 2));
        int month = Integer.parseInt(ssn.substring(2, 4));
        int day = Integer.parseInt(ssn.substring(4, 6));

        char genderNum = ssn.charAt(7);

        String gender = (genderNum == '1' || genderNum == '3') ? "남자" : "여자";

        int birthYear = (genderNum == '1' || genderNum == '2') ? 1900 + year : 2000 + year;

        int age = LocalDate.now().getYear() - birthYear + 1;

        System.out.printf("%d년도 %d월 %d일생 %d세 %s",
                birthYear, month, day, age, gender);

        sc.close();


    } // main end
} // class end

package com.codegymhueJava;

public class NextDayCalculator {
    public static boolean namNhuan(int year) {
        boolean isLeap = false;
        if (year % 4 == 0)//chia hết cho 4 là năm nhuận
        {
            if (year % 100 == 0)
            //nếu vừa chia hết cho 4 mà vừa chia hết cho 100 thì không phải năm nhuận
            {
                if (year % 400 == 0)//chia hết cho 400 là năm nhuận
                    isLeap = true;
                else
                    isLeap = false;//không chia hết cho 400 thì không phải năm nhuận
            } else//chia hết cho 4 nhưng không chia hết cho 100 là năm nhuận
                isLeap = true;
        } else {
            isLeap = false;
        }
        return isLeap;
    }

    public static int ngaytrongthang(int month, int year) {
        int day = 0;
        if(month < 1 || month > 12) {
            System.out.println("orror: please enter month try again!!");
        }else {
            switch(month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                {
                    day = 31;
                    break;
                }
                case 4:
                case 6:
                case 9:
                case 11:
                {
                    day = 30;
                    break;
                }
                case 2:
                    if(namNhuan(year) == true){
                        day = 29;
                        break;
                    }else {
                        day = 28;
                        break;
                    }


            }
        }
        return day;
    }

    public static String ngayTiepTheo(int day, int month, int year) {
        day = ngaytrongthang(month, year);
        if(day < 1 || day > day){
            System.out.println("not avaiable");
        }else {
            if(day < day) {
                day ++;
            }
            else if(month < 12){
                day++;
                month++;
                year = year;
            }
            else if(day == 31 && month == 12){
                day = 1;
                month = 1;
                year++;
            };
        }
        return day + "/" + month + "/" + year;
    }
}


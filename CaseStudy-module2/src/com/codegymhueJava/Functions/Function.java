package com.codegymhueJava.Functions;

import com.codegymhueJava.Thread.Loading;
import com.codegymhueJava.Thread.ThreadGoodBye;
import com.codegymhueJava.check.CheckInput;
import com.codegymhueJava.custorm.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.codegymhueJava.check.CheckInput.checkInteger;

public class Function {
//    DANH SÁCH MÓN ĂN VÀ ĐỒ UỐNG.
    static List <MonHaiSan> listHaiSan = new ArrayList<MonHaiSan>();
    static List <MonKhaiVi> monKhaiVi = new ArrayList<MonKhaiVi>();
    static List <MonLau> listMonLau = new ArrayList<MonLau>();
    static List <DoUong> listDoUong = new ArrayList<DoUong>();
    static List <MonRung> listMonRung = new ArrayList<MonRung>();
    //    Thread

    static ThreadGoodBye threadGoodBye = new ThreadGoodBye();
    static Loading loading = new Loading();

    //    màu chữ
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";

    static Scanner scanner = new Scanner(System.in);
    //    kiểm tra đầu vào
    static CheckInput check = new CheckInput();

//    đọc file
    static ReadFile readFile = new ReadFile();

//    ghi file
    static WriteFile writeFile = new WriteFile();

    //    List
    static List<FoodsObj> listFoods = new ArrayList<FoodsObj>();
    public static void thanhToan() throws InterruptedException {
        loading.start();
        loading.join();
        if(listFoods.size() == 0) {
            System.out.println("\nDanh sách trống.");
        }else {
            int totalPrice = 0;
            for(FoodsObj o : listFoods) {
                System.out.println("\n" + o.getName() +"  "+ o.getQuantity() + "  "+ o.getPrice());
                totalPrice += o.getPrice();
            }
            System.out.println("Thời gian " + java.time.LocalDateTime.now());
            System.out.println("\nTotal: " + totalPrice + " k");
        }
    }

    public static void menuDoUong() throws InterruptedException {
        List<DoUong> douong = readFile.readDoUong();
        if (douong.size() == 0) {
            System.out.println(ANSI_YELLOW + "TẠM HẾT HÀNG");
        }else {
            System.out.println(ANSI_CYAN + "\n|||||||||||||||||||||||||||||||||||||||||");
            System.out.println("||           THỰC ĐƠN ĐỒ UỐNG          ||");
            System.out.println("||-------------------------------------||");
            System.out.println("|| " +douong.get(0).getPrice() + "k" + "          "+douong.get(0).getName());
            System.out.println("|| " +douong.get(1).getPrice() + "k" + "          "+douong.get(1).getName());
            System.out.println("|| " +douong.get(2).getPrice() + "k" + "          "+douong.get(2).getName());
            System.out.println("||                           0. _back_ ||");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||");
        }
        int selectDU;
        String du = "";
        int quantityL = 0;
        int priceR = 0;

        do {
            System.out.print(ANSI_YELLOW + "select: ");
            selectDU = (int) checkInteger(0,3);
            switch (selectDU)
            {
                case 0 :
                    menu();
                    break;
                case 1 :
                    du = douong.get(0).getName();
                    System.out.print("Số lượng: ");
                    quantityL = (int) checkInteger(0,10);
                    priceR = douong.get(0).getPrice()* quantityL;
                    listFoods.add(new FoodsObj(du,quantityL, priceR));
                    break;
                case 2 :
                    du = douong.get(1).getName();
                    System.out.print("Số lượng: ");
                    quantityL = (int) checkInteger(0,10);
                    priceR = douong.get(0).getPrice() * quantityL;
                    listFoods.add(new FoodsObj(du,quantityL, priceR));
                    break;
                case 3 :
                    du =douong.get(2).getName();
                    System.out.print("Số lượng: ");
                    quantityL = (int) checkInteger(0,10);
                    priceR = douong.get(0).getPrice() * quantityL;
                    listFoods.add(new FoodsObj(du,quantityL, priceR));
                    break;

            }
        }while (selectDU != 0);

    }

    public static void menuLau () throws InterruptedException {
        List<MonLau> lau = readFile.readMonLau();
        if (lau.size() == 0) {
            System.out.println(ANSI_YELLOW + "TẠM HẾT HÀNG");
        }else {
            System.out.println(ANSI_WHITE + "\n|||||||||||||||||||||||||||||||||||||||||");
            System.out.println("||           THỰC ĐƠN LẪU              ||");
            System.out.println("||-------------------------------------||");
            System.out.println("|| " +lau.get(0).getPrice() + "k" + "          "+lau.get(0).getName());
            System.out.println("|| " +lau.get(1).getPrice() + "k" + "          "+lau.get(1).getName());
            System.out.println("|| " +lau.get(2).getPrice() + "k" + "          "+lau.get(2).getName());
            System.out.println("||                           0. _back_ ||");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||");
        }
        int selectR;
        String mLau = "";
        int quantityL = 0;
        int priceR = 0;

        do {
            System.out.print(ANSI_YELLOW + "select: ");
            selectR = (int) checkInteger(0,3);
            switch (selectR)
            {
                case 0 :
                    menu();
                    break;
                case 1 :
                    mLau = lau.get(0).getName();
                    System.out.print("Số lượng: ");
                    quantityL = (int) checkInteger(0,10);
                    priceR = lau.get(0).getPrice()* quantityL;
                    listFoods.add(new FoodsObj(mLau,quantityL, priceR));
                    break;
                case 2 :
                    mLau = lau.get(1).getName();
                    System.out.print("Số lượng: ");
                    quantityL = (int) checkInteger(0,10);
                    priceR = lau.get(0).getPrice() * quantityL;
                    listFoods.add(new FoodsObj(mLau,quantityL, priceR));
                    break;
                case 3 :
                    mLau =lau.get(2).getName();
                    System.out.print("Số lượng: ");
                    quantityL = (int) checkInteger(0,10);
                    priceR = lau.get(0).getPrice() * quantityL;
                    listFoods.add(new FoodsObj(mLau,quantityL, priceR));
                    break;

            }
        }while (selectR != 0);

    }

    public static void menuNuiRung() throws InterruptedException {
        List <MonRung> monRung = readFile.readMonRung();
        if (monRung.size() == 0) {
            System.out.println(ANSI_YELLOW + "TẠM HẾT HÀNG");
        }else {
            System.out.println(ANSI_GREEN + "\n|||||||||||||||||||||||||||||||||||||||||");
            System.out.println("||           THỰC ĐƠN NÚI RỪNG         ||");
            System.out.println("||-------------------------------------||");
            System.out.println("|| 1. " +monRung.get(0).getPrice() + "k" + "          "+monRung.get(0).getName());
            System.out.println("|| 2. " +monRung.get(1).getPrice() + "k" + "          "+monRung.get(1).getName());
            System.out.println("|| 3. " +monRung.get(2).getPrice() + "k" + "          "+monRung.get(2).getName());
            System.out.println("||                           0. _back_ ||");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||");
        }
        int selectR;
        String rung = "";
        int quantityR = 0;
        int priceR = 0;

        do {
            System.out.print(ANSI_YELLOW + "select: ");
            selectR = (int) checkInteger(0,3);
            switch (selectR)
            {
                case 0 :
                    menu();
                    break;
                case 1 :
                    rung = monRung.get(0).getName();
                    System.out.print("Số lượng: ");
                    quantityR = (int) checkInteger(0,10);
                    priceR = monRung.get(0).getPrice()* quantityR;
                    listFoods.add(new FoodsObj(rung,quantityR, priceR));
                    break;
                case 2 :
                    rung = monRung.get(1).getName();
                    System.out.print("Số lượng: ");
                    quantityR = (int) checkInteger(0,10);
                    priceR = monRung.get(0).getPrice() * quantityR;
                    listFoods.add(new FoodsObj(rung,quantityR, priceR));
                    break;
                case 3 :
                    rung =monRung.get(2).getName();
                    System.out.print("Số lượng: ");
                    quantityR = (int) checkInteger(0,10);
                    priceR = monRung.get(0).getPrice() * quantityR;
                    listFoods.add(new FoodsObj(rung,quantityR, priceR));
                    break;

            }
        }while (selectR != 0);
    }

    public static void menuHaiSan () throws InterruptedException {
        List <MonHaiSan> monHaiSan = readFile.readMonHaiSan();
        if (monHaiSan.size() == 0) {
            System.out.println(ANSI_YELLOW + "TẠM HẾT HÀNG");
        }else {
            System.out.println(ANSI_YELLOW + "\n|||||||||||||||||||||||||||||||||||||||||");
            System.out.println("||           THỰC ĐƠN HẢI SẢN          ||");
            System.out.println("||-------------------------------------||");
            System.out.println("|| 1. " +monHaiSan.get(0).getPrice() + "k" + "          "+monHaiSan.get(0).getName());
            System.out.println("|| 2. " +monHaiSan.get(1).getPrice() + "k" + "          "+monHaiSan.get(1).getName());
            System.out.println("|| 3. " +monHaiSan.get(2).getPrice() + "k" + "          "+monHaiSan.get(2).getName());
            System.out.println("||                           0. _back_ ||");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||");
            int selectHS;
            String hai_san = "";
            int quantityHS = 0;
            int priceHS = 0;

            do {
                System.out.print(ANSI_YELLOW + "select: ");
                selectHS = (int) checkInteger(0,3);
                switch (selectHS)
                {
                    case 0 :
                        menu();
                        break;
                    case 1 :
                        hai_san = monHaiSan.get(0).getName();
                        System.out.print("Số lượng: ");
                        quantityHS = (int) checkInteger(0,10);
                        priceHS = monHaiSan.get(0).getPrice()* quantityHS;
                        listFoods.add(new FoodsObj(hai_san,quantityHS, priceHS));
                        break;
                    case 2 :
                        hai_san = monHaiSan.get(1).getName();
                        System.out.print("Số lượng: ");
                        quantityHS = (int) checkInteger(0,10);
                        priceHS = monHaiSan.get(0).getPrice() * quantityHS;
                        listFoods.add(new FoodsObj(hai_san,quantityHS, priceHS));
                        break;
                    case 3 :
                        hai_san =monHaiSan.get(2).getName();
                        System.out.print("Số lượng: ");
                        quantityHS = (int) checkInteger(0,10);
                        priceHS = monHaiSan.get(0).getPrice() * quantityHS;
                        listFoods.add(new FoodsObj(hai_san,quantityHS, priceHS));
                        break;

                }
            }while (selectHS != 0);
        }

    }

    public static void menuKhaiVi() throws InterruptedException {
        List <MonKhaiVi> monKhaiVi = readFile.readMonKhaiVi();
        if (monKhaiVi.size() == 0) {
            System.out.println(ANSI_YELLOW + "TẠM HẾT HÀNG");
        }else {
            System.out.println(ANSI_PURPLE + "\n|||||||||||||||||||||||||||||||||||||||||");
            System.out.println("||           THỰC ĐƠN KHAI VỊ          ||");
            System.out.println("||-------------------------------------||");
            System.out.println("|| 1. " + monKhaiVi.get(0).getPrice() + "k" + "          "+ monKhaiVi.get(0).getName());
            System.out.println("|| 2. " + monKhaiVi.get(1).getPrice() + "k" + "          "+ monKhaiVi.get(1).getName());
            System.out.println("|| 3. " + monKhaiVi.get(2).getPrice() + "k" + "          "+ monKhaiVi.get(2).getName());
            System.out.println("||                          0. _back_  ||");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||");
            int selectKV;
            String khai_vi = "";
            int quantitykv = 0;
            int pricekv = 0;

            do {
                System.out.print(ANSI_YELLOW + "select: ");
                selectKV = (int) checkInteger(0,3);
                switch (selectKV)
                {
                    case 0 :
                        menu();
                        break;
                    case 1 :
                        khai_vi = monKhaiVi.get(0).getName();
                        System.out.print("Số lượng: ");
                        quantitykv = (int) checkInteger(0,10);
                        pricekv = monKhaiVi.get(0).getPrice() * quantitykv;
                        listFoods.add(new FoodsObj(khai_vi,quantitykv, pricekv));
                        break;
                    case 2 :
                        khai_vi = monKhaiVi.get(1).getName();
                        System.out.print("Số lượng: ");
                        quantitykv = (int) checkInteger(0,10);
                        pricekv = monKhaiVi.get(1).getPrice() * quantitykv;
                        listFoods.add(new FoodsObj(khai_vi,quantitykv, pricekv));
                        break;
                    case 3 :
                        khai_vi = monKhaiVi.get(2).getName();
                        System.out.print("Số lượng: ");
                        quantitykv = (int) checkInteger(0,10);
                        pricekv = monKhaiVi.get(2).getPrice() * quantitykv;
                        listFoods.add(new FoodsObj(khai_vi,quantitykv, pricekv));
                        break;

                }
            }while (selectKV != 0);


        }




    }

    public static void menu() throws InterruptedException {
        System.out.println(ANSI_BLUE + "\n|||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||           THỰC ĐƠN HÔM NAY CÓ       ||");
        System.out.println("||-------------------------------------||");
        System.out.println("||     1. KHAI VỊ                      ||");
        System.out.println("||     2. HẢI SẢN                      ||");
        System.out.println("||     3. NÚI RỪNG                     ||");
        System.out.println("||     4. LẪU                          ||");
        System.out.println("||     5. ĐỒ UỐNG CÁC LOẠI             ||");
        System.out.println("||     6. THANH TOÁN                   ||");
        System.out.println("||                           0. _exit_ ||");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||");
        while (true) {
            System.out.print(ANSI_YELLOW + "select: ");
            int select = (int) checkInteger(0,6);
            switch (select)
            {
                case 0 :
//                    Chạy dòng goodbye...
                    begin();
                    break;
                case 1 :
                    menuKhaiVi();
                    break;
                case 2 :
                    menuHaiSan ();
                    break;
                case 3 :
                    menuNuiRung();
                    break;
                case 4 :
                    menuLau ();
                    break;
                case 5 :
                    menuDoUong();
                    break;
                case 6 :
                    thanhToan();
                    break;
            }
        }

    }


    public static void begin () throws InterruptedException {
        System.out.println(ANSI_BLUE + "\n|||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||     1. ĐĂNG NHẬP                    ||");
        System.out.println("||     2. KHÁCH HÀNG                   ||");
        System.out.println("||                           0. _exit_ ||");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||");
        while (true) {
            System.out.print(ANSI_YELLOW + "select: ");
            int select = (int) checkInteger(0,2);
            switch (select)
            {
                case 0 :
//                    Chạy dòng goodbye...
                    threadGoodBye.start();
                    threadGoodBye.join();
                    System.exit(0);
                case 1 :
                    String [] addmin = {"hoang"};
                    String [] pass = {"123"};
                    System.out.print("Tên: ");
                    String name = scanner.nextLine();
                    for(int i = 0; i < addmin.length; ++i) {
                        if(addmin[i].equals(name)) {
                            System.out.print("Mật khẩu: ");
                            String pas = scanner.nextLine();
                            for(int j = 0; j < pass.length; j++) {
                                if(pass[j].equals(pas)) {
                                    addmin();
                                }else {
                                    System.out.println("Vui lòng kiểm tra lại");
                                }
                            }
                        }else {
                            System.out.println("Vui lòng kiểm tra lại");
                        }
                    }
                    break;
                case 2 :
                    menu();
                    break;

            }
        }
    }

    private static void addmin() throws InterruptedException {
        System.out.println(ANSI_BLUE + "\n|||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||            TRANG QUẢN LÝ            ||");
        System.out.println("||-------------------------------------||");
        System.out.println("||     1. THÊM MÓN ĂN                  ||");
        System.out.println("||     2. SỬA MÓN ĂN                   ||");
        System.out.println("||     3. XOÁ MÓN ĂN                   ||");
        System.out.println("||     4. KIỂM TRA DOANH THU           ||");
        System.out.println("||     5. HIỂN THỊ TẤT CẢ CÁC MÓN      ||");
        System.out.println("||                           0. _exit_ ||");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||");
        int select;
        do {
            System.out.print(ANSI_YELLOW + "select: ");
             select = (int) checkInteger(0,5);
            switch (select)
            {
                case 0 :
                    begin();
                    break;
                case 1 :
                    addMonAn();
                    break;
                case 2 :
                    suaMonAn();
                    break;
                case 3 :
                    xoaMonAn();
                    break;
                case 4 :
                    kiemTraDoanhThu();
                    break;
                case 5 :
                    hienThiTatCa();
                    break;
            }
        }while(select != 0);


    }

    private static void hienThiTatCa() {
//        hiển thị file khai vị
        List <MonKhaiVi> monKhaiVi = readFile.readMonKhaiVi();
        System.out.println(ANSI_GREEN + "Món khai vị:");
        if(monKhaiVi.size() == 0) {
            System.out.println(ANSI_WHITE + "CHƯA CÓ THÔNG TIN MÓN ĂN");
        }else {
            for(MonKhaiVi kv : monKhaiVi)
            {
                System.out.println(kv.toString());
            }
        }

//        hiển thị file hải sản
        List <MonHaiSan> monHaiSan = readFile.readMonHaiSan();
        System.out.println(ANSI_GREEN + "Hải Sản: ");
        if(monHaiSan.size() == 0) {
            System.out.println(ANSI_WHITE + "CHƯA CÓ THÔNG TIN MÓN ĂN");
        }else {
            TenVaGia ();
            for (MonHaiSan hs: monHaiSan)
            {
            System.out.println(hs.toString());
            }
        }

//        Hiển thị file Món Rừng
        List <MonRung> monRung = readFile.readMonRung();
        System.out.println(ANSI_GREEN + "Món Rừng: ");
        if(monRung.size() == 0) {
            System.out.println(ANSI_WHITE + "CHƯA CÓ THÔNG TIN MÓN ĂN");
        }else {
            TenVaGia ();
            for (MonRung mr : monRung) {
                System.out.println(mr.toString());
            }
        }

//        Hiển thị file Lẫu
        List<MonLau> lau = readFile.readMonLau();
        System.out.println(ANSI_GREEN + "Món Lẫu:");
        if(lau.size() == 0) {
            System.out.println(ANSI_WHITE + "CHƯA CÓ THÔNG TIN MÓN ĂN");
        }else {
            TenVaGia();
            for (MonLau ml : lau) {
                System.out.println(ml.toString());
            }
        }

//        Đọc file Đồ uống
        List<DoUong> douong = readFile.readDoUong();
        System.out.println(ANSI_GREEN + "Đồ Uống:");
        if(douong.size() == 0) {
            System.out.println(ANSI_WHITE + "CHƯA CÓ THÔNG TIN MÓN ĂN");
        }else {
            TenVaGia ();
            for (DoUong du : douong) {
                System.out.println(du.toString());
            }
        }

    }

    private static void kiemTraDoanhThu() {

    }

    private static void xoaMonAn() throws InterruptedException {
        System.out.println(ANSI_BLUE + "\n|||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||            TRANG THÊM MÓN ĂN        ||");
        System.out.println("||-------------------------------------||");
        System.out.println("||     1. XOÁ MÓN KHAI VỊ              ||");
        System.out.println("||     2. XOÁ MÓN HAI SẢN              ||");
        System.out.println("||     3. XOÁ MÓN RỪNG                 ||");
        System.out.println("||     4. XOÁ MÓN LẪU                  ||");
        System.out.println("||     5. XOÁ ĐỒ UỐNG                  ||");
        System.out.println("||                           0. _BACK_ ||");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||");




    }

    private static void suaMonAn() throws InterruptedException {

        System.out.println(ANSI_BLUE + "\n|||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||            TRANG SỬA MÓN ĂN        ||");
        System.out.println("||-------------------------------------||");
        System.out.println("||     1. SỬA MÓN KHAI VỊ              ||");
        System.out.println("||     2. SỬA MÓN HAI SẢN              ||");
        System.out.println("||     3. SỬA MÓN RỪNG                 ||");
        System.out.println("||     4. SỬA MÓN LẪU                  ||");
        System.out.println("||     5. SỬA ĐỒ UỐNG                  ||");
        System.out.println("||                           0. _BACK_ ||");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||");
        int option;
        do {
            System.out.print(ANSI_BLUE + "chọn: ");
            option = (int) check.checkInteger(0,5);
            switch (option) {
                case 0 :
                    addmin();
                    break;
                case 1 :
                    List <MonKhaiVi> monKhaiVi = readFile.readMonKhaiVi();
                    System.out.println("Nhập tên món: ");
                    String name = check.checkString();
                    for (MonKhaiVi khaiVi : monKhaiVi) {
                        if(khaiVi.getName().equals(name)) {
                            System.out.println("Nhập tên mới: ");
                            String newName= check.checkString();
                            khaiVi.setName(newName);
                            System.out.println("Nhập giá: ");
                            int newPrice = (int) check.checkInteger(0,1000);
                            khaiVi.setPrice(newPrice);
                            writeFile.writeToFile(monKhaiVi);
                        }
                    }
                    break;
                case 2 :
                    List <MonHaiSan> monHaiSan = readFile.readMonHaiSan();
                    System.out.println("Nhập tên món: ");
                    String ten = check.checkString();
                    for (MonHaiSan haiSan : monHaiSan) {
                        if(haiSan.getName().equals(ten)) {
                            System.out.println("Nhập tên mới: ");
                            String newName= check.checkString();
                            haiSan.setName(newName);
                            System.out.println("Nhập giá: ");
                            int newPrice = (int) check.checkInteger(0,1000);
                            haiSan.setPrice(newPrice);
                            writeFile.writeToFile(monHaiSan);
                        }
                    }
                    break;
                case 3 :
                    List <MonRung> monRung = readFile.readMonRung();
                    System.out.println("Nhập tên món: ");
                    String mon = check.checkString();
                    for (MonRung mr : monRung) {
                        if (mr.getName().equals(mon)) {
                            System.out.println("Nhập tên mới: ");
                            String newName = check.checkString();
                            mr.setName(newName);
                            System.out.println("Nhập giá: ");
                            int newPrice = (int) check.checkInteger(0, 1000);
                            mr.setPrice(newPrice);
                            writeFile.writeToFile(monRung);
                        }
                    }
                    break;
                case 4 :
                    List<MonLau> lau = readFile.readMonLau();
                    System.out.println("Nhập tên món: ");
                    String monL = check.checkString();
                    for (MonLau monLau : lau) {
                        if (monLau.getName().equals(monL)) {
                            System.out.println("Nhập tên mới: ");
                            String newName = check.checkString();
                            monLau.setName(newName);
                            System.out.println("Nhập giá: ");
                            int newPrice = (int) check.checkInteger(0, 1000);
                            monLau.setPrice(newPrice);
                            writeFile.writeToFile(lau);
                        }
                    }
                    break;
                case 5 :
                    List<DoUong> douong = readFile.readDoUong();
                    System.out.println("Nhập tên món: ");
                    String du = check.checkString();
                    for (DoUong doU : douong) {
                        if (doU.getName().equals(du)) {
                            System.out.println("Nhập tên mới: ");
                            String newName = check.checkString();
                            doU.setName(newName);
                            System.out.println("Nhập giá: ");
                            int newPrice = (int) check.checkInteger(0, 1000);
                            doU.setPrice(newPrice);
                            writeFile.writeToFile(douong);
                        }
                    }
                    break;

            }

        }while (option != 0);


    }

    private static void addMonAn() throws InterruptedException {
        System.out.println(ANSI_BLUE + "\n|||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||            TRANG THÊM MÓN ĂN        ||");
        System.out.println("||-------------------------------------||");
        System.out.println("||     1. THÊM MÓN KHAI VỊ             ||");
        System.out.println("||     2. THÊM MÓN HAI SẢN             ||");
        System.out.println("||     3. THÊM MÓN RỪNG                ||");
        System.out.println("||     4. THÊM MÓN LẪU                 ||");
        System.out.println("||     5. THÊM ĐỒ UỐNG                 ||");
        System.out.println("||                           0. _BACK_ ||");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||");
        int selectThemMon;
        do {
            System.out.print(ANSI_YELLOW + "select: ");
            selectThemMon = (int) checkInteger(0,5);
            switch (selectThemMon)
            {
                case 0 :

                    addmin();
                    break;
                case 1 :
                    System.out.println("Nhập số món: ");
                    int n = (int) check.checkInteger(1,3);
                    for(int i = 0; i < n; i++ ){
                        System.out.println("Món " + i );
                        String name = check.checkString();
                        System.out.println("Giá: " );
                        int price = (int) checkInteger(0,1000);
                        monKhaiVi.add(new MonKhaiVi(name,price));
                    }
                    writeFile.writeToFile(monKhaiVi);
                    break;
                case 2 :
                    System.out.println("Nhập số món: ");
                    int m = (int) check.checkInteger(1,3);
                    for(int i = 0; i < m; i++ ){
                        System.out.println("Món " + i );
                        String name = check.checkString();
                        System.out.println("Giá: " );
                        int price = (int) checkInteger(0,1000);
                        listHaiSan.add(new MonHaiSan(name,price));
                    }
                    writeFile.writeToFile(listHaiSan);
                    break;
                case 3 :
                    System.out.println("Nhập số món: ");
                    int k = (int) check.checkInteger(1,3);
                    for(int i = 0; i < k; i++ ){
                        System.out.println("Món " + i );
                        String name = check.checkString();
                        System.out.println("Giá: " );
                        int price = (int) checkInteger(0,1000);
                        listMonRung.add(new MonRung(name,price));
                    }
                    writeFile.writeToFile(listMonRung);
                    break;
                case 4 :
                    System.out.println("Nhập số món: ");
                    int h = (int) check.checkInteger(1,3);
                    for(int i = 0; i < h; i++ ){
                        System.out.println("Món " + i );
                        String name = check.checkString();
                        System.out.println("Giá: " );
                        int price = (int) checkInteger(0,1000);
                        listMonLau.add(new MonLau(name,price));
                    }
                    writeFile.writeToFile(listMonLau);
                    break;
                case 5 :
                    System.out.println("Nhập số món: ");
                    int e = (int) check.checkInteger(1,3);
                    for(int i = 0; i < e; i++ ){
                        System.out.println("Món " + i );
                        String name = check.checkString();
                        System.out.println("Giá: " );
                        int price = (int) checkInteger(0,1000);
                        listDoUong.add(new DoUong(name,price));
                    }
                    writeFile.writeToFile(listDoUong);
                    break;
            }
        }while (selectThemMon != 0);
    }


    public static void TenVaGia () {
        System.out.println("TÊN\t\tGIÁ");
        System.out.println("--------------------");
    }
}

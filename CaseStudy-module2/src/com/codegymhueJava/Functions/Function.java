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

    public static void menuDoUong() {
        if (listMonLau.size() == 0) {
            System.out.println(ANSI_YELLOW + "TẠM HẾT HÀNG");
        }else {
            System.out.println(ANSI_CYAN + "\n|||||||||||||||||||||||||||||||||||||||||");
            System.out.println("||           THỰC ĐƠN ĐỒ UỐNG          ||");
            System.out.println("||-------------------------------------||");
            System.out.println("|| " +listDoUong.get(0).getPrice() + "k" + "          "+listDoUong.get(0).getName());
            System.out.println("|| " +listDoUong.get(1).getPrice() + "k" + "          "+listDoUong.get(1).getName());
            System.out.println("|| " +listDoUong.get(2).getPrice() + "k" + "          "+listDoUong.get(2).getName());
            System.out.println("||                           0. _back_ ||");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||");
        }

    }

    public static void menuLau () {
        if (listMonLau.size() == 0) {
            System.out.println(ANSI_YELLOW + "TẠM HẾT HÀNG");
        }else {
            System.out.println(ANSI_WHITE + "\n|||||||||||||||||||||||||||||||||||||||||");
            System.out.println("||           THỰC ĐƠN LẪU              ||");
            System.out.println("||-------------------------------------||");
            System.out.println("|| " +listMonLau.get(0).getPrice() + "k" + "          "+listMonLau.get(0).getName());
            System.out.println("|| " +listMonLau.get(1).getPrice() + "k" + "          "+listMonLau.get(1).getName());
            System.out.println("|| " +listMonLau.get(2).getPrice() + "k" + "          "+listMonLau.get(2).getName());
            System.out.println("||                           0. _back_ ||");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||");
        }

    }

    public static void menuNuiRung() throws InterruptedException {
        if (listMonRung.size() == 0) {
            System.out.println(ANSI_YELLOW + "TẠM HẾT HÀNG");
        }else {
            System.out.println(ANSI_GREEN + "\n|||||||||||||||||||||||||||||||||||||||||");
            System.out.println("||           THỰC ĐƠN NÚI RỪNG         ||");
            System.out.println("||-------------------------------------||");
            System.out.println("|| " +listMonRung.get(0).getPrice() + "k" + "          "+listMonRung.get(0).getName());
            System.out.println("|| " +listMonRung.get(1).getPrice() + "k" + "          "+listMonRung.get(1).getName());
            System.out.println("|| " +listMonRung.get(2).getPrice() + "k" + "          "+listMonRung.get(2).getName());
            System.out.println("||                           0. _back_ ||");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||");
        }


    }

    public static void menuHaiSan () throws InterruptedException {
        if (listHaiSan.size() == 0) {
            System.out.println(ANSI_YELLOW + "TẠM HẾT HÀNG");
        }else {
            System.out.println(ANSI_YELLOW + "\n|||||||||||||||||||||||||||||||||||||||||");
            System.out.println("||           THỰC ĐƠN HẢI SẢN          ||");
            System.out.println("||-------------------------------------||");
            System.out.println("|| " +listHaiSan.get(0).getPrice() + "k" + "          "+listHaiSan.get(0).getName());
            System.out.println("|| " +listHaiSan.get(1).getPrice() + "k" + "          "+listHaiSan.get(1).getName());
            System.out.println("|| " +listHaiSan.get(2).getPrice() + "k" + "          "+listHaiSan.get(2).getName());
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
                        hai_san = "NGAO,SÒ,ỐC,HẾN";
                        System.out.print("Số lượng: ");
                        quantityHS = (int) checkInteger(0,10);
                        priceHS = 100* quantityHS;
                        listFoods.add(new FoodsObj(hai_san,quantityHS, priceHS));
                        break;
                    case 2 :
                        hai_san = "CUA,TÔM,CÁ,GHẸ";
                        System.out.print("Số lượng: ");
                        quantityHS = (int) checkInteger(0,10);
                        priceHS = 250 * quantityHS;
                        listFoods.add(new FoodsObj(hai_san,quantityHS, priceHS));
                        break;
                    case 3 :
                        hai_san = "ĐẶT BIỆT ỐC VÒI VOI";
                        System.out.print("Số lượng: ");
                        quantityHS = (int) checkInteger(0,10);
                        priceHS = 1000000 * quantityHS;
                        listFoods.add(new FoodsObj(hai_san,quantityHS, priceHS));
                        break;

                }
            }while (selectHS != 0);
        }

    }

    public static void menuKhaiVi() throws InterruptedException {
        List <MonKhaiVi> monKhaiVi = readMonKhaiVi();
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
        System.out.println(ANSI_GREEN + "Món khai vị:");
        if(monKhaiVi.size() == 0) {
            System.out.println(ANSI_WHITE + "CHƯA CÓ THÔNG TIN MÓN ĂN");
        }else {
            TenVaGia ();
            for(MonKhaiVi kv : monKhaiVi)
            {
                System.out.println(kv.toString());
            }
        }

        System.out.println(ANSI_GREEN + "Hải Sản: ");
        if(listHaiSan.size() == 0) {
            System.out.println(ANSI_WHITE + "CHƯA CÓ THÔNG TIN MÓN ĂN");
        }else {
            TenVaGia ();
            for (MonHaiSan hs: listHaiSan)
            {
            System.out.println(hs.toString());
            }
        }

        System.out.println(ANSI_GREEN + "Món Rừng: ");
        if(listMonRung.size() == 0) {
            System.out.println(ANSI_WHITE + "CHƯA CÓ THÔNG TIN MÓN ĂN");
        }else {
            TenVaGia ();
            for (MonRung mr : listMonRung) {
                System.out.println(mr.toString());
            }
        }

        System.out.println(ANSI_GREEN + "Món Lẫu:");
        if(listMonLau.size() == 0) {
            System.out.println(ANSI_WHITE + "CHƯA CÓ THÔNG TIN MÓN ĂN");
        }else {
            TenVaGia();
            for (MonLau ml : listMonLau) {
                System.out.println(ml.toString());
            }
        }

        System.out.println(ANSI_GREEN + "Đồ Uống:");
        if(listDoUong.size() == 0) {
            System.out.println(ANSI_WHITE + "CHƯA CÓ THÔNG TIN MÓN ĂN");
        }else {
            TenVaGia ();
            for (DoUong du : listDoUong) {
                System.out.println(du.toString());
            }
        }

    }

    private static void kiemTraDoanhThu() {
    }

    private static void xoaMonAn() {
    }

    private static void suaMonAn() throws InterruptedException {

        System.out.println(ANSI_BLUE + "\n|||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||            TRANG THÊM MÓN ĂN        ||");
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
                    List <MonKhaiVi> monKhaiVi = readMonKhaiVi();
                    System.out.println("Nhập tên món: ");
                    String name = check.checkString();
                    for (MonKhaiVi khaiVi : monKhaiVi) {
                        System.out.println(khaiVi);
                        if(khaiVi.getName().equals(name)) {
                            System.out.println("Nhập tên mới: ");
                            String newName= check.checkString();
                            khaiVi.setName(newName);
                            System.out.println("Nhập giá: ");
                            int newPrice = (int) check.checkInteger(0,1000);
                            khaiVi.setPrice(newPrice);
                        }
                    }

                    writeToFile(monKhaiVi);
                    break;
                case 2 :
                    break;
                case 3 :
                    break;
                case 4 :
                    break;
                case 5 :
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
                    writeToFile(monKhaiVi);
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
                    writeToFile(listHaiSan);
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
                    writeToFile(listMonRung);
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
                    writeToFile(listMonLau);
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
                    writeToFile(listDoUong);
                    break;
            }
        }while (selectThemMon != 0);
    }


    public static void TenVaGia () {
        System.out.println("\t\t\t\tTÊN\t\tGIÁ");
        System.out.println("\t\t\t\t--------------------");
    }

    public static <E> void writeToFile(List <E> listName) {
        System.out.println("Nhập tên file: ");
        String fileName = check.checkString();
        try {
            FileWriter file = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(file);
            for (E e : listName) {
                bufferedWriter.write(e.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static List<MonKhaiVi> readMonKhaiVi () {
        List<MonKhaiVi> khaiVi = new ArrayList<>();
        try {
            FileReader file = new FileReader("khaiviFile.txt");
            BufferedReader bufferedReader = new BufferedReader(file);
            String line = "";
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String [] khaiviTXT = line.split(",");
                String name = khaiviTXT[0];
                int price = Integer.parseInt(khaiviTXT[1]);
                khaiVi.add(new MonKhaiVi(name,price));
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return khaiVi;
    }



}

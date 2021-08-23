package com.codegymhueJava;

import com.codegymhueJava.Functions.Function;
import com.codegymhueJava.Thread.Loading;
import com.codegymhueJava.Thread.ThreadGoodBye;
import com.codegymhueJava.Thread.ThreadWelcome;
import com.codegymhueJava.check.CheckInput;
import com.codegymhueJava.custorm.FoodsObj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static ThreadWelcome threadWelcome = new ThreadWelcome();
    static Function function = new Function();







    public static void main(String[] args) throws InterruptedException {
//        chạy dòng welcome
    threadWelcome.start();
    threadWelcome.join();
    function.begin();


    }

}

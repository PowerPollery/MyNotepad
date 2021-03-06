package main;

import biz.AppFunc;
import biz.runbiz.RunBiz;
import util.JavaUtil;
import view.EditWin;

import javax.swing.*;
import java.io.*;

/**
 * 应用主入口
 */

public class AppMain {
    //args的第一个参数就是被打开的那个文件(如果存在的话)
    public static void main(String[] args) throws FileNotFoundException {
        JavaUtil.setLoggingPolicy("console", null);
//        JavaUtil.setLoggingPolicy("file", "mynotepad-main.log");

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e){}

        EditWin editWin = new EditWin();
        AppFunc appFunc = new AppFunc(editWin);
        RunBiz runBiz = new RunBiz(editWin);
        if(args.length != 0){//直接打开文件
            appFunc.open(new File(args[0]), null);
        }
    }
}

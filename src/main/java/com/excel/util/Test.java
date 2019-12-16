package com.excel.util;/*
*@author YuanYY
*@date 2019/12/13 13:54
*/

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.metadata.Sheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public class Test {

    public static void main(String[] args) throws Exception {
        String filePath = "C:\\Users\\Lenovo\\Excel\\1.xlsx";
        //第一个1代表sheet1 ，第二个0代表从第几行开始读取数据，行号最小值为0
        Sheet sheet = new Sheet( 1,0 );
        InputStream in = new FileInputStream( new File( filePath ) );
        List<Object> readResylt = EasyExcelFactory.read( in,sheet );
        System.out.println(readResylt);
    }
}

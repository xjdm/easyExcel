package com.excel;/*
*@author YuanYY
*@date 2019/12/13 10:40
*/


import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.metadata.Sheet;
import com.excel.pojo.WriteModel;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test {

    @org.junit.Test

    public void writeExcel1()throws Exception{
        //文件输出位置
        OutputStream out = new FileOutputStream( "C:\\Users\\Lenovo\\Excel\\1.xlsx" );

        ExcelWriter writer = EasyExcelFactory.getWriter( out );

        Sheet sheet1 = new Sheet( 1,0,WriteModel.class );

        sheet1.setSheetName( "第一个sheet" );

        writer.write( creatModelList(),sheet1 );
        writer.finish();
        out.close();
    }

    private List<? extends BaseRowModel> creatModelList() {

        List<WriteModel> writeModels = new ArrayList<>(  );
        for (int i = 0;i<100;i++){
            WriteModel writeModel = WriteModel.builder()
                    .CardNumber( "0101"+i ).phone( "1326666766"+i ).pwd( "123456"+i ).build();
            writeModels.add( writeModel );
        }
        return writeModels;
    }


}

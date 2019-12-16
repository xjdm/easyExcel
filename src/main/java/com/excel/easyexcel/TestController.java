package com.excel.easyexcel;/*
*@author YuanYY
*@date 2019/12/16 15:39
*/

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.metadata.Sheet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Controller
@RequestMapping("/")
public class TestController {
    @GetMapping("/alive")
    @ResponseBody
    public String alive() throws IOException {
        return "success";
    }

    @GetMapping("view")
    public String view(MultipartFile file) throws IOException {
        return "templates/excelUpload";
    }

    @PostMapping("upload")
    @ResponseBody
    public String upload(MultipartFile file) throws IOException {
       /* InputStream in = file.getInputStream();
        Sheet sheet = new Sheet( 1,0 );
        List<Object> readResylt = EasyExcelFactory.read( in,sheet );*/
      /*  System.out.println(readResylt);*/
        // EasyExcel.read(file.getInputStream(), UploadData.class, new UploadDataListener(uploadDAO)).sheet().doRead();
        return "success";
    }
}

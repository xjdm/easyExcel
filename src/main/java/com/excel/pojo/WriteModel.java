package com.excel.pojo;/*
*@author YuanYY
*@date 2019/12/13 10:53
*/

import com.alibaba.excel.annotation.ExcelProperty;

import com.alibaba.excel.metadata.BaseRowModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WriteModel extends BaseRowModel {

    @ExcelProperty(value = "卡号",index = 1)
    private String CardNumber;

    @ExcelProperty(value = "密码",index = 2)
    private String pwd;

    @ExcelProperty(value = "手机号",index =3)
    private String phone;




}


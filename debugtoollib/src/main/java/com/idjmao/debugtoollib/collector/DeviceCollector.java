package com.idjmao.debugtoollib.collector;

/**
 * Created by 1djmao on 2017/12/9.
 */

public class DeviceCollector {


    public String collect(){
        //BOARD 主板
        String phoneInfo="【设备信息】";
        phoneInfo += "\nBOARD: " + android.os.Build.BOARD;
        phoneInfo += ",\n BOOTLOADER: " + android.os.Build.BOOTLOADER;
//BRAND 运营商
        phoneInfo += ",\n BRAND: " + android.os.Build.BRAND;
        phoneInfo += ",\n CPU_ABI: " + android.os.Build.CPU_ABI;
        phoneInfo += ",\n CPU_ABI2: " + android.os.Build.CPU_ABI2;

//DEVICE 驱动
        phoneInfo += ",\n DEVICE: " + android.os.Build.DEVICE;
//DISPLAY Rom的名字 例如 Flyme 1.1.2（魅族rom） &nbsp;JWR66V（Android nexus系列原生4.3rom）
        phoneInfo += ",\n DISPLAY: " + android.os.Build.DISPLAY;
//指纹
        phoneInfo += ",\n FINGERPRINT: " + android.os.Build.FINGERPRINT;
//HARDWARE 硬件
        phoneInfo += ",\n HARDWARE: " + android.os.Build.HARDWARE;
        phoneInfo += ",\n HOST: " + android.os.Build.HOST;
        phoneInfo += ",\n ID: " + android.os.Build.ID;
//MANUFACTURER 生产厂家
        phoneInfo += ",\n MANUFACTURER: " + android.os.Build.MANUFACTURER;
//MODEL 机型
        phoneInfo += ",\n MODEL: " + android.os.Build.MODEL;
        phoneInfo += ",\n PRODUCT: " + android.os.Build.PRODUCT;
        phoneInfo += ",\n RADIO: " + android.os.Build.RADIO;
        phoneInfo += ",\n RADITAGSO: " + android.os.Build.TAGS;
        phoneInfo += ",\n TIME: " + android.os.Build.TIME;
        phoneInfo += ",\n TYPE: " + android.os.Build.TYPE;
        phoneInfo += ",\n USER: " + android.os.Build.USER;
//VERSION.RELEASE 固件版本
        phoneInfo += ",\n VERSION.RELEASE: " + android.os.Build.VERSION.RELEASE;
        phoneInfo += ",\n VERSION.CODENAME: " + android.os.Build.VERSION.CODENAME;
//VERSION.INCREMENTAL 基带版本
        phoneInfo += ",\n VERSION.INCREMENTAL: " + android.os.Build.VERSION.INCREMENTAL;
//VERSION.SDK SDK版本
        phoneInfo += ",\n VERSION.SDK: " + android.os.Build.VERSION.SDK;
        phoneInfo += ",\n VERSION.SDK_INT: " + android.os.Build.VERSION.SDK_INT;
        return phoneInfo;
    }
}

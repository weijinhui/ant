package com.ant.util;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2018/3/20.
 */
@Component("DateConverter")
public class DateConverter implements Converter<String, Date>{

    public Date convert(String stringDate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        try {
            if(!StringUtils.isEmpty(stringDate)){
                if(stringDate.length() > 10){
                    simpleDateFormat.applyPattern("yyyy-MM-dd HH:mm:ss");
                }else{
                    simpleDateFormat.applyPattern("yyyy-MM-dd");
                }
                return simpleDateFormat.parse(stringDate);
            }
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String currentDateToString(Date date) {
        Format format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(date);
    }

    public Date getNextDay(Date date) {//后一天
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, +1);
        date = calendar.getTime();
        return date;
    }
}

package com.zhidi.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String, Date>{

	@Override
	public Date convert(String date) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date newDate = sdf.parse(date);
			return newDate;
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		return null;
	}

}

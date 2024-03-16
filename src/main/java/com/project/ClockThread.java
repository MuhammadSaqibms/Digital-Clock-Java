package com.project;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockThread extends Thread{
	DigitalClock dc;
	public ClockThread(DigitalClock dc) {
		this.dc = dc;
		start();
	}
	public void run() {
		while(true) {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:s");
			String formatdate = sdf.format(date);
			String[] dateArr = formatdate.split(":");
			dc.textField.setText(dateArr[0]);
			dc.textField_1.setText(dateArr[1]);
			dc.textField_2.setText(dateArr[2]);
		}
	}

}

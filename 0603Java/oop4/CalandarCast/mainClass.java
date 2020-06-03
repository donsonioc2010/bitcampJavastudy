package CalandarCast;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	Calendar		year month day
		 	Date
		 */
		//일정관리에 주로사용
		
		//1. Calendar cal = new GregorianCalendar();
		Calendar cal = Calendar.getInstance();
		
		//날짜	//getter
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; //0~11
		int day = cal.get(Calendar.DATE);
		
		System.out.println(year + "년 "+month+"월 "+day+"일");
		
		//setter
		cal.set(Calendar.YEAR,2021);
		cal.set(Calendar.MONTH, Calendar.JANUARY);
		cal.set(Calendar.DATE, 15);
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH)+1; //0~11
		day = cal.get(Calendar.DATE);
		
		System.out.println(year + "년 "+month+"월 "+day+"일");
		
		//요일
		int weekday  = cal.get(Calendar.DAY_OF_WEEK); //1~7 일요일~토요일
		switch (weekday) {
			case 6:
				System.out.println("금요일");
				break;
	
			default:
				break;
		}
		
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, 6-1);
		cal.set(Calendar.DATE,1);
		//지정한달의 마지막날짜
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("lastday = " + lastDay);
		
		//달력만들기
			//위의 빈칸 1일의 요일값이 필요함
		weekday = cal.get(Calendar.DAY_OF_WEEK);
		int up = (weekday-1)%7;		//그달의 맨위의 빈칸의 갯수
		
		//그달의 맨아래칸의 빈칸의 갯수
		lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		cal.set(Calendar.DATE, lastDay);
		weekday = cal.get(Calendar.DAY_OF_WEEK);
		int down = 7-weekday;
		
		//달력을 출력
		year = 2021;
		month = 5;
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		int _startday = cal.get(Calendar.DAY_OF_WEEK);
		int _lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int _date = 1;
		
		System.out.println(year +"년 "+month+"월 ");
		System.out.println("===================================================================");
		String week_day="일월화수목금토";
		for (int i = 0; i < week_day.length(); i++) {
			char c = week_day.charAt(i);
			System.out.print(c +"\t");
		}
		System.out.println();
		System.out.println("===================================================================");
		//위쪽빈칸
		for(int i = 1; i<_startday; i++) {
			System.out.print("*"+"\t");
		}
		//날짜
		for(int i = 0; i<_lastday;i++) {
			System.out.print(_date+"\t");
			if((_date + _startday-1)%7==0) {
				System.out.println();
			}
			_date++;
		}
		//밑쪽 빈칸
		for(int i = 0; i<(7-(_startday+_lastday-1)%7);i++) {
			System.out.print("*"+"\t");
		}
	}

}

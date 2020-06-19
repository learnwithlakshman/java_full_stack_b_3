package com.lwl.cj.day10;

import java.util.Arrays;

public class StringExample3 {
		public static void main(String[] args) {
			String data = "krish@wipro.com,manoj@infosys,charan@wipro.com,lakshman@tcs.com,tanvi@tcs.com";
			
			//Krish  -  WIPRO
			//Lakshman - TCS
			
			String[] arr = data.split(",");
			String names[] = new String[arr.length];
			int c = 0;
			for(String d:arr) {
				String[] nameArr = d.split("@");
				String name = nameArr[0];
				String cname = nameArr[1];
				int index = cname.indexOf(".");
				if( index != -1) {
					cname = cname.substring(0, index);
				}
				name = name.substring(0,1).toUpperCase().concat(name.substring(1,name.length()));
				cname = cname.toUpperCase();
				names[c++] = name;
				System.out.println(name +" - "+cname);
			}
			
			System.out.println(Arrays.toString(names));
			for(String name:names) {
				if(name.equalsIgnoreCase("tanvi")) {
					System.out.println(name);
				}
			}
			
		}
}

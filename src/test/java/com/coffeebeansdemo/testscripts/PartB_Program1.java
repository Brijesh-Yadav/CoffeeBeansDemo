package com.coffeebeansdemo.testscripts;

import java.util.LinkedList;

public class PartB_Program1 {

	public static void main(String[] args) {

		int a = 100000;
		int b = a + 200000;
		LinkedList<String> list = new LinkedList<String>();

		/**
		 * find out 6 digit number multiply by 2 check the digit number convert
		 * it to string covert main string to string to char array check all
		 * char array in string
		 */
		int fr = 0;
		for (int i = a; i <= b; i++) {
			System.out.println("start---- " + i);
			int rst = 0;
			char[] chr = Integer.toString(i).toCharArray();
			if (chr.length == 6) {
				int nmb = i;
				String nm = Integer.toString(i);
				// System.out.println("Multiply by 2");
				int mltnm = nmb * 2;
				String multiplednm = Integer.toString(mltnm);
				// System.out.println("String "+nm+" Integer "+nmb+" multiplied
				// by 2 "+mltnm);
				// System.out.println("Multiply by 2 "+mltnm);

				rst = PartB_Program1.compareNum1(mltnm, nm);
				int rst2 = PartB_Program1.compareNum2(nmb, multiplednm);
				System.out.println("rst2 " + rst2);
				if (rst == 0 && rst2 == 0) {
					fr = 1;
					String dt = "String " + nm + " Integer " + nmb + " multiplied by 2 String " + multiplednm
							+ " digits are found in actual..("+nmb+")";
					System.out.println(dt);
					list.add(dt);
				} else {
					// System.out.println("String "+nm+" Integer "+nmb+"
					// multiplied by 2 "+mltnm+" are not equal");
				}
				System.out.println("String " + nm + " Integer " + nmb + " multiplied by 2 String " + multiplednm + " ");
			}
			System.out.println("End ----- " + i + "\n");
		}

		if (fr != 0) {
			System.out.println("present");
		} else {
			System.out.println("not present");
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

	public static int compareNum1(int mltnm, String nm) {
		int rst = 0;
		System.out.println("compareNum1 ");
		System.out.println("mltnm " + mltnm + " nm " + nm);

		char[] newchr = Integer.toString(mltnm).toCharArray();

		for (int j = 0; j < newchr.length; j++) {
			System.out.println(newchr[j] + " checking in " + nm);
			String str = String.valueOf(newchr[j]);
			boolean rs = nm.contains(str);
			if (rs == false) {
				rst = 1;
				System.out.println("return " + rst);
				break;
			}
		}
		return rst;
	}

	public static int compareNum2(int mltnm, String nm) {
		System.out.println("compareNum2 start -----");
		int rst = 0;
		System.out.println("mltnm " + mltnm + " nm " + nm);
		char[] newchr = Integer.toString(mltnm).toCharArray();
		for (int j = 0; j < newchr.length; j++) {
			System.out.println(newchr[j] + " checking in " + nm);
			String str = String.valueOf(newchr[j]);
			boolean rs = nm.contains(str);
			if (rs == false) {
				rst = 1;
				System.out.println("return " + rst);
				break;
			}
		}
		System.out.println("compareNum2 End -----");
		return rst;
	}

}

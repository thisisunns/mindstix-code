package com.in;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		// www. google.com /a
		// OUTPUT: ['w','w'.'w','.',' ','g','o','o','g','l','e','.','C','O','M','
		// ','/','a']
		// INPUT:
		// ['w','w'.'w','.','%','2','0',g','o','o','g','l','e','.','C','O','M','%','2','0','/','a']

		String str = "www. google.com /a";
		char[] cs = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		String replace = "%20";

		for (int i = 0; i < cs.length; i++) {
			if (cs[i] == ' ') {
				sb.append(replace);
			} else
				sb.append(cs[i]);
		}
		String newStr = new String(sb);
		char[] charArray = newStr.toCharArray();
		System.out.println("Input :" + Arrays.toString(cs));
		System.out.println("Output :" + Arrays.toString(charArray));
	}

}

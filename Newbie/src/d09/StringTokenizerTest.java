package org.nitpro.util;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args){
		StringTokenizer token = new StringTokenizer(args[0],",;.?");
		while(token.hasMoreTokens()){
			String str1 = token.nextToken();
			System.out.println(str1);
		}
	}
}

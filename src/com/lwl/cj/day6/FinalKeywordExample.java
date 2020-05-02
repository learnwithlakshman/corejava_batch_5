package com.lwl.cj.day6;

import java.util.Arrays;

public class FinalKeywordExample {

		public final static void main(final String... args) {
			final int DAYS_IN_WEEK = 7;
			System.out.println(Arrays.toString(args));
			args[1] = "Tanvi";
			System.out.println(Arrays.toString(args));
			
		}
}

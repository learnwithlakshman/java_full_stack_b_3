package com.lwl.cbook;

public final class IdGenerator {

		private static int id = 1001;
		private IdGenerator() {
			
		}
		public static int getNewId() {
			return id++;
		}
}

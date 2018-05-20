package com.gitChris

class fibSeq {

	static main(args) {
		
		int a = 0, b = 1, c
		
		Scanner scn = new Scanner(System.in)
		
		println("Enter the number: ")
		int n = scn.nextInt()
		
		for (int i = 0; i <= n; i++) {
			c = a + b
			println(c)
			a = b
			b = c
		}
		
	}

}

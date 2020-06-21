public class Patrones {
	public static void Simple1(int n) {
		for (int x=0;x<n;x++) {
			if(x % 2 == 0) {
				System.out.print("*");
			}
			else {
				System.out.print(".");
			}
		}
	}
	public static void Simple2(int n) {
		for (int x=0;x<n;x++) {
			System.out.printf("%d",1234);
		}
	}
	public static void Simple3(int n) {
		for (int x=0;x<n;x++) {
			System.out.print("||*");
		}
	}
	public static void Anidado1(int n) {
		int f,c;
		for(f=0;f<n;f++) { 
			System.out.print("*");
		} 
		
		System.out.print("\n");
		for(c=0; c<n-2;c++) {
			System.out.print("*"); 
			for(f=0;f<n-2;f++) {
				System.out.print(" "); 
		    }
			System.out.print("*");
			System.out.print("\n");
		}
		if(n>1) {
			for(f=0;f<n;f++) {
				System.out.print("*");
			}
		}
		System.out.print("\n");
	}
	public static void Anidado2(int n) {
		int f,c,x;
		x = n - 2;
		for(f=0;f<n;f++) { 
			System.out.print("*");
		} 
		System.out.print("\n");
		for(c=0; c<n-2;c++) {
			for(f=0;f<n;f++) {
				if(f==x) {
					System.out.print("*");
					x--;
				} 
				else {
					System.out.print(" ");
				}
		    }
			System.out.print("\n");
		}
		if(n>1) {
			for(f=0;f<n;f++) {
				System.out.print("*");
			}
		}
		System.out.print("\n");
	}
	public static void Anidado3(int n) {
		int f,c,x,y;
		y = 0;
		x = n - 1;
		System.out.print("\n");
		for(c=0; c<n;c++) {
			for(f=0;f<n;f++) {
				if(f==x) {
					System.out.print("*");
				} 
				else {
					if(f==y) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
		    }
			y++;
			x--;
			System.out.print("\n");
		}
	}
	public static void Anidado4(int n) {
		int f,c;
		for(f=0;f<n-1;f++) {
			System.out.print("*");
		}
		System.out.print("\n");
		for(c=0; c<n-2;c++) {
			System.out.print(" "); 
			for(f=0;f<n-2;f++) {
				System.out.print("*"); 
		    }
			System.out.print(" ");
			System.out.print("\n");
		}
		for(f=1;f<=n;f++) {
			if(f == 1) {
				System.out.print(" ");
			}
			else {
				System.out.print("*");
			}
		}
		if(n == 1) {
			System.out.print("\n");
			System.out.print("*");
		}
		System.out.print("\n");
	}
}

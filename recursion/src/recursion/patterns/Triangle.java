package recursion.patterns;

public class Triangle {
	public static void triangle(int r,int c) {
		if(r==0) return;
		if(c<r) {
			System.out.print("x");
			triangle(r,c+1);
		}else {
			System.out.println();
			triangle(r-1,0);
		}
	}
   public static void triangle2(int r,int c) {
	   if(r==5)return;
	   if(c<=r) {
		   System.out.print("x ");
		   triangle2(r,c+1);
	   }else {
		   System.out.println();
		   triangle2(r+1,1);
	   }
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle2(1,1);
	}

}

public class Demo02{

	public static void main(String args[]){
		
		int n=6;

		int i,a,b;

        for( i=1;i<=n;i++){

            for(  a=n-1;a>=i;a--)

            {

                System.out.print(" ");

            }

            for(  b=1;b<=2*i-1;b++)

            {

               System.out.print("*");

            }

            System.out.println("");

        }
		
		for(i=n-1;i>=1;i--){
			
			for(a=i;a<=n-1;a++){
				
				System.out.print(" ");
			}
			
			for(b=1;b<=2*i-1;b++){
			
				System.out.print("*");
			
		}
		
		System.out.println("");
		
		}
	}	
}
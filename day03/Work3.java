public class Work3{

	public static void main(String args[]){
		double pay = 1000;
		double cost=987;
		double payback=pay - cost;
		
		
		
		int i,j,k,l,m,n;
		for(i=0;i<20;i++){
			for(j=0;j<100;j++){
				for(k=0;k<200;k++){
					for(l=0;l<500;l++){
						for(m=0;m<1000;m++){
							for(n=0;n<2000;n++){
								if(50*i+10*j+5*k+2*l+1*m+n/2 == 987){
								System.out.println("ÕÅÊý£º"+i+j+k+l+m+n);
								}
							}
						}
					}
				}
			}
		}
	}		
}
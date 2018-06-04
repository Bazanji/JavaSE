public class Work3{

	public static void main(String args[]){
		double pay = 1000;
		double cost=987;
		double payback=pay - cost;
		int i,j,k,l,m,n;
		for(n=0;n<2000;n++){
			for(m=0;m<1000;m++){
				for(l=0;l<500;l++){
					for(j=0;j<100;j++){
						for(k=0;k<200;k++){
							for(i=0;i<20;i++){
								// if(0+10+5*k+2+1+n/2 == 13)
							// m=1;
							// l=1;
							// j=1;
							// i=0;
							if(50*i+10*j+5*k+2*l+1*m+n/2 == 13)
								{
									System.out.println("ÕÅÊý£º"
									+i+"\t"
									+j+"\t"
									+k+"\t"
									+l+"\t"
									+m+"\t"
									+n);
								}
							}
						}
					}
				}
			}
		}
		
	}		
}
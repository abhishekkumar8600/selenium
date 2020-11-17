
public class MultiDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]=new int[2][3];
		
		a[0][0]=25;
		a[0][1]=31;
		a[0][2]=33;
		a[1][0]=56;
		a[1][1]=90;
		a[1][2]=12;
		
		System.out.println(a[0][1]);
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		

	}

}

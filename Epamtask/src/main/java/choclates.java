
public class choclates {
int s=0;
int y=0;
	int weight(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			s=s+a[i];
		}
		return(s);
	}
	int count(int a[],int low,int high)
	{
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]>=low&& a[i]<=high)
			{
				y++;
			}
			
		}
		return(y);
	}
}
class loop
	{
		public void show()
			{
				for(int i=0;i<=10;i++)
					{
						System.out.println("Loopind was executed  "+i+"  time");
					}
			}
	}
class looping
	{
		public static void main(String a[])
			{
				loop obj=new loop();
				obj.show();					
			}
	}
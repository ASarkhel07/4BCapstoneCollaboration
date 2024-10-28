public class CollabProgram
{
	public static void main(String[]args)
	{
		createSquareArray(5, 5);
	}


	public static void createSquareArray(int sizeX, int sizeY)
	{
		int[][] arr = new int[sizeX][sizeY];
		for(int i = 0; i < sizeX; i++){
			for(int j = 0; j < sizeY; j++){
				arr[i][j] = (int)(Math.random()*10+1);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}


}
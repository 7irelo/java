package example;

public class Main
{

	public static void main(String[] args)
	{
		int[] array = {10, 4, 5, 1, 3, 7, 8, 6, 2, 9};

    	for (int i = 0; i < array.length - 1; i++)
    	{
        	for (int j = 0; j < array.length - i - 1; j++)
        	{
            	if (array[j] > array[j + 1])
            	{
                	int temp = array[j];
                	array[j] = array[j + 1];
                	array[j + 1] = temp;
            	}
        	}
    	}
		for (int i = 0; i < 10; i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}
import java.net.URL;
import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args)
	{
		attributes a1 = new attributes("Peter Parker", "SPider Man", "unknown", "good", "male");
		
		
		a1.display();
		
		
		//Scanner input = new Scanner(System.in);
		//System.out.print("Enter your name:");
		//String name = input.nextLine();
		//System.out.println(name);
		
		//Scanner input1 = new Scanner(System.in);
		//System.out.print("Enter your age:");
		//String age = input.nextLine();
		//System.out.println(Integer.parseInt(age) + 2);
		//int age = input.nextInt();
		//System.out.println(age + 2);
		
		
		String cardJson = Driver.getJSON("https://datahub.io/five-thirty-eight/comic-characters/r/1.html");
		System.out.println(cardJson);
	}
		
		static String getJSON(String urlString)
		{
			String line = "";
			try
			{
				URL url = new URL(urlString);
				Scanner input = new Scanner(url.openStream());
				//open url stream, 
				//keep reading froms canner as long as their is something to read
				
				while (input.hasNext())
				{
					line += input.nextLine();
				}
				
				input.close();
				//reader close
			}
			catch(Exception e)
			{
				e.printStackTrace();
				line = "Cant connect";
			}
			
			
		
		return line;
		
	}
}

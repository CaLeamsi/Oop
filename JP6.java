import java.util.Scanner;
public class JP4{

public static void main(String[] args){

Scanner in = new Scanner(System.in);
int grade;

			System.out.print("Enter the Grade: ");
			grade = in.nextInt();
	
	try{
		if (grade>100)
			{
			System.out.println("Very Very Very Excellent!");	
			}	
				{
				System.out.println("Very Very Very Excellent!");
				}
					else if(grade>100)
					{
						System.out.println("Excellent!");
					}
						else if(grade>=85)
						{
							System.out.print("Very Satisfactory!");
						}
	
							else if(grade>=80)
							{
								System.out.print("satisfactory");
							}
								else if(grade>=75)
								{
									System.out.print("Fair");
								}
									else
									{
										System.out.print("POOR");
									}
									}
										catch(Exception e)
										{
											System.out.print("invalid");
											}
	}
	}
	
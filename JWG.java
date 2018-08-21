import java.util.*;
class jumble
{
	public static void main(String[] args)
	{
		int flag=0, i,ch,flag2=0,flag3=0,check=0;
		String answer;
		Scanner x=new Scanner(System.in);
		
		String a[]={"POLNIHD","EUNNIPG","IEAANTNGR","AHGRMRUBE","TNAINIGVAO","ACATRBEI","RINOCOEMPH","CPEOELSTE","MDNOIAUH","YRANONTUASURS"};
		String b[]={"DOLPHIN","PENGUIN","ARGENTINA","HAMBURGER","NAVIGATION","BACTERIA","MICROPHONE","TELESCOPE","HUMANOID","TYRANNOSAURUS"};
		String hint1[]={"Animal, as intelligent as human","Remember the old cartoon character?","An American Sportsman's home","We all love to eat it","Most impotant content of the Geography books","Consume these and you'll be fit or may be ill","A performance is incomplete without this","Watch the stars with it","Most Intelligent robot","Welcome to the Jurrasic World"};
		String hint2[]={"A sea creature","A bird","A country known for Football","Kind of a Sandwich, you need to open your mouth wide to eat it","Synonym of Traveling","Microscopic creature","Audio input Device","Kind of a binocular","Human+Android","Carnivorous, king of Dinosaurs"};
		while(true)//used to run the program as long as the user wants which is terminated by a break statement.
		{
			System.out.println("1.Start the game\n2.About\n3.Exit");
			ch=x.nextInt();
			switch(ch)
			{
				case 1:	for (i=0;i<10;i++)//loop for 10 questions
				{
					if(i==9)//for getting different output for the last question
					{
					System.out.println("Final Round\n");
					}
					else//for the rest of the questions
					{
					System.out.println("Round "+(i+1)+"\n");//prints the round number
					}
					System.out.println("Question: "+a[i]+"\n");//prints the question
					System.out.println("\n1.Answer\n2.Hint \n3.Exit");//menu for the options to answer, hint and exit.
					while(true)
					{
					
					int ch1=x.nextInt();//input of choice.
					switch(ch1)
					{
						case 1:	if(i!=9)//for rest of the questions
						{
								answer=x.next();//input of the answer
								if((answer.toUpperCase()).equals(b[i]))
								{
									System.out.println("\nRight answer. You move to next level\n");
									flag3=1;//flag to terminate the loop of the answer menu
								}
								else
								{
									System.out.println("\nWrong Answer. You lost\n");
									flag3=1;
									flag2=1;//flag to terminate the game
								}
								break;
						}
						else if(i==9)//for the final question
						{
							answer=x.next();
								if((answer.toUpperCase()).equals(b[i]))//converts the answer to upper case makin it not case sensitive and checks if it is equal to the answer in the database.
								{
									System.out.println("\nRight answer. You won\nCongratulations!!!!");
									flag3=1;
								}
								else
								{
									System.out.println("\nWrong Answer. You lost\n");
									flag3=1;
									flag2=1;
								}
								break;
						}
						case 2:	if(check==0)//condition if first input is given or not
								{
								System.out.println("\nHint: "+hint1[i]+"\n");
								check=check+1;
								}
								else//for the 2nd hint
								System.out.println("\nHint: "+hint2[i]+"\n");
								break;
						default:flag3=1;
								flag2=1;
								break;
					}
					if(flag3==1)
					{
						flag3=0;
						break;//answer menu terminated on write answer
					}
					}
					if (flag2==1)
					{
						flag2=0;
						break;//answer menu terminated if desired
					}
					check=0;//check variable used as flag to check which hint to print is reset.
				}
				System.out.println();
				break;
				case 2:	System.out.println("Created by Dhruv Chakraborty\n");//prints the game credits
						break;
				default:	flag=1;
						break;
			}
			if(flag==1)
			{
				flag=0;
				break;
			}
		}
	}
}
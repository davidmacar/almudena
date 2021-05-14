public class Challenges {
	private static Challenges challenges = null;
	
	private Challenges(){
	}

	public static Challenges getInstance(){
		if(challenges == null){
			challenges = new Challenges();
		}
		return challenges;
	}

	/*
	* Write a method maximum that returns the largest integer in the list. 
	* You can assume that the list has at leastone element.
	*/
	public Integer maximum(Integer[] numList){
		if(numList.length <= 0)
			return null;
		Integer aux = numList[0];
		for(int i = 1; i < numList.length; i++){
			if(numList[i] > aux)
				aux = numList[i];
		}
		return aux;
	}

	/*
	* Write a program called printNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER" 
	* if the int variable "number" is 1, 2,... , 9, or other, respectively. Use:
	* (a) a "nested-if" statement;
	* (b) a "switch-case-default" statement.
	*/
	public String printNumberInWord(int num){
		//SWITCH CLAUSE
		String ret = "";
		switch(num){
			case 1: 
				ret = "ONE";
			break;
			case 2: 
				ret = "TWO";
			break;
			case 3:
				ret = "THREE"; 
			break;
			case 4:
				ret = "FOUR"; 
			break;
			case 5:
				ret = "FIVE";
			break;
			case 6:
				ret = "SIX"; 
			break;
			case 7:
				ret = "SEVEN"; 
			break;
			case 8:
				ret = "EIGHT"; 
			break;
			case 9:
				ret = "NINE"; 
			break;
			default:
				ret = "OTHER";
			break;
		}
		
		return ret;		

		/*
		// NESTED IFS
		if(num != 1){
			if(num != 2){
				if(num != 3){
					if(num != 4){
						if(num != 5){
							if(num != 6){
								if(num != 7){
									if(num != 8){
										if(num != 9)
											ret = "OTHER";
										else
											ret = "NINE";
									}
									else
										ret = "EIGHT";
								}
								else
									ret = "SEVEN";
							}
							else
								ret = "SIX";
						}
						else
							ret = "FIVE";
					}
					else
						ret = "FOUR";
				}
				else
					ret = "THREE";
			}
			else
				ret = "TWO";
		}
		else
			ret = "ONE";

		return ret;
		*/
	}

	/*
	* Write a method called checkOddEven which prints "Odd Number" 
	* if the int variable “number” is odd, or“Even Number” otherwise.
	* Hint n is an even number if (n % 2) is 0; otherwise, it is an odd number. 
	* Use == for comparison, e.g., (n % 2)== 0. 
	*/
	public void checkOddEven(int num){
		if((num % 2) == 0)
			System.out.println("CHALLENGE 3: " + num + "-> Odd Number");
		else 
			System.out.println("CHALLENGE 3: " + num + "-> Even Number");
	}

	/*
	* Write a method averagethat returns the average of the integer in the list. 
	* You can assumethat the list has at least one element.
	*/
	public double average(Integer[] numList){
		double average = 0.0;
		double sum = 0.0;
		if(numList.length <= 0)
			return 0.0;
		for(int i = 0; i < numList.length; i++){
			sum += numList[i];
		}
		average = sum / numList.length;
		return average;
	}
}

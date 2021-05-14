class Main {
	/*PREGUNTA: En los enunciados no pone el static en la función. ??=¿?¿Significa eso que para cada challenge hay que crear una clase y hacer todo lo de contructors setters y getters?*/
  
	public static void main(String[] args) {
	
	  //Challenge 1
	  Integer[] numList = {4,5,13,4,6};
	  System.out.println("The maximum is " + maximum(numList));
  
	  //Challenge 2
	  int number = 10;
	  printNumberInWord(number);
  
	  //Challenge 3
	  int num = 22;
	  checkOddEven(num);
  
	  //Challenge 4
	  //Using Challenge 1 array
	  System.out.println(average(numList));
	}
}
  
  class CHALLENGES{
	/*Challenge 1: Find Maximum
	Write a method maximum that returns the largest integer in the list. You can assume that the list has at least one element.*/
	public Integer maximum(Integer[] numList){ 
	  System.out.println("CHALLENGE 1");
	  int z = 0;
	  for (int i: numList){
		if(z<i){
		z = i;
		System.out.println("z equals " + z);
		System.out.println("i equals " + i);
		}
	  }
	  return z;
	}
  
  
  /*Challenge 2: Print number in word
  Write a program called printNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively. Use:
  
  (a) a "nested-if" statement;
  
  (b) a "switch-case-default" statement.
  */
	public void printNumberInWord(int number) {
	  System.out.println(" ");
	  System.out.println("CHALLENGE 2a");
	  switch(number){
	  case 1:
		System.out.println("ONE");
	  break;
	  case 2:
		System.out.println("TWO");
	  break;
	  case 3:
		System.out.println("THREE");
	  break;
	  case 4:
		System.out.println("FOUR");
	  break;
	  case 5:
		System.out.println("FIVE");
	  break;
	  case 6:
		System.out.println("SIX");
	  break;
	  case 7:
		System.out.println("SEVEN");
	  break;
	  case 8:
		System.out.println("EIGHT");
	  break;
	  case 9:
		System.out.println("NINE");
	  break;
	  default:
		System.out.println("OTHER");
	  }
  
  
	  System.out.println(" ");
	  System.out.println("CHALLENGE 2b");
	  //hay que hacerlo con nested-if y no sé cómo
	  for(int i=0; i<10;i++){
		if (number==i){  
		  if (number == 1){
		  System.out.println("ONE");
		  }else if (number == 2){
		  System.out.println("TWO");
		  }else if (number == 3){
		  System.out.println("THREE");
		  }else if (number == 4){
		  System.out.println("FOUR");
		  }else if (number == 5){
		  System.out.println("FIVE");
		  }else if (number == 6){
		  System.out.println("SIX");
		  }else if (number == 7){
		  System.out.println("SEVEN");
		  }else if (number == 8){
		  System.out.println("EIGHT");
		  }else if (number == 9){
		  System.out.println("NINE");
		  }
		  return;
		}
		if (i==9){
		  System.out.println("OTHER");
		}
	  }
  
  
	}
  
   /* Challenge 3: Check Odd/Even
  Write a method called checkOddEven which prints "Odd Number" if the int variable “number” is odd, or “Even Number” otherwise.
  
  Hint n is an even number if (n % 2) is 0; otherwise, it is an odd number. Use == for comparison, e.g., (n % 2) == 0.*/
  
  
	public void checkOddEven(int num){ 
	  System.out.println(" ");
	  System.out.println("CHALLENGE 3");
  
  
	  if (num % 2 == 0){
		System.out.println("Even Number");
	  }else{
		System.out.println("Odd Number");
	  }
	}
  
	/*Challenge 4: Calculate the average
  Write a method average that returns the average of the integer in the list. You can assume that the list has at least one element.*/
  
  
  public double average(Integer[] numList) { 
	System.out.println(" ");
	System.out.println("CHALLENGE 4");
	double z=0.0000000;
	for(int y: numList){
	  z = z + y;
	}
	z = z/numList.length;
	return z;
  }
}
  
public class ConditionalStatement {
	public static void main(String[] args){

		int age = 34;
		String sex = "male";  
		float growth = 1.7f;
		char name = 'Д';

if(age > 20) 
    System.out.println(" Вам больше двaдцати лет.");


if(sex == "male" ) 
        System.out.println(" Вы мужского пола");


if(sex == "fmale") 
    System.out.println(" Вы женского пола");


if(growth < 1.80) 
    System.out.println(" Ваш рост ниже среднего");
 else 
    System.out.println(" Ваш рост выше среднего");


if(name == 'М') 
    System.out.println(" Ваше имя начинатся с буквы М");
  else if(name == 'И')
    System.out.println(" Ваше имя начинатся с буквы И");
 else 
  System.out.println(" Ваше имя начинатся с буквы " + name);
} 

	}

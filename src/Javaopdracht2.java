
public class Javaopdracht2 {

	public static void main(String[] args) 
	{
		//De string
	String howManyes = "regeneeeeen";
	
	//Nodig om e's te tellen
	int resultaat = 0;
	
	//Nodig om de letters 1 voor 1 af te gaan
	char[] ch = new char[howManyes.length()];
	  
    
     
    //Array om de letters 1 voor 1 af te gaan
	for (int x = 0; x < howManyes.length(); x ++ )
	{
	//if opdracht om te controleren of de letter daadwerkelijk een 1 is, zoja + 1 bij resultaat
		ch[x] = howManyes.charAt(x);
		if (ch[x] == 'e')
		{
			resultaat ++;
		}
	}
	//Print het resultaat
	System.out.println(resultaat);
	}

}
class Programa{
	public static void main(String[] args){
		String plano = "M";
		switch(plano){
			case "T": 
				System.out.println("5g Youtube");	
			case "M":
				System.out.println("WhatsApp + Instagram Gratis");	
				
			default:
				System.out.println("100 min de ligacao");
			break;
		}		
	}
}
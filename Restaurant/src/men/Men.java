package men;

import java.util.Scanner;
public class Men {
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
	System.out.println("Menu:");
	System.out.println("1.Ciorba de burta.");
	System.out.println("2.Sarmale");
	System.out.println("3.Paste cu creveti");
	System.out.println("4.Tochitura de porc");
	System.out.println("5.Papanasi");
	System.out.println("6.Salata Bianca");
	System.out.println("7.Delicatesa Laura");
	System.out.println("Alegeti optiunea:");
	int op=sc.nextInt();
	switch(op)  {
	case 1:System.out.println("Ai ales ciorba de burta");
		break;
	case 2:System.out.println("Ai ales sarmale");
	    break;
	case 3:System.out.println("Ai ales paste cu creveti");
	    break;
	case 4:System.out.println("Ai ales tochitura de porc ");
        break;
	case 5:System.out.println("Ai ales papanasi");
        break;
	case 6:System.out.println("Ai ales salata Bianca");
        break;
	case 7:System.out.println("Ai ales delicatesa Laura");
        break;
	}
	
	}
	

}

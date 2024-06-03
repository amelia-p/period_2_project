import java.util.Scanner;
import pkg.*;

public class level_two_system{
    public static void main(String[] args){
        
       @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
       System.out.println("Star-Planets System: ");
       System.out.println("Choose what type of Star you would like in your system (input a number)");
       System.out.println("1.Red Dwarf \n2.Red Giant \n3.Yellow Dwarf: ");
       int typenum = sc.nextInt(); 
       
       System.out.println("How many Planets would you like to have in your Star-Planet system?: ");
       int numPlanets = sc.nextInt(); 
       Planet [] planets = new Planet [numPlanets];
       for (int a = 0; a<numPlanets; a++){
            System.out.println("What type of planet would you like Planet "+(a+1)+" to be? \n1. Rocky Planet \n2. Gas Planet \n3. Water planet \n4. Desert Planet \n5. Exoplanet \nPlease input a number");
                int planetType = sc.nextInt(); 
            
                System.out.println("What is the radius of the planet's orbit (in gigameter 10^9)? (input a double)");
                double radius = sc.nextDouble(); 
               
            System.out.println("What will be this planet's mass? (input a double):");
                double mass = sc.nextDouble(); 
                
            planets[a] = new Planet(planetType, radius, mass);
       }
       printPlanetChart(planets);
       
       Star user = new Star (typenum);

        for (int c = 0; c<planets.length; c++){
            double gforce = ((6.6743*(Math.pow(10,-11)))*planets[c].getMass()*user.getMass())/Math.pow(planets[c].getRadius(),2);
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("The force of gravitation that is exerted on Planet "+(c+1)+"(the "+planets[0].getType()+") by the "+user.getType()+" is "+gforce+" Newtons");
        }

            System.out.println(" \n \n");
    }
    public static void printPlanetChart(Planet [] planets){
        for (int i = 0; i<planets.length; i++){
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Planet "+(i+1)+": \nType: "+planets[i].getType()+"\nMass: "+planets[i].getMass()+" kg"+"\nRadius of orbit around star: "+planets[i].getRadius()+" km");
        }
   }


}
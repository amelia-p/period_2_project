
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class level_1 {
	public static void main(String args[]) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Please make sure to input all values as DOUBLES (ex: 1.5, 5.2, 4.0, 101.9, etc.)");
                System.out.println("_______________________________________________________________________________________________________");
                System.out.println("");
                System.out.println("mass: ");
                double m = sc.nextDouble();
                sc.nextLine();
                System.out.println("gravitational force: ");
                double g = sc.nextDouble();
                sc.nextLine();
                System.out.println("distance down the incline: ");
                double x = sc.nextDouble();
                sc.nextLine();
                System.out.println("height of incline: ");
                double h = sc.nextDouble();
                sc.nextLine();
                System.out.println("angle of the incline: ");
                double θ = sc.nextDouble();
				θ = θ*Math.PI/180;
                sc.nextLine();
                //Block user = new Block(m, g, θ, x);
                
                System.out.println("Would you like there to be a frictional force?");
                String answerf = sc.nextLine();
                double vf;
                double gwork;
                double workl;
                double twork;
                if (answerf.equals("yes")||answerf.equals("Yes")||answerf.equals("y")||answerf.equals("Y")){
                    //insert image with friction
                    var frame = new JFrame();
  					var icon = new ImageIcon("Ff.jpg");
  					var label = new JLabel(icon);
  					frame.add(label);
					frame.setSize(500, 500);
  					frame.pack();
  					frame.setVisible(true); 
                    
                    System.out.println("Please input the coefficient of kinetic friction between the block and the incline: ");
                    double uk = sc.nextDouble();
                    sc.nextLine();
                    //how to calculate final velocity with friction:
                    vf = Math.sqrt(Math.abs((2*g*(Math.cos(θ)*uk - Math.sin(θ))*x)));
                    gwork = m*g*(Math.sin(θ))*x;
                    workl = m*g*(Math.cos(θ))*uk*x;
                    twork = Math.abs(workl-gwork);
                    System.out.println("Work done by gravity: "+gwork+" Joules");
                    System.out.println("Work done by friction: "+workl+" Joules");
                    System.out.println("Total work done on block: "+twork+" Joules");
                }
                else{
                    //insert image without friction
                    var frame = new JFrame();
  					var icon = new ImageIcon("nfric.jpg");
  					var label = new JLabel(icon);
  					frame.add(label);
					frame.setSize(5000, 5000);
  					frame.pack();
  					frame.setVisible(true); 
    			
					
					double ttwork = m*g*(Math.sin(θ))*x;
                   
					
					//how to calculate final velocity without friction:
                    vf = Math.sqrt(2*g*h);
					System.out.println("Total work done on block (gravity only): "+ttwork+" Joules");
                    
				}
                System.out.println("Final Velocity: "+vf+" m/s");
                //System.out.println("It takes "+seconds+" seconds for the block to travel down the incline");
            }
	}
}


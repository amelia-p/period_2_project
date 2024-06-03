package pkg;
public class Star{
    String type = "";
    double mass = 0.0; 
    // mass is in septillions 10^24
    public Star (int typenum){
        switch (typenum) {
            case 1 -> {
                type = "Red Dwarf";         //modelled after Proxima Centauri
                mass = 2.428*(Math.pow(10,27));
            }
            case 2 -> {
                type = "Red Giant";         // modelled after Gamma Crucic
                mass = 2586.0*(Math.pow(10,27));
            }
            default -> {
                type = "Yellow Dwarf";      // modelled after the Sun
                mass = 1989.1*(Math.pow(10,27));
            }
        }
    }
    public double getMass(){
        return mass; 
    }
    public String getType(){
        return type;
    }

}
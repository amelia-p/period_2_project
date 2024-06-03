package pkg;
public class Planet{
    
    double radius=0.0; //distance from the star / the planet's orbit radius IN gigameters (10^9)
    String type = ""; 
    boolean isHabitable = false; 
    double mass = 0.0; // in septillions = 10^24
// setType(String) == sets the type of planet that planet is (rocky, gas, water, desert or exoplanet)
    public Planet(int newType, double newRadius, double newMass) {
        switch (newType) {
            case 1 -> type = "Rocky Planet";
            case 2 -> type = "Gas Planet";
            case 3 -> type = "Water Planet";
            case 4 -> type = "Desert Planet";
            default -> type = "Exo Planet";
        }

        setRadius(newRadius);
        setMass(newMass);
    }

    public void setRadius(double newradius){
        radius = newradius*(Math.pow(10,24));
    }
    public void setType(String newtype){
        type = newtype;
        if (type.equals("Water Planet")){
            isHabitable = true;
        }
        else if (type.equals("Desert Planet")){
            isHabitable = true;
            //arrakis :)
        }
    }
    public boolean getHabitability(){
        return isHabitable;
    }
    public void setMass(double newmass){
        mass = newmass*(Math.pow(10,9));
    }

    public double getMass(){
        return mass;
    }
    public double getRadius(){
        return radius;
    }
    public String getType(){
        return type;
    }

}
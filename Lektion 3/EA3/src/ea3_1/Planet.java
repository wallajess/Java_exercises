package ea3_1;

public enum Planet {
    MERCURY(0, 37.9),
    VENUS(0, 108.2),
    EARTH(1, 149.6),
    MARS(2, 228.0),
    JUPITER(79, 778.5),
    SATURN(274, 1432.0), 
    URANUS(28, 2867.0), 
    NEPTUNE(16, 4515.0);
    
    private int moons;
    private double distanceFromSun;
    
    Planet(int moons, double distanceFromSun){
        this.moons = moons;
        this.distanceFromSun = distanceFromSun;
    }
    
    public int getNumberOfMoons() {
        return moons;
    }
    
    public boolean isCloserToSunThan(Planet other) {
        return (this.distanceFromSun < other.distanceFromSun);
        }
    }

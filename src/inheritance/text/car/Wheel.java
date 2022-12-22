package inheritance.text.car;

public class Wheel {

    private String wheel;

    public Wheel(String wheel) {
        this.wheel = wheel;
    }

    public void changeWheel(){
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "wheel='" + wheel + '\'' +
                '}';
    }
}

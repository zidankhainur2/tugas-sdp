import builder.GamingComputerBuilder;
import builder.Builder;
import director.ComputerDirector;
import product.Computer;

public class Main {
    public static void main(String[] args) {
        Builder builder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector();
        director.construct(builder);

        Computer gamingPC = builder.getResult();
        gamingPC.displayInfo();
    }
}

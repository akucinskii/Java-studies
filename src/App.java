import trueFactory.Car;
import trueFactory.Factory;
import trueFactory.FactoryUseCase;
import trueFactory.FordInstruction;
import trueFactory.OpelInstruction;
import trueFactory.MazdaInstruction;

public class App {
    public static void main(String[] args) throws Exception {

        Factory factory = new Factory();

        FactoryUseCase factoryUseCase = new FactoryUseCase(factory);

        factoryUseCase.addInstruction(new OpelInstruction());
        factoryUseCase.addInstruction(new FordInstruction());
        factoryUseCase.addInstruction(new MazdaInstruction());

        Car OpelCar = factoryUseCase.getCarByName("Opel");

        Car FordCar = factoryUseCase.getCarByName("Ford");

        Car MazdaCar = factoryUseCase.getCarByName("Mazda");

        try {
            System.out.println(FordCar.run());
            System.out.println(MazdaCar.run());
            System.out.println(FordCar.stop());

            if (FordCar instanceof trueFactory.Ford)
                ((trueFactory.Ford) FordCar).startSelfDrivingMode();

            if (MazdaCar instanceof trueFactory.Mazda)
                ((trueFactory.Mazda) MazdaCar).honkAtPedestrians();

            if (OpelCar instanceof trueFactory.Opel)
                ((trueFactory.Opel) OpelCar).lockCarDoors();

            System.out.println(OpelCar.run());

            if (OpelCar instanceof trueFactory.Opel)
                ((trueFactory.Opel) OpelCar).unlockCarDoors();

            System.out.println(OpelCar.run());

        } catch (Exception e) {
            System.out.println("No such car instruction in factory");
        }

    }
}

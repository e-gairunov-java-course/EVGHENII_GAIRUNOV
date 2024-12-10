package homework_nr_14.Airplane;

public class Airplane {
    private final String manufacturer;
    private final String model;
    private final int nrOfEngines;

    public Airplane(String manufacturer, String model, int nrOfEngines) {
        if(testString(manufacturer)) this.manufacturer = manufacturer;
        else throw new InvalidManufacturerException("Wrong manufacturer name.");
        if(testString(model)) this.model = model;
        else throw new InvalidModelException("Wrong model name.");
        if(testEngines(nrOfEngines)) this.nrOfEngines = nrOfEngines;
        else throw new InvalidNrOfEnginesException("Wrong number of engines.");
    }

    private static boolean testString(String str){
        return (str != null) && !str.isEmpty();
    }

    private static boolean testEngines(int num){
        return (num != 0) && (num % 2 == 0);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getNrOfEngines() {
        return nrOfEngines;
    }

    public static Airplane createAirplaneLBYL(String manufacturer, String model, int nrOfEngines){
        if(!testString(manufacturer) || !testString(model) || !testEngines(nrOfEngines)){
            System.out.println("Unsuccessful creating Airplane object in createAirplaneLBYL() method.");
            return null;
        }
        System.out.println("Successful creating Airplane object in createAirplaneLBYL() method.");
        return new Airplane(manufacturer,model,nrOfEngines);
    }

    public static Airplane createAirplaneEAFP(String manufacturer, String model, int nrOfEngines){
        Airplane airplane;
        try{
            airplane = new Airplane(manufacturer,model,nrOfEngines);
            System.out.println("Successful creating Airplane object in createAirplaneEAFP() method.");
            return airplane;
        }
        catch (InvalidManufacturerException exception) {
            System.out.println("InvalidManufacturerException in createAirplaneEAFP() method.");
        }
        catch (InvalidModelException exception) {
            System.out.println("InvalidModelException in createAirplaneEAFP() method.");
        }
        catch (InvalidNrOfEnginesException exception){
                    System.out.println("InvalidNrOfEnginesException in createAirplaneEAFP() method.");
        }
        return null;
    }

    public static void main(String[] args) {
        Airplane a1 = createAirplaneLBYL("Boeing", "737", 2);
        Airplane a2 = createAirplaneEAFP("Airbus", "A320", 2);
    }
}

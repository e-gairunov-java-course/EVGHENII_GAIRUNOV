package homework_nr_12;

public enum FuelTypes {
    BENZIN(true),
    SOLARA(true),
    PROPAN(true),
    METAN(false);
    private final boolean isLiquid;
    FuelTypes(boolean isLiquid){this.isLiquid = isLiquid;}
    boolean isLiquidFuel(){return this.isLiquid;}
}

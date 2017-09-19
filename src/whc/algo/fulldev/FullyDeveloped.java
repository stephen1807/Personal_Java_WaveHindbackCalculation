package whc.algo.fulldev;


import whc.algo.FormulaInterface;

/**
 * Rumus untuk fully developed wave
 */
public class FullyDeveloped implements FormulaInterface {

    /**
     * Rumus tinggi gelombang signifikan menurut energi spektral
     *
     * @param windVelocityDouble Kecepatan angin
     * @return Hmo
     */
    public double waveHeightCalc(double windVelocityDouble) {
        double result = 0.2433 * Math.pow(windVelocityDouble, 2) / GRAVITY_CONSTANT_DOUBLE;
        return result;
    }

    /**
     * Rumus perioda puncak gelombang
     *
     * @param windVelocityDouble Kecepatan angin
     * @return Tp
     */
    public double peakPeriodCalc(double windVelocityDouble) {
        double result = 8.134 * windVelocityDouble / GRAVITY_CONSTANT_DOUBLE;
        return result;
    }

    @Override
    public String getType() {
        return "Fully Developed";
    }
}

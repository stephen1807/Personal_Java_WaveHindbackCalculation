package whc.algo.nonfulldev.fetchlimited;

import whc.algo.FormulaInterface;

/**
 * Rumus untuk limited fetch
 */
public class FetchLimited implements FormulaInterface {

    /**
     * Rumus tinggi gelombang signifikan menurut energi spektral
     *
     * @param windVelocityDouble Kecepatan angin
     * @param fetchLengthDouble  Effective fetch length
     * @return Hmo
     */
    public double waveHeightCalc(double fetchLengthDouble, double windVelocityDouble) {
        return 0.0016 * Math.pow(windVelocityDouble, 2) / GRAVITY_CONSTANT_DOUBLE * Math.pow(GRAVITY_CONSTANT_DOUBLE * fetchLengthDouble / Math.pow(windVelocityDouble, 2), (double) 1 / 2);
    }

    /**
     * Rumus perioda puncak gelombang
     *
     * @param windVelocityDouble Kecepatan angin
     * @param fetchLengthDouble  Effective fetch length
     * @return Tp
     */
    public double peakPeriodCalc(double fetchLengthDouble, double windVelocityDouble) {
        return 0.2857 * windVelocityDouble / GRAVITY_CONSTANT_DOUBLE * Math.pow(GRAVITY_CONSTANT_DOUBLE * fetchLengthDouble / Math.pow(windVelocityDouble, 2), (double) 1 / 3);
    }

    public String getType() {
        return "Fetch Limited";
    }
}

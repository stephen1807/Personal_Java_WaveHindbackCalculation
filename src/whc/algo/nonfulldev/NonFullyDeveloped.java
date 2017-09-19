package whc.algo.nonfulldev;

import whc.algo.FormulaInterface;

/**
 * Rumus untuk non fully developed wave
 */
public class NonFullyDeveloped implements FormulaInterface {

    public double timeCCalc(double fetchLengthDouble, double windSpeedDouble) {
        double result = 68.8 * Math.pow(GRAVITY_CONSTANT_DOUBLE * fetchLengthDouble / Math.pow(windSpeedDouble, 2),(double) 2 / 3) * windSpeedDouble / GRAVITY_CONSTANT_DOUBLE;
        return result;
    }

    public String getType() {
        return "Non Fully Developed";
    }
}

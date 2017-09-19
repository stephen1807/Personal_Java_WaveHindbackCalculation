package whc.algo.nonfulldev.durationlimited;

import whc.algo.FormulaInterface;

/**
 * Rumus untuk duration limited
 */
public class DurationLimited implements FormulaInterface {

    /**
     *  Rumus untuk menghitung panjang minimum fetch
     * @param timeDouble Waktu
     * @param windVelocityDouble Kecepatan angin
     * @return
     */
    public double minimumFetchLengthCalc(double timeDouble, double windVelocityDouble) {
        double result = Math.pow(GRAVITY_CONSTANT_DOUBLE * timeDouble / 68.8 / windVelocityDouble, (double)3 / 2) * Math.pow(windVelocityDouble, 2) / GRAVITY_CONSTANT_DOUBLE;
        return result;
    }

    public String getType() {
        return "Duration Limited";
    }
}

package whc.algo;

import whc.algo.fulldev.FullyDeveloped;
import whc.algo.nonfulldev.NonFullyDeveloped;
import whc.algo.nonfulldev.durationlimited.DurationLimited;
import whc.algo.nonfulldev.fetchlimited.FetchLimited;

import java.util.ArrayList;
import java.util.List;

/**
 */
public class Algorithm {

    private double waveHeightDouble = 0;
    private double peakPeriodDouble = 0;
    private List<String> typeList;

    public Algorithm() {
        typeList = new ArrayList<>();
    }

    public void calculateResult(double fetchLengthDouble, double windVelocityDouble, double timeDouble) {

        if (firstCalc(fetchLengthDouble, windVelocityDouble) <= 7.15 * Math.pow(10, 4)) {
            NonFullyDeveloped nonFullyDeveloped = new NonFullyDeveloped();
            typeList.add(nonFullyDeveloped.getType());

            if (nonFullyDeveloped.timeCCalc(fetchLengthDouble, windVelocityDouble) <= timeDouble) {
                FetchLimited fetchLimited = new FetchLimited();
                typeList.add(fetchLimited.getType());
                waveHeightDouble = fetchLimited.waveHeightCalc(fetchLengthDouble, windVelocityDouble);
                peakPeriodDouble = fetchLimited.peakPeriodCalc(fetchLengthDouble, windVelocityDouble);

            } else {
                DurationLimited durationLimited = new DurationLimited();
                typeList.add(durationLimited.getType());

                double fetchLengthMinDouble = durationLimited.minimumFetchLengthCalc(timeDouble, windVelocityDouble);
                FetchLimited fetchLimited = new FetchLimited();
                waveHeightDouble = fetchLimited.waveHeightCalc(fetchLengthMinDouble, windVelocityDouble);
                peakPeriodDouble = fetchLimited.peakPeriodCalc(fetchLengthMinDouble, windVelocityDouble);

            }

        } else {
            FullyDeveloped fullyDeveloped = new FullyDeveloped();
            typeList.add(fullyDeveloped.getType());
            waveHeightDouble = fullyDeveloped.waveHeightCalc(windVelocityDouble);
            peakPeriodDouble = fullyDeveloped.peakPeriodCalc(windVelocityDouble);
        }
    }

    public double getWaveHeightDouble() {
        return waveHeightDouble;
    }

    public void setWaveHeightDouble(double waveHeightDouble) {
        this.waveHeightDouble = waveHeightDouble;
    }

    public double getPeakPeriodDouble() {
        return peakPeriodDouble;
    }

    public void setPeakPeriodDouble(double peakPeriodDouble) {
        this.peakPeriodDouble = peakPeriodDouble;
    }

    public List<String> getTypeList() {
        return typeList;
    }

    public void setTypeList(List<String> typeList) {
        this.typeList = typeList;
    }

    private double firstCalc(double fetchLengthDouble, double windVelocityDouble) {
        double result = 68.8 * Math.pow(FormulaInterface.GRAVITY_CONSTANT_DOUBLE * fetchLengthDouble / Math.pow(windVelocityDouble, 2), (double) 2 / 3);
        return result;
    }
}

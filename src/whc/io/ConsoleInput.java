package whc.io;

import whc.algo.Algorithm;

import java.util.Scanner;

/**
 */
public class ConsoleInput {

    public void manualInput() {

        double fetchLengthDouble;
        double windVelocityDouble;
        double timeDouble;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nilai F:");
        while (true) {
            if (scanner.hasNextDouble()) {
                fetchLengthDouble = scanner.nextDouble();
                break;
            } else {
                System.out.println("Angka tidak dapat diproses. Harap coba lagi");
            }
        }
        System.out.println("Masukkan nilai Ua:");
        while (true) {
            if (scanner.hasNextDouble()) {
                windVelocityDouble = scanner.nextDouble();
                break;
            } else {
                System.out.println("Angka tidak dapat diproses. Harap coba lagi");
            }
        }
        System.out.println("Masukkan nilai t:");
        while (true) {
            if (scanner.hasNextDouble()) {
                timeDouble = scanner.nextDouble();
                break;
            } else {
                System.out.println("Angka tidak dapat diproses. Harap coba lagi");
            }
        }

        Algorithm algorithm = new Algorithm();
        algorithm.calculateResult(fetchLengthDouble, windVelocityDouble, timeDouble);
        System.out.println("Hmo\t:" + algorithm.getWaveHeightDouble());
        System.out.println("Tp\t:" + algorithm.getPeakPeriodDouble());
        System.out.println(algorithm.getTypeList().toString());
        scanner.close();
    }
}

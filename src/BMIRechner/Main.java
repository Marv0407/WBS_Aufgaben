package BMIRechner;

class BMIRechner {

    private static int kalorienempfehlung(double bmi) {
        if (bmi < 18.5) {
            return 2500;
        }
        if (bmi <= 24.9 && bmi >= 18.5) {
            return 2000;
        }
        if (bmi <= 29.9 && bmi >= 25) {
            return 1800;
        }
        if (bmi >= 30) {
            return 1500;
        }
        return 0;
    }

    private static double berechneBMI(double gewicht, double koerpergroesse) {
        return (gewicht/((koerpergroesse/100)*(koerpergroesse/100)));
    }

    public static void bmi(double gewicht, double koerpergroesse) {
        StringBuilder sb = new StringBuilder();
        sb.append("Körpergröße: ");
        sb.append(koerpergroesse);
        sb.append("\n");
        sb.append("Gewicht: ");
        sb.append(gewicht);
        sb.append("\n");
        sb.append("BMI: ");
        sb.append(berechneBMI(gewicht, koerpergroesse));
        sb.append("\n");
        sb.append("\n");
        sb.append("Basierend auf dem BMI ergibt sich folgende Kalorienempfehlung: ");
        sb.append(kalorienempfehlung(berechneBMI(gewicht, koerpergroesse)));
        sb.append("kcal täglich.");
        System.out.println(sb.toString());
    }

}

public class Main {
    public static void main(String[] args) {
        BMIRechner bmiRechner = new BMIRechner();
        BMIRechner.bmi(60.0, 174.0);

    }
}

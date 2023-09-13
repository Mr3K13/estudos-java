package salario;

public class Calculos {
    public double salario, reajuste, salfinal;

    public double calculo() {
        if (salario <= 280) {
            reajuste = 0.2;
            salfinal = salario + (salario * reajuste);
            return salfinal;
        } else if (salario <= 700) {
            reajuste = 0.15;
            salfinal = salario + (salario * reajuste);
            return salfinal;
        } else if (salario <= 1500) {
            reajuste = 0.10;
            salfinal = salario + (salario * reajuste);
            return salfinal;
        } else {
            reajuste = 0.05;
            salfinal = salario + (salario * reajuste);
            return salfinal;

        }
    }
}
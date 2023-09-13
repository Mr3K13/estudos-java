package pagamentos;

public class Calculos {
    public double valorhora, qtdhora, IR, INSS, FGTS, bruto, liquido, desconto;

    public double calculo() {
        bruto = valorhora * qtdhora;
        INSS = bruto * 0.10;
        FGTS = bruto * 0.11;
        if (bruto <= 900) {
            IR = 1;
            liquido = bruto - (INSS);
            desconto = (bruto * IR) + (INSS);
            return liquido;
        } else if (bruto <= 1500) {
            IR = 0.05;
            desconto = (bruto * IR) + (INSS);
            liquido = bruto - desconto;
            return liquido;
        } else if (bruto <= 2500) {
            IR = 0.10;
            desconto = (bruto * IR) + (INSS);
            liquido = bruto - desconto;
            return liquido;
        } else {
            IR = 0.20;
            desconto = (bruto * IR) + (INSS);
            liquido = bruto - desconto;
            return liquido;
        }
    }
}
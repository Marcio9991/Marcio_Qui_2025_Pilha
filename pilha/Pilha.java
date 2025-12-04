package pilha;

import javax.swing.JOptionPane;

public class Pilha {
    public static void main(String[] args) {

        while (true) {
            String pergunta1 = JOptionPane.showInputDialog(null,
                    "Escolha o primeiro metal de acordo com o número: \n(Li-1, K-2, Cs-3, Ba-4, Sr-5, Ca-6, Na-7, Mg-8, Al-9, Mn-10, Zn-11, Fe-12, Co-13, Ni-14, Pb-15, H-16, Cu-17, Ag-18, Pd-19, Pt-20, Au-21) ",
                    "Esolha", JOptionPane.QUESTION_MESSAGE);
            int oxida = Integer.parseInt(pergunta1);

            String pergunta2 = JOptionPane.showInputDialog(null,
                    "Escolha o segundo metal de acordo com o número: \n(Li-1, K-2, Cs-3, Ba-4, Sr-5, Ca-6, Na-7, Mg-8, Al-9, Mn-10, Zn-11, Fe-12, Co-13, Ni-14, Pb-15, H-16, Cu-17, Ag-18, Pd-19, Pt-20, Au-21) ",
                    "Esolha", JOptionPane.QUESTION_MESSAGE);
            int reduz = Integer.parseInt(pergunta2);

            if (oxida == reduz) {
                JOptionPane.showMessageDialog(null, "Não funciona", "Definição pilha",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (oxida < reduz) {
                    int troca;
                    troca = oxida;
                    oxida = reduz;
                    reduz = troca;
                }

                float[] potencialPilhas = new float[21];
                potencialPilhas = preencherPotenciais(potencialPilhas);

                double valorPilha = 0;
                valorPilha = calcularValorPilha(potencialPilhas, oxida - 1, reduz - 1);

                imprimir(potencialPilhas, valorPilha, oxida, reduz);

                String pergunta3 = JOptionPane.showInputDialog(null,
                        "Quer encerrar o programa? (Responda com 'Sim' ou 'Não'", "Question",
                        JOptionPane.QUESTION_MESSAGE);
                if (pergunta3.equals("Sim") == true) {
                    break;
                }
            }

        }
    }

    public static void imprimir(float[] potencialPilhas, double valorPilha, int oxida, int reduz) {

        if (oxida > reduz) {
            JOptionPane.showMessageDialog(null, "O número do metal que oxida é: " + oxida, "Definição pilha",
                    JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "O número do metal que reduz é: " + reduz, "Definição pilha",
                    JOptionPane.INFORMATION_MESSAGE);

            JOptionPane.showMessageDialog(null, "E.pilha = E.red - E.oxi", "Potencial pilha",
                    JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,
                    "E.pilha = ( " + potencialPilhas[reduz] + " sólido) - ( " + potencialPilhas[oxida]
                            + " aquoso)",
                    "Potencial pilha",
                    JOptionPane.INFORMATION_MESSAGE);

            JOptionPane.showMessageDialog(null, "E.pilha: " + valorPilha + " de V", "Potencial pilha",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static double calcularValorPilha(float[] potencialPilhas, int oxida, int reduz) {

        double calc = 0.0;

        if (oxida > reduz) {
            calc = potencialPilhas[oxida] - (potencialPilhas[reduz]);
        }

        if (calc < 0) {
            calc *= -1;
        }

        return calc;
    }

    private static float[] preencherPotenciais(float[] potencialPilhas) {

        for (int i = 0; i < potencialPilhas.length; i++) {
            switch (i) {
                case 1:

                    potencialPilhas[i] = (float) -3.04;
                    break;

                case 2:

                    potencialPilhas[i] = (float) -2.93;
                    break;

                case 3:

                    potencialPilhas[i] = (float) -2.92;
                    break;

                case 4:

                    potencialPilhas[i] = (float) -2.90;
                    break;

                case 5:

                    potencialPilhas[i] = (float) -2.89;
                    break;

                case 6:

                    potencialPilhas[i] = (float) -2.87;
                    break;

                case 7:

                    potencialPilhas[i] = (float) -2.71;
                    break;

                case 8:

                    potencialPilhas[i] = (float) -2.35;
                    break;

                case 9:

                    potencialPilhas[i] = (float) -1.66;
                    break;

                case 10:

                    potencialPilhas[i] = (float) -1.18;
                    break;

                case 11:

                    potencialPilhas[i] = (float) -0.76;
                    break;

                case 12:

                    potencialPilhas[i] = (float) -0.44;
                    break;

                case 13:

                    potencialPilhas[i] = (float) -0.28;
                    break;

                case 14:

                    potencialPilhas[i] = (float) -0.23;
                    break;

                case 15:

                    potencialPilhas[i] = (float) -0.13;
                    break;

                case 16:

                    potencialPilhas[i] = (float) -0.01;
                    break;

                case 17:

                    potencialPilhas[i] = (float) 0.34;
                    break;

                case 18:

                    potencialPilhas[i] = (float) 0.80;
                    break;

                case 19:

                    potencialPilhas[i] = (float) 0.20;
                    break;

                case 20:

                    potencialPilhas[i] = (float) 0.90;
                    break;

                case 21:

                    potencialPilhas[i] = (float) 1.50;
                    break;

                default:

                    break;
            }
        }

        return potencialPilhas;
    }
}

package pilha;

import java.util.Locale;

import javax.swing.JOptionPane;

public class Pilha {
    public static void main(String[] args) {

        while (true) {
            String pergunta1 = JOptionPane.showInputDialog(null,
                    "Escolha o primeiro metal de acordo com o número: \n(Li-1, K-2, Cs-3, Ba-4, Sr-5, Ca-6, Na-7, Mg-8, Al-9, Mn-10, Zn-11, Fe-12, Co-13, Ni-14, Pb-15, Cu-16, Ag-17, Pd-18, Pt-17, Au-20) ",
                    "Metal que oxida", JOptionPane.QUESTION_MESSAGE);
            int oxida = Integer.parseInt(pergunta1);

            String pergunta2 = JOptionPane.showInputDialog(null,
                    "Escolha o segundo metal de acordo com o número: \n(Li-1, K-2, Cs-3, Ba-4, Sr-5, Ca-6, Na-7, Mg-8, Al-9, Mn-10, Zn-11, Fe-12, Co-13, Ni-14, Pb-15, Cu-16, Ag-17, Pd-18, Pt-19, Au-20) ",
                    "Metal que reduz", JOptionPane.QUESTION_MESSAGE);
            int reduz = Integer.parseInt(pergunta2);

            float[] potencialPilhasReduz = new float[20];
            potencialPilhasReduz = preencherPotenciaisReduzem(potencialPilhasReduz);

            float[] potencialPilhasOxida = new float[20];
            potencialPilhasOxida = preencherPotenciaisOxidam(potencialPilhasOxida, potencialPilhasReduz);

            String[] metais = new String[20];
            metais = preencherMetais(metais);

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

                double valorPilha = 0;
                valorPilha = calcularValorPilha(potencialPilhasReduz, potencialPilhasOxida, oxida - 1, reduz - 1);

                imprimir(potencialPilhasReduz, valorPilha, oxida, reduz, metais);

                String pergunta3 = JOptionPane.showInputDialog(null,
                        "Quer encerrar o programa? (Responda com 'Ss' ou 'Nn'", "Question",
                        JOptionPane.QUESTION_MESSAGE);
                if (pergunta3.equals("Ss") == true) {
                    break;
                }
            }

        }
    }

    public static void imprimir(float[] potencialPilhas, double valorPilha, int oxida, int reduz, String[] metais) {

        String valorFormatado = String.format(Locale.US, "%.2f", valorPilha);

        if (oxida > reduz) {
            JOptionPane.showMessageDialog(null, "O número do metal que oxida é: " + metais[oxida - 1],
                    "Definição pilha",
                    JOptionPane.INFORMATION_MESSAGE);

            JOptionPane.showMessageDialog(null, "O número do metal que reduz é: " + metais[reduz - 1],
                    "Definição pilha",
                    JOptionPane.INFORMATION_MESSAGE);

            JOptionPane.showMessageDialog(null, "E.pilha = E.red - E.oxi", "Potencial pilha",
                    JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,
                    "E.pilha = ( " + potencialPilhas[reduz - 1] + " sólido) - ( " + potencialPilhas[oxida - 1]
                            + " aquoso)",
                    "Potencial pilha",
                    JOptionPane.INFORMATION_MESSAGE);

            JOptionPane.showMessageDialog(null, "E.pilha: " + valorFormatado + " V", "Potencial pilha",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static double calcularValorPilha(float[] potencialPilhasReduz, float[] potencialPilhasOxida, int oxida, int reduz) {

        double calc = 0.0;

        if (oxida > reduz) {
            calc = potencialPilhasOxida[oxida] - (potencialPilhasReduz[reduz]);
        }

        if (calc < 0) {
            calc *= -1;
        }

        return calc;
    }

    private static float[] preencherPotenciaisOxidam(float[] potencialPilhasOxida, float[] potencialPilhasReduz) {

        for (int i = 0; i < potencialPilhasOxida.length; i++) {
            potencialPilhasOxida[i] = potencialPilhasReduz[i]*(-1);
        }

        return potencialPilhasOxida;
    }

    private static float[] preencherPotenciaisReduzem(float[] potencialPilhas) {

        for (int i = 0; i < potencialPilhas.length; i++) {
            switch (i) {
                case 0:

                    potencialPilhas[i] = (float) -3.04;
                    break;

                case 1:

                    potencialPilhas[i] = (float) -2.93;
                    break;

                case 2:

                    potencialPilhas[i] = (float) -2.92;
                    break;

                case 3:

                    potencialPilhas[i] = (float) -2.90;
                    break;

                case 4:

                    potencialPilhas[i] = (float) -2.89;
                    break;

                case 5:

                    potencialPilhas[i] = (float) -2.87;
                    break;

                case 6:

                    potencialPilhas[i] = (float) -2.71;
                    break;

                case 7:

                    potencialPilhas[i] = (float) -2.35;
                    break;

                case 8:

                    potencialPilhas[i] = (float) -1.66;
                    break;

                case 9:

                    potencialPilhas[i] = (float) -1.18;
                    break;

                case 10:

                    potencialPilhas[i] = (float) -0.76;
                    break;

                case 11:

                    potencialPilhas[i] = (float) -0.44;
                    break;

                case 12:

                    potencialPilhas[i] = (float) -0.28;
                    break;

                case 13:

                    potencialPilhas[i] = (float) -0.23;
                    break;

                case 14:

                    potencialPilhas[i] = (float) -0.13;
                    break;

                case 15:

                    potencialPilhas[i] = (float) 0.34;
                    break;

                case 16:

                    potencialPilhas[i] = (float) 0.80;
                    break;

                case 17:

                    potencialPilhas[i] = (float) 0.20;
                    break;

                case 18:

                    potencialPilhas[i] = (float) 0.90;
                    break;

                case 19:

                    potencialPilhas[i] = (float) 1.50;
                    break;

                default:

                    break;
            }
        }

        return potencialPilhas;
    }

    private static String[] preencherMetais(String[] metais) {

        for (int i = 0; i < metais.length; i++) {
            switch (i) {
                case 0:
                    metais[i] = "Lítio";
                    break;

                case 1:
                    metais[i] = "Potássio";
                    break;

                case 2:
                    metais[i] = "Césio";
                    break;

                case 3:
                    metais[i] = "Bário";
                    break;

                case 4:
                    metais[i] = "Estrôncio";
                    break;

                case 5:
                    metais[i] = "Cálcio";
                    break;

                case 6:
                    metais[i] = "Sódio";
                    break;

                case 7:
                    metais[i] = "Magnésio";
                    break;

                case 8:
                    metais[i] = "Alumínio";
                    break;

                case 9:
                    metais[i] = "Manganês";
                    break;

                case 10:
                    metais[i] = "Zinco";
                    break;

                case 11:
                    metais[i] = "Ferro";
                    break;

                case 12:
                    metais[i] = "Cobalto";
                    break;

                case 13:
                    metais[i] = "Níquel";
                    break;

                case 14:
                    metais[i] = "Chumbo";
                    break;

                case 15:
                    metais[i] = "Cobre";
                    break;

                case 16:
                    metais[i] = "Prata";
                    break;

                case 17:
                    metais[i] = "Paládio";
                    break;

                case 18:
                    metais[i] = "Platina";
                    break;

                case 19:
                    metais[i] = "Ouro";
                    break;

                default:
                    break;
            }
        }

        return metais;
    }
}

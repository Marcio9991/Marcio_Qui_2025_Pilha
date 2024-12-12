package pilha;

import javax.swing.JOptionPane;

public class Pilha {
    public static void main(String[] args) {
        String pergunta1 = JOptionPane.showInputDialog(null, "Escolha o primeiro metal de acordo com o número: \n(Li-1, K-2, Cs-3, Ba-4, Sr-5, Ca-6, Na-7, Mg-8, Al-9, Mn-10, Zn-11, Fe-12, Co-13, Ni-14, Pb-15, H-16, Cu-17, Ag-18, Pd-19, Pt-20, Au-21) ", "Esolha", JOptionPane.QUESTION_MESSAGE);
        int n1 = Integer.parseInt(pergunta1);

        String pergunta2 = JOptionPane.showInputDialog(null, "Escolha o segundo metal de acordo com o número: \n(Li-1, K-2, Cs-3, Ba-4, Sr-5, Ca-6, Na-7, Mg-8, Al-9, Mn-10, Zn-11, Fe-12, Co-13, Ni-14, Pb-15, H-16, Cu-17, Ag-18, Pd-19, Pt-20, Au-21) ", "Esolha", JOptionPane.QUESTION_MESSAGE);
        int n2 = Integer.parseInt(pergunta2);

        float[] potencialPilhas = new float[21];

        for (int i = 0; i < potencialPilhas.length; i++) {
            switch (i) {
                case 1:

                    potencialPilhas[i] = -304/100;                    
                    break;

                case 2:

                    potencialPilhas[i] = -293/100;                    
                    break;

                case 3:

                    potencialPilhas[i] = -292/100;                    
                    break;

                case 4:

                    potencialPilhas[i] = -290/100;                    
                    break;
                
                case 5:

                    potencialPilhas[i] = -289/100;                    
                    break;

                case 6:

                    potencialPilhas[i] = -287/100;                    
                    break;

                case 7:

                    potencialPilhas[i] = -271/100;                    
                    break;

                case 8:

                    potencialPilhas[i] = -235/100;                    
                    break;

                case 9:

                    potencialPilhas[i] = -166/100;                    
                    break;
                
                case 10:

                    potencialPilhas[i] = -118/100;                    
                    break;

                case 11:

                    potencialPilhas[i] = -76/100;                    
                    break;

                case 12:

                    potencialPilhas[i] = -44/100;                    
                    break;

                case 13:

                    potencialPilhas[i] = -28/100;                    
                    break;

                case 14:

                    potencialPilhas[i] = -23/100;                    
                    break;
                
                case 15:

                    potencialPilhas[i] = -13/100;                    
                    break;

                case 16:

                    potencialPilhas[i] = -1/100;                    
                    break;

                case 17:

                    potencialPilhas[i] = 34/100;                    
                    break;

                case 18:

                    potencialPilhas[i] = 80/100;                    
                    break;

                case 19:

                    potencialPilhas[i] = 20/100;                    
                    break;
                
                case 20:

                    potencialPilhas[i] = 90/100;                    
                    break;

                case 21:

                    potencialPilhas[i] = 150/100;                    
                    break;

                default:

                    break;
            }
        }
        
        float valorPilha;

        if (n1 < n2) {
            valorPilha = potencialPilhas[n1 - 1] -  potencialPilhas[n2 - 1];
        } else {
            valorPilha = potencialPilhas[n2 - 1] -  potencialPilhas[n1 - 1];
        }

        if (n1 > n2) {
            JOptionPane.showMessageDialog(null, "O metal que oxida é: " + pergunta1, "Definição pilha", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "O metal que reduz é: " + pergunta2, "Potencial pilha", JOptionPane.INFORMATION_MESSAGE);

            JOptionPane.showMessageDialog(null, "E.pilha = E.red - E.oxi", "Potencial pilha", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "E.pilha = ( " + n2 +" ) - ( " + n1 + " )", "Potencial pilha", JOptionPane.INFORMATION_MESSAGE);

            JOptionPane.showMessageDialog(null, "E.pilha: " + valorPilha + " de V", "Potencial pilha", JOptionPane.INFORMATION_MESSAGE);
        } if (n2 < n1) {
            JOptionPane.showMessageDialog(null, "O metal que oxida é: " + pergunta2, "Definição pilha", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "O metal que reduz é: " + pergunta1, "Potencial pilha", JOptionPane.INFORMATION_MESSAGE);

            JOptionPane.showMessageDialog(null, "E.pilha = E.red - E.oxi", "Potencial pilha", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "E.pilha = ( " + n1 +" ) - ( " + n2 + " )", "Potencial pilha", JOptionPane.INFORMATION_MESSAGE);

            JOptionPane.showMessageDialog(null, "E.pilha: " + valorPilha + " de V", "Potencial pilha", JOptionPane.INFORMATION_MESSAGE);
        } if (n1 == n2) {
            JOptionPane.showMessageDialog(null, "Não funciona", "Definição pilha", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}

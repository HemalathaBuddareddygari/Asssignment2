package java.com;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

    public  class AverageAge {

        public static void main(String[] args) {
            int Avg = 0;
            int n = Integer
                    .parseInt(JOptionPane
                            .showInputDialog("Enter number of how many people are in the classroom:"));
            n = n - 1;

            List<Integer> Ages = new ArrayList<>();
            Ages.add(21);
            Ages.add(22);
            Ages.add(23);
            Ages.add(25);
            for (int i = 0; i <= n; i++) {
                Ages.add(Integer.parseInt(JOptionPane
                        .showInputDialog("Enter the ages, program will stop at length limit.")));
            }
            AverageAge(Ages);
        }
        public static int AverageAge(List<Integer> Ages) {
            int sum = 0;
            for (int x = 0; x < Ages.size(); x++) {
                sum = sum + Ages.get(x);
            }
            int Avg = sum / Ages.size();
            JOptionPane.showMessageDialog(null, "The average age is: \n" + Avg);
            return Avg;

        }
    }

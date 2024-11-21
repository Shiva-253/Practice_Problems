public class SortingNames {

    public static void main(String[] args) {
        String names[] = {"Krishna", "Balaram", "Shiva", "Bharama", "Ganesh", "Durga", "Avinash", "Avinasa"};
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                int index = 0;
                while (index < names[i].length() && index < names[j].length() && names[i].charAt(index) == names[j].charAt(index)) {
                    index++;
                }
                if (index < names[i].length() && index < names[j].length() && names[i].charAt(index) > names[j].charAt(index)) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                } else if (index == names[i].length() && index < names[j].length()) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
    }

}

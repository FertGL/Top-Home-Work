package less_56.task3;

public class Main {
    private static final String LENGTH_RULE = "Пароль должен быть длиной от 8 до 20 символов";
    private static final String BIG_LETTER = "Пароль должен содержать хотя бы одну заглавную букву";
    private static final String SMALL_LETTER = "Пароль должен содержать хотя бы одну строчную букву";
    private static final String HAVE_DIGIT = "Пароль должен содержать хотя бы одну цифру";
    private static final String NO_SPACE = "Пароль не должен содержать пробелов";

    public static void main(String[] args) {
        String[] passwords = {"MyPassword123", "ffffff66", "ShlechtPass", "aSdf3h", "avalanche gt2020"};
        passCheck(passwords);
    }

    /**
     *
     * @param passwords массив паролей типа String
     * Этот метод проверяет все пароли в массиве и выводит заключение, выполняет ли они все условия, в противном случае
     *                  выводит те условия которыйе они не выполняют
     */
    private static void passCheck(String[] passwords) {
        String result = "";
        for (String pass : passwords) {
            StringBuilder passFlaws = new StringBuilder();
            if (!(pass.length() > 8 && pass.length() < 20)) {
                passFlaws.append(LENGTH_RULE).append(", ");
            }
            if (pass.toLowerCase().equals(pass)) {
                passFlaws.append(BIG_LETTER).append(", ");
            }
            if (pass.toUpperCase().equals(pass)) {
                passFlaws.append(SMALL_LETTER).append(", ");
            }
            if (pass.replaceAll("[^1-9]", "").isBlank()) {
                passFlaws.append(HAVE_DIGIT).append(", ");
            }
            if (!(pass.replaceAll(" ", "").length() == pass.length())) {
                passFlaws.append(NO_SPACE).append(", ");
            }


            if (passFlaws.isEmpty()) {
                System.out.println(result = "Пароль: " + pass + " - " + "подходит");
            } else {
                System.out.println(result = "Пароль: " + pass + " - " + passFlaws.deleteCharAt(passFlaws.length() - 2));
            }

        }
    }
}


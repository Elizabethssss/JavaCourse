package task1.view;

public class Util {
    public final String MENU = "Choose command:\n1. Print all\n" +
            "2. Add new student\n" +
            "3. Exit";

    public final String WRONG_INPUT = "Wrong input!!!";

    public enum Enter {
        SURNAME("Enter surname: "),
        NAME("Enter name: "),
        BIRTH("Enter date of birth (xx.xx.xxxx): "),
        TELEPHONE("Enter phone number (+38(0xx)xx-xx-xxx): "),
        ADDRESS("Enter address (Street N', 'room' N): ");

        private String info;
        public String getInfo() {
            return info;
        }

        Enter(String info) {
            this.info = info;
        }
    }

}

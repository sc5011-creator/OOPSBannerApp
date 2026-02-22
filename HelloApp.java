class HelloApp {

    static void printOops() {

        String banner = String.join("\n",
            " OOOO   OOOO   PPPP    SSSS ",
            "O    O O    O  P   P  S     ",
            "O    O O    O  PPPP    SSS  ",
            "O    O O    O  P          S ",
            " OOOO   OOOO   P      SSSS  "
        );

        System.out.println(banner);
    }

    public static void main(String[] args) {
        printOops();
    }
}
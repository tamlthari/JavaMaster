public class MegaBytesConverter {

    public static int toMegaBytes(int kiloBytes) {

        int megaBytes = Math.round(kiloBytes / 1000);

        return megaBytes;
    }

    public static int remainderkB(int kiloBytes) {

        int remainderKiloBytes = kiloBytes % 1000;

        return remainderKiloBytes;
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int remainderKiloBytes = kiloBytes % 1024;

            int megaBytes = Math.round(kiloBytes / 1024);

            System.out.println(kiloBytes +
                    " KB = " + megaBytes +
                    " MB and " + remainderKiloBytes +
                    " KB");
        }
    }
}

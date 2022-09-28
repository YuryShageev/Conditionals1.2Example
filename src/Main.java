public class Main {
    public static void main(String[] args) {
        int age = 19;
        boolean conNotGoToSchool = age < 7 || age >= 18;
        if (age >= 18 && age < 21) {
            System.out.println("Тебе достаточно лет, чтобы водить авто, но не достаточно, чтобы пить алкоголь");
        }
        if (conNotGoToSchool) {
            System.out.println("Я думаю, что ты не ходишь в школу");
        }

        boolean skyIsClear = true;
        if (skyIsClear) {
            System.out.println("Небо чистое");
        }
    }
}
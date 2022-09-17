import java.util.logging.Handler;

public class sesliHarfler {
    public static void main(String[] args) {
        char harf ='A';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
            System.out.println("Kalın sesli Harf");
                break;
            default:
            System.out.println("İnce sesli Harf");

                break;
        }
    }
}

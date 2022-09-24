import java.io.SyncFailedException;

public class methods2 {
    public static void main(String[] args) {
        String mesaj ="Bugün hava çok güzel";
        String yenimesaj =sehirver();
        System.out.println(yenimesaj);
        int sayi = topla(7,5);
        System.out.println(sayi);
        int toplam =topla2(2,5,5,8,6,5);
        System.out.println(toplam);
    }
    public static void ekle(){ //void yap 
        System.out.println("Eklendi.");
    }
    public static void sil(){
        System.out.println("Silindi.");

    }
    public static void guncelle(){
        System.out.println("Güncellendi.");

    }
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public static int topla2(int... sayilar){
        int toplam =0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }

    public static String sehirver(){
        return "Ankara";
    }


}

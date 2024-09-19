public class ContohJava {
    public static int hitungLuasPersegi ( int sisi){
        return sisi * sisi;
    }

    public static void main(String[] args) {
        int sisi = 5;
        System.out.println("Luas Persegi dari Sisi " + sisi  + " = " + hitungLuasPersegi(sisi));
    }
}

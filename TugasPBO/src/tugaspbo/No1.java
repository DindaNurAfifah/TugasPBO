package tugaspbo;


public class No1 {
    
     public static void main(String[] args) {
        String Awal  = "JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis";
        String kasus_1 = Awal.substring(0,36);
        System.out.println("Kasus 1 : " + kasus_1);
        
        String kasus_2 = kasus_1.toLowerCase();
        System.out.println("Kasus 2 : " + kasus_2);
        
        String kasus_3 = kasus_1.toUpperCase();
        System.out.println("Kasus 3 : " + kasus_3);
            
        String kasus_4 = Awal.substring(25,36);
        System.out.println("Kasus 4 : " + kasus_4);
        
        String kasus_5 = Awal.substring(37,63);
        System.out.println("Kasus 5 : " + kasus_5);
            

 }
}

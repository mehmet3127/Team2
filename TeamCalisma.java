public class TeamCalisma {
    public static void main(String[] args) {
        System.out.println("Team 2 Collaborate");
        System.out.println("Team 2 esra");
        System.out.println("Team 2 yeliz");


        int a = 10;
        int b = 10;
        int c = 0;
        //GOREV PAYLASIMI

        // a ile b yi toplayan method             --esra hanim     ----20 - 25
        // a ile b yi carpan method                 --hasan kucuk   ----26 -30
        // a ile b yi bolen method                  --hasan demir   ----31 -35
        // a ile b yi cikartan method               --hanife hanim   ----36-40
        // a ile b yi ortalamasini alan method      --kevser hanim     ----41-45
        // a ile b yi ortalamasinin karesini alan method --yeliz hanim     ----46-50

toplayanMethod(int a,int b,int c);
toplamininKaresiniAlma(int a, int b, int c);
ortalamasiniALma(int a,int b,int c);
cikar(int a,int b, int c);
carpim(int a,int b,int c);
toplamininKaresi(int a,int b,int c);


        }

    public static void toplayanMethod(int a,int b,int c){

        c=a+b;
        System.out.println(c);
    }
    
    
    public static void toplamininKaresiniAlma(int a, int b, int c) {
        c = (a + b) * (a + b);
        System.out.println(c);

     }

public static void ortalamasiniALma(int a,int b,int c){
        c=((a+b)/2);
    System.out.println(c);
}

        public static void cikar(int a,int b, int c){
            c=a-b;
            System.out.println("Verilen Iki Sayinin Farki : "+c);
            }
        
        public static void carpim(int a,int b,int c){

        c=a*b;
        System.out.println(c);
    }
        public static void toplamininKaresi(int a,int b,int c){
        c=(a+b)*(a+b)-5;
        System.out.println(c);
        
        }


}

package enKucukEnBuyuk;

public class Search {
    public int enK;
    public int enB;
    public int bul(int [] a, int b){
        for( int i: a){
            if ( i < b) this.enK=i;
            else {
                this.enB=i;
                System.out.println("En kücük sayı: "
                        + this.enK+" \nEn büyük sayı: "+ this.enB);
                return this.enB;
            }
        }
        return b;
    }
}


/// -788  -1  0  1  2  12  15  788

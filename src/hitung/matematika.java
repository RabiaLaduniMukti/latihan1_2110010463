package hitung;

public class matematika {
    //membuat atribut
    double bil1,bil2;
    
    //method constructor
    public matematika (double bil1, double bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
        
    }

    //method accsessor
    public double setpenjumlahan (){
        return bil1 + bil2 ;
    }
    public double setpengurangan (){
        return bil1 - bil2 ;
}
    public double setperkalian (){
        return bil1 * bil2 ;
}
    public double setpembagian (){
        return bil1 / bil2 ;
    }
    

}


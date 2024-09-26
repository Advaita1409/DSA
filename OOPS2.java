
public class OOPS2 {
    public static void main(String args[]){
        Queen q = new Queen();
        q.move();
    }
}

interface chessPlayer{
    void move(); //abstract method
}

class Queen implements chessPlayer{
    public void move(){
        System.out.println("up,down,left,right, diagonal(all four directions)");
    }
}

class Rook implements chessPlayer{
    public void move(){
        System.out.println("up,down,left,right");
    }
}

class King implements chessPlayer{
    public void move(){
        System.out.println("up,down,left,right, diagonal(by one step)");
    }
}
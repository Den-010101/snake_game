import java.awt.*;
import java.util.ArrayList;

public class Snake {

    private ArrayList<Node> snakebody;

    public  Snake(){
        snakebody = new ArrayList<>();
        snakebody.add(new Node(80,0));
        snakebody.add(new Node(60,0));
        snakebody.add(new Node(40,0));
        snakebody.add(new Node(20,0));
    }
    public  ArrayList<Node>getSnakebody(){
        return  snakebody;
    }

    public  void drawSnake(Graphics g){

        for(int i = 0;i<snakebody.size();i++){
            if(i == 0){
                g.setColor(Color.RED);
            }else{
                g.setColor(Color.BLUE);
            }

            Node n = snakebody.get(i);
            if(n.x >Main.width){
                n.x = 0;
            }
            if(n.x < 0){
                n.x=Main.width - Main.CELL_SIZE;
            }
            if(n.y >Main.height){
                n.y = 0;
            }
            if(n.y < 0){
                n.x=Main.height - Main.CELL_SIZE;
            }

            g.fillOval(n.x,n.y,Main.CELL_SIZE,Main.CELL_SIZE);
        }
    }
}

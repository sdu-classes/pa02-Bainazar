public class Square extends Rectangle {
    public Square(){

    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side ,String color , boolean filled){
        super(side,side);
        super.color = color;
        super.filled = filled;
    }
    public double getSide(){
        return width;
}
    public void setSide( double side){
        this.width= side;
}
    public void setWidth( double side ){
        this.width = side;
}
    public void setLength(double side){
        this.length = side ;
    }
    public String toString(){
        return "Square[Rectangle[Shape[color="+color+",filled="+filled+"],width="+width+",length="+length+"]";
    }

    }

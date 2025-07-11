/** A class that represents a path via pursuit curves. */
public class Path {
    // TODO
    private Point curr;
    private Point next;
    public Path(double x, double y){
        next=new Point(x,y);
        curr=new Point();
    }
    public double getCurrX(){
        return curr.getX();
    }
    public double getCurrY(){
        return curr.getY();
    }
    public double getNextX(){
        return next.getX();
    }
    public double getNextY(){
        return next.getY();
    }
    public Point getCurrentPoint(){
        return curr;
    }
    public void setCurrentPoint(Point point){
        curr.setX(point.getX());
        curr.setY(point.getY());
    }
    public void iterate(double dx,double dy){
        setCurrentPoint(next);
        next.setX(next.getX()+dx);
        next.setY(next.getY()+dy);
    }
}

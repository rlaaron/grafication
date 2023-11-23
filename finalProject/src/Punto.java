class Punto {
    int x,y,z;
    public Punto(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString(){
        return "x: "+x+" y: "+y+" z: "+z;
    }
}
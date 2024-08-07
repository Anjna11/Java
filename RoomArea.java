class Room {
    float length;
    float breadth;
    
    void getdata(float a, float b) {
        
        length = a;
        breadth = b;
    }
}

class RoomArea {
    
    public static void main(String args[]){
        float area;
        
        Room r = new Room();
        r.getdata(14, 10);
        area = r.length * r.breadth;
        System.out.print("Area is: " +area);
    }
} 

public class Box {
     double height;
     double width;
     double depth;
    
    
    public Box() {
        this.height = 0;
        this.width = 0;
        this.depth = 0;
    }
    
    
    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    
    
    public double calculateVolume() {
        return height * width * depth;
    }
    
    
    class Box_new extends Box {
        private double weight;
        
        
        public Box_new(double height, double width, double depth, double weight) {
            super(height, width, depth); 
            this.weight = weight;
        }
        
        
        public double getWeight() {
            return weight;
        }
    }
    
    
    public static void main (String args[]) {
        
        Box box = new Box(5.0, 6.0, 7.0);
        System.out.println("Volume of box: " + box.calculateVolume());

    
        Box_new box_new = box.new Box_new(5.0, 6.0, 7.0, 15.0);
        System.out.println("Volume of box_new: " + box_new.calculateVolume());
        System.out.println("Weight of box_new: " + box_new.getWeight());
    }
}

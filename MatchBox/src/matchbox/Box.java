package matchbox;

/**
 *
 * @author Eugene Vereshchagin (g7skim)
 */
class Box {
 
   double width;
   double height;
   double depth;
 
   // This is an empty constructor
   Box() {
          
   }
   // Constructor with parameters
   Box(double w, double h, double d) {
          width  = w;
          height = h;
          depth  = d;
   }
 
   void getVolume() {
          System.out.println("Volume of MatchBox is : " + width * height * depth);
   }

    
}

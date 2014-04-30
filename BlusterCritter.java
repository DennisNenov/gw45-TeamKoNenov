 
import info.gridworld.actor.Actor; 
import info.gridworld.actor.Rock; 
import info.gridworld.actor.Critter; 
 
import info.gridworld.grid.Location; 
 
import java.util.ArrayList; 
import java.awt.Color;

public class BlusterCritter extends Critter{
private int courage;
public BlusterCritter (int bound){
  courage= bound;
}
public ArrayList<Actor> getActors(){
Location l= getLocation();
ArrayList a= new ArrayList();
for(int i = loc.getRow() - 2; i <= loc.getRow() + 2; i++ ){ 
 for(int u = loc.getCol() - 2; u <= loc.getCol() + 2; u++){
  Location t= new Location( i, u);
    if (getGrid().isValid(t)){
      Actor aa= getGrid().get(t);
        if (aa != null){
          a.add(aa);
          }
      }
    }
  }
  return a;
}
public void processActors(ArrayList<Actor> actors){ 
 int i= 0; 
Color c = getColor(); 
 int red = c.getRed(); 
 int green = c.getGreen(); 
 int blue = c.getBlue(); 
 for(Actor a: actors) {
 if(a instanceof Critter) {
 count++; }
 if(count < courageFactor){ 
 if(red > 0) red++; 
 if(green > 0) green++; 
 if(blue > 0) blue++;  }
 else {
 if(red > 0) red--; 
 if(green > 0) green--; 
 if(blue > 0) blue--; 
 } 
  
 setColor(new Color(red, green, blue));
 }
}

import info.gridworld.actor.Actor; 
import info.gridworld.actor.Critter; 
import info.gridworld.grid.Grid; 
import info.gridworld.grid.Location; 
import java.awt.Color; 
import java.util.ArrayList; 
 

public class KingCrab extends CrabCritter { 

 public int distance(Location loc1, Location loc2) { 
 int x1 = loc1.getRow(); 
 int y1 = loc1.getCol(); 
 int x2 = loc2.getRow(); 
 int y2 = loc2.getCol(); 
 double d = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2)) + .5; 
 return (int)Math.floor(d); 
 } //distanceformula!
 

 * This method moves the Actor to a location that is one location 
 * further away from this KingCrab and returns true. If there is no 
 * location that is one location further away, the method returns false. 
 */ 
 private boolean moveActor (Actor a) 
 { 
 ArrayList<Location> locs = 
 getGrid().getEmptyAdjacentLocations(a.getLocation()); 
 
 for(Location loc:locs) 
 { 
 if(distance(getLocation(), loc) > 1) 
 { 
 a.moveTo(loc); 
 return true; 
 } 
 } 
 
 return false; 
 } 
 
 public void processActors(ArrayList<Actor> actors) 
 { 
 for (Actor a : actors) 
 { 
 if (!moveActor(a)) 
 { 
 a.removeSelfFromGrid(); 
 } 
 } 
 } 
} 

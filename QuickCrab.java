import info.gridworld.actor.Actor; 
import info.gridworld.actor.Critter; 
import info.gridworld.grid.Grid; 
import info.gridworld.grid.Location; 

import java.util.ArrayList; 


public class QuickCrab extends CrabCritter{
  
  
  public ArrayList<Location> getMoveLocations(){ 
 ArrayList<Location> l = new ArrayList<Location>(); 
 Grid g = getGrid(); 
 
 twoAway(l,getDirection() + Location.LEFT); 
 twoAway(l,getDirection() + Location.RIGHT); 
 
 if (locs.size() == 0) {
 return super.getMoveLocations(); 
 }
 return locs; 
 } 
 

 
 private void twoAway(ArrayList<Location> l,int d){ 
 Grid g = getGrid(); 
 Location loc = getLocation(); 
  Location temp = loc.getAdjacentLocation(dir); 
  if(g.isValid(temp) && g.get(temp) == null){ 
     Location loc2 = temp.getAdjacentLocation(d); 
  }
  if(g.isValid(loc2) && g.get(loc2)== null){ 
  l.add(loc2); 
 } 
 } 
}
  
  }

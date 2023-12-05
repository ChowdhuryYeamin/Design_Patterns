package assignment_1;



public class driver {

    public static void main(String[] args) {
        
        DanceController dancePad = new ConcreteDanceController();
        DancePadAdapter dancePadAdapter = new DancePadAdapter(dancePad);
        
        
        dancePadAdapter.stepAndPress(DanceController.direction.FORWARD); 
        dancePadAdapter.stepAndPress(DanceController.direction.LEFT);    
        

        
        GuitarController guitarController = new ConcreteGuitarController();
        GuitarToDanceAdapter guitarToDanceAdapter = new GuitarToDanceAdapter(guitarController);

        
        guitarToDanceAdapter.pressGuitarButton(GuitarController.colors.GREEN); 
        guitarToDanceAdapter.pressGuitarButton(GuitarController.colors.RED);   
        
        
    }
}




class ConcreteDanceController implements DanceController {
    @Override
    public void Step(direction dir) {
        System.out.println("Stepping in direction: " + dir);
    }
}

class ConcreteGuitarController implements GuitarController {
    
    @Override
    public void PressFretButton(colors button) {
        
        System.out.println("Pressed fret button: " + button);
    }

    @Override
    public void PressPick() {
        
        System.out.println("Strummed the pick on the guitar.");
    }

    @Override
    public void PressTremelo() {
        
        System.out.println("Used the tremolo bar on the guitar.");
    }
}


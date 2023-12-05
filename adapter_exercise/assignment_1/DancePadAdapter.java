package assignment_1;

public class DancePadAdapter implements GuitarController {
    private DanceController dancePad;

    public DancePadAdapter(DanceController dancePad) {
        this.dancePad = dancePad;
    }

    
    public void stepAndPress(DanceController.direction dir) {
        System.out.print("Pressed: ");
        switch (dir) {
            case FORWARD:
                System.out.println("ORANGE fret button and the pick");
                break;
            case LEFT:
                System.out.println("GREEN fret button and the pick");
                break;
            case RIGHT:
                System.out.println("BLUE fret button and the pick");
                break;
            case BACK:
                System.out.println("RED fret button and the pick");
                break;
            case MIDDLE:
                System.out.println("YELLOW fret button and the pick");
                break;
            default:
                throw new IllegalArgumentException("Unknown direction: " + dir);
        }
        
        dancePad.Step(dir); 
    }

    
    @Override
    public void PressFretButton(colors button) {
        
    }

    @Override
    public void PressPick() {
        
    }

    @Override
    public void PressTremelo() {
        
    }
}

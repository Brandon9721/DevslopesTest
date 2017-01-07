import java.awt.*;


class FirstFrame extends Frame
{
    public FirstFrame()
    {
        super("First Frame");
        
        buildGUI();
        setSize(200,200);
        setVisible(true);
        
    }
    
    public void buildGUI()
    {
        add(new Label("Hello First Frame"));
    }
    
    public static void main(String[] args)
    {
        FirstFrame f = new FirstFrame();
    }
}

jhh

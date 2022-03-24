import java.awt.Graphics;

/**
 * Class Arc:  inherits from Shape and handles Arc shapes
 * @author Barb Ericson
 */
public class Arc extends Shape
{
    /** Constructor */
    public Arc()
    {
        super();  // call parent constructor (note the parent's constructor has no parameters)
    }

    /**
     * Draw the shape
     * @param g   the graphics context to draw to
     */
    @Override
    public void draw(Graphics g)
    {
        // set the color to draw the shape in
        g.setColor(getColor());

        // draw the arc given the top left corner of the enclosing
        // arc and the width and height
        g.drawArc(getMinX(), getMinY(), getWidth(), getHeight(), 180, 90); // the getter methods here are INHERITED FROM SHAPE!
    }
}



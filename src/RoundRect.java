import java.awt.Graphics;

/**
 * Class Rectangle:  inherits from Shape and draws a round rectangle
 * @author Barb Ericson
 */
public class RoundRect extends Shape
{
    /** Constructor */
    public RoundRect()
    {
        super();  // call parent constructor (note the parent's constructor has no parameters)
    }

    /** Draw the shape
     * @param g   the graphics context on which to draw
     */
    @Override
    public void draw(Graphics g)
    {
        // set the color
        g.setColor(getColor());

        // draw the rectangle given the top left point and width and height
        g.drawRoundRect(getMinX(), getMinY(), getWidth(), getHeight(), 30, 30); // the getter methods here are INHERITED FROM SHAPE!
    }
}



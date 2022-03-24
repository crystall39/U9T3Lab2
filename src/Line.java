import java.awt.Graphics;

/**
 * Class Arc:  inherits from Shape and handles Line shapes
 * @author Barb Ericson
 */
public class Line extends Shape
{
    /** Constructor */
    public Line()
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
        // line and the width and height
        g.drawLine(getP1().x, getP1().y, getP2().x, getP2().y); // the getter methods here are INHERITED FROM SHAPE!
    }
}
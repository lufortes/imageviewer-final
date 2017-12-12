import java.awt.Color;

/**
 * Green filter.
 * 
 * @author Lucita Fortes
 * @version Dec 11, 2017
 */
public class GreenFilter extends Filter
{
    /**
     * Constructor for objects of class InvertFilter.
     * @param name The name of the filter.
     */
    public GreenFilter(String name)
    {
        super(name);
    }

    /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pix = image.getPixel(x, y);
                image.setPixel(x, y, new Color(0,
                                               255 - pix.getGreen(),
                                               0));
            }
        }
    }
}

// CircleAdapter.java
package NewDrawingSys;

import com.mycompany.oldDrawingSys.Circle;

public class CircleAdapter implements Shape {
    private final Circle circle;

    public CircleAdapter(Circle circle) {
        this.circle = circle;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int centerX = (x1 + x2) / 2;
        int centerY = (y1 + y2) / 2;
        int radius = Math.abs(x2 - x1) / 2;
        circle.draw(centerX, centerY, radius);
    }
}

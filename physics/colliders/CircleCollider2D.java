package dev.mv.engine.physics.colliders;

import dev.mv.engine.exceptions.Exceptions;
import dev.mv.engine.physics.Collider2D;
import dev.mv.engine.physics.Physics2D;
import dev.mv.engine.physics.shapes2d.Circle;
import dev.mv.engine.physics.shapes2d.Shape2D;

public class CircleCollider2D implements Collider2D {

    private static final String name = CircleCollider2D.class.getSimpleName();

    private Physics2D physics;

    public CircleCollider2D(Physics2D physics) {
        this.physics = physics;
    }

    @Override
    public boolean checkCollision(Shape2D a, Shape2D b) {
        checkType(a, b);
        return false;
    }

    private void checkType(Shape2D a, Shape2D b) {
        if (!(a instanceof Circle || b instanceof Circle)) {
            Exceptions.send("BAD_COLLIDER", name, "non circle shapes");
        }
    }
}

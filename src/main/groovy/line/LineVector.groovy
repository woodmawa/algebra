package line

import org.ujmp.core.doublematrix.DenseDoubleMatrix

class LineVector {
    Point start = new Point (x:0, y:0, z:0) //assumes default of origen (0,0,0)
    Point end = new Point (x:0, y:0, z:0)

    //return vector as DenseMatrix
    DenseDoubleMatrix asType (DenseDoubleMatrix clazz) {
        if (clazz == DenseDoubleMatrix) {


            DenseDoubleMatrix m = DenseDoubleMatrix().Factory.zeros(3, 2)

            m.setAsDouble(end.x, 0, 0)
            m.setAsDouble(end.y, 1, 0)
            m.setAsDouble(end.z, 2, 0)
            m.setAsDouble(start.x, 0, 1)
            m.setAsDouble(start.y, 1, 1)
            m.setAsDouble(start.z, 2, 1)
            return m
        }
    }

    DenseDoubleMatrix matrix (LineVector v) {
        DenseDoubleMatrix m =  DenseDoubleMatrix.Factory.zeros(3,2)

        m.setAsDouble(v.end.x, 0, 0)
        m.setAsDouble(v.end.y, 1, 0)
        m.setAsDouble(v.end.z, 2, 0)
        m.setAsDouble(v.start.x, 0, 1)
        m.setAsDouble(v.start.y, 1, 1)
        m.setAsDouble(v.start.z, 2, 1)
        return m

    }

    //constructor takes x,y,z relative to origin
    LineVector (x,y,z = 0) {
        this.end.x = x
        this.end.y = y
        this.end.z = z
    }

    //constriuctor built from end and start Points
    LineVector (Point end, Point start = null) {
        end = end
        if (start) this.start = start
    }

    Double length () {
        assert end
        def len = ((end.x-start.x).power(2) + (end.y-start.y).power(2) + (end.z-start.z).power(2)).power(0.5)
    }

    //proxy simple getters to hide point implementation
    double getX() { end.x }
    void setX(double x) { end.x = x }
    double getY() { end.y }
    void setY(double y) { end.y = y }
    double getZ() { end.z }
    void setZ(double z) { end.z = z }

    LineVector minus (LineVector other) {
        new LineVector (
                end.x - other.end.x,
                end.y - other.end.y,
                end.z - other.end.z)
    }

    LineVector plus (LineVector other) {
        new LineVector (
                end.x + other.end.x,
                end.y + other.end.y,
                end.z + other.end.z)
    }

    LineVector scalerMultiply (amount) {
        end.x = end.x * amount
        end.y = end.y * amount
        end.z = end.z * amount
        return this
    }

    LineVector crossProduct (LineVector) {
        //DenseDoubleMatrix m = matrix (this).mu

    }

    def dotProduct (LineVector) {

    }
}

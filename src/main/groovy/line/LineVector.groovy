package line

class LineVector {
    Point start = new Point (x:0, y:0, z:0) //assumes default of origen (0,0,0)
    Point end = new Point (x:0, y:0, z:0)

    Double length () {
        assert end
        def len = ((end.x-start.x).power(2) + (end.y-start.y).power(2) + (end.z-start.z).power(2)).power(0.5)
    }

}

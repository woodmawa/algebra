package line

import spock.lang.Specification

class LineVectorTestSpecification extends Specification {

    def "length of unit line vector should be '1'" () {
        given : "new line of length 1 relative to origin"

            LineVector lv_xy = new LineVector (end: new Point(x:1,y:1))
        LineVector lv_xyz = new LineVector (end: new Point(x:1,y:1,z:1))


        when: "we calculate the length of the vector"
            double len_xy = lv_xy.length()
            double len_xyz = lv_xyz.length()

        then: "expect the length to be 1"
            len_xy == (1+1).power(0.5)
            len_xyz == (1+1+1).power(0.5)
    }
}

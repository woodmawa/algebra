package scripts

import line.LineVector
import org.ujmp.core.doublematrix.DenseDoubleMatrix

LineVector l1 = new LineVector (1,1)
LineVector l2 = new LineVector (1,1)

LineVector sum = l1+l2

assert sum.end.x == 2.0
assert sum.end.y == 2.0

assert l1.scalerMultiply(2).end.x == 2

println l1.matrix()
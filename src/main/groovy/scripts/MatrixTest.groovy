package scripts

import org.ujmp.core.doublematrix.DenseDoubleMatrix

def m = DenseDoubleMatrix.Factory.zeros(3,2)

m.setAsDouble(1.0,1,1)

println m
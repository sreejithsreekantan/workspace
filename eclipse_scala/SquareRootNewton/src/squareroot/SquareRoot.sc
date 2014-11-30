package squareroot

object SquareRoot {
  println("Welcome to the Scala Square Root worksheet")
                                                  //> Welcome to the Scala Square Root worksheet
  def abs(x: Double): Double =
  	if (x<0) -x else x                        //> abs: (x: Double)Double
  
  def sqrtIter(x: Double, guess: Double): Double =
  		if (isGoodEnough(x, guess)) guess
  		else sqrtIter(x, improve(x,guess))//> sqrtIter: (x: Double, guess: Double)Double
  
  
  def isGoodEnough(x: Double, guess: Double) =
  	// we divide by x to cover the case of very small and very large numbers
  	// numbers less than 0.001	: abs(guess*guess - x) will always return true
  	// very large numbers				: abs(guess*guess - x) will return false even after
  	// 														it reached an approximation; just because the
  	//														abs value is some 0.00100333
  		abs(guess*guess - x)/x < 0.001    //> isGoodEnough: (x: Double, guess: Double)Boolean
  		
  	def improve(x: Double,guess: Double) =
  		(guess + x/guess)/2               //> improve: (x: Double, guess: Double)Double
  		
  def sqrt(x: Double): Double = {
  		
  	sqrtIter(x, 1.0)
  }                                               //> sqrt: (x: Double)Double
  

	// testing isGoodEnough() and improve() function
  isGoodEnough(100, 1.0)                          //> res0: Boolean = false
  improve(100, 1.0)                               //> res1: Double = 50.5
  isGoodEnough(100, 50.5)                         //> res2: Boolean = false
  improve(100, 50.5)                              //> res3: Double = 26.24009900990099
  isGoodEnough(100, 26.2400990)                   //> res4: Boolean = false
  improve(100, 26.2400990)                        //> res5: Double = 15.025530115755299
  isGoodEnough(100, 15.025530115755299)           //> res6: Boolean = false
  improve(100, 15.025530115755299)                //> res7: Double = 10.840434671848312
  isGoodEnough(100, 10.840434671848312)           //> res8: Boolean = false
  improve(100, 10.840434671848312)                //> res9: Double = 10.032578510872773
  isGoodEnough(100, 10.032578510872773)           //> res10: Boolean = false
  improve(100, 10.032578510872773)                //> res11: Double = 10.000052895642408
  isGoodEnough(100, 10.000052895642408)           //> res12: Boolean = true
  improve(100, 10.000052895642408)                //> res13: Double = 10.000000000139897
  isGoodEnough(100, 10.000000000139897)           //> res14: Boolean = true
  improve(100, 10.000000000139897)                //> res15: Double = 10.0
  // testing sqrtIter() function
    sqrtIter(100, 1.0)                            //> res16: Double = 10.000052895642693
  // testing sqrt() function
  sqrt(4)                                         //> res17: Double = 2.000609756097561
  sqrt(100)                                       //> res18: Double = 10.000052895642693
  sqrt(0.001)                                     //> res19: Double = 0.03162278245070105
  sqrt(1e-20)                                     //> res20: Double = 1.0000021484861236E-10
  sqrt(1.0e20)                                    //> res21: Double = 1.0000021484861237E10
  sqrt(1.0e50)                                    //> res22: Double = 1.0000003807575104E25
}
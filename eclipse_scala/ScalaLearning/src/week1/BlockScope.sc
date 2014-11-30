package week1

object blockScope {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  def sqrt(x: Double): Double = {
  	// all the functions inside are not visible outside.
  	// all outside functions of same name are shadowed
  	// by inside equivalents
  	def abs(x: Double): Double =
  	if (x<0) -x else x
  
  	def sqrtIter(x: Double, guess: Double): Double =
  		if (isGoodEnough(x, guess)) guess
  		else sqrtIter(x, improve(x,guess))
  
  	def isGoodEnough(x: Double, guess: Double) =
  		abs(guess*guess - x)/x < 0.001
  		
  	def improve(x: Double,guess: Double) =
  		(guess + x/guess)/2
  			
  	sqrtIter(x, 1.0)
  }                                               //> sqrt: (x: Double)Double
  
  val x = 0                                       //> x  : Int = 0
  def f(y: Int) = y + 1                           //> f: (y: Int)Int
  val result = {
  	val x = f(3)
  	x * x
  } + x                                           //> result  : Int = 16
}
package week1

object blockScope {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(78); 
  println("Welcome to the Scala worksheet");$skip(551); 
  
  
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
  };System.out.println("""sqrt: (x: Double)Double""");$skip(15); 
  
  val x = 0;System.out.println("""x  : Int = """ + $show(x ));$skip(24); 
  def f(y: Int) = y + 1;System.out.println("""f: (y: Int)Int""");$skip(50); 
  val result = {
  	val x = f(3)
  	x * x
  } + x;System.out.println("""result  : Int = """ + $show(result ))}
}

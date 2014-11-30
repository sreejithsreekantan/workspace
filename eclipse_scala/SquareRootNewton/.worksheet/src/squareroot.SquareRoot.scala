package squareroot

object SquareRoot {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(95); 
  println("Welcome to the Scala Square Root worksheet");$skip(53); 
  def abs(x: Double): Double =
  	if (x<0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(131); 
  
  def sqrtIter(x: Double, guess: Double): Double =
  		if (isGoodEnough(x, guess)) guess
  		else sqrtIter(x, improve(x,guess));System.out.println("""sqrtIter: (x: Double, guess: Double)Double""");$skip(435); 
  
  
  def isGoodEnough(x: Double, guess: Double) =
  	// we divide by x to cover the case of very small and very large numbers
  	// numbers less than 0.001	: abs(guess*guess - x) will always return true
  	// very large numbers				: abs(guess*guess - x) will return false even after
  	// 														it reached an approximation; just because the
  	//														abs value is some 0.00100333
  		abs(guess*guess - x)/x < 0.001;System.out.println("""isGoodEnough: (x: Double, guess: Double)Boolean""");$skip(71); 
  		
  	def improve(x: Double,guess: Double) =
  		(guess + x/guess)/2;System.out.println("""improve: (x: Double, guess: Double)Double""");$skip(68); 
  		
  def sqrt(x: Double): Double = {
  		
  	sqrtIter(x, 1.0)
  };System.out.println("""sqrt: (x: Double)Double""");$skip(79); val res$0 = 
  

	// testing isGoodEnough() and improve() function
  isGoodEnough(100, 1.0);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(20); val res$1 = 
  improve(100, 1.0);System.out.println("""res1: Double = """ + $show(res$1));$skip(26); val res$2 = 
  isGoodEnough(100, 50.5);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(21); val res$3 = 
  improve(100, 50.5);System.out.println("""res3: Double = """ + $show(res$3));$skip(32); val res$4 = 
  isGoodEnough(100, 26.2400990);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(27); val res$5 = 
  improve(100, 26.2400990);System.out.println("""res5: Double = """ + $show(res$5));$skip(40); val res$6 = 
  isGoodEnough(100, 15.025530115755299);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(35); val res$7 = 
  improve(100, 15.025530115755299);System.out.println("""res7: Double = """ + $show(res$7));$skip(40); val res$8 = 
  isGoodEnough(100, 10.840434671848312);System.out.println("""res8: Boolean = """ + $show(res$8));$skip(35); val res$9 = 
  improve(100, 10.840434671848312);System.out.println("""res9: Double = """ + $show(res$9));$skip(40); val res$10 = 
  isGoodEnough(100, 10.032578510872773);System.out.println("""res10: Boolean = """ + $show(res$10));$skip(35); val res$11 = 
  improve(100, 10.032578510872773);System.out.println("""res11: Double = """ + $show(res$11));$skip(40); val res$12 = 
  isGoodEnough(100, 10.000052895642408);System.out.println("""res12: Boolean = """ + $show(res$12));$skip(35); val res$13 = 
  improve(100, 10.000052895642408);System.out.println("""res13: Double = """ + $show(res$13));$skip(40); val res$14 = 
  isGoodEnough(100, 10.000000000139897);System.out.println("""res14: Boolean = """ + $show(res$14));$skip(35); val res$15 = 
  improve(100, 10.000000000139897);System.out.println("""res15: Double = """ + $show(res$15));$skip(56); val res$16 = 
  // testing sqrtIter() function
    sqrtIter(100, 1.0);System.out.println("""res16: Double = """ + $show(res$16));$skip(39); val res$17 = 
  // testing sqrt() function
  sqrt(4);System.out.println("""res17: Double = """ + $show(res$17));$skip(12); val res$18 = 
  sqrt(100);System.out.println("""res18: Double = """ + $show(res$18));$skip(14); val res$19 = 
  sqrt(0.001);System.out.println("""res19: Double = """ + $show(res$19));$skip(14); val res$20 = 
  sqrt(1e-20);System.out.println("""res20: Double = """ + $show(res$20));$skip(15); val res$21 = 
  sqrt(1.0e20);System.out.println("""res21: Double = """ + $show(res$21));$skip(15); val res$22 = 
  sqrt(1.0e50);System.out.println("""res22: Double = """ + $show(res$22))}
}

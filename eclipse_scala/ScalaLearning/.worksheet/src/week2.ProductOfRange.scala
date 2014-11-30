package week2

object ProductOfRange {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(82); 
  println("Welcome to the Scala worksheet");$skip(157); 
  
  def product(f:Int => Int)(a: Int, b: Int): Int =
  {
  	def loop(a: Int, acc: Int): Int =
  		if (a>b) acc
  		else loop(a+1, f(a)*acc)
  	loop(a,1)
	};System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(22); val res$0 = 
	
	product(x=>x)(1,4);System.out.println("""res0: Int = """ + $show(res$0));$skip(20); val res$1 = 
	product(x=>x)(1,5);System.out.println("""res1: Int = """ + $show(res$1));$skip(20); val res$2 = 
	product(x=>x)(2,6);System.out.println("""res2: Int = """ + $show(res$2));$skip(22); val res$3 = 
	product(x=>x*x)(1,3);System.out.println("""res3: Int = """ + $show(res$3));$skip(61); 
	
	def factorial(x: Int): Int =
	{
		product(x => x)(1,x)
	};System.out.println("""factorial: (x: Int)Int""");$skip(16); val res$4 = 
	
	factorial(4);System.out.println("""res4: Int = """ + $show(res$4));$skip(14); val res$5 = 
	factorial(5);System.out.println("""res5: Int = """ + $show(res$5));$skip(14); val res$6 = 
	factorial(6);System.out.println("""res6: Int = """ + $show(res$6))}
}

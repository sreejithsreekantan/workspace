package week2

object ProductOfRange {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def product(f:Int => Int)(a: Int, b: Int): Int =
  {
  	def loop(a: Int, acc: Int): Int =
  		if (a>b) acc
  		else loop(a+1, f(a)*acc)
  	loop(a,1)
	}                                         //> product: (f: Int => Int)(a: Int, b: Int)Int
	
	product(x=>x)(1,4)                        //> res0: Int = 24
	product(x=>x)(1,5)                        //> res1: Int = 120
	product(x=>x)(2,6)                        //> res2: Int = 720
	product(x=>x*x)(1,3)                      //> res3: Int = 36
	
	def factorial(x: Int): Int =
	{
		product(x => x)(1,x)
	}                                         //> factorial: (x: Int)Int
	
	factorial(4)                              //> res4: Int = 24
	factorial(5)                              //> res5: Int = 120
	factorial(6)                              //> res6: Int = 720
}
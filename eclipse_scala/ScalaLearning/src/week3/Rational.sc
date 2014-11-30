package week3

object Rational {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	new Rational(1, 2)                        //> res0: week3.Rational = 1/2
	
	val n = new Rational(2, 4)                //> n  : week3.Rational = 1/2
	n.numer                                   //> res1: Int = 1
	n.denom                                   //> res2: Int = 2
	
	val y = new Rational(2, 3)                //> y  : week3.Rational = 2/3
	n.add(y)                                  //> res3: week3.Rational = 7/6
	
	n.sub(y)                                  //> res4: week3.Rational = 1/-6
	
	n.neg                                     //> res5: week3.Rational = 1/-2
	
	val a = new Rational(1, 3)                //> a  : week3.Rational = 1/3
	val b = new Rational(5, 7)                //> b  : week3.Rational = 5/7
	val c = new Rational(3, 2)                //> c  : week3.Rational = 3/2
	a.add(b.neg).add(c.neg)                   //> res6: week3.Rational = -79/42
	
	val d = new Rational(10, 20)              //> d  : week3.Rational = 1/2
	val e = new Rational(15, 20)              //> e  : week3.Rational = 3/4
	
	d.less(e)                                 //> res7: Boolean = true
	d.more(e)                                 //> res8: Boolean = false
	
	d.max(e)                                  //> res9: week3.Rational = 3/4
	d.min(e)                                  //> res10: week3.Rational = 1/2
}

class Rational(x: Int, y: Int) {
	
	// constructor overload
	def this(x: Int) = this(x, 1)
	
	private def gcd(a: Int, b: Int): Int =
		if (b == 0) a else gcd(b, a%b)
	def g = gcd(x,y)
	def numer = x/g
	def denom = y/g
	
	def add(that: Rational) =
		new Rational(
			numer * that.denom + that.numer * denom,
			denom * that.denom
			)
			
	def sub(that: Rational) =
		new Rational(
			numer * that.denom - that.numer * denom,
			denom * that.denom
			)
	
	def neg =
		new Rational(-numer, denom)
	
	def less(that: Rational) =
		numer * that.denom < that.numer * denom
		
	def more(that: Rational) =
		!less(that)
		
	def max(that: Rational) =
		if (less(that)) that else this
		
	def min(that: Rational) =
		if (less(that)) this else that
		
	override def toString() =
		numer + "/" + denom
}
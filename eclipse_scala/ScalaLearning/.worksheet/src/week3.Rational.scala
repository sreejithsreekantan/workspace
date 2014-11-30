package week3

object Rational {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); 
  println("Welcome to the Scala worksheet");$skip(20); val res$0 = 
	new Rational(1, 2);System.out.println("""res0: week3.Rational = """ + $show(res$0));$skip(30); 
	
	val n = new Rational(2, 4);System.out.println("""n  : week3.Rational = """ + $show(n ));$skip(9); val res$1 = 
	n.numer;System.out.println("""res1: Int = """ + $show(res$1));$skip(9); val res$2 = 
	n.denom;System.out.println("""res2: Int = """ + $show(res$2));$skip(30); 
	
	val y = new Rational(2, 3);System.out.println("""y  : week3.Rational = """ + $show(y ));$skip(10); val res$3 = 
	n.add(y);System.out.println("""res3: week3.Rational = """ + $show(res$3));$skip(12); val res$4 = 
	
	n.sub(y);System.out.println("""res4: week3.Rational = """ + $show(res$4));$skip(9); val res$5 = 
	
	n.neg;System.out.println("""res5: week3.Rational = """ + $show(res$5));$skip(30); 
	
	val a = new Rational(1, 3);System.out.println("""a  : week3.Rational = """ + $show(a ));$skip(28); 
	val b = new Rational(5, 7);System.out.println("""b  : week3.Rational = """ + $show(b ));$skip(28); 
	val c = new Rational(3, 2);System.out.println("""c  : week3.Rational = """ + $show(c ));$skip(25); val res$6 = 
	a.add(b.neg).add(c.neg);System.out.println("""res6: week3.Rational = """ + $show(res$6));$skip(32); 
	
	val d = new Rational(10, 20);System.out.println("""d  : week3.Rational = """ + $show(d ));$skip(30); 
	val e = new Rational(15, 20);System.out.println("""e  : week3.Rational = """ + $show(e ));$skip(13); val res$7 = 
	
	d.less(e);System.out.println("""res7: Boolean = """ + $show(res$7));$skip(11); val res$8 = 
	d.more(e);System.out.println("""res8: Boolean = """ + $show(res$8));$skip(12); val res$9 = 
	
	d.max(e);System.out.println("""res9: week3.Rational = """ + $show(res$9));$skip(10); val res$10 = 
	d.min(e);System.out.println("""res10: week3.Rational = """ + $show(res$10))}
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

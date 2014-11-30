package week2

object GenericRangeOperation {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(89); 
  println("Welcome to the Scala worksheet");$skip(166); 

	def RangeOper1(f: Int => Int)
						(Oper: (Int, Int) => Int)
						(a: Int, b: Int): Int =
	{
		if (a == b) f(a)
		else Oper(f(a), RangeOper1(f)(Oper)(a+1, b))
	};System.out.println("""RangeOper1: (f: Int => Int)(Oper: (Int, Int) => Int)(a: Int, b: Int)Int""");$skip(205); 

	def RangeOper(f: Int => Int)
						(Oper: (Int, Int) => Int)
						(a: Int, b: Int) =
	{
		def loop(a: Int, acc: Int): Int =
		{
			if (a>b) acc
			else loop(a+1, Oper(f(a),acc))
		}
		loop(a+1,f(a))
	};System.out.println("""RangeOper: (f: Int => Int)(Oper: (Int, Int) => Int)(a: Int, b: Int)Int""");$skip(94); 
	
	def ProductRange(f: Int => Int)(a: Int, b: Int): Int =
		RangeOper(f)((x, y) => x*y)(a, b);System.out.println("""ProductRange: (f: Int => Int)(a: Int, b: Int)Int""");$skip(90); 
	
	def SumRange(f: Int => Int)(a: Int, b: Int): Int =
		RangeOper(f)((x, y) => x+y)(a, b);System.out.println("""SumRange: (f: Int => Int)(a: Int, b: Int)Int""");$skip(44); val res$0 = 
	
	
	RangeOper1(x => x)((x, y) => x+y)(1,5);System.out.println("""res0: Int = """ + $show(res$0));$skip(39); val res$1 = 
	RangeOper(x => x)((x, y) => x+y)(1,5);System.out.println("""res1: Int = """ + $show(res$1));$skip(23); val res$2 = 
	SumRange(x => x)(1,5);System.out.println("""res2: Int = """ + $show(res$2));$skip(40); val res$3 = 
	RangeOper1(x => x)((x, y) => x*y)(1,5);System.out.println("""res3: Int = """ + $show(res$3));$skip(39); val res$4 = 
	RangeOper(x => x)((x, y) => x*y)(1,5);System.out.println("""res4: Int = """ + $show(res$4));$skip(27); val res$5 = 
	ProductRange(x => x)(1,5);System.out.println("""res5: Int = """ + $show(res$5));$skip(42); val res$6 = 
	RangeOper1(x => x*x)((x, y) => x+y)(1,5);System.out.println("""res6: Int = """ + $show(res$6));$skip(41); val res$7 = 
	RangeOper(x => x*x)((x, y) => x+y)(1,5);System.out.println("""res7: Int = """ + $show(res$7))}
}

class Marks(var cat1:Int = 7,var cat2:Int = 17,var exam:Int = 56){
    override def toString = s"Cat1: $cat1\ncat2: $cat2\nExam: $exam\nTotal: ${cat1+cat2+exam}"
}

object DefaultParaConstructor{
    def main(args:Array[String])={
      println(new Marks())
      println(new Marks(10,20))
      println(new Marks(4,6,30))

    }
}
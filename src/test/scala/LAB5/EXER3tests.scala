package LAB5
import chisel3._
import org.scalatest._
import chiseltest._

class EX3_operatortests extends FreeSpec with ChiselScalatestTester{
    "operatorTest_LAB5" in { 
        test(new Operator(4,UInt(4.W))(_+_)){ c=>
        c.io.in(0).poke(3.U)
        c.io.in(1).poke(2.U)
        c.io.in(2).poke(7.U)
        c.io.in(3).poke(6.U)
        
        c.clock.step(1)
        c.io.out(0).expect(2.U)
        c.io.out(1).expect(2.U)
        c.io.out(2).expect(2.U)
        c.io.out(3).expect(2.U)}
    }
}
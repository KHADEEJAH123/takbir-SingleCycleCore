package LAB5
import chisel3._
import org.scalatest._
import chiseltest._

class T1_LAB5 extends FreeSpec with ChiselScalatestTester{
    "TASK1_LAB5_Test" in { 
        test(new Adder(4)){ c=>
        c.io.in1.poke(2.U)
        c.io.in2.poke(1.U)
        c.clock.step(1)
        c.io.sum.expect(3.U)
        }
    }
}
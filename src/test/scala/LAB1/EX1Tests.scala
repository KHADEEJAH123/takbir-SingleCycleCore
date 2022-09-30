package LAB1
import chisel3._
import org.scalatest._
import chiseltest._

class Counter1 extends FreeSpec with ChiselScalatestTester {

    "COUNTER TEST" in {
       test(new Counter(3.S)){ c =>
       c.clock.step(1)
       c.io.result.expect(0.B)
       }
    }
}
package basic_gates
import chisel3._
import org.scalatest._
import chiseltest._

class ANDTests extends FreeSpec with ChiselScalatestTester {

    "AND GATE TEST" in {
       test(new AND()){ c =>
       c.io.a.poke(8.S)
       c.io.b.poke(-15.S)
       c.clock.step(1)
       c.io.c.expect(0.S)
       }
    }
}

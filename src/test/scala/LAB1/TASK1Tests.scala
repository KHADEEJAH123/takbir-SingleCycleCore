package LAB1
import chisel3._
import org.scalatest._
import chiseltest._

class ANDTests extends FreeSpec with ChiselScalatestTester{

    "AND GATE TEST" in {
       test(new AND()){ c =>
       c.io.a.poke(8.U)
       c.io.b.poke(15.U)
       c.clock.step(1)
       c.io.c.expect(0.U)
       }
    }
}
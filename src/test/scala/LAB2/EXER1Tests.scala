package LAB2
import chisel3._
import org.scalatest._
import chiseltest._

class MUX1TESTS extends FreeSpec with ChiselScalatestTester{

    "MUX1 TEST" in {
       test(new Mux_2to1()){ c =>
       c.io.in_A.poke(6.U)
       c.io.in_B.poke(15.U)
       c.io.select.poke(0.B)
       c.clock.step(1)
       c.io.out.expect(6.U)
       }
    }
}
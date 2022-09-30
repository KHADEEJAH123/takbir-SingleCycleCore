package LAB2
import chisel3._
import org.scalatest._
import chiseltest._

class MUX4TESTS extends FreeSpec with ChiselScalatestTester{

    "MUX4 TEST" in {
       test(new mux4()){ c =>
       c.io.in.poke(6.U)
       //c.io.in_B.poke(15.U)
       //c.io.select.poke(0.B)
       c.clock.step(1)
       c.io.out.expect(3.U)
       }
    }
}
package basic_gates
import chisel3._
import org.scalatest._
import chiseltest._

class MuxTests extends FreeSpec with ChiselScalatestTester {

    "MUX GATE TEST" in {
       test(new MUX()){ c =>
       c.io.a.poke(8.U)
       c.io.b.poke(15.U)
       c.io.sel.poke(3.U)
       c.clock.step(1) 
       c.io.out.expect(7.U)
       }
    }
}
package basic_gates
import chisel3._
import org.scalatest._
import chiseltest._

class NOTTests extends FreeSpec with ChiselScalatestTester {

    "NORTests GATE TEST" in {
       test(new NOT()){ c =>
       c.io.a.poke(8.S)
       c.clock.step(1)
       c.io.c.expect(7.S)
       }
    }
}
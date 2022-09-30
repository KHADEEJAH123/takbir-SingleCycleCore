package basic_gates
import chisel3._
import org.scalatest._
import chiseltest._

class ORTests extends FreeSpec with ChiselScalatestTester {

    "OR GATE TEST" in {
       test(new OR()){ c =>
       c.io.a.poke(8.S)
       c.io.b.poke(-15.S)
       c.clock.step(1)
       c.io.c.expect(-7.S)
       }
    }
}
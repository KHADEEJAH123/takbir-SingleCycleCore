package LAB7
import chisel3._
import org.scalatest._
import chiseltest._

class LAB7task1tests  extends FreeSpec with ChiselScalatestTester {
    "LAB7 task1 Test" in {
        test(new LAB7_task1()){c=>
        c.io.f1.poke(1.B)
        c.io.f2.poke(0.B)
        c.io.r1.poke(0.B )
        c.io.r2.poke(0.B)
        c.clock.step(2)
        }
    }
}
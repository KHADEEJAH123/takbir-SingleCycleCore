package LAB7
import chisel3._
import org.scalatest._
import chiseltest._

class LAB7_EX1  extends FreeSpec with ChiselScalatestTester {
    "LAB7_EX1_TEST" in {
        test(new PPPtest()){c=>
        c.io.in1.bits.poke(1.U)
        c.io.in1.valid.poke(1.B)
        c.io.in2.bits.poke(1.U)
        c.io.in2.valid.poke(1.B)
        c.io.out.ready.poke(1.B)
        c.clock.step(30)
        c.io.out.bits.expect(1.U)
        }
    }
}
package LAB8
import chisel3._
import org.scalatest._
import chiseltest._

class EX1_LAB8  extends FreeSpec with ChiselScalatestTester {
    "LAB8_EX1 Test" in {
        test(new without_using_masking()){c=>
        c.io.enable.poke(1.B)
        c.io.write.poke(1.B)
        c.io.addr.poke(14.U )
        c.io.mask(0).poke(0.B)
        c.io.mask(1).poke(0.B)
        c.io.mask(2).poke(0.B)
        c.io.mask(3).poke(0.B)
        c.io.dataIn(0).poke(1.U)
        c.io.dataIn(1).poke(1.U)
        c.io.dataIn(2).poke(1.U)
        c.io.dataIn(3).poke(1.U)
        c.clock.step(2)
        }
    }
}
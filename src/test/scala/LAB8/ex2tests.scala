package LAB8
import org.scalatest._ 
import chisel3._ 
import chiseltest._ 
import chiseltest.experimental.TestOptionBuilder._ 
import chiseltest.internal.VerilatorBackendAnnotation

class Forwarding_LAB8 extends FreeSpec with ChiselScalatestTester {
    "EX2_LAB8" in {
        test(new Forwarding){ c =>
            c.io.enable.poke(1.B)
            c.io.rdAddr.poke(1.U)
            c.io.wrAddr.poke(1.U)
            c.io.wrData(0).poke(1.U)
            c.io.wrData(1).poke(2.U)
            c.io.wr_en.poke(1.B)
            c.io.mask(0).poke(0.B)
            c.io.mask(1).poke(1.B)
            c.clock.step(10)
        }
    }
}
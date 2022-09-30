package LAB8
import org.scalatest._ 
import chisel3._ 
import chiseltest._ 
import chiseltest.experimental.TestOptionBuilder._ 
import chiseltest.internal.VerilatorBackendAnnotation

class READ_WRITE_TEST extends FreeSpec with ChiselScalatestTester {
     "LAB8_EX3" in {
         test(new Asynch_Mem){ c =>
             c.io.data_in.poke(1.U)
             c.io.addr.poke(3.U)
             c.io.wr_en.poke(1.B)
             c.clock.step(10)
             c.io.data_out.expect(1.U)
         }
     }
 }
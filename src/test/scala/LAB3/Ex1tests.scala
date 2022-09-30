package LAB3

import chisel3._
import org.scalatest.FreeSpec
import chiseltest._

class encoder_Test extends FreeSpec with ChiselScalatestTester{
   "ENCODERTest test" in{
       test(new encoder_4to2()){c =>
         c.io.in.poke(0.U)
         c.clock.step(1)
         c.io.out.expect(0.U)
         
       }
    }      
}
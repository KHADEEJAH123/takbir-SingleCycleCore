package LAB3
import chisel3._
import org.scalatest._
import chiseltest._

class ALU2TESTS extends FreeSpec with ChiselScalatestTester{

    "ALU TEST" in {
       test(new ALU()){ c =>
       c.io.in_A.poke(6.U)
       c.io.in_B.poke(15.U)
       c.io.alu_Op.poke(3.U)
       c.clock.step(1)
       c.io.out.expect(15.U)
       //c.io.sum.expect(.U)
       }
    }
}
package LAB4
import chisel3._
import chisel3.util._
import org.scalatest._
import chiseltest._
import scala.util.Random

class branchtest extends FreeSpec with ChiselScalatestTester {
    "branchtest_LAB4" in {
    test(new BranchFunction()) { c =>
        val array_fnct3 = Array ( 0,1,4,5,6,7)
             for ( i <- 0 until 100) {
                val x = Random . nextLong () & 0xFFFFFFFFL
                val y = Random . nextLong () & 0xFFFFFFFFL
                val branch = Random.nextBoolean()
                val opr = Random . nextInt (6)
                val fnct3 = array_fnct3(opr)
                val result = fnct3 match {
                case 0 => if (x === y) {1} else 0
                case 1 => if (x != y) {1} else 0
                case 4 => if (x < y) {1} else 0
                case 5 => if (x > y) {1} else 0
                case 6 => if (x < y) {1} else 0
                case 7 => if (x >= y) {1} else 0
                case _ => 0
                }
            c.io.fnct3.poke(fnct3.U)
            c.io.branch.poke(branch.B)
            c.io.arg_x.poke(x.U)
            c.io.arg_y.poke(y.U)
            c.clock.step(1)
            if (branch === 1.B ) {
                c.io.br_taken.expect(result.B)
                }
            else if (branch === 0.B) {
                c.io.br_taken.expect(0.B)
                }
        
        println("fnc: ",fnct3)
        println("arg_x: ",x)
        println("arg_y: ",y)
        println("branch: ",branch)
        println("result:" ,result)
             }
    }}
}
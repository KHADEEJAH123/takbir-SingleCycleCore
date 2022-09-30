package LAB5
import chisel3._
import chisel3 . util._

class Adder ( Width : Int ) extends Module {
require ( Width >= 0)
// your code begin from here
val io=IO( new Bundle{
    val in1 = Input ( UInt (Width. W ) )
    val in2 = Input ( UInt (Width. W ) )
    val sum = Output ( UInt (Width. W ) )})
    io.sum := io.in1 + io.in2
// your code end here
}
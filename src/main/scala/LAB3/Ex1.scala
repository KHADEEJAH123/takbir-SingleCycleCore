package LAB3
import chisel3._
import chisel3.util._
import chisel3.stage.ChiselStage

class LM_IO_Interfacee extends Bundle {
    val in = Input ( UInt (4.W) )
    val out = Output ( UInt (2.W ) )
}


class encoder_4to2 extends Module {
val io = IO( new LM_IO_Interfacee )
io. out := "b00".U
switch ( io.in) {
is ("b0000".U) {io. out := "b00".U}
is ("b0001".U) {io. out := "b01".U}
is ("b0010".U) {io. out := "b10".U}
is ("b0011".U) {io. out := "b11".U}
}
}
package se.lejon.customcolumn

case class TableMapping(id: Long, status: Status)

sealed trait Status { def intValue: Int }
case object Active extends Status { override val intValue: Int = 1 }
case object Disabled extends Status { override val intValue: Int = 2 }
case object Deleted extends Status { override val intValue: Int = 3 }
package se.lejon.customcolumn

import scala.slick.driver.MySQLDriver.simple._

trait MyTypeMapper {
    protected implicit val statusColumnType =
        MappedColumnType.base[Status, Int](_.intValue, intToStatus)

    private def intToStatus(i: Int): Status = i match {
        case 1 => Active
        case 2 => Disabled
        case _ => Deleted
    }
}
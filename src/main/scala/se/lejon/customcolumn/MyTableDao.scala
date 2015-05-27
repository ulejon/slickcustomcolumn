package se.lejon.customcolumn

import scala.slick.driver.MySQLDriver.simple._

class MyTableDao extends MyTypeMapper {
    val Items = TableQuery[MyTableDefinition]

    def byId(id: Long)(implicit session: Session): Option[TableMapping] = Items.filter(_.status =!= Deleted).firstOption
}
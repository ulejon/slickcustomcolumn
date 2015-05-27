package se.lejon.customcolumn

import scala.slick.driver.MySQLDriver.simple._

class MyTableDefinition(tag: Tag) extends Table[TableMapping](tag, "sometable") with MyTypeMapper {
    def id = column[Long]("ID", O.PrimaryKey, O.AutoInc)

    def status = column[Status]("STATUS", O.NotNull, O.Default(Active))

    def * = (id, status) <> (TableMapping.tupled, TableMapping.unapply)
}
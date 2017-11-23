package top.bigwave.test;

import java.sql.Connection;
import java.sql.DriverManager;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import static top.bigwave.jooqdemo.Tables.*;

public class Test {
	private static final String URL = "jdbc:mysql://localhost:3306/library";
	private static final String USER = "root";
	private static final String PASSWORD = "mysqladmin";

	public static void main(String[] args) throws Exception {
		Class.forName("org.gjt.mm.mysql.Driver");

		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
			Result<Record> result = create.select().from(AUTHOR).fetch();
			System.out.println(result);
			
			for(Record r : result) {
				System.out.println("id = " + r.getValue(AUTHOR.ID));
				System.out.println("firstName = " + r.getValue(AUTHOR.FIRST_NAME));
				System.out.println("lastName = " + r.getValue(AUTHOR.LAST_NAME));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
/* Output:
+----+----------+---------+
|  id|first_name|last_name|
+----+----------+---------+
|   1|asd       |asd      |
+----+----------+---------+
id = 1
firstName = asd
lastName = asd
*/

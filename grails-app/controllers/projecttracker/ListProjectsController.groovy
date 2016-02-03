package projecttracker
//import groovy.sql.Sql
//
//class ListProjectsController {
//
//	def index = {
//		redirect (action: current)
//	}
//	
//    def current = { 
//		
//		def sql = Sql.newInstance("jdbc:oracle:thin:@data:1522:banF","MedecusUser","medtestuser", "com.mysql.jdbc.Driver")
//			sql.eachRow("select * from UWIMONA.UWM_MEDECUS_DATA"){ row ->
//				println row.LASTNAME
//			}
//	}
//}

//import groovy.sql.Sql
//class ListProjectsController{
//  static void main(String[] args) {
//	def sql = Sql.newInstance("jdbc:oracle:thin:@data:1522:banF","MedecusUser","medtestuser", "com.mysql.jdbc.Driver")
//	sql.eachRow("select * from UWIMONA.UWM_MEDECUS_DATA"){ row ->
//	   println row.isEmpty()
//	}
//  }
//}

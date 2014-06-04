// @SOURCE:C:/Users/michael/Desktop/tutorial/SocialGamingServer/conf/routes
// @HASH:e3688a9ca28baa74fbf91b6fc66efd9beb1dc359
// @DATE:Sun Jun 01 21:16:02 CEST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:12
private[this] lazy val controllers_Application_loginUser2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/"),DynamicPart("faceBookAuthToken", """[^/]+""",true),StaticPart("/"),DynamicPart("googleCDSToken", """[^/]+""",true),StaticPart("/"),DynamicPart("longitude", """[^/]+""",true),StaticPart("/"),DynamicPart("latitude", """[^/]+""",true),StaticPart("/login"))))
        

// @LINE:13
private[this] lazy val controllers_Application_getNearbyUsers3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/"),DynamicPart("facebookID", """[^/]+""",true),StaticPart("/getNearbyUsers"))))
        

// @LINE:16
private[this] lazy val controllers_Application_updateUserLocation4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("positions/"),DynamicPart("facebookId", """[^/]+""",true),StaticPart("/"),DynamicPart("longitude", """[^/]+""",true),StaticPart("/"),DynamicPart("latitude", """[^/]+""",true),StaticPart("/update"))))
        

// @LINE:19
private[this] lazy val controllers_Application_requestNewGame5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("games/"),DynamicPart("facebookID", """[^/]+""",true),StaticPart("/requestNew"))))
        

// @LINE:20
private[this] lazy val controllers_Application_abortGame6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("games/"),DynamicPart("gameID", """[^/]+""",true),StaticPart("/"),DynamicPart("facebookID", """[^/]+""",true),StaticPart("/abort"))))
        

// @LINE:21
private[this] lazy val controllers_Application_acceptGame7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("games/"),DynamicPart("gameID", """[^/]+""",true),StaticPart("/"),DynamicPart("facebookID", """[^/]+""",true),StaticPart("/accept"))))
        

// @LINE:22
private[this] lazy val controllers_Application_interactionInGame8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("games/"),DynamicPart("gameID", """[^/]+""",true),StaticPart("/"),DynamicPart("facebookID", """[^/]+""",true),StaticPart("/interaction"))))
        

// @LINE:23
private[this] lazy val controllers_Application_poke9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("games/"),DynamicPart("userFacebookID", """[^/]+""",true),StaticPart("/"),DynamicPart("recipentFacebookID", """[^/]+""",true),StaticPart("/poke"))))
        

// @LINE:27
private[this] lazy val controllers_Application_test10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("test/"),DynamicPart("userFacebookID", """[^/]+""",true),StaticPart("/test"))))
        

// @LINE:31
private[this] lazy val controllers_Application_AddMonster11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Monsters/"),DynamicPart("Monsterid", """[^/]+""",true),StaticPart("/"),DynamicPart("Name", """[^/]+""",true),StaticPart("/"),DynamicPart("Level", """[^/]+""",true),StaticPart("/"),DynamicPart("Facebookid", """[^/]+""",true),StaticPart("/add"))))
        

// @LINE:32
private[this] lazy val controllers_Application_getMonster12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Monsters/"),DynamicPart("Monsterid", """[^/]+""",true),StaticPart("/get"))))
        

// @LINE:33
private[this] lazy val controllers_Application_getmyMonsters13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Monsters/"),DynamicPart("Facebookid", """[^/]+""",true),StaticPart("/getmyMonsters"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/$faceBookAuthToken<[^/]+>/$googleCDSToken<[^/]+>/$longitude<[^/]+>/$latitude<[^/]+>/login""","""controllers.Application.loginUser(faceBookAuthToken:String, googleCDSToken:String, longitude:Double, latitude:Double)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/$facebookID<[^/]+>/getNearbyUsers""","""controllers.Application.getNearbyUsers(facebookID:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """positions/$facebookId<[^/]+>/$longitude<[^/]+>/$latitude<[^/]+>/update""","""controllers.Application.updateUserLocation(facebookId:String, longitude:Double, latitude:Double)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """games/$facebookID<[^/]+>/requestNew""","""controllers.Application.requestNewGame(facebookID:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """games/$gameID<[^/]+>/$facebookID<[^/]+>/abort""","""controllers.Application.abortGame(gameID:String, facebookID:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """games/$gameID<[^/]+>/$facebookID<[^/]+>/accept""","""controllers.Application.acceptGame(gameID:String, facebookID:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """games/$gameID<[^/]+>/$facebookID<[^/]+>/interaction""","""controllers.Application.interactionInGame(gameID:String, facebookID:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """games/$userFacebookID<[^/]+>/$recipentFacebookID<[^/]+>/poke""","""controllers.Application.poke(userFacebookID:String, recipentFacebookID:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """test/$userFacebookID<[^/]+>/test""","""controllers.Application.test(userFacebookID:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Monsters/$Monsterid<[^/]+>/$Name<[^/]+>/$Level<[^/]+>/$Facebookid<[^/]+>/add""","""controllers.Application.AddMonster(Monsterid:String, Name:String, Level:String, Facebookid:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Monsters/$Monsterid<[^/]+>/get""","""controllers.Application.getMonster(Monsterid:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Monsters/$Facebookid<[^/]+>/getmyMonsters""","""controllers.Application.getmyMonsters(Facebookid:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:12
case controllers_Application_loginUser2(params) => {
   call(params.fromPath[String]("faceBookAuthToken", None), params.fromPath[String]("googleCDSToken", None), params.fromPath[Double]("longitude", None), params.fromPath[Double]("latitude", None)) { (faceBookAuthToken, googleCDSToken, longitude, latitude) =>
        invokeHandler(controllers.Application.loginUser(faceBookAuthToken, googleCDSToken, longitude, latitude), HandlerDef(this, "controllers.Application", "loginUser", Seq(classOf[String], classOf[String], classOf[Double], classOf[Double]),"POST", """ User functions: login, get users and update positions""", Routes.prefix + """users/$faceBookAuthToken<[^/]+>/$googleCDSToken<[^/]+>/$longitude<[^/]+>/$latitude<[^/]+>/login"""))
   }
}
        

// @LINE:13
case controllers_Application_getNearbyUsers3(params) => {
   call(params.fromPath[String]("facebookID", None)) { (facebookID) =>
        invokeHandler(controllers.Application.getNearbyUsers(facebookID), HandlerDef(this, "controllers.Application", "getNearbyUsers", Seq(classOf[String]),"GET", """""", Routes.prefix + """users/$facebookID<[^/]+>/getNearbyUsers"""))
   }
}
        

// @LINE:16
case controllers_Application_updateUserLocation4(params) => {
   call(params.fromPath[String]("facebookId", None), params.fromPath[Double]("longitude", None), params.fromPath[Double]("latitude", None)) { (facebookId, longitude, latitude) =>
        invokeHandler(controllers.Application.updateUserLocation(facebookId, longitude, latitude), HandlerDef(this, "controllers.Application", "updateUserLocation", Seq(classOf[String], classOf[Double], classOf[Double]),"POST", """ Positioning""", Routes.prefix + """positions/$facebookId<[^/]+>/$longitude<[^/]+>/$latitude<[^/]+>/update"""))
   }
}
        

// @LINE:19
case controllers_Application_requestNewGame5(params) => {
   call(params.fromPath[String]("facebookID", None)) { (facebookID) =>
        invokeHandler(controllers.Application.requestNewGame(facebookID), HandlerDef(this, "controllers.Application", "requestNewGame", Seq(classOf[String]),"POST", """ Game requests and event triggering""", Routes.prefix + """games/$facebookID<[^/]+>/requestNew"""))
   }
}
        

// @LINE:20
case controllers_Application_abortGame6(params) => {
   call(params.fromPath[String]("gameID", None), params.fromPath[String]("facebookID", None)) { (gameID, facebookID) =>
        invokeHandler(controllers.Application.abortGame(gameID, facebookID), HandlerDef(this, "controllers.Application", "abortGame", Seq(classOf[String], classOf[String]),"POST", """""", Routes.prefix + """games/$gameID<[^/]+>/$facebookID<[^/]+>/abort"""))
   }
}
        

// @LINE:21
case controllers_Application_acceptGame7(params) => {
   call(params.fromPath[String]("gameID", None), params.fromPath[String]("facebookID", None)) { (gameID, facebookID) =>
        invokeHandler(controllers.Application.acceptGame(gameID, facebookID), HandlerDef(this, "controllers.Application", "acceptGame", Seq(classOf[String], classOf[String]),"POST", """""", Routes.prefix + """games/$gameID<[^/]+>/$facebookID<[^/]+>/accept"""))
   }
}
        

// @LINE:22
case controllers_Application_interactionInGame8(params) => {
   call(params.fromPath[String]("gameID", None), params.fromPath[String]("facebookID", None)) { (gameID, facebookID) =>
        invokeHandler(controllers.Application.interactionInGame(gameID, facebookID), HandlerDef(this, "controllers.Application", "interactionInGame", Seq(classOf[String], classOf[String]),"POST", """""", Routes.prefix + """games/$gameID<[^/]+>/$facebookID<[^/]+>/interaction"""))
   }
}
        

// @LINE:23
case controllers_Application_poke9(params) => {
   call(params.fromPath[String]("userFacebookID", None), params.fromPath[String]("recipentFacebookID", None)) { (userFacebookID, recipentFacebookID) =>
        invokeHandler(controllers.Application.poke(userFacebookID, recipentFacebookID), HandlerDef(this, "controllers.Application", "poke", Seq(classOf[String], classOf[String]),"POST", """""", Routes.prefix + """games/$userFacebookID<[^/]+>/$recipentFacebookID<[^/]+>/poke"""))
   }
}
        

// @LINE:27
case controllers_Application_test10(params) => {
   call(params.fromPath[String]("userFacebookID", None)) { (userFacebookID) =>
        invokeHandler(controllers.Application.test(userFacebookID), HandlerDef(this, "controllers.Application", "test", Seq(classOf[String]),"POST", """""", Routes.prefix + """test/$userFacebookID<[^/]+>/test"""))
   }
}
        

// @LINE:31
case controllers_Application_AddMonster11(params) => {
   call(params.fromPath[String]("Monsterid", None), params.fromPath[String]("Name", None), params.fromPath[String]("Level", None), params.fromPath[String]("Facebookid", None)) { (Monsterid, Name, Level, Facebookid) =>
        invokeHandler(controllers.Application.AddMonster(Monsterid, Name, Level, Facebookid), HandlerDef(this, "controllers.Application", "AddMonster", Seq(classOf[String], classOf[String], classOf[String], classOf[String]),"POST", """""", Routes.prefix + """Monsters/$Monsterid<[^/]+>/$Name<[^/]+>/$Level<[^/]+>/$Facebookid<[^/]+>/add"""))
   }
}
        

// @LINE:32
case controllers_Application_getMonster12(params) => {
   call(params.fromPath[String]("Monsterid", None)) { (Monsterid) =>
        invokeHandler(controllers.Application.getMonster(Monsterid), HandlerDef(this, "controllers.Application", "getMonster", Seq(classOf[String]),"GET", """""", Routes.prefix + """Monsters/$Monsterid<[^/]+>/get"""))
   }
}
        

// @LINE:33
case controllers_Application_getmyMonsters13(params) => {
   call(params.fromPath[String]("Facebookid", None)) { (Facebookid) =>
        invokeHandler(controllers.Application.getmyMonsters(Facebookid), HandlerDef(this, "controllers.Application", "getmyMonsters", Seq(classOf[String]),"GET", """""", Routes.prefix + """Monsters/$Facebookid<[^/]+>/getmyMonsters"""))
   }
}
        
}

}
     
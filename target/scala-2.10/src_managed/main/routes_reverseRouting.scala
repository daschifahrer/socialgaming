// @SOURCE:C:/Users/michael/Desktop/tutorial/SocialGamingServer/conf/routes
// @HASH:e3688a9ca28baa74fbf91b6fc66efd9beb1dc359
// @DATE:Sun Jun 01 21:16:02 CEST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:27
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:27
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:6
class ReverseApplication {
    

// @LINE:16
def updateUserLocation(facebookId:String, longitude:Double, latitude:Double): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "positions/" + implicitly[PathBindable[String]].unbind("facebookId", dynamicString(facebookId)) + "/" + implicitly[PathBindable[Double]].unbind("longitude", longitude) + "/" + implicitly[PathBindable[Double]].unbind("latitude", latitude) + "/update")
}
                                                

// @LINE:27
def test(userFacebookID:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "test/" + implicitly[PathBindable[String]].unbind("userFacebookID", dynamicString(userFacebookID)) + "/test")
}
                                                

// @LINE:31
def AddMonster(Monsterid:String, Name:String, Level:String, Facebookid:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "Monsters/" + implicitly[PathBindable[String]].unbind("Monsterid", dynamicString(Monsterid)) + "/" + implicitly[PathBindable[String]].unbind("Name", dynamicString(Name)) + "/" + implicitly[PathBindable[String]].unbind("Level", dynamicString(Level)) + "/" + implicitly[PathBindable[String]].unbind("Facebookid", dynamicString(Facebookid)) + "/add")
}
                                                

// @LINE:20
def abortGame(gameID:String, facebookID:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "games/" + implicitly[PathBindable[String]].unbind("gameID", dynamicString(gameID)) + "/" + implicitly[PathBindable[String]].unbind("facebookID", dynamicString(facebookID)) + "/abort")
}
                                                

// @LINE:23
def poke(userFacebookID:String, recipentFacebookID:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "games/" + implicitly[PathBindable[String]].unbind("userFacebookID", dynamicString(userFacebookID)) + "/" + implicitly[PathBindable[String]].unbind("recipentFacebookID", dynamicString(recipentFacebookID)) + "/poke")
}
                                                

// @LINE:33
def getmyMonsters(Facebookid:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "Monsters/" + implicitly[PathBindable[String]].unbind("Facebookid", dynamicString(Facebookid)) + "/getmyMonsters")
}
                                                

// @LINE:13
def getNearbyUsers(facebookID:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[String]].unbind("facebookID", dynamicString(facebookID)) + "/getNearbyUsers")
}
                                                

// @LINE:32
def getMonster(Monsterid:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "Monsters/" + implicitly[PathBindable[String]].unbind("Monsterid", dynamicString(Monsterid)) + "/get")
}
                                                

// @LINE:21
def acceptGame(gameID:String, facebookID:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "games/" + implicitly[PathBindable[String]].unbind("gameID", dynamicString(gameID)) + "/" + implicitly[PathBindable[String]].unbind("facebookID", dynamicString(facebookID)) + "/accept")
}
                                                

// @LINE:22
def interactionInGame(gameID:String, facebookID:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "games/" + implicitly[PathBindable[String]].unbind("gameID", dynamicString(gameID)) + "/" + implicitly[PathBindable[String]].unbind("facebookID", dynamicString(facebookID)) + "/interaction")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:12
def loginUser(faceBookAuthToken:String, googleCDSToken:String, longitude:Double, latitude:Double): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[String]].unbind("faceBookAuthToken", dynamicString(faceBookAuthToken)) + "/" + implicitly[PathBindable[String]].unbind("googleCDSToken", dynamicString(googleCDSToken)) + "/" + implicitly[PathBindable[Double]].unbind("longitude", longitude) + "/" + implicitly[PathBindable[Double]].unbind("latitude", latitude) + "/login")
}
                                                

// @LINE:19
def requestNewGame(facebookID:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "games/" + implicitly[PathBindable[String]].unbind("facebookID", dynamicString(facebookID)) + "/requestNew")
}
                                                
    
}
                          
}
                  


// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:27
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:27
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:6
class ReverseApplication {
    

// @LINE:16
def updateUserLocation : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateUserLocation",
   """
      function(facebookId,longitude,latitude) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "positions/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("facebookId", encodeURIComponent(facebookId)) + "/" + (""" + implicitly[PathBindable[Double]].javascriptUnbind + """)("longitude", longitude) + "/" + (""" + implicitly[PathBindable[Double]].javascriptUnbind + """)("latitude", latitude) + "/update"})
      }
   """
)
                        

// @LINE:27
def test : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.test",
   """
      function(userFacebookID) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "test/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userFacebookID", encodeURIComponent(userFacebookID)) + "/test"})
      }
   """
)
                        

// @LINE:31
def AddMonster : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.AddMonster",
   """
      function(Monsterid,Name,Level,Facebookid) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Monsters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("Monsterid", encodeURIComponent(Monsterid)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("Name", encodeURIComponent(Name)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("Level", encodeURIComponent(Level)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("Facebookid", encodeURIComponent(Facebookid)) + "/add"})
      }
   """
)
                        

// @LINE:20
def abortGame : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.abortGame",
   """
      function(gameID,facebookID) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "games/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("gameID", encodeURIComponent(gameID)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("facebookID", encodeURIComponent(facebookID)) + "/abort"})
      }
   """
)
                        

// @LINE:23
def poke : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.poke",
   """
      function(userFacebookID,recipentFacebookID) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "games/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userFacebookID", encodeURIComponent(userFacebookID)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("recipentFacebookID", encodeURIComponent(recipentFacebookID)) + "/poke"})
      }
   """
)
                        

// @LINE:33
def getmyMonsters : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getmyMonsters",
   """
      function(Facebookid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Monsters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("Facebookid", encodeURIComponent(Facebookid)) + "/getmyMonsters"})
      }
   """
)
                        

// @LINE:13
def getNearbyUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getNearbyUsers",
   """
      function(facebookID) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("facebookID", encodeURIComponent(facebookID)) + "/getNearbyUsers"})
      }
   """
)
                        

// @LINE:32
def getMonster : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getMonster",
   """
      function(Monsterid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Monsters/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("Monsterid", encodeURIComponent(Monsterid)) + "/get"})
      }
   """
)
                        

// @LINE:21
def acceptGame : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.acceptGame",
   """
      function(gameID,facebookID) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "games/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("gameID", encodeURIComponent(gameID)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("facebookID", encodeURIComponent(facebookID)) + "/accept"})
      }
   """
)
                        

// @LINE:22
def interactionInGame : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.interactionInGame",
   """
      function(gameID,facebookID) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "games/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("gameID", encodeURIComponent(gameID)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("facebookID", encodeURIComponent(facebookID)) + "/interaction"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:12
def loginUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loginUser",
   """
      function(faceBookAuthToken,googleCDSToken,longitude,latitude) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("faceBookAuthToken", encodeURIComponent(faceBookAuthToken)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("googleCDSToken", encodeURIComponent(googleCDSToken)) + "/" + (""" + implicitly[PathBindable[Double]].javascriptUnbind + """)("longitude", longitude) + "/" + (""" + implicitly[PathBindable[Double]].javascriptUnbind + """)("latitude", latitude) + "/login"})
      }
   """
)
                        

// @LINE:19
def requestNewGame : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.requestNewGame",
   """
      function(facebookID) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "games/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("facebookID", encodeURIComponent(facebookID)) + "/requestNew"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:27
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:27
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:6
class ReverseApplication {
    

// @LINE:16
def updateUserLocation(facebookId:String, longitude:Double, latitude:Double): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateUserLocation(facebookId, longitude, latitude), HandlerDef(this, "controllers.Application", "updateUserLocation", Seq(classOf[String], classOf[Double], classOf[Double]), "POST", """ Positioning""", _prefix + """positions/$facebookId<[^/]+>/$longitude<[^/]+>/$latitude<[^/]+>/update""")
)
                      

// @LINE:27
def test(userFacebookID:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.test(userFacebookID), HandlerDef(this, "controllers.Application", "test", Seq(classOf[String]), "POST", """""", _prefix + """test/$userFacebookID<[^/]+>/test""")
)
                      

// @LINE:31
def AddMonster(Monsterid:String, Name:String, Level:String, Facebookid:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.AddMonster(Monsterid, Name, Level, Facebookid), HandlerDef(this, "controllers.Application", "AddMonster", Seq(classOf[String], classOf[String], classOf[String], classOf[String]), "POST", """""", _prefix + """Monsters/$Monsterid<[^/]+>/$Name<[^/]+>/$Level<[^/]+>/$Facebookid<[^/]+>/add""")
)
                      

// @LINE:20
def abortGame(gameID:String, facebookID:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.abortGame(gameID, facebookID), HandlerDef(this, "controllers.Application", "abortGame", Seq(classOf[String], classOf[String]), "POST", """""", _prefix + """games/$gameID<[^/]+>/$facebookID<[^/]+>/abort""")
)
                      

// @LINE:23
def poke(userFacebookID:String, recipentFacebookID:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.poke(userFacebookID, recipentFacebookID), HandlerDef(this, "controllers.Application", "poke", Seq(classOf[String], classOf[String]), "POST", """""", _prefix + """games/$userFacebookID<[^/]+>/$recipentFacebookID<[^/]+>/poke""")
)
                      

// @LINE:33
def getmyMonsters(Facebookid:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getmyMonsters(Facebookid), HandlerDef(this, "controllers.Application", "getmyMonsters", Seq(classOf[String]), "GET", """""", _prefix + """Monsters/$Facebookid<[^/]+>/getmyMonsters""")
)
                      

// @LINE:13
def getNearbyUsers(facebookID:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getNearbyUsers(facebookID), HandlerDef(this, "controllers.Application", "getNearbyUsers", Seq(classOf[String]), "GET", """""", _prefix + """users/$facebookID<[^/]+>/getNearbyUsers""")
)
                      

// @LINE:32
def getMonster(Monsterid:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getMonster(Monsterid), HandlerDef(this, "controllers.Application", "getMonster", Seq(classOf[String]), "GET", """""", _prefix + """Monsters/$Monsterid<[^/]+>/get""")
)
                      

// @LINE:21
def acceptGame(gameID:String, facebookID:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.acceptGame(gameID, facebookID), HandlerDef(this, "controllers.Application", "acceptGame", Seq(classOf[String], classOf[String]), "POST", """""", _prefix + """games/$gameID<[^/]+>/$facebookID<[^/]+>/accept""")
)
                      

// @LINE:22
def interactionInGame(gameID:String, facebookID:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.interactionInGame(gameID, facebookID), HandlerDef(this, "controllers.Application", "interactionInGame", Seq(classOf[String], classOf[String]), "POST", """""", _prefix + """games/$gameID<[^/]+>/$facebookID<[^/]+>/interaction""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:12
def loginUser(faceBookAuthToken:String, googleCDSToken:String, longitude:Double, latitude:Double): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loginUser(faceBookAuthToken, googleCDSToken, longitude, latitude), HandlerDef(this, "controllers.Application", "loginUser", Seq(classOf[String], classOf[String], classOf[Double], classOf[Double]), "POST", """ User functions: login, get users and update positions""", _prefix + """users/$faceBookAuthToken<[^/]+>/$googleCDSToken<[^/]+>/$longitude<[^/]+>/$latitude<[^/]+>/login""")
)
                      

// @LINE:19
def requestNewGame(facebookID:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.requestNewGame(facebookID), HandlerDef(this, "controllers.Application", "requestNewGame", Seq(classOf[String]), "POST", """ Game requests and event triggering""", _prefix + """games/$facebookID<[^/]+>/requestNew""")
)
                      
    
}
                          
}
        
    
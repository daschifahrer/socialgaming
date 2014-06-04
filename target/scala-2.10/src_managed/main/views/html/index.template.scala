
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*22.2*/getGames/*22.10*/ = {{
	import scala.collection.JavaConverters._
	
	models.Game.findAllGames().asScala.toSeq.reverse
}};
Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
	
	<h2> """),_display_(Seq[Any](/*5.8*/message)),format.raw/*5.15*/(""" - Game statistics:</h2><br>
	<div>
   """),_display_(Seq[Any](/*7.5*/for(game <- getGames) yield /*7.26*/ {_display_(Seq[Any](format.raw/*7.28*/("""
   	<p>
   		<li> <b>"""),_display_(Seq[Any](/*9.15*/game/*9.19*/.date)),format.raw/*9.24*/(""" :</b> 
   			<p> """),_display_(Seq[Any](/*10.12*/game/*10.16*/.getState)),format.raw/*10.25*/(""" : """),_display_(Seq[Any](/*10.29*/game/*10.33*/.firstUserName)),format.raw/*10.47*/(""" vs. """),_display_(Seq[Any](/*10.53*/game/*10.57*/.secondUserName)),format.raw/*10.72*/(""" -> winner: """),_display_(Seq[Any](/*10.85*/game/*10.89*/.winnerName)),format.raw/*10.100*/(""" </p>
   		</li>
   	</p>
   """)))})),format.raw/*13.5*/("""
   </div>
   
	
	"""),format.raw/*19.41*/("""
""")))})),format.raw/*20.2*/("""

"""),format.raw/*26.2*/("""


"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 01 21:16:06 CEST 2014
                    SOURCE: C:/Users/michael/Desktop/tutorial/SocialGamingServer/app/views/index.scala.html
                    HASH: 07341f8da3cc5c5db6808f65dfe5d4f02a0c4203
                    MATRIX: 774->1|869->426|886->434|1017->18|1054->21|1085->44|1124->46|1168->56|1196->63|1270->103|1306->124|1345->126|1403->149|1415->153|1441->158|1496->177|1509->181|1540->190|1580->194|1593->198|1629->212|1671->218|1684->222|1721->237|1770->250|1783->254|1817->265|1878->295|1924->421|1957->423|1986->535
                    LINES: 26->1|28->22|28->22|33->1|35->3|35->3|35->3|37->5|37->5|39->7|39->7|39->7|41->9|41->9|41->9|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|45->13|49->19|50->20|52->26
                    -- GENERATED --
                */
            
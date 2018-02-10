package controllers

import models.Greeting
import play.api.i18n.Langs
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, ControllerComponents}
import play.twirl.api.Html
import play.api.Configuration
import git.GitInfo

class MonitoringController(cc: ControllerComponents, configuration : Configuration) extends AbstractController(cc) {


  def index = Action {
    implicit req => 
      Ok(Json.obj(
        "POD_IP"-> configuration.get[String]("pod.ip"),
        "POD_NAME" -> configuration.get[String]("pod.name"),
        "VERSION"-> "1.0.0"
      )
    )
  }
}

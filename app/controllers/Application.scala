package controllers

import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def join = Action {
    Ok("Ok")
  }

  def deleteAllUsers() = Action {
    Ok("Ok")
  }
}
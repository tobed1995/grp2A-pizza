package controllers

import play.api.mvc._

/**
 * Main controller of the Pizza Service application.
 *
 * @author ob, scs
 */
object Application extends Controller {

  /**
   * Shows the start page of the application.
   *
   * @return main web page
   */
  def index : Action[AnyContent] = Action {
    Ok(views.html.index())
  }

  def logOut = Action { request =>
    Ok(views.html.index()).withNewSession
  }


}

import controllers.MonitoringController
import play.api.i18n.Langs
import play.api.mvc.ControllerComponents
import services.ServicesModule
import play.api.Configuration

trait GreetingModule extends ServicesModule {

  import com.softwaremill.macwire._

  lazy val monitoringController = wire[MonitoringController]

  def langs: Langs

  def controllerComponents: ControllerComponents

  def configuration : Configuration

}

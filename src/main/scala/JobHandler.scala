import org.apache.camel.{Body, ExchangeProperty}

class JobHandler {
  def handle(@ExchangeProperty("CamelTimerCounter") counter: Long): Unit = {
    import scala.math.{atan, tan}

    val iterations = (counter % 500) * 10
    var x = 0.5
    for {_ <- Seq.range(1, iterations)}
      x = tan(atan(x))
  }
}

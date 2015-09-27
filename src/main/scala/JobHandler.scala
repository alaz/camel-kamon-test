import org.apache.camel.{Body, ExchangeProperty}

class JobHandler {
  def handle(@ExchangeProperty("CamelTimerCounter") timerCounter: Long, @Body body: String): Unit = {
    assume(body == null)

    Thread.sleep(timerCounter % 5)
  }
}

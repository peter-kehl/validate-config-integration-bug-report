package your.pack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.mqtt.inbound.MqttPahoMessageDrivenChannelAdapter;

@Configuration
public class BeanConf {
    @Bean
    IntegrationFlow mqttInbound(Conf con) {
        MqttPahoMessageDrivenChannelAdapter adapter = new MqttPahoMessageDrivenChannelAdapter( "tcp://localhost:1883", "mqttClientID");
        return IntegrationFlows.from(adapter).handle( message -> {throw new Error("MQTT handler invoked.");} );
    }
}

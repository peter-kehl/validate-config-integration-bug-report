package your.pack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.mqtt.inbound.MqttPahoMessageDrivenChannelAdapter;

@Configuration
public class IntegrationFlowConf {
    @Bean
    IntegrationFlow mqttInbound(ConfKotlin conf) {
        System.out.println( "conf is of class: " +conf.getClass());
        System.out.println( "conf.getValue(): " + conf.getValue());
        MqttPahoMessageDrivenChannelAdapter adapter = new MqttPahoMessageDrivenChannelAdapter( "tcp://localhost:1883", "mqttClientID", "topic");
        return IntegrationFlows
                .from(adapter)
                .handle( message -> {throw new Error("MQTT handler invoked.");} )
                .get();
    }
}

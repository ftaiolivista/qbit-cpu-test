package it.vista.qbit

import io.advantageous.qbit.server.ServiceEndpointServer
import io.advantageous.qbit.server.EndpointServerBuilder

// import static io.advantageous.qbit.client.ClientBuilder.clientBuilder
// import io.advantageous.qbit.client.Client

import io.advantageous.qbit.message.MethodCallBuilder

class QbitCpuTest {

  public static void main(args) {

    final ServiceEndpointServer server = new EndpointServerBuilder().build()
    server.start()

  }

}

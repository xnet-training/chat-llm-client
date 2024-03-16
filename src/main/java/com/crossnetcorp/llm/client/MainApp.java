package com.crossnetcorp.chat.llm.client;

public static void main(String[] args) {
  public static void main(String args[]) {
    // Paso 1: Establecer la conexión con el servidor
    ManagedChannel channel = ManagedChannelBuilder
	    .forAddress("172.17.8.220", 8999)
	    .usePlaintext().build();
    // Paso 2: 
    //GreeterGrpc.GreeterBlockingStub bookStub = GreeterGrpc.newBlockingStub(channel);
    //
    
    // Paso 3: Ralizar la petición (request / response)
    //Helloworld.HelloReply reply = bookStub.sayHello(Helloworld.HelloRequest.newBuilder().setName("gRPC").build());
    //    System.out.println(reply.getMessage());

    // Paso 4: Cerrar el canal
    //channel.shutdown();
  }
}

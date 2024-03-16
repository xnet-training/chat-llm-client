package com.crossnetcorp.chat.llm.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.crossnetcorp.chat.llmserver.LLMChatServiceGrpc;
import com.crossnetcorp.chat.llmserver.LlmServer.PingResponse;
import com.crossnetcorp.chat.llmserver.LlmServer.PingRequest;

public class MainApp {

    public static void main(String args[]) {
        System.out.println("Iniciando Cliente Chatbot LLM ...");
        // Paso 1: Establecer la conexión con el servidor
        ManagedChannel channel = ManagedChannelBuilder.forAddress("172.17.8.220", 8999).usePlaintext().build();
        // Paso 2:
        LLMChatServiceGrpc.LLMChatServiceBlockingStub llmStub = LLMChatServiceGrpc.newBlockingStub(channel);
        //

        // Paso 3: Ralizar la petición (request / response)
        System.out.println("Iniciando llamada remota ...");
        PingResponse response = llmStub.ping(PingRequest.newBuilder().setName("Caja Cusco - Curso ARQ003").build());
        System.out.println("Recibiendo respuesta ...");
        System.out.println(response.getResponse());

        // Paso 4: Cerrar el canal
        channel.shutdown();
    }
}

FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY build/libs/*.jar app.jar
COPY keystore.p12 ./keystore.p12

ENV SSL_KEY_STORE_PASSWORD=${SSL_KEY_STORE_PASSWORD}
ENV SSL_KEY_STORE=./keystore.p12
ENV SSL_KEY_ALIAS=${SSL_KEY_ALIAS}
ENV NGROK_AUTH_TOKEN=${NGROK_AUTHTOKEN}


EXPOSE 8443

ENTRYPOINT ["java", "-jar", "app.jar"]
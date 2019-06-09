FROM adoptopenjdk/openjdk11:alpine
EXPOSE 8080 8443 8000
# Create a docker-entrypoint script at the root folder to funnel start commands to
COPY ./docker-entrypoint.sh /docker-entrypoint.sh

# Default port on Spring Boot web applications for http and https, as well as port 8000 for remote Java debugging.
RUN chmod u+x /docker-entrypoint.sh
ENTRYPOINT ["/docker-entrypoint.sh"]
# Deploy our app last, so we can keep all the previous commands fresh in our cache.
# COPY ./build/libs/*.jar /opt
ADD build/distributions/nta-local-inject-api.tar /



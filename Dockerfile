FROM adoptopenjdk/openjdk11:alpine
MAINTAINER Dilip Sundarraj
EXPOSE 8080 8443 8000
# Create a docker-entrypoint script at the root folder to funnel start commands to
COPY ./docker-entrypoint.sh /docker-entrypoint.sh

RUN chmod u+x /docker-entrypoint.sh

ENTRYPOINT ["/docker-entrypoint.sh"]

#RUN mkdir /opt && chmod 755 /opt

# Deploy our app last, so we can keep all the previous commands fresh in our cache.
# COPY ./build/libs/*.jar /opt
COPY ./build/libs/*.jar /opt

RUN cd /opt && ln -s *.jar app.jar


#CMD ["start"]



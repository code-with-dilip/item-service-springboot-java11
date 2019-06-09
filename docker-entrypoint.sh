#!/bin/sh

    java_opts="-Djava.security.egd=file:/dev/./urandom "

   [ -n "$ENVIRONMENT" ] && java_opts+=" -Dspring.profiles.active=$ENVIRONMENT"

exec java -jar ${java_env} /opt/app.jar

#!/bin/bash
set -e

if [ "$1" = 'start' ]; then
    exec env ${java_env}  /nta-local-inject-api/bin/nta-local-inject-api
fi
exec "$@"

#!/usr/bin/env bash

HEROKU_NAME="powerful-reaches-88152"

docker login -u _ --password=$HEROKU_API_KEY registry.heroku.com
git init
heroku git:remote -a $HEROKU_NAME
heroku stack:set container
git push heroku master


echo "🚀  https://$HEROKU_NAME"
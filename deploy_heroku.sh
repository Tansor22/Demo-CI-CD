#!/usr/bin/env bash

HEROKU_NAME="powerful-reaches-88152"

#docker login -u _ --password=$HEROKU_API_KEY registry.heroku.com
# Setup Heroku
sudo apt-add-repository 'deb http://toolbelt.herokuapp.com/ubuntu ./'
curl http://toolbelt.herokuapp.com/apt/release.key | apt-key add -
sudo apt-get update
sudo apt-get install heroku-toolbelt

# Run Heroku CLI
# Once installed, you’ll have access to the heroku command from your command shell.
# Log in using the email address and password you used when creating your Heroku account.
heroku container:push web


echo "🚀  https://$HEROKU_NAME"
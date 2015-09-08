# fuzz

Sample minimalist ClojureScript project using Google Material Designs. Demonstrates

+ Basic Ring/HttpKit, ClojureScript integration
+ Figwheel
+ js interopt
+ Dommy
+ Hiccups
+ Mustache.js
+ Core.Async
+ Om/React
+ clj-http
+ Server sent events

## Usage

Repl in, do

`(dev)`

`(reset)`

Visit port 8080.

Expose `:slack-token` via environ to run the Slack functionality.

Run `(send-msg "foo")` from the REPL to send a message to the ldnclj channel.

## License

Copyright © 2015 JUXT LTD.

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

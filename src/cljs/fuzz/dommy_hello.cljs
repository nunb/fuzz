(ns fuzz.dommy-hello
  (:require [dommy.core :as dommy :refer-macros [sel1]]))

(defn- snippet []
  "<div class='juxt-div'><h1>Killing in the name of</h1></div>")

(defn handler [container params]
  (dommy/set-html! (sel1 :#container) (snippet)))

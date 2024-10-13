(ns com.example.app
  (:require [com.example.ui :as ui]))

;; Define a function that takes the context `ctx` and returns the page
(defn app [ctx]
  (ui/page ctx
   [:div "Hello world"]))

;; Define a module with the correct route
(def module
  {:routes [["/app" {:get app}]]})

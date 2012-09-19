(ns bootstrap-docs.server
  (:require [noir.server :as server])
  (:use [ring.middleware.gzip :only [wrap-gzip]]))

(server/load-views-ns "bootstrap-docs.controllers")

(server/add-middleware wrap-gzip)

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "8080"))]
    (server/start port {:mode mode
                        :ns 'bootstrap-docs})))

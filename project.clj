(defproject bootstrap-docs "0.1.0-SNAPSHOT"
            :description "FIXME: write this!"
            :dependencies [[org.clojure/clojure "1.4.0"]
                           [noir "1.3.0-beta10"]
                           [bootstrap "0.0.1-SNAPSHOT"]
                           [amalloy/ring-gzip-middleware "0.1.2"]]
            :min-lein-version "2.0.0-preview10"
            :main bootstrap-docs.server)

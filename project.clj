(defproject bootstrap-docs "0.1.0-SNAPSHOT"
            :description "FIXME: write this!"
            :dependencies [[org.clojure/clojure "1.4.0"]
                           [noir "1.3.0-beta3"]
                           [bootstrap "0.0.1-SNAPSHOT"]
                           [rm-hull/ring-gzip-middleware "0.1.3"]]
            :dev-dependencies [[appengine-magic "0.5.0"]]
            :main bootstrap-docs.server)

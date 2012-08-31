(ns bootstrap-docs.app_servlet
  (:gen-class :extends javax.servlet.http.HttpServlet)
  (:use [appengine-magic.servlet :only [make-servlet-service-method]])
  (:require [appengine-magic.core :as gae]
            [noir.util.gae :as noir-gae]
            [noir.server.handler :as handler]
            [bootstrap-docs.controllers.base-css]
            [bootstrap-docs.controllers.scaffolding]
            [bootstrap-docs.controllers.javascript]
            [bootstrap-docs.controllers.components]))

(gae/def-appengine-app myapp-app (noir-gae/gae-handler nil))

(defn -service [this request response]
  ((make-servlet-service-method myapp-app) this request response))

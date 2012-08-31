(ns bootstrap-docs.views.common
  (:use [hiccup.core]
        [hiccup.element]
        [hiccup.form]
        [hiccup.page]
        [hiccup.bootstrap]))

(def bootstrap-docs-css
  {:docs "/assets/css/docs.css"})

(def bootstrap-docs-js
  {:application "/assets/js/application.js"})

(defn navigator
  "Navigator on top"
  [nav-list]
  [:div.navbar.navbar-fixed-top
    [:div.navbar-inner
     [:div.container
      [:button.btn.btn-navbar
       {:data-target ".nav-collapse",
        :data-toggle "collapse",
        :type "button"}
       (repeat 3 [:span.icon-bar])]

      [:div.nav-collapse.collapse
       nav-list]]]])

(defn greeter
  "A greeter with heading and content"
  [title content]

  [:header#overview.jumbotron.subhead
     [:h1 title]
     [:p.lead
      content]])

(defn subnav
  "A smaller navigator"
  [links]

  [:div.subnav
      (unordered-list {:class "nav nav-pills"}
                      links)])

(def footer
  [:footer.footer
     [:p.pull.right (link-to "#" "Back to top")]
     [:p
      "Designed and built with all the love in the world "
      (link-to {:target "_blank"}
               "http://twitter.com/twitter" "@twitter")
      " by "
      (link-to {:target "_blank"}
               "http://twitter.com/mdo" "@mdo")
      " and "
      (link-to {:target "_blank"}
               "http://twitter.com/fat" "@fat")
      "."]
     [:p
      "Code licensed under the "
      (link-to {:target "_blank"}
               "http://www.apache.org/licenses/LICENSE-2.0"
               "Apache License v2.0")

      ". Documentation licensed under "
      (link-to {:target "_blank"}
               "http://creativecommons.org/licenses/by/3.0/"
               "CC BY 3.0")
      "."]
     [:p
      "Icons from "
      (link-to {:target "_blank"}
               "http://glyphicons.com"
               "Glyphicons Free")
      ", licensed under "
      (link-to {:target "_blank"}
               "http://creativecommons.org/licenses/by/3.0/"
               "CC BY 3.0")
      "."]])

(defn layout
  "Generate :head for pages"
  [title css-assets js-assets main-content]

  (html5
   [:head
    [:meta {:charset "utf-8"}]
    [:title (str title " · Twitter Bootstrap")]
    (meta-tags {:viewport "width=device-width, initial-scale=1.0"
                :description title
                :author "myguidingstar"})

    (apply include-css (get-assets bootstrap-css css-assets))
    (include-css (get bootstrap-docs-css :docs))

    (favicon "/assets/ico/favicon.ico")
    (apple-touch-icon)]

   [:body
    {:data-offset "50", :data-target ".subnav", :data-spy "scroll"}
    main-content
    (apply include-js (get-assets bootstrap-js js-assets))
    (include-js (get bootstrap-docs-js :application))]))

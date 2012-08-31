(ns bootstrap-docs.views.base-css.header
  (:use [hiccup.core]
        [hiccup.element]
        [hiccup.form]
        [hiccup.page]))

(def navigator
  [:div.navbar.navbar-fixed-top
    [:div.navbar-inner
     [:div.container
      [:button.btn.btn-navbar
       {:data-target ".nav-collapse",
        :data-toggle "collapse",
        :type "button"}
       (repeat 3 [:span.icon-bar])]

      [:div.nav-collapse.collapse
       (unordered-list {:class "nav"}
                        [[:li.active (link-to "/base-css" "Base CSS")]
                         (link-to "/scaffolding" "Scaffolding")
                         (link-to "/components" "Components")
                         {:class "divider-vertical"}
                         (link-to "/javascript" "Javascript plugins")
                         (link-to "/less" "Using LESS")])]]]])

(def header
  [:header#overview.jumbotron.subhead
     [:h1 "Base CSS"]
     [:p.lead
      "On top of the scaffolding, basic HTML elements are styled
and enhanced with extensible classes to provide a fresh, consistent
 look and feel."]
     [:div.subnav
      (unordered-list {:class "nav nav-pills"}
                      [(link-to "#typography" "Typography")
                       (link-to "#code" "Code")
                       (link-to "#tables" "Tables")
                       (link-to "#forms" "Forms")
                       (link-to "#buttons" "Buttons")
                       (link-to "#icons" "Icons")

                       ])]])
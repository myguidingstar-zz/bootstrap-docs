(ns bootstrap-docs.controllers.base-css
  (:use [noir.core]
        [hiccup.core]
        [hiccup.element]
        [hiccup.bootstrap]
        [bootstrap-docs.views.common]
        [bootstrap-docs.views.base-css.typography]
        [bootstrap-docs.views.base-css.code]
        [bootstrap-docs.views.base-css.tables]
        [bootstrap-docs.views.base-css.forms]
        [bootstrap-docs.views.base-css.buttons]
        [bootstrap-docs.views.base-css.icons]))

(def content
  (list
   (navigator
      [:ul.nav
       [:li.active (link-to "/base-css" "Base CSS")]
       [:li (link-to "/scaffolding" "Scaffolding")]
       [:li (link-to "/components" "Components")]
       [:li {:class "divider-vertical"}]
       [:li (link-to "/javascript" "Javascript plugins")]
       ])

   [:div.container
    (greeter "Base CSS"
             "On top of the scaffolding, basic HTML elements are styled and
enhanced with extensible classes to provide a fresh, consistent look and feel.")

    (subnav [(link-to "#typography" "Typography")
              (link-to "#code" "Code")
              (link-to "#tables" "Tables")
              (link-to "#forms" "Forms")
              (link-to "#buttons" "Buttons")
              (link-to "#icons" "Icons")])

    typography
    code
    tables
    forms
    buttons
    icons
    footer]))

(defpage "/base-css" []
  (layout "Base CSS"
          :all :all
          content))
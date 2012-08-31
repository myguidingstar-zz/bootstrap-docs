(ns bootstrap-docs.views.components.misc
  (:use [noir.core]
        [hiccup.core]
        [hiccup.element]
        [hiccup.bootstrap]
        [bootstrap-docs.views.common]
        [hiccup.form]
        [hiccup.page]
        ))

(def misc
  [:section#misc
     [:div.page-header
      [:h1 "Miscellaneous " [:small "Lightweight utility components"]]]
     [:div.row
      [:div.span4
       [:h2 "Wells"]
       [:p
        "Use the well as a simple effect on an element to give it an inset
effect."]
       [:div.well "Look, I'm in a well!"]
       [:pre.prettyprint.linenums
        (format-code
         [:div.well "..."])]]

      [:div.span4
       [:h2 "Close icon"]
       [:p
        "Use the generic close icon for dismissing content like modals and
alerts."]
       [:p [:button.close {:style "float: none;"} "×"]]
       [:pre.prettyprint.linenums
        (format-code
         [:button.close "×"])]
       [:p
        "iOS devices require an href=\"#\" for click events if you rather use
an anchor."]
       [:pre.prettyprint.linenums
        (format-code
         [:a.close {:href "#"} "×"])]]]])
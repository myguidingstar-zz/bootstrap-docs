(ns bootstrap-docs.views.scaffolding.global
  (:use [hiccup.core]
        [hiccup.element]
        [hiccup.bootstrap]
        [bootstrap-docs.views.common]
        ))

(def global
  [:section#global
     [:div.page-header
      [:h1
       "Global styles "
       [:small "for CSS reset, typography, and links"]]]
     [:div.row
      [:div.span4
       [:h2 "Requires HTML5 doctype"]
       [:p
        "Bootstrap makes use of HTML elements and CSS properties that require
the use of the HTML5 doctype. Be sure to include it at the beginning of every
 Bootstrapped page in your project."]
       [:pre.prettyprint.linenums (format-code (html5 ...))]]

      [:div.span4
       [:h2 "Typography and links"]
       [:p
        "Within the "
        [:strong "scaffolding.less"]
        " file, we set basic global display, typography, and link styles.
 Specifically, we:"]
       [:ul
        [:li "Remove margin on the body"]
        [:li
         "Set "
         [:code "background-color: white;"]
         " on the "
         [:code "body"]]
        [:li
         "Use the "
         [:code "@baseFontFamily"]
         ", "
         [:code "@baseFontSize"]
         ", and "
         [:code "@baseLineHeight"]
         " attributes as our typographyic base"]
        [:li
         "Set the global link color via "
         [:code "@linkColor"]
         " and apply link underlines only on "
         [:code ":hover"]]]]

      [:div.span4
       [:h2 "Reset via Normalize"]
       [:p
        "As of Bootstrap 2, the traditional CSS reset has evolved
to make use of elements from "
        (link-to {:target "_blank"}
                 "http://necolas.github.com/normalize.css/" "Normalize.css")
        ", a project by "
        (link-to {:target "_blank"}
         "http://twitter.com/necolas" "Nicolas Gallagher")
        " that also powers the "
        (link-to {:target "_blank"}
                 "http://html5boilerplate.com" "HTML5 Boilerplate")
        "."]
       [:p
        "The new reset can still be found in "
        [:strong "reset.less"]
        ", but with many elements removed for brevity and accuracy."]]]])
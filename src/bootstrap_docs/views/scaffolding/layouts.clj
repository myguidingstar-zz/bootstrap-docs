(ns bootstrap-docs.views.scaffolding.layouts
  (:use [noir.core]
        [hiccup.core]
        [hiccup.element]
        [hiccup.bootstrap]
        [bootstrap-docs.views.common]
        ))

(def layouts
  [:section#layouts
     [:div.page-header
      [:h1 "Layouts " [:small "Basic templates to create webpages"]]]
     [:div.row
      [:div.span6
       [:h2 "Fixed layout"]
       [:p
        "The default and simple 940px-wide, centered layout for just about any
website or page provided by a single "
        [:code "[:div.container]"]
        "."]
       [:div.mini-layout [:div.mini-layout-body]]
       [:pre.prettyprint.linenums
        (format-code [:body [:div.container "..."]])]]

      [:div.span6
       [:h2 "Fluid layout"]
       [:p
        [:code "[:div.container-fluid]"]
        " gives flexible page structure, min- and max-widths, and a
 left-hand sidebar. It's great for apps and docs."]
       [:div.mini-layout.fluid
        [:div.mini-layout-sidebar]
        [:div.mini-layout-body]]
       [:pre.prettyprint.linenums
        (format-code
         [:div.container-fluid
          [:div.row-fluid
           [:div.span2 (comment "Sidebar content")]
           [:div.span10 (comment "Body content")]]])]]]])
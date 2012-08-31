(ns bootstrap-docs.views.components.typography
  (:use [noir.core]
        [hiccup.core]
        [hiccup.element]
        [hiccup.bootstrap]
        [bootstrap-docs.views.common]
        [hiccup.form]
        [hiccup.page]
        ))

(def typography
  [:section#typography
     [:div.page-header
      [:h1
       "Typographic components "
       [:small "Page header and hero unit for segmenting content"]]]
     [:h2 "Hero unit"]
     [:div.row
      [:div.span4
       [:p
        "Bootstrap provides a lightweight, flexible component called a hero unit
 to showcase content on your site. It works well on marketing and content-heavy
sites."]
       [:h3 "Markup"]
       [:p "Wrap your content in a " [:code "div"] " like so:"]
       [:pre.prettyprint.linenums
        (format-code
         [:div.hero.unit
          [:h1 "Hello, world!"]
          [:p "Tagline"]
          [:p [:a.btn.btn-primary.btn-large "Learn more"]]])]]
      [:div.span8
       [:div.hero.unit
        [:h1 "Hello, world!"]
        [:p
         "This is a simple hero unit, a simple jumbotron-style component for
 calling extra attention to featured content or information."]
        [:p [:a.btn.btn-primary.btn-large "Learn more"]]]]]

     [:h2 "Page header"]
     [:div.row
      [:div.span4
       [:p
        "A simple shell for an "
        [:code "h1"]
        " to appropriately space out and segment sections of content on a page.
It can utilize the "
        [:code "h1"]
        "'s default "
        [:code "small"]
        ", element as well most other components (with additional styles)."]]
      [:div.span8
       [:div.page-header
        [:h1 "Example page header " [:small "Subtext for header"]]]
       [:pre.prettyprint.linenums
        (format-code
         [:div.page.header
          [:h1 "Example page header"]])]]]])
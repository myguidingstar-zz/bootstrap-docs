(ns bootstrap-docs.views.components.breadcrumbs
  (:use [noir.core]
        [hiccup.core]
        [hiccup.element]
        [hiccup.bootstrap]
        [bootstrap-docs.views.common]
        [hiccup.form]
        [hiccup.page]
        ))

(def breadcrumbs
  [:section#breadcrumbs
     [:div.page-header
      [:h1 "Breadcrumbs"]]
     [:div.row
      [:div.span6
       [:h3 "Why use them"]
       [:p
        "Breadcrumb navigation is used as a way to show users where they are
within an app or a site, but not for primary navigation. Keep their use sparse
and succinct to be most effective."]
       [:h3 "Examples"]
       [:p
        "A single example shown as it might be displayed across multiple
 pages."]
       [:ul.breadcrumb [:li.active "Home"]]
       [:ul.breadcrumb
        [:li [:a {:href "#"} "Home"] " " [:span.divider "/"]]
        [:li.active "Library"]]
       [:ul.breadcrumb
        [:li [:a {:href "#"} "Home"] " " [:span.divider "/"]]
        [:li [:a {:href "#"} "Library"] " " [:span.divider "/"]]
        [:li.active "Data"]]]
      [:div.span6
       [:h3 "Markup"]
       [:p "HTML is your standard unordered list with links."]
       [:pre.prettyprint.linenums
        (format-code
         [:ul.breadcrumb
          [:li [:a {:href "#"} "Home"] " " [:span.divider "/"]]
          [:li [:a {:href "#"} "Library"] " " [:span.divider "/"]]
          [:li.active "Data"]])]]]])
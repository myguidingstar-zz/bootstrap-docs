(ns bootstrap-docs.controllers.components
  (:use [noir.core]
        [hiccup.core]
        [hiccup.element]
        [hiccup.form]
        [hiccup.page]
        [hiccup.bootstrap]
        [bootstrap-docs.views.common]
        [bootstrap-docs.views.components.button-groups]
        [bootstrap-docs.views.components.button-dropdowns]
        [bootstrap-docs.views.components.navs]
        [bootstrap-docs.views.components.navbar]
        [bootstrap-docs.views.components.breadcrumbs]
        [bootstrap-docs.views.components.pagination]
        [bootstrap-docs.views.components.labels]
        [bootstrap-docs.views.components.badges]
        [bootstrap-docs.views.components.typography]
        [bootstrap-docs.views.components.thumbnails]
        [bootstrap-docs.views.components.alerts]
        [bootstrap-docs.views.components.progress]
        [bootstrap-docs.views.components.misc]
        ))

(def content
  (list
   (navigator
    [:ul.nav
     [:li (link-to "/base-css" "Base CSS")]
     [:li (link-to "/scaffolding" "Scaffolding")]
     [:li.active (link-to "/components" "Components")]
     [:li {:class "divider-vertical"}]
     [:li (link-to "/javascript" "Javascript plugins")]
     ])

   [:div.container
    (greeter "Components"
             "Dozens of reusable components are built into Bootstrap to provide
navigation, alerts, popovers, and much more.")

    [:div.subnav
     [:ul.nav.nav-pills
      [:li.dropdown
       [:a.dropdown-toggle
        {:href "#", :data-toggle "dropdown"}
        "Buttons "
        [:b.caret]]
       [:ul.dropdown-menu
        [:li [:a {:href "#buttonGroups"} "Button groups"]]
        [:li [:a {:href "#buttonDropdowns"} "Button dropdowns"]]]]
      [:li.dropdown
       [:a.dropdown-toggle
        {:href "#", :data-toggle "dropdown"}
        "Navigation "
        [:b.caret]]
       [:ul.dropdown-menu
        [:li [:a {:href "#navs"} "Nav, tabs, pills"]]
        [:li [:a {:href "#navbar"} "Navbar"]]
        [:li [:a {:href "#breadcrumbs"} "Breadcrumbs"]]
        [:li [:a {:href "#pagination"} "Pagination"]]]]
      [:li [:a {:href "#labels"} "Labels"]]
      [:li [:a {:href "#badges"} "Badges"]]
      [:li [:a {:href "#typography"} "Typography"]]
      [:li [:a {:href "#thumbnails"} "Thumbnails"]]
      [:li [:a {:href "#alerts"} "Alerts"]]
      [:li [:a {:href "#progress"} "Progress bars"]]
      [:li [:a {:href "#misc"} "Miscellaneous"]]]]
    button-groups
    button-dropdowns
    navs
    navbar
    breadcrumbs
    pagination
    labels
    badges
    typography
    thumbnails
    alerts
    progress
    misc
    footer]))

(defpage "/components" []
     (layout "Components"
             :all :all
             content))
(ns bootstrap-docs.views.components.navbar
  (:use [noir.core]
        [hiccup.core]
        [hiccup.element]
        [hiccup.bootstrap]
        [bootstrap-docs.views.common]
        [hiccup.form]
        [hiccup.page]
        ))

(def navbar
  [:section#navbar
     [:div.page-header [:h1 "Navbar"]]
     [:h2 "Static navbar example"]
     [:p
      "An example of a static (not fixed to the top) navbar with project name,
navigation, and search form."]
     [:div.navbar
      [:div.navbar-inner
       [:div.container
        [:a.btn.btn-navbar
         {:data-target ".nav-collapse", :data-toggle "collapse"}
         [:span.icon-bar]
         [:span.icon-bar]
         [:span.icon-bar]]
        [:a.brand {:href "#"} "Project name"]
        [:div.nav-collapse
         [:ul.nav
          [:li.active [:a {:href "#"} "Home"]]
          [:li [:a {:href "#"} "Link"]]
          [:li [:a {:href "#"} "Link"]]
          [:li [:a {:href "#"} "Link"]]
          [:li.dropdown
           [:a.dropdown-toggle
            {:data-toggle "dropdown", :href "#"}
            "Dropdown "
            [:b.caret]]
           [:ul.dropdown-menu
            [:li [:a {:href "#"} "Action"]]
            [:li [:a {:href "#"} "Another action"]]
            [:li [:a {:href "#"} "Something else here"]]
            [:li.divider]
            [:li.nav-header "Nav header"]
            [:li [:a {:href "#"} "Separated link"]]
            [:li [:a {:href "#"} "One more separated link"]]]]]
         [:form.navbar-search.pull-left
          {:action ""}
          (text-field {:class "search-query span2" :placeholder "Search"} "")]
         [:ul.nav.pull-right
          [:li [:a {:href "#"} "Link"]]
          [:li.divider-vertical]
          [:li.dropdown
           [:a.dropdown-toggle
            {:data-toggle "dropdown", :href "#"}
            "Dropdown "
            [:b.caret]]
           [:ul.dropdown-menu
            [:li [:a {:href "#"} "Action"]]
            [:li [:a {:href "#"} "Another action"]]
            [:li [:a {:href "#"} "Something else here"]]
            [:li.divider]
            [:li [:a {:href "#"} "Separated link"]]]]]]
]]]

     [:div.row
      [:div.span8
       [:h3 "Navbar scaffolding"]
       [:p
        "The navbar requires only a few divs to structure it well for static or
fixed display."]
       [:pre.prettyprint.linenums
        (format-code
         [:div.navbar
          [:div.navbar-inner
           [:div.container
            "..."]]])]
       [:h3 "Fixed navbar"]
       [:p
        "Fix the navbar to the top or bottom of the viewport with an additional
class on the outermost div, "
        [:code ".navbar"]
        "."]
       [:div.row
        [:div.span4
         [:pre.prettyprint.linenums
          (format-code
           [:div.navbar.navbar-fixed-top
            "..."])]]
        [:div.span4
         [:pre.prettyprint.linenums
          (format-code
           [:div.navbar.navbar-fixed-bottom
            "..."])]]]

       [:p
        "When you affix the navbar, remember to account for the hidden area
underneath. Add 40px or more of padding to the "
        [:code "[:body]"]
        ". Be sure to add this after the core Bootstrap CSS and before the
optional responsive CSS."]
       [:h3 "Brand name"]
       [:p
        "A simple link to show your brand or project name only requires an
anchor tag."]
       [:pre.prettyprint.linenums
        (format-code
         (link-to {:class "brand"} "#" "Project name"))
]
       [:h3 "Forms in navbar"]
       [:p
        "To properly style and position a form within the navbar, add the
appropriate classes as shown below. For a default form, include "
        [:code ".navbar-form"]
        " and either "
        [:code ".pull-left"]
        " or "
        [:code ".pull-right"]
        " to properly align it."]
       [:pre.prettyprint.linenums
        (format-code
         [:form.navbar-form.pull-left
          (text-field {:class "span2"} "")])]
       [:p
        "For a more customized search form, add "
        [:code ".navbar-search"]
        " to the "
        [:code "form"]
        " and "
        [:code ".search-query"]
        " to the input for specialized styles in the navbar."]
       [:pre.prettyprint.linenums
        (format-code
         [:form.navbar-search.pull-left
          (text-field {:class "search-query" :placeholder "Search"})])]
       [:h3 "Optional responsive variation"]
       [:p
        "Depending on the amount of content in your topbar, you might want to
implement the responsive options. To do so, wrap your nav content in a
containing div, "
        [:code ".nav-collapse.collapse"]
        ", and add the navbar toggle button, "
        [:code ".btn-navbar"]
        "."]
       [:pre.prettyprint.linenums
        (format-code
         [:div.navbar
    [:div.navbar-inner
     [:div.container
      (comment "btn-navbar is used as the toggle for collapsed navbar content")
      [:a.btn.btn.navbar
       {:data-target ".nav-collapse", :data-toggle "collapse"}
       [:span.icon-bar]
       [:span.icon-bar]
       [:span.icon-bar]]
      (comment "Be sure to leave the brand out there if you want it shown")
      [:a.brand {:href "#"} "Project name"]
      (comment "Everything you want hidden at 940px or less, place within here")
      [:div.nav.collapse
       (comment ".nav, .navbar-search, .navbar-form, etc")]]]])]
       [:div.alert.alert-info
        [:strong "Heads up!"]
        " The responsive navbar requires the "
        [:a {:href "./javascript#collapse"} "collapse plugin"]
        " and "
        [:a
         {:href "./scaffolding#responsive"}
         "responsive Bootstrap CSS file"]]]

      [:div.span4
       [:h3 "Nav links"]
       [:p "Nav items are simple to add via unordered lists."]
       [:pre.prettyprint.linenums
        (format-code
            [:ul.nav
    [:li.active [:a {:href "#"} "Home"]]
    [:li [:a {:href "#"} "Link"]]
    [:li [:a {:href "#"} "Link"]]])
]
       [:p
        "You can easily add dividers to your nav links with an empty list item
and a simple class. Just add this between links:"]
       [:pre.prettyprint.linenums
        (format-code
         [:ul.nav
          "..."
          [:ul [:li.divider.vertical]]
          "..."])]
       [:h3 "Component alignment"]
       [:p
        "To align a nav, search form, or text, use the "
        [:code ".pull-left"]
        " or "
        [:code ".pull-right"]
        " utility classes. Both classes will add a CSS float in the specified
direction."]
       [:h3 "Adding dropdown menus"]
       [:p
        "Adding dropdowns and dropups to the nav is super simple, but does
require the use of "
        [:a
         {:href "./javascript#dropdowns"}
         "our javascript plugin"]
        "."]
       [:pre.prettyprint.linenums
        (format-code
         [:ul.nav
          [:li.dropdown
           [:a.dropdown-toggle
            {:data-toggle "dropdown", :href "#"}
            "Account"
            [:b.caret]]
           [:ul.dropdown-menu "..."]]])]
       [:p
        [:a.btn
         {:href "./javascript#dropdowns"}
         "Get the javascript →"]]
       [:hr]
       [:h3 "Text in the navbar"]
       [:p
        "Wrap strings of text in a "
        [:code "[{:class \".navbar-text\"}]"]
        ", usually on a "
        [:code "[:p]"]
        " tag for proper leading and color."]]]])
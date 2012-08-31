(ns bootstrap-docs.views.components.navs
  (:use [noir.core]
        [hiccup.core]
        [hiccup.element]
        [hiccup.bootstrap]
        [bootstrap-docs.views.common]
        [hiccup.form]
        [hiccup.page]
        ))

(def navs
  [:section#navs
     [:div.page-header
      [:h1
       "Nav, tabs, and pills "
       [:small "Highly customizable list-style navigation"]]]
     [:h2
      "Lightweight defaults "
      [:small "Same markup, different classes"]]
     [:div.row
      [:div.span4
       [:h3 "Powerful base class"]
       [:p
        "All nav components here—tabs, pills, and lists—"
        [:strong "share the same base markup and styles"]
        " through the "
        [:code ".nav"]
        " class."]
       [:h3 "When to use"]
       [:p
        "Tabs and pills are great for sections of content or navigating between
pages of related content."]
       [:h3 "Component alignment"]
       [:p
        "To align nav links, use the "
        [:code ".pull-left"]
        " or "
        [:code ".pull-right"]
        " utility classes. Both classes will add a CSS float in the specified
direction."]]
      [:div.span4
       [:h3 "Basic tabs"]
       [:p
        "Take a regular "
        [:code "[:ul]"]
        " of links and add "
        [:code ".nav-tabs"]
        ":"]
       [:ul.nav.nav-tabs
        [:li.active [:a {:href "#"} "Home"]]
        [:li [:a {:href "#"} "Profile"]]
        [:li [:a {:href "#"} "Messages"]]]
       [:pre.prettyprint.linenums
        (format-code
         [:ul.nav.nav-tabs
          [:li.active [:a {:href "#"} "Home"]]
          [:li [:a {:href "#"} "..."]]
          [:li [:a {:href "#"} "..."]]])]]
      [:div.span4
       [:h3 "Basic pills"]
       [:p
        "Take that same HTML, but use "
        [:code ".nav-pills"]
        " instead:"]
       [:ul.nav.nav-pills
        [:li.active [:a {:href "#"} "Home"]]
        [:li [:a {:href "#"} "Profile"]]
        [:li [:a {:href "#"} "Messages"]]]
       [:pre.prettyprint.linenums
        (format-code
         [:ul.nav.nav-pills
          [:li.active [:a {:href "#"} "Home"]]
          [:li [:a {:href "#"} "..."]]
          [:li [:a {:href "#"} "..."]]])]]]
     [:h2 "Stackable " [:small "Make tabs or pills vertical"]]
     [:div.row
      [:div.span4
       [:h3 "How to stack 'em"]
       [:p
        "As tabs and pills are horizontal by default, just add a second class, "
        [:code ".nav-stacked"]
        ", to make them appear vertically stacked."]]
      [:div.span4
       [:h3 "Stacked tabs"]
       [:ul.nav.nav-tabs.nav-stacked
        [:li.active [:a {:href "#"} "Home"]]
        [:li [:a {:href "#"} "Profile"]]
        [:li [:a {:href "#"} "Messages"]]]
       [:pre.prettyprint.linenums
        (format-code
         [:ul.nav.nav-tabs.nav-stacked
          "..."])]]
      [:div.span4
       [:h3 "Stacked pills"]
       [:ul.nav.nav-pills.nav-stacked
        [:li.active [:a {:href "#"} "Home"]]
        [:li [:a {:href "#"} "Profile"]]
        [:li [:a {:href "#"} "Messages"]]]
       [:pre.prettyprint.linenums
        (format-code
         [:ul.nav.nav-pills.nav-stacked
          "..."])]]]
     [:h2 "Dropdowns " [:small "For advanced nav components"]]
     [:div.row
      [:div.span4
       [:h3 "Rich menus made easy"]
       [:p
        "Dropdown menus in Bootstrap tabs and pills are super easy and require
only a little extra HTML and a lightweight jQuery plugin."]
       [:p
        "Head over to the Javascript page to read the docs on "
        [:a {:href "./javascript#tabs"} "initializing dropdowns"]
        " in Bootstrap."]]
      [:div.span4
       [:h3 "Tabs with dropdowns"]
       [:ul.nav.nav-tabs
        [:li.active [:a {:href "#"} "Home"]]
        [:li [:a {:href "#"} "Help"]]
        [:li.dropdown
         [:a.dropdown-toggle
          {:href "#", :data-toggle "dropdown"}
          "Dropdown "
          [:b.caret]]
         [:ul.dropdown-menu
          [:li [:a {:href "#"} "Action"]]
          [:li [:a {:href "#"} "Another action"]]
          [:li [:a {:href "#"} "Something else here"]]
          [:li.divider]
          [:li [:a {:href "#"} "Separated link"]]]]]
       [:pre.prettyprint.linenums
        (format-code
         [:ul.nav.nav-tabs
          [:li.dropdown
           [:a.dropdown-toggle
            {:href "#", :data-toggle "dropdown"}
            "Dropdown"
            [:b.caret]]
           [:ul.dropdown-menu (comment "links")]]])]]

      [:div.span4
       [:h3 "Pills with dropdowns"]
       [:ul.nav.nav-pills
        [:li.active [:a {:href "#"} "Home"]]
        [:li [:a {:href "#"} "Help"]]
        [:li.dropdown
         [:a.dropdown-toggle
          {:href "#", :data-toggle "dropdown"}
          "Dropdown "
          [:b.caret]]
         [:ul.dropdown-menu
          [:li [:a {:href "#"} "Action"]]
          [:li [:a {:href "#"} "Another action"]]
          [:li [:a {:href "#"} "Something else here"]]
          [:li.divider]
          [:li [:a {:href "#"} "Separated link"]]]]]
       [:pre.prettyprint.linenums
        (format-code
         [:ul.nav.nav-pills
          [:li.dropdown
           [:a.dropdown-toggle
            {:href "#", :data-toggle "dropdown"}
            "Dropdown"
            [:b.caret]]
           [:ul.dropdown-menu (comment "links")]]])]]]
     [:h2
      "Nav lists "
      [:small "Build simple stacked navs, great for sidebars"]]
     [:div.row
      [:div.span4
       [:h3 "Application-style navigation"]
       [:p
        "Nav lists provide a simple and easy way to build groups of nav links
 with optional headers. They're best used in sidebars like the Finder in OS X."]
       [:p
        "Structurally, they're built on the same core nav styles as tabs and
 pills, so usage and customization are straightforward."]
       [:hr]
       [:h4 "With icons"]
       [:p
        "Nav lists are also easy to equip with icons. Add the proper "
        [:code "[:i]"]
        " tag with class and you're set."]
       [:h4 "Horizontal dividers"]
       [:p
        "Add a horizontal divider by creating an empty list item with the
 class "
        [:code ".divider"]
        ", like so:"]
       [:pre.prettyprint.linenums
        (format-code
         [:ul.nav.nav.list
          "..."
          [:ul [:li.divider]]
          "..."])]]

      [:div.span4
       [:h3 "Example nav list"]
       [:p
        "Take a list of links and add "
        [:code "{:class \"nav nav-list\"}"]
        ":"]
       [:div.well
        {:style "padding: 8px 0;"}
        [:ul.nav.nav-list
         [:li.nav-header "List header"]
         [:li.active [:a {:href "#"} "Home"]]
         [:li [:a {:href "#"} "Library"]]
         [:li [:a {:href "#"} "Applications"]]
         [:li.nav-header "Another list header"]
         [:li [:a {:href "#"} "Profile"]]
         [:li [:a {:href "#"} "Settings"]]
         [:li.divider]
         [:li [:a {:href "#"} "Help"]]]]

       [:pre.prettyprint.linenums
        (format-code
         [:ul.nav.nav-list
          [:li.nav-header "List header"]
          [:li.active [:a {:href "#"} "Home"]]
          [:li [:a {:href "#"} "Library"]]
          "..."])]]
      [:div.span4
       [:h3 "Example with icons"]
       [:p "Same example, but with " [:code "[:i]"] " tags for icons."]
       [:div.well
        {:style "padding: 8px 0;"}
        [:ul.nav.nav-list
         [:li.nav-header "List header"]
         [:li.active
          [:a {:href "#"} [:i.icon-white.icon-home] " Home"]]
         [:li [:a {:href "#"} [:i.icon-book] " Library"]]
         [:li [:a {:href "#"} [:i.icon-pencil] " Applications"]]
         [:li.nav-header "Another list header"]
         [:li [:a {:href "#"} [:i.icon-user] " Profile"]]
         [:li [:a {:href "#"} [:i.icon-cog] " Settings"]]
         [:li.divider]
         [:li [:a {:href "#"} [:i.icon.flag] " Help"]]]]

       [:pre.prettyprint.linenums
        (format-code
         [:ul.nav.nav-list
          "..."
          [:ul [:li [:a {:href "#"} [:i.icon-book] "Library"]]]
          "..."])]]]
     [:h2 "Tabbable nav " [:small "Bring tabs to life via javascript"]]
     [:div.row
      [:div.span4
       [:h3 "What's included"]
       [:p
        "Bring your tabs to life with a simple plugin to toggle between content
via tabs. Bootstrap integrates tabbable tabs in four styles: top (default),
right, bottom, and left."]
       [:p
        "Changing between them is easy and only requires changing very little
markup."]
       [:hr]
       [:h4 "Fade in tabs"]
       [:p
        "To make tabs fade in, add "
        [:code ".fade"]
        " to each "
        [:code ".tab-pane"]
        "."]
       [:hr]
       [:h4 "Requires jQuery plugin"]
       [:p
        "All tabbable tabs are powered by our lightweight jQuery plugin. Read
more about how to bring tabbable tabs to life "
        [:a
         {:href "./javascript#tabs"}
         "on the javascript docs page"]
        "."]
       [:p
        [:a.btn
         {:href "./javascript#tabs"}
         "Get the javascript →"]]]
      [:div.span8
       [:h3 "Tabbable example"]
       [:p
        "To make tabs tabbable, create a "
        [:code ".tab-pane"]
        " with unique ID for every tab and wrap them in "
        [:code ".tab-content"]
        "."]
       [:div.tabbable
        {:style "margin-bottom: 18px;"}
        [:ul.nav.nav-tabs
         [:li.active
          [:a {:data-toggle "tab", :href "#tab1"} "Section 1"]]
         [:li [:a {:data-toggle "tab", :href "#tab2"} "Section 2"]]
         [:li [:a {:data-toggle "tab", :href "#tab3"} "Section 3"]]]
        [:div.tab-content
         {:style "padding-bottom: 9px; border-bottom: 1px solid #ddd;"}
         [:div#tab1.tab-pane.active [:p "I'm in Section 1."]]
         [:div#tab2.tab-pane [:p "Howdy, I'm in Section 2."]]
         [:div#tab3.tab-pane [:p "What up girl, this is Section 3."]]]]

       [:p
        "For right or left aligned tabs, wrap the "
        [:code ".nav-tabs"]
        " and "
        [:code ".tab-content"]
        " in "
        [:code ".tabbable"]
        "."]
       [:h3 "Straightforward markup"]
       [:p
        "Using tabbable tabs requires a wrapping div, a set of tabs, and a set
of tabbable panes of content."]
       [:pre.prettyprint.linenums
        (format-code
         [:div.tabbable
             (comment "Only required for left/right tabs")
             [:ul.nav.nav-tabs
     [:li.active [:a {:data-toggle "tab", :href "#tab1"} "Section 1"]]
     [:li [:a {:data-toggle "tab", :href "#tab2"} "Section 2"]]]
             [:div.tab-content
     [:div#tab1.tab-pane.active [:p "I'm in Section 1."]]
     [:div#tab2.tab-pane [:p "Howdy, I'm in Section 2."]]]])
        ]]]
     [:h3 "Tabbable in any direction"]
     [:div.row
      [:div.span4
       [:h4 "Tabs on the bottom"]
       [:p
        "Flip the order of the HTML and add a class to put tabs on the bottom."]
       [:div.tabbable.tabs-below
        [:div.tab-content
         [:div#A.tab-pane.active [:p "I'm in Section A."]]
         [:div#B.tab-pane [:p "Howdy, I'm in Section B."]]
         [:div#C.tab-pane [:p "What up girl, this is Section C."]]]
        [:ul.nav.nav-tabs
         [:li.active [:a {:data-toggle "tab", :href "#A"} "Section 1"]]
         [:li [:a {:data-toggle "tab", :href "#B"} "Section 2"]]
         [:li [:a {:data-toggle "tab", :href "#C"} "Section 3"]]]]

       [:pre.prettyprint.linenums
        {:style "margin-top: 11px;"}
        (format-code
         [:div.tabble.tabs-below
          [:div.tab-content
           "..."]
          [:ul.nav.nav-tabs
           "..."]])
]]
      [:div.span4
       [:h4 "Tabs on the left"]
       [:p "Swap the class to put tabs on the left."]
       [:div.tabbable.tabs-left
        [:ul.nav.nav-tabs
         [:li.active
          [:a {:data-toggle "tab", :href "#lA"} "Section 1"]]
         [:li [:a {:data-toggle "tab", :href "#lB"} "Section 2"]]
         [:li [:a {:data-toggle "tab", :href "#lC"} "Section 3"]]]
        [:div.tab-content
         [:div#lA.tab-pane.active [:p "I'm in Section A."]]
         [:div#lB.tab-pane [:p "Howdy, I'm in Section B."]]
         [:div#lC.tab-pane [:p "What up girl, this is Section C."]]]]

       [:pre.prettyprint.linenums
        (format-code
         [:div.tabble.tabs-left
          [:div.tab-content
           "..."]
          [:ul.nav.nav-tabs
           "..."]])]]
      [:div.span4
       [:h4 "Tabs on the right"]
       [:p "Swap the class to put tabs on the right."]
       [:div.tabbable.tabs-right
        [:ul.nav.nav-tabs
         [:li.active
          [:a {:data-toggle "tab", :href "#rA"} "Section 1"]]
         [:li [:a {:data-toggle "tab", :href "#rB"} "Section 2"]]
         [:li [:a {:data-toggle "tab", :href "#rC"} "Section 3"]]]
        [:div.tab-content
         [:div#rA.tab-pane.active [:p "I'm in Section A."]]
         [:div#rB.tab-pane [:p "Howdy, I'm in Section B."]]
         [:div#rC.tab-pane [:p "What up girl, this is Section C."]]]]
       [:pre.prettyprint.linenums
        (format-code
         [:div.tabble.tabs-right
          [:div.tab-content
           "..."]
          [:ul.nav.nav-tabs
           "..."]])]]]])
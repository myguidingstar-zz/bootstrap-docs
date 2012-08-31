(ns bootstrap-docs.views.components.button-groups
  (:use [noir.core]
        [hiccup.core]
        [hiccup.element]
        [hiccup.bootstrap]
        [bootstrap-docs.views.common]
        [hiccup.form]
        [hiccup.page]
        ))

(def button-groups
  [:section#buttonGroups
   [:div.page-header
    [:h1
     "Button groups "
     [:small "Join buttons for more toolbar-like functionality"]]]
   [:div.row
    [:div.span4
     [:h3 "Button groups"]
     [:p
      "Use button groups to join multiple buttons together as one composite
component. Build them with a series of "
      [:code "[:a]"]
      " or "
      [:code "[:button]"]
      " elements."]
     [:h3 "Best practices"]
     [:p
      "We recommend the following guidelines for using button groups and
toolbars:"]
     [:ul
      [:li
       "Always use the same element in a single button group, "
       [:code "[:a]"]
       " or "
       [:code "[:button]"]
       "."]
      [:li
       "Don't mix buttons of different colors in the same button group."]
      [:li
       "Use icons in addition to or instead of text, but be sure include
 alt and title text where appropriate."]]
     [:p
      [:span.label.label-info "Related"]
      " Button groups with dropdowns (see below) should be called out
 separately and always include a dropdown caret to indicate intended
 behavior."]]
    [:div.span4
     [:h3 "Default example"]
     [:p
      "Here's how the HTML looks for a standard button group built with
anchor tag buttons:"]
     [:div
      [:div.btn-group
       {:style "margin: 9px 0;"}
       [:button.btn "Left"]
       [:button.btn "Middle"]
       [:button.btn "Right"]]]
     [:pre.prettyprint.linenums
      (format-code
       [:div.btn-group
        [:button.btn "1"]
        [:button.btn "2"]
        [:button.btn "3"]])
      ]
     [:h3 "Toolbar example"]
     [:p
      "Combine sets of "
      [:code "[:div.btn-group]"]
      " into a "
      [:code "[:div.btn-toolbar]"]
      " for more complex components."]
     [:div.btn-toolbar
      [:div.btn-group
       [:button.btn "1"]
       [:button.btn "2"]
       [:button.btn "3"]
       [:button.btn "4"]]
      [:div.btn-group
       [:button.btn "5"]
       [:button.btn "6"]
       [:button.btn "7"]]
      [:div.btn-group [:button.btn "8"]]]
     [:pre.prettyprint.linenums
      (format-code
       [:div.btn-toolbar [:div.btn-group "..."]])]]
    [:div.span4
     [:h3 "Checkbox and radio flavors"]
     [:p
      "Button groups can also function as radios, where only one button
 may be active, or checkboxes, where any number of buttons may be active. View "
      (link-to "./javascript#buttons" "the Javascript docs")
      " for that."]
     [:p
      [:a.btn.js-btn
       {:href "./javascript#buttons"}
       "Get the javascript »"]]
     [:h3 "Dropdowns in button groups"]
     [:p
      [:span.label.label-info "Heads up!"]
      " Buttons with dropdowns must be individually wrapped in their own "
      [:code ".btn-group"]
      " within a "
      [:code ".btn-toolbar"]
      " for proper rendering."]]]])
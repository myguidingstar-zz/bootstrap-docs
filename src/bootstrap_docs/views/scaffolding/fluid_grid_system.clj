(ns bootstrap-docs.views.scaffolding.fluid-grid-system
  (:use [noir.core]
        [hiccup.core]
        [hiccup.element]
        [hiccup.bootstrap]
        [bootstrap-docs.views.common]
        ))

(def fluid-grid-system
  [:section#fluidGridSystem
     [:div.page-header
      [:h1
       "Fluid grid system "
       [:small "12 responsive, percent-based columns"]]]
     [:h2 "Fluid columns"]
     [:div.row-fluid.show-grid
      [:div.span1 "1"]
      [:div.span1 "1"]
      [:div.span1 "1"]
      [:div.span1 "1"]
      [:div.span1 "1"]
      [:div.span1 "1"]
      [:div.span1 "1"]
      [:div.span1 "1"]
      [:div.span1 "1"]
      [:div.span1 "1"]
      [:div.span1 "1"]
      [:div.span1 "1"]]
     [:div.row-fluid.show-grid
      [:div.span4 "4"]
      [:div.span4 "4"]
      [:div.span4 "4"]]
     [:div.row-fluid.show-grid [:div.span4 "4"] [:div.span8 "8"]]
     [:div.row-fluid.show-grid [:div.span6 "6"] [:div.span6 "6"]]
     [:div.row-fluid.show-grid [:div.span12 "12"]]
     [:div.row
      [:div.span4
       [:h3 "Percents, not pixels"]
       [:p
        "The fluid grid system uses percents for column widths instead of
fixed pixels. It also has the same responsive variations as our fixed grid
 system, ensuring proper proportions for key screen resolutions and devices."]]

      [:div.span4
       [:h3 "Fluid rows"]
       [:p
        "Make any row fluid simply by changing "
        [:code ".row"]
        " to "
        [:code ".row-fluid"]
        ". The columns stay the exact same, making it super straightforward to
 flip between fixed and fluid layouts."]]

      [:div.span4
       [:h3 "Markup"]
       [:pre.prettyprint.linenums
        (format-code
         [:div.row-fluid [:div.span4 "..."] [:div.span8 "..."]])]]]
     [:h2 "Fluid nesting"]
     [:div.row
      [:div.span6
       [:p
        "Nesting with fluid grids is a bit different: the number of nested
columns doesn't need to match the parent. Instead, your columns are reset at
 each level because each row takes up 100% of the parent column."]
       [:div.row-fluid.show-grid
        [:div.span12
         "Fluid 12"
         [:div.row-fluid.show-grid
          [:div.span6 "Fluid 6"]
          [:div.span6 "Fluid 6"]]]]]

      [:div.span6
       [:pre.prettyprint.linenums
        (format-code
         [:div.row-fluid
        [:div.span12
         "Level 1 of column"
         [:div.row-fluid
          [:div.span6 "Level 2"]
          [:div.span6 "Level 2"]]]])]]]])
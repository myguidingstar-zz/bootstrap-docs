(ns bootstrap-docs.views.scaffolding.grid-system
  (:use [noir.core]
        [hiccup.core]
        [hiccup.element]
        [hiccup.bootstrap]
        [bootstrap-docs.views.common]
        ))

(def grid-system
  [:section#gridSystem
     [:div.page-header
      [:h1
       "Default grid system "
       [:small "12 columns with a responsive twist"]]]
     [:div.row.show-grid
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
     [:div.row.show-grid
      [:div.span4 "4"]
      [:div.span4 "4"]
      [:div.span4 "4"]]
     [:div.row.show-grid [:div.span4 "4"] [:div.span8 "8"]]
     [:div.row.show-grid [:div.span6 "6"] [:div.span6 "6"]]
     [:div.row.show-grid [:div.span12 "12"]]
     [:div.row
      [:div.span4
       [:p
        "The default grid system provided in Bootstrap utilizes "
        [:strong "12 columns"]
        " that render out at widths of 724px, 940px (default without
 responsive CSS included), and 1170px. Below 767px viewports, the
 columns become fluid and stack vertically. "]]

      [:div.span4
       [:pre.prettyprint.linenums
        (format-code
         [:div.row [:div.span4 "..."] [:div.span8 "..."]])]]

      [:div.span4
       [:p
        "As shown here, a basic layout can be created with two \"columns\",
 each spanning a number of the 12 foundational columns we defined as part of
 our grid system."]]
]

     [:br]
     [:h2 "Offsetting columns"]
     [:div.row.show-grid
      [:div.span4 "4"]
      [:div.span4.offset4 "4 offset 4"]]

     [:div.row.show-grid
      [:div.span3.offset3 "3 offset 3"]
      [:div.span3.offset3 "3 offset 3"]]

     [:div.row.show-grid [:div.span8.offset4 "8 offset 4"]]

     [:pre.prettyprint.linenums
      (format-code
       [:div.row [:div.span4 "..."]
        [:div.span4.offset4 "..."]])]
     [:br]
     [:h2 "Nesting columns"]
     [:div.row
      [:div.span6
       [:p
        "With the static (non-fluid) grid system in Bootstrap,
 nesting is easy. To nest your content, just add a new "
        [:code ".row"]
        " and set of "
        [:code ".span*"]
        " columns within an existing "
        [:code ".span*"]
        " column."]
       [:h3 "Example"]
       [:p
        "Nested rows should include a set of columns that add up
 to the number of columns of it's parent. For example, two nested "
        [:code ".span3"]
        " columns should be placed within a "
        [:code ".span6"]
        "."]
       [:div.row.show-grid
        [:div.span6
         "Level 1 of column"
         [:div.row.show-grid
          [:div.span3 "Level 2"]
          [:div.span3 "Level 2"]]]]]

      [:div.span6
       [:pre.prettyprint.linenums
        (format-code
         [:div.row
        [:div.span6
         "Level 1 of column"
         [:div.row
          [:div.span3 "Level 2"]
          [:div.span3 "Level 2"]]]])]]]])

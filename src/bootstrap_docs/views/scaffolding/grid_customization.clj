(ns bootstrap-docs.views.scaffolding.grid-customization
  (:use [noir.core]
        [hiccup.core]
        [hiccup.element]
        [hiccup.bootstrap]
        [bootstrap-docs.views.common]
        ))

(def grid-customization
  [:section#gridCustomization
     [:div.page-header [:h1 "Grid customization"]]
     [:table.table.table-bordered.table-striped
      [:thead
       [:tr
        [:th "Variable"]
        [:th "Default value"]
        [:th "Description"]]]
      [:tbody
       [:tr
        [:td [:code "@gridColumns"]]
        [:td "12"]
        [:td "Number of columns"]]
       [:tr
        [:td [:code "@gridColumnWidth"]]
        [:td "60px"]
        [:td "Width of each column"]]
       [:tr
        [:td [:code "@gridGutterWidth"]]
        [:td "20px"]
        [:td "Negative space between columns"]]]]
     [:div.row
      [:div.span4
       [:h3 "Variables in LESS"]
       [:p
        "Built into Bootstrap are a handful of variables for customizing the
 default 940px grid system, documented above. All variables for the grid are
 stored in variables.less."]]

      [:div.span4
       [:h3 "How to customize"]
       [:p
        "Modifying the grid means changing the three "
        [:code "@grid*"]
        " variables and recompiling Bootstrap. Change the grid variables in
 variables.less and use one of the "
        (link-to "less.html#compiling" "four ways documented to recompile")
        ". If you're adding more columns, be sure to add the CSS for those in
 grid.less."]]

      [:div.span4
       [:h3 "Staying responsive"]
       [:p
        "Customization of the grid only works at the default level, the 940px
grid. To maintain the responsive aspects of Bootstrap, you'll also have to
customize the grids in responsive.less."]]]])
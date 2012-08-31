(ns bootstrap-docs.views.base-css.tables
  (:use [hiccup.core]
        [hiccup.element]
        [hiccup.form]
        [hiccup.page]
        [hiccup.bootstrap]
        ))


(def tables
  [:section#tables
     [:div.page-header
      [:h1 "Tables " [:small "For, you guessed it, tabular data"]]]
     [:h2 "Table markup"]
     [:div.row
      [:div.span8
       [:table.table.table-bordered.table-striped
        [:colgroup [:col.span1] [:col.span7]]
        [:thead [:tr [:th "Tag"] [:th "Description"]]]
        [:tbody
         [:tr
          [:td [:code "[:table]"]]
          [:td
           "Wrapping element for displaying data in a tabular format"]]
         [:tr
          [:td [:code "[:thead]"]]
          [:td
           "Container element for table header rows ("
           [:code "[:tr]"]
           ") to label table columns"]]
         [:tr
          [:td [:code "[:tbody]"]]
          [:td
           "Container element for table rows ("
           [:code "[:tr]"]
           ") in the body of the table"]]
         [:tr
          [:td [:code "[:tr]"]]
          [:td
           "Container element for a set of table cells ("
           [:code "[:td]"]
           " or "
           [:code "[:th]"]
           ") that appears on a single row"]]
         [:tr
          [:td [:code "[:td]"]]
          [:td "Default table cell"]]
         [:tr
          [:td [:code "[:th]"]]
          [:td
           "Special table cell for column (or row,
depending on scope and placement) labels"
           [:br]
           "Must be used within a "
           [:code "[:thead]"]]]
         [:tr
          [:td [:code "[:caption]"]]
          [:td
           "Description or summary of what the table holds,
especially useful for screen readers"]]]]]
      [:div.span4
       [:pre.prettyprint.linenums
        (format-code
         [:table [:thead [:tr [:th "..."] [:th "..."]]
                  [:tbody [:tr [:td "..."] [:td "..."]]]]])]]]

     [:h2 "Table options"]
     [:table.table.table-bordered.table-striped
      [:thead [:tr [:th "Name"] [:th "Class"] [:th "Description"]]]
      [:tbody
       [:tr
        [:td "Default"]
        [:td.muted "None"]
        [:td "No styles, just columns and rows"]]
       [:tr
        [:td "Basic"]
        [:td [:code ".table"]]
        [:td "Only horizontal lines between rows"]]
       [:tr
        [:td "Bordered"]
        [:td [:code ".table-bordered"]]
        [:td "Rounds corners and adds outer border"]]
       [:tr
        [:td "Zebra-stripe"]
        [:td [:code ".table-striped"]]
        [:td
         "Adds light gray background color to odd rows (1, 3, 5, etc)"]]
       [:tr
        [:td "Condensed"]
        [:td [:code ".table-condensed"]]
        [:td
         "Cuts vertical padding in half, from 8px to 4px, within all "
         [:code "td"]
         " and "
         [:code "th"]
         " elements"]]]]
     [:h2 "Example tables"]
     [:h3 "1. Default table styles"]
     [:div.row
      [:div.span4
       [:p
        "Tables are automatically styled with only a few borders
to ensure readability and maintain structure. With 2.0, the "
        [:code ".table"]
        " class is required."]
       [:pre.prettyprint.linenums

        (str (quote [:table.table "..."]))]]
      [:div.span8
       [:table.table
        [:thead
         [:tr
          [:th "#"]
          [:th "First Name"]
          [:th "Last Name"]
          [:th "Username"]]]
        [:tbody
         [:tr [:td "1"] [:td "Mark"] [:td "Otto"] [:td "@mdo"]]
         [:tr [:td "2"] [:td "Jacob"] [:td "Thornton"] [:td "@fat"]]
         [:tr
          [:td "3"]
          [:td "Larry"]
          [:td "the Bird"]
          [:td "@twitter"]]]]]]
     [:h3 "2. Striped table"]
     [:div.row
      [:div.span4
       [:p
        "Get a little fancy with your tables
by adding zebra-striping—just add the "
        [:code ".table-striped"]
        " class."]
       [:p.muted
        [:strong "Note:"]
        " Striped tables use the "
        [:code ":nth-child"]
        " CSS selector and is not available in IE7-IE8."]
       [:pre.prettyprint.linenums
        {:style "margin-bottom: 18px;"}
        (str (quote [:table.table.table-striped "..."]))]]
      [:div.span8
       [:table.table.table-striped
        [:thead
         [:tr
          [:th "#"]
          [:th "First Name"]
          [:th "Last Name"]
          [:th "Username"]]]
        [:tbody
         [:tr [:td "1"] [:td "Mark"] [:td "Otto"] [:td "@mdo"]]
         [:tr [:td "2"] [:td "Jacob"] [:td "Thornton"] [:td "@fat"]]
         [:tr
          [:td "3"]
          [:td "Larry"]
          [:td "the Bird"]
          [:td "@twitter"]]]]]]
     [:h3 "3. Bordered table"]
     [:div.row
      [:div.span4
       [:p
        "Add borders around the entire table and
rounded corners for aesthetic purposes."]
       [:pre.prettyprint.linenums
        (str (quote [:table.table.table-bordered "..."]))]]
      [:div.span8
       [:table.table.table-bordered
        [:thead
         [:tr
          [:th "#"]
          [:th "First Name"]
          [:th "Last Name"]
          [:th "Username"]]]
        [:tbody
         [:tr
          [:td {:rowspan "2"} "1"]
          [:td "Mark"]
          [:td "Otto"]
          [:td "@mdo"]]
         [:tr [:td "Mark"] [:td "Otto"] [:td "@TwBootstrap"]]
         [:tr [:td "2"] [:td "Jacob"] [:td "Thornton"] [:td "@fat"]]
         [:tr
          [:td "3"]
          [:td {:colspan "2"} "Larry the Bird"]
          [:td "@twitter"]]]]]]
     [:h3 "4. Condensed table"]
     [:div.row
      [:div.span4
       [:p
        "Make your tables more compact by adding the "
        [:code ".table-condensed"]
        " class to cut table cell padding in half (from 8px to 4px)."]
       [:pre.prettyprint.linenums
        {:style "margin-bottom: 18px;"}
        (str (quote [:table.table.table-condensed "..."]))]]
      [:div.span8
       [:table.table.table-condensed
        [:thead
         [:tr
          [:th "#"]
          [:th "First Name"]
          [:th "Last Name"]
          [:th "Username"]]]
        [:tbody
         [:tr [:td "1"] [:td "Mark"] [:td "Otto"] [:td "@mdo"]]
         [:tr [:td "2"] [:td "Jacob"] [:td "Thornton"] [:td "@fat"]]
         [:tr
          [:td "3"]
          [:td {:colspan "2"} "Larry the Bird"]
          [:td "@twitter"]]]]]]
     [:h3 "5. Combine them all!"]
     [:div.row
      [:div.span4
       [:p
        "Feel free to combine any of the table classes to achieve
different looks by utilizing any of the available classes."]
       [:pre.prettyprint.linenums
        {:style "margin-bottom: 18px;"}
        (str (quote
              [:table.table.table-striped.table-bordered.table-condensed
               "..."]))]]
      [:div.span8
       [::table.table.table-striped.table-bordered.table-condensed
        [:thead
         [:tr [:th] [:th {:colspan "2"} "Full name"] [:th]]
         [:tr
          [:th "#"]
          [:th "First Name"]
          [:th "Last Name"]
          [:th "Username"]]]
        [:tbody
         [:tr]
         [:tr [:td "1"] [:td "Mark"] [:td "Otto"] [:td "@mdo"]]
         [:tr [:td "2"] [:td "Jacob"] [:td "Thornton"] [:td "@fat"]]
         [:tr
          [:td "3"]
          [:td {:colspan "2"} "Larry the Bird"]
          [:td "@twitter"]]]]]]])
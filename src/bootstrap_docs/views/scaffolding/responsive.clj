(ns bootstrap-docs.views.scaffolding.responsive
  (:use [noir.core]
        [hiccup.core]
        [hiccup.element]
        [hiccup.bootstrap]
        [bootstrap-docs.views.common]
        ))

(def responsive
  [:section#responsive
     [:div.page-header
      [:h1
       "Responsive design "
       [:small "Media queries for various devices and resolutions"]]]

     [:div.row
      [:div.span4
       [:p
        (image "assets/img/responsive-illustrations.png" "Responsive devices")
]
       [:h3 "What they do"]
       [:p
        "Media queries allow for custom CSS based on a number of
conditions—ratios, widths, display type, etc—but usually focuses around "
        [:code "min-width"]
        " and "
        [:code "max-width"]
        "."]
       (unordered-list
        ["Modify the width of column in our grid"
         "Stack elements instead of float wherever necessary"
         "Resize headings and text to be more appropriate for devices"])
       [:p
        "Use media queries responsibly and only as a start to your mobile
audiences. For larger projects, do consider dedicated code bases and not layers
of media queries."]]
      [:div.span8
       [:h2 "Supported devices"]
       [:p
        "Bootstrap supports a handful of media queries in a single file to help
make your projects more appropriate on different devices and screen resolutions.
Here's what's included:"]
       [:table.table.table-bordered.table-striped
        [:thead
         [:tr
          [:th "Label"]
          [:th "Layout width"]
          [:th "Column width"]
          [:th "Gutter width"]]]
        [:tbody
         [:tr
          [:td "Smartphones"]
          [:td "480px and below"]
          [:td.muted {:colspan "2"} "Fluid columns, no fixed widths"]]
         [:tr
          [:td "Smartphones to tablets"]
          [:td "767px and below"]
          [:td.muted {:colspan "2"} "Fluid columns, no fixed widths"]]
         [:tr
          [:td "Portrait tablets"]
          [:td "768px and above"]
          [:td "42px"]
          [:td "20px"]]
         [:tr
          [:td "Default"]
          [:td "980px and up"]
          [:td "60px"]
          [:td "20px"]]
         [:tr
          [:td "Large display"]
          [:td "1200px and up"]
          [:td "70px"]
          [:td "30px"]]]]
       [:h3 "Requires meta tag"]
       [:p
        "To ensure devices display responsive pages properly, include the
viewport meta tag."]
       [:pre.prettyprint.linenums
        (format-code
         [:meta {:name "viewport"
                 :content "width=device-width, initial-scale=1.0"}])]]]
     [:br]

     [:h2 "Using the media queries"]
     [:div.row
      [:div.span4
       [:p
        "Bootstrap doesn't automatically include these media queries, but
understanding and adding them is very easy and requires minimal setup. You have
a few options for including the responsive features of Bootstrap:"]
       (ordered-list
        ["Use the compiled responsive version, bootstrap-responsive.css"
         "Add @import \"responsive.less\" and recompile Bootstrap"
         "Modify and recompile responsive.less as a separate file"])
       [:p
        [:strong "Why not just include it?"]
        " Truth be told, not everything needs to be responsive. Instead of
encouraging developers to remove this feature, we figure it best to enable
it."]]

      [:div.span8
       [:pre.prettyprint.linenums
        "
  /* Landscape phones and down */
  @media (max-width: 480px) { ... }

  /* Landscape phone to portrait tablet */
  @media (max-width: 767px) { ... }

  /* Portrait tablet to landscape and desktop */
  @media (min-width: 768px) and (max-width: 979px) { ... }

  /* Large desktop */
  @media (min-width: 1200px) { ... }"]]]

     [:br]

     [:h2 "Responsive utility classes"]
     [:div.row
      [:div.span4
       [:h3 "What are they"]
       [:p
        "For faster mobile-friendly development, use these basic utility classes
 for showing and hiding content by device."]
       [:h3 "When to use"]
       [:p
        "Use on a limited basis and avoid creating entirely different versions
of the same site. Instead, use them to complement each device's presentation."]
       [:p
        "For example, you might show a "
        [:code "(dropdown)"]
        " element for nav on mobile layouts, but not on tablets or desktops."]]

      [:div.span8
       [:h3 "Support classes"]
       [:p
        "Shown here is a table of the classes we support and their effect on a
 given media query layout (labeled by device). They can be found in "
        [:code "responsive.less"]
        "."]
       [:table.table.table-bordered.table-striped.responsive-utilities
        [:thead
         [:tr
          [:th "Class"]
          [:th "Phones " [:small "480px and below"]]
          [:th "Tablets " [:small "767px and below"]]
          [:th "Desktops " [:small "768px and above"]]]]
        [:tbody
         [:tr
          [:th [:code ".visible-phone"]]
          [:td.is-visible "Visible"]
          [:td.is-hidden "Hidden"]
          [:td.is-hidden "Hidden"]]
         [:tr
          [:th [:code ".visible-tablet"]]
          [:td.is-hidden "Hidden"]
          [:td.is-visible "Visible"]
          [:td.is-hidden "Hidden"]]
         [:tr
          [:th [:code ".visible-desktop"]]
          [:td.is-hidden "Hidden"]
          [:td.is-hidden "Hidden"]
          [:td.is-visible "Visible"]]
         [:tr
          [:th [:code ".hidden-phone"]]
          [:td.is-hidden "Hidden"]
          [:td.is-visible "Visible"]
          [:td.is-visible "Visible"]]
         [:tr
          [:th [:code ".hidden-tablet"]]
          [:td.is-visible "Visible"]
          [:td.is-hidden "Hidden"]
          [:td.is-visible "Visible"]]
         [:tr
          [:th [:code ".hidden-desktop"]]
          [:td.is-visible "Visible"]
          [:td.is-visible "Visible"]
          [:td.is-hidden "Hidden"]]]]
       [:h3 "Test case"]
       [:p
        "Resize your browser or load on different devices to test the above
classes."]
       [:h4 "Visible on..."]
       [:p
        "Green checkmarks indicate that class is visible in your current
viewport."]
       [:ul.responsive-utilities-test
        [:li "Phone" [:span.visible-phone "✔ Phone"]]
        [:li "Tablet" [:span.visible-tablet "✔ Tablet"]]
        [:li "Desktop" [:span.visible-desktop "✔ Desktop"]]]
       [:h4 "Hidden on..."]
       [:p
        "Here, green checkmarks indicate that class is hidden in your current
viewport."]
       [:ul.responsive-utilities-test.hidden-on
        [:li "Phone" [:span.hidden-phone "✔ Phone"]]
        [:li "Tablet" [:span.hidden-tablet "✔ Tablet"]]
        [:li "Desktop" [:span.hidden-desktop "✔ Desktop"]]]]]

     [:div.row [:div.span4]]])
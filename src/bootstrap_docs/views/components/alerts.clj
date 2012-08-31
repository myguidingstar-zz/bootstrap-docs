(ns bootstrap-docs.views.components.alerts
  (:use [noir.core]
        [hiccup.core]
        [hiccup.element]
        [hiccup.bootstrap]
        [bootstrap-docs.views.common]
        [hiccup.form]
        [hiccup.page]
        ))

(def alerts
  [:section#alerts
     [:div.page-header
      [:h1
       "Alerts "
       [:small "Styles for success, warning, and error messages"]]]
     [:h2 "Lightweight defaults"]
     [:div.row
      [:div.span4
       [:h3 "Rewritten base class"]
       [:p
        "With Bootstrap 2, we've simplified the base class: "
        [:code ".alert"]
        " instead of "
        [:code ".alert-message"]
        ". We've also reduced the minimum required markup—no "
        [:code "[:p]"]
        " is required by default, just the outer "
        [:code "[:div]"]
        "."]
       [:h3 "Single alert message"]
       [:p
        "For a more durable component with less code, we've removed the
differentiating look for block alerts, messages that come with more padding and
typically more text. The class also has changed to "
        [:code ".alert-block"]
        "."]
       [:hr]
       [:h3 "Goes great with javascript"]
       [:p
        "Bootstrap comes with a great jQuery plugin that supports alert
messages, making dismissing them quick and easy."]
       [:p
        [:a.btn.js-btn
         {:href "./javascript#alerts"}
         "Get the plugin »"]]]
      [:div.span8
       [:h3 "Example alerts"]
       [:p
        "Wrap your message and an optional close icon in a div with simple
class."]
       [:div.alert
        [:button.close {:data-dismiss "alert", :type "button"} "×"]
        [:strong "Warning!"]
        " Best check yo self, you're not looking too good."]
       [:pre.prettyprint.linenums
        (format-code
         [:div.alert
        [:button.close {:data-dismiss "alert", :type "button"} "×"]
        [:strong "Warning!"]
        " Best check yo self, you're not looking too good."])]
       [:p
        [:span.label.label-info "Heads up!"]
        " iOS devices require an "
        [:code (format-code {:href "#"})]
        " for the dismissal of alerts. Be sure to include it and the data
attribute for anchor close icons. Alternatively, you may use a "
        [:code (str [:button])]
        " element with the data attribute, which we have opted to do for our
docs. When using "
        [:code (str [:button])]
        ", you must include "
        [:code (format-code {:type "button"})]
        " or your forms may not submit."]
       [:p
        "Easily extend the standard alert message with two optional classes: "
        [:code ".alert-block"]
        " for more padding and text controls and "
        [:code ".alert-heading"]
        " for a matching heading."]
       [:div.alert.alert-block
        [:button.close {:data-dismiss "alert", :type "button"} "×"]
        [:h4.alert-heading "Warning!"]
        [:p
         "Best check yo self, you're not looking too good. Nulla vitae elit
libero, a pharetra augue. Praesent commodo cursus magna, vel scelerisque nisl
consectetur et."]]
       [:pre.prettyprint.linenums
        (format-code
         [:div.alert.alert-block
          [:button.close {:data-dismiss "alert", :type "button"} "×"]
          [:h4.alert-heading "Warning!"]
          [:p
           "Best check yo self, you're not looking too good. Nulla vitae elit
libero, a pharetra augue. Praesent commodo cursus magna, vel scelerisque nisl
consectetur et."]])]]]
     [:h2
      "Contextual alternatives "
      [:small "Add optional classes to change an alert's connotation"]]
     [:div.row
      [:div.span4
       [:h3 "Error or danger"]
       [:div.alert.alert-error
        [:button.close {:data-dismiss "alert", :type "button"} "×"]
        [:strong "Oh snap!"]
        " Change a few things up and try submitting again."]
       [:pre.prettyprint.linenums
        (format-code
         [:div.alert.alert-error "..."])]]
      [:div.span4
       [:h3 "Success"]
       [:div.alert.alert-success
        [:button.close {:data-dismiss "alert", :type "button"} "×"]
        [:strong "Well done!"]
        " You successfully read this important alert message."]
       [:pre.prettyprint.linenums
        (format-code
         [:div.alert.alert-success "..."])]]
      [:div.span4
       [:h3 "Information"]
       [:div.alert.alert.info
        [:button.close {:data-dismiss "alert", :type "button"} "×"]
        [:strong "Heads up!"]
        " This alert needs your attention, but it's not super important."]
       [:pre.prettyprint.linenums
                (format-code
                 [:div.alert.alert-info "..."])]]]])
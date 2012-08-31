(ns bootstrap-docs.views.components.progress
  (:use [noir.core]
        [hiccup.core]
        [hiccup.element]
        [hiccup.bootstrap]
        [bootstrap-docs.views.common]
        [hiccup.form]
        [hiccup.page]
        ))

(def progress
  [:section#progress
     [:div.page-header
      [:h1
       "Progress bars "
       [:small "For loading, redirecting, or action status"]]]
     [:h2 "Examples and markup"]
     [:div.row
      [:div.span4
       [:h3 "Basic"]
       [:p "Default progress bar with a vertical gradient."]
       [:div.progress [:div.bar {:style "width: 60%;"}]]
       [:pre.prettyprint.linenums
        (format-code
                [:div.progress [:div.bar {:style "width: 60%;"}]])]]
      [:div.span4
       [:h3 "Striped"]
       [:p "Uses a gradient to create a striped effect (no IE)."]
       [:div.progress.progress-striped
        [:div.bar {:style "width: 20%;"}]]
       [:pre.prettyprint.linenums
        (format-code
         [:div.progress.progress-striped
          [:div.bar {:style "width: 20%;"}]])]]
      [:div.span4
       [:h3 "Animated"]
       [:p "Takes the striped example and animates it (no IE)."]
       [:div.progress.progress-striped.active
        [:div.bar {:style "width: 45%"}]]
       [:pre.prettyprint.linenums
        (format-code
                [:div.progress.progress-striped.active
        [:div.bar {:style "width: 45%"}]])]]]
     [:h2 "Options and browser support"]
     [:div.row
      [:div.span3
       [:h3 "Additional colors"]
       [:p
        "Progress bars use some of the same button and alert classes for
consistent styles."]
       [:div.progress.progress-info
        {:style "margin-bottom: 9px;"}
        [:div.bar {:style "width: 20%"}]]
       [:div.progress.progress-success
        {:style "margin-bottom: 9px;"}
        [:div.bar {:style "width: 40%"}]]
       [:div.progress.progress-warning
        {:style "margin-bottom: 9px;"}
        [:div.bar {:style "width: 60%"}]]
       [:div.progress.progress-danger
        {:style "margin-bottom: 9px;"}
        [:div.bar {:style "width: 80%"}]]]
      [:div.span3
       [:h3 "Striped bars"]
       [:p
        "Similar to the solid colors, we have varied striped progress bars."]
       [:div.progress.progress-info.progress-striped
        {:style "margin-bottom: 9px;"}
        [:div.bar {:style "width: 20%"}]]
       [:div.progress.progress-success.progress-striped
        {:style "margin-bottom: 9px;"}
        [:div.bar {:style "width: 40%"}]]
       [:div.progress.progress-warning.progress-striped
        {:style "margin-bottom: 9px;"}
        [:div.bar {:style "width: 60%"}]]
       [:div.progress.progress-danger.progress-striped
        {:style "margin-bottom: 9px;"}
        [:div.bar {:style "width: 80%"}]]]
      [:div.span3
       [:h3 "Behavior"]
       [:p
        "Progress bars use CSS3 transitions, so if you dynamically adjust the
width via javascript, it will smoothly resize."]
       [:p
        "If you use the "
        [:code ".active"]
        " class, your "
        [:code ".progress-striped"]
        " progress bars will animate the stripes left to right."]]
      [:div.span3
       [:h3 "Browser support"]
       [:p
        "Progress bars use CSS3 gradients, transitions, and animations to
achieve all their effects. These features are not supported in IE7-9 or older
versions of Firefox."]
       [:p "Opera and IE do not support animations at this time."]]]])
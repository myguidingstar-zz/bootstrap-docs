(ns bootstrap-docs.views.base-css.buttons
  (:use [hiccup.core]
        [hiccup.element]
        [hiccup.form]
        [hiccup.page]
        [hiccup.bootstrap]
        ))

(def buttons
  [:section#buttons
     [:div.page-header [:h1 "Buttons"] [:br]]
     [:table.table.table-bordered.table-striped
      [:thead
       [:tr [:th "Button"] [:th "{:class \"...\"}"] [:th "Description"]]]
      [:tbody
       [:tr
        [:td [:button.btn {:href "#"} "Default"]]
        [:td [:code "btn"]]
        [:td "Standard gray button with gradient"]]
       [:tr
        [:td [:button.btn.btn.primary {:href "#"} "Primary"]]
        [:td [:code "btn btn-primary"]]
        [:td
         "Provides extra visual weight and identifies the primary
action in a set of buttons"]]
       [:tr
        [:td [:button.btn.btn-info {:href "#"} "Info"]]
        [:td [:code "btn btn-info"]]
        [:td "Used as an alternative to the default styles"]]
       [:tr
        [:td [:button.btn.btn-success {:href "#"} "Success"]]
        [:td [:code "btn btn-success"]]
        [:td "Indicates a successful or positive action"]]
       [:tr
        [:td [:button.btn.btn-warning {:href "#"} "Warning"]]
        [:td [:code "btn btn-warning"]]
        [:td "Indicates caution should be taken with this action"]]
       [:tr
        [:td [:button.btn.btn-danger {:href "#"} "Danger"]]
        [:td [:code "btn btn-danger"]]
        [:td "Indicates a dangerous or potentially negative action"]]
       [:tr
        [:td [:button.btn.btn-inverse {:href "#"} "Inverse"]]
        [:td [:code "btn btn-inverse"]]
        [:td
         "Alternate dark gray button, not tied to a semantic action or use"]]]]
     [:div.row
      [:div.span4
       [:h3 "Buttons for actions"]
       [:p
        "As a convention, buttons should only be used for actions while
hyperlinks are to be used for objects. For instance, \"Download\"
should be a button while \"recent activity\" should be a link."]
       [:p
        "Button styles can be applied to anything with the "
        [:code ".btn"]
        " class applied. However, typically you'll want to apply these to only "
        [:code "[:a]"]
        " and "
        [:code "[:button]"]
        " elements."]
       [:h3 "Cross browser compatibility"]
       [:p
        "IE9 doesn't crop background gradients on rounded corners, so we remove
 it. Related, IE9 jankifies disabled "
        [:code "button"]
        " elements, rendering text gray with a nasty text-shadow that we cannot
fix."]]
      [:div.span4
       [:h3 "Multiple sizes"]
       [:p
        "Fancy larger or smaller buttons? Add "
        [:code ".btn-large"]
        ", "
        [:code ".btn-small"]
        ", or "
        [:code ".btn-mini"]
        " for two additional sizes."]
       [:p
        [:button.btn.btn-large.btn-primary "Primary action"]
        [:button.btn.btn-large "Action"]]
       [:p
        [:button.btn.btn-small.btn-primary "Primary action"]
        [:button.btn.btn-small "Action"]]
       [:p
        [:button.btn.btn-mini.btn-primary "Primary action"]
        [:button.btn.btn-mini "Action"]]
       [:br]
       [:h3 "Disabled state"]
       [:p
        "For disabled buttons, add the "
        [:code ".disabled"]
        " class to links and the "
        [:code "disabled"]
        " attribute for "
        [:code "[:button]"]
        " elements."]
       [:p
        [:a.btn.btn-large.btn-primary.disabled
         {:href "#"}
         "Primary link"]
        [:a.btn.btn-large.disabled {:href "#"} "Link"]]
       [:p
        {:style "margin-bottom: 18px;"}
        [:button.btn.btn-large.btn-primary.disabled
         {:disabled "disabled"}
         "Primary button"]
        [:button.btn.btn-large {:disabled "disabled"} "Button"]]
       [:p
        [:span.label.label-info "Heads up!"]
        "We use "
        [:code ".disabled"]
        " as a utility class here, similar to the common "
        [:code ".active"]
        " class, so no prefix is required."]]
      [:div.span4
       [:h3 "One class, multiple tags"]
       [:p
        "Use the "
        [:code ".btn"]
        " class on an "
        [:code "[:a]"]
        ", "
        [:code "[:button]"]
        ", or "
        [:code "[:input]"]
        " element."]
       [:form
        [:a.btn {:href ""} "Link"]
        [:button.btn {:type "submit"} "Button"]
        [:input.btn {:value "Input", :type "button"}]
        [:input.btn {:value "Submit", :type "submit"}]]
       [:pre.prettyprint.linenums
        (format-code
         [:form
          [:a.btn {:href ""} "Link"]
          [:button.btn {:type "submit"} "Button"]
          [:input.btn {:value "Input", :type "button"}]
          [:input.btn {:value "Submit", :type "submit"}]])]
       [:p
        "As a best practice, try to match the element for you context
to ensure matching cross-browser rendering. If you have an "
        [:code "input"]
        ", use an "
        [:code "[:input {:type \"submit\"}]"]
        " for your button."]]]]
)
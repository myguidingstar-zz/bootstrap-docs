(ns bootstrap-docs.views.components.labels
  (:use [noir.core]
        [hiccup.core]
        [hiccup.element]
        [hiccup.bootstrap]
        [bootstrap-docs.views.common]
        [hiccup.form]
        [hiccup.page]
        ))

(def labels
  [:section#labels
     [:div.page-header
      [:h1 "Inline labels " [:small "Label and annotate text"]]]
     [:table.table.table-bordered.table-striped
      [:thead [:tr [:th "Labels"] [:th "Markup"]]]
      [:tbody
       [:tr
        [:td [:span.label "Default"]]
        [:td [:code (format-code
                     [:span.label "Default"])]]]
       [:tr
        [:td [:span.label.label-success "Success"]]
        [:td
         [:code (format-code
                     [:span.label.label-success "Success"])]]]
       [:tr
        [:td [:span.label.label-warning "Warning"]]
        [:td
         [:code (format-code
                 [:span.label.label-warning "Warning"])]]]
       [:tr
        [:td [:span.label.label-important "Important"]]
        [:td
         [:code (format-code
                 [:span.label.label-important "Important"])]]]
       [:tr
        [:td [:span.label.label-info "Info"]]
        [:td [:code (format-code
                     [:span.label.label-info "Info"])]]]
       [:tr
        [:td [:span.label.label-inverse "Inverse"]]
        [:td
         [:code (format-code
                 [:span.label.label-inverse "Inverse"])]]]]]])
(ns bootstrap-docs.views.components.badges
  (:use [noir.core]
        [hiccup.core]
        [hiccup.element]
        [hiccup.bootstrap]
        [bootstrap-docs.views.common]
        [hiccup.form]
        [hiccup.page]
        ))

(def badges
  [:section#badges
     [:div.page-header
      [:h1 "Badges " [:small "Indicators and unread counts"]]]
     [:div.row
      [:div.span4
       [:h3 "About"]
       [:p
        "Badges are small, simple components for displaying an indicator or
count of some sort. They're commonly found in email clients like Mail.app or on
mobile apps for push notifications."]]

      [:div.span8
       [:h3 "Available classes"]
       [:table.table.table-bordered.table-striped
        [:thead [:tr [:th "Name"] [:th "Example"] [:th "Markup"]]]
        [:tbody
         [:tr
          [:td "Default"]
          [:td [:span.badge "1"]]
          [:td [:code (format-code
                       [:span.badge "1"])]]]
         [:tr
          [:td "Success"]
          [:td [:span.badge.badge-success "2"]]
          [:td [:code (format-code
                       [:span.badge.badge-success "2"])]]]
         [:tr
          [:td "Warning"]
          [:td [:span.badge.badge-warning "4"]]
          [:td [:code (format-code
                       [:span.badge.badge-warning "4"])]]]
         [:tr
          [:td "Important"]
          [:td [:span.badge.badge-important "6"]]
          [:td
           [:code (format-code
                   [:span.badge.badge-important "6"])]]]
         [:tr
          [:td "Info"]
          [:td [:span.badge.badge-info "8"]]
          [:td [:code (format-code
                       [:span.badge.badge-info "8"])]]]
         [:tr
          [:td "\n              Inverse\n            "]
          [:td [:span.badge.badge-inverse "10"]]
          [:td
           [:code (format-code
                   [:span.badge.badge-inverse "10"])]]]]]]]])
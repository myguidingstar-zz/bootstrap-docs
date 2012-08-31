(ns bootstrap-docs.views.components.pagination
  (:use [noir.core]
        [hiccup.core]
        [hiccup.element]
        [hiccup.bootstrap]
        [bootstrap-docs.views.common]
        [hiccup.form]
        [hiccup.page]
        ))

(def pagination
  [:section#pagination
     [:div.page-header
      [:h1
       "Pagination "
       [:small "Two options for paging through content"]]]
     [:h2 "Multicon-page pagination"]
     [:div.row
      [:div.span4
       [:h3 "When to use"]
       [:p
        "Ultra simplistic and minimally styled pagination inspired by Rdio,
great for apps and search results. The large block is hard to miss, easily
scalable, and provides large click areas."]
       [:h3 "Stateful page links"]
       [:p
        "Links are customizable and work in a number of circumstances with the
right class. "
        [:code ".disabled"]
        " for unclickable links and "
        [:code ".active"]
        " for current page."]
       [:h3 "Flexible alignment"]
       [:p
        "Add either of two optional classes to change the alignment of
pagination links: "
        [:code ".pagination-centered"]
        " and "
        [:code ".pagination-right"]
        "."]]
      [:div.span4
       [:h3 "Examples"]
       [:p
        "The default pagination component is flexible and works in a number of
variations."]
       [:div.pagination
        [:ul
         [:li.disabled [:a {:href "#"} "«"]]
         [:li.active [:a {:href "#"} "1"]]
         [:li [:a {:href "#"} "2"]]
         [:li [:a {:href "#"} "3"]]
         [:li [:a {:href "#"} "4"]]
         [:li [:a {:href "#"} "»"]]]]
       [:div.pagination
        [:ul
         [:li [:a {:href "#"} "«"]]
         [:li [:a {:href "#"} "10"]]
         [:li.active [:a {:href "#"} "11"]]
         [:li [:a {:href "#"} "12"]]
         [:li [:a {:href "#"} "»"]]]]
       [:div.pagination
        [:ul
         [:li [:a {:href "#"} "«"]]
         [:li.active [:a {:href "#"} "10"]]
         [:li.disabled [:a {:href "#"} "..."]]
         [:li [:a {:href "#"} "20"]]
         [:li [:a {:href "#"} "»"]]]]
       [:div.pagination.pagination-centered
        [:ul
         [:li.active [:a {:href "#"} "1"]]
         [:li [:a {:href "#"} "2"]]
         [:li [:a {:href "#"} "3"]]
         [:li [:a {:href "#"} "4"]]
         [:li [:a {:href "#"} "5"]]]]]
      [:div.span4
       [:h3 "Markup"]
       [:p
        "Wrapped in a "
        [:code "[:div]"]
        ", pagination is just a "
        [:code "[:ul]"]
        "."]
       [:pre.prettyprint.linenums
        (format-code
            [:div.pagination
             [:ul
              [:li [:a {:href "#"} "Prev"]]
              [:li.active [:a {:href "#"} "1"]]
              [:li [:a {:href "#"} "2"]]
              [:li [:a {:href "#"} "3"]]
              [:li [:a {:href "#"} "4"]]
              [:li [:a {:href "#"} "Next"]]]])]]]

     [:h2 "Pager " [:small "For quick previous and next links"]]
     [:div.row
      [:div.span4
       [:h3 "About pager"]
       [:p
        "The pager component is a set of links for simple pagination
implementations with light markup and even lighter styles. It's great for simple
sites like blogs or magazines."]
       [:h4 "Optional disabled state"]
       [:p
        "Pager links also use the general "
        [:code ".disabled"]
        " class from the pagination."]]
      [:div.span4
       [:h3 "Default example"]
       [:p "By default, the pager centers links."]
       [:ul.pager
        [:li [:a {:href "#"} "Previous"]]
        [:li [:a {:href "#"} "Next"]]]
       [:pre.prettyprint.linenums
        (format-code
           [:ul.pager
            [:li [:a {:href "#"} "Previous"]]
            [:li [:a {:href "#"} "Next"]]])]]
      [:div.span4
       [:h3 "Aligned links"]
       [:p "Alternatively, you can align each link to the sides:"]
       [:ul.pager
        [:li.previous [:a {:href "#"} "← Older"]]
        [:li.next [:a {:href "#"} "Newer →"]]]
       [:pre.prettyprint.linenums
        (format-code
         [:ul.pager
          [:li.previous [:a {:href "#"} "← Older"]]
          [:li.next [:a {:href "#"} "Newer →"]]])]]]])
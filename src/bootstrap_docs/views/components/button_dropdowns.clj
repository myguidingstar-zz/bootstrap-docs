(ns bootstrap-docs.views.components.button-dropdowns
  (:use [noir.core]
        [hiccup.core]
        [hiccup.element]
        [hiccup.bootstrap]
        [bootstrap-docs.views.common]
        [hiccup.form]
        [hiccup.page]
        ))

(def button-dropdowns
  [:section#buttonDropdowns
     [:div.page-header
      [:h1
       "Button dropdown menus "
       [:small "Built on button groups to provide contextual menus"]]]
     [:h2 "Button dropdowns"]
     [:div.row
      [:div.span4
       [:h3 "Overview and examples"]
       [:p
        "Use any button to trigger a dropdown menu by placing it within a "
        [:code ".btn-group"]
        " and providing the proper menu markup."]
       [:div.btn-toolbar
        {:style "margin-top: 18px;"}
        [:div.btn-group
         [:button.btn.dropdown-toggle
          {:data-toggle "dropdown"}
          "Action "
          [:span.caret]]
         [:ul.dropdown-menu
          [:li [:a {:href "#"} "Action"]]
          [:li [:a {:href "#"} "Another action"]]
          [:li [:a {:href "#"} "Something else here"]]
          [:li.divider]
          [:li [:a {:href "#"} "Separated link"]]]]

        [:div.btn-group
         [:button.btn.btn-primary.dropdown-toggle
          {:data-toggle "dropdown"}
          "Action "
          [:span.caret]]
         [:ul.dropdown-menu
          [:li [:a {:href "#"} "Action"]]
          [:li [:a {:href "#"} "Another action"]]
          [:li [:a {:href "#"} "Something else here"]]
          [:li.divider]
          [:li [:a {:href "#"} "Separated link"]]]]

        [:div.btn-group
         [:button.btn.btn-danger.dropdown-toggle
          {:data-toggle "dropdown"}
          "Danger "
          [:span.caret]]
         [:ul.dropdown-menu
          [:li [:a {:href "#"} "Action"]]
          [:li [:a {:href "#"} "Another action"]]
          [:li [:a {:href "#"} "Something else here"]]
          [:li.divider]
          [:li [:a {:href "#"} "Separated link"]]]]]

       [:div.btn-toolbar
        [:div.btn-group
         [:button.btn.btn-warning.dropdown-toggle
          {:data-toggle "dropdown"}
          "Warning "
          [:span.caret]]
         [:ul.dropdown-menu
          [:li [:a {:href "#"} "Action"]]
          [:li [:a {:href "#"} "Another action"]]
          [:li [:a {:href "#"} "Something else here"]]
          [:li.divider]
          [:li [:a {:href "#"} "Separated link"]]]]

        [:div.btn-group
         [:button.btn.btn-success.dropdown-toggle
          {:data-toggle "dropdown"}
          "Success "
          [:span.caret]]
         [:ul.dropdown-menu
          [:li [:a {:href "#"} "Action"]]
          [:li [:a {:href "#"} "Another action"]]
          [:li [:a {:href "#"} "Something else here"]]
          [:li.divider]
          [:li [:a {:href "#"} "Separated link"]]]]

        [:div.btn-group
         [:button.btn.btn-info.dropdown-toggle
          {:data-toggle "dropdown"}
          "Info "
          [:span.caret]]
         [:ul.dropdown-menu
          [:li [:a {:href "#"} "Action"]]
          [:li [:a {:href "#"} "Another action"]]
          [:li [:a {:href "#"} "Something else here"]]
          [:li.divider]
          [:li [:a {:href "#"} "Separated link"]]]]

        [:div.btn-group
         [:button.btn.btn-inverse.dropdown-toggle
          {:data-toggle "dropdown"}
          "Inverse "
          [:span.caret]]
         [:ul.dropdown-menu
          [:li [:a {:href "#"} "Action"]]
          [:li [:a {:href "#"} "Another action"]]
          [:li [:a {:href "#"} "Something else here"]]
          [:li.divider]
          [:li [:a {:href "#"} "Separated link"]]]]
]
]
      [:div.span8
       [:h3 "Example markup"]
       [:p
        "Similar to a button group, our markup uses regular button markup,
 but with a handful of additions to refine the style and support Bootstrap's
dropdown jQuery plugin."]
       [:pre.prettyprint.linenums
        (format-code
         [:div.btn-group
          [:a.btn.dropdown-toggle
           {:data-toggle "dropdown" :href "#" }
           "Action"
           [:span.caret]]
          [:ul.dropdown-menu
           (comment "dropdown menu links")]])]]]
     [:div.row
      [:div.span4
       [:h3 "Works with all button sizes"]
       [:p
        "Button dropdowns work at any size. your button sizes to "
        [:code ".btn-large"]
        ", "
        [:code ".btn-small"]
        ", or "
        [:code ".btn-mini"]
        "."]
       [:div.btn-toolbar
        {:style "margin-top: 18px;"}
        [:div.btn-group
         [:button.btn.btn-large.dropdown-toggle
          {:data-toggle "dropdown"}
          "Large button "
          [:span.caret]]
         [:ul.dropdown-menu
          [:li [:a {:href "#"} "Action"]]
          [:li [:a {:href "#"} "Another action"]]
          [:li [:a {:href "#"} "Something else here"]]
          [:li.divider]
          [:li [:a {:href "#"} "Separated link"]]]]

        [:div.btn-group
         [:button.btn.btn-small.dropdown-toggle
          {:data-toggle "dropdown"}
          "Small button "
          [:span.caret]]
         [:ul.dropdown-menu
          [:li [:a {:href "#"} "Action"]]
          [:li [:a {:href "#"} "Another action"]]
          [:li [:a {:href "#"} "Something else here"]]
          [:li.divider]
          [:li [:a {:href "#"} "Separated link"]]]]

        [:div.btn-group
         [:button.btn.btn-mini.dropdown-toggle
          {:data-toggle "dropdown"}
          "Mini button "
          [:span.caret]]
         [:ul.dropdown-menu
          [:li [:a {:href "#"} "Action"]]
          [:li [:a {:href "#"} "Another action"]]
          [:li [:a {:href "#"} "Something else here"]]
          [:li.divider]
          [:li [:a {:href "#"} "Separated link"]]]]]]

      [:div.span4
       [:h3 "Requires javascript"]
       [:p
        "Button dropdowns require the "
        [:a
         {:href "./javascript#dropdowns"}
         "Bootstrap dropdown plugin"]
        " to function."]
       [:p
        "In some cases—like mobile—dropdown menus will extend outside the
 viewport. You need to resolve the alignment manually or with custom
javascript."]]]

     [:br]
     [:h2 "Split button dropdowns"]
     [:div.row
      [:div.span4
       [:h3 "Overview and examples"]
       [:p
        "Building on the button group styles and markup, we can easily create a
split button. Split buttons feature a standard action on the left and a dropdown
toggle on the right with contextual links."]
       [:div.btn-toolbar
        {:style "margin-top: 18px;"}
        [:div.btn-group
         [:button.btn "Action"]
         [:button.btn.dropdown-toggle
          {:data-toggle "dropdown"}
          [:span.caret]]
         [:ul.dropdown-menu
          [:li [:a {:href "#"} "Action"]]
          [:li [:a {:href "#"} "Another action"]]
          [:li [:a {:href "#"} "Something else here"]]
          [:li.divider]
          [:li [:a {:href "#"} "Separated link"]]]]

        [:div.btn-group
         [:button.btn.btn-primary "Action"]
         [:button.btn.btn-primary.dropdown-toggle
          {:data-toggle "dropdown"}
          [:span.caret]]
         [:ul.dropdown-menu
          [:li [:a {:href "#"} "Action"]]
          [:li [:a {:href "#"} "Another action"]]
          [:li [:a {:href "#"} "Something else here"]]
          [:li.divider]
          [:li [:a {:href "#"} "Separated link"]]]]

        [:div.btn-group
         [:button.btn.btn-danger "Danger"]
         [:button.btn.btn-danger.dropdown-toggle
          {:data-toggle "dropdown"}
          [:span.caret]]
         [:ul.dropdown-menu
          [:li [:a {:href "#"} "Action"]]
          [:li [:a {:href "#"} "Another action"]]
          [:li [:a {:href "#"} "Something else here"]]
          [:li.divider]
          [:li [:a {:href "#"} "Separated link"]]]]
]
       [:div.btn-toolbar
        [:div.btn-group
         [:button.btn.btn-warning "Warning"]
         [:button.btn.btn-warning.dropdown-toggle
          {:data-toggle "dropdown"}
          [:span.caret]]
         [:ul.dropdown-menu
          [:li [:a {:href "#"} "Action"]]
          [:li [:a {:href "#"} "Another action"]]
          [:li [:a {:href "#"} "Something else here"]]
          [:li.divider]
          [:li [:a {:href "#"} "Separated link"]]]]

        [:div.btn-group
         [:button.btn.btn-success "Success"]
         [:button.btn.btn-success.dropdown-toggle
          {:data-toggle "dropdown"}
          [:span.caret]]
         [:ul.dropdown-menu
          [:li [:a {:href "#"} "Action"]]
          [:li [:a {:href "#"} "Another action"]]
          [:li [:a {:href "#"} "Something else here"]]
          [:li.divider]
          [:li [:a {:href "#"} "Separated link"]]]]

        [:div.btn-group
         [:button.btn.btn-info "Info"]
         [:button.btn.btn-info.dropdown-toggle
          {:data-toggle "dropdown"}
          [:span.caret]]
         [:ul.dropdown-menu
          [:li [:a {:href "#"} "Action"]]
          [:li [:a {:href "#"} "Another action"]]
          [:li [:a {:href "#"} "Something else here"]]
          [:li.divider]
          [:li [:a {:href "#"} "Separated link"]]]]
]
       [:div.btn-toolbar
        [:div.btn-group
         [:button.btn.btn-inverse "Inverse"]
         [:button.btn.btn-inverse.dropdown-toggle
          {:data-toggle "dropdown"}
          [:span.caret]]
         [:ul.dropdown-menu
          [:li [:a {:href "#"} "Action"]]
          [:li [:a {:href "#"} "Another action"]]
          [:li [:a {:href "#"} "Something else here"]]
          [:li.divider]
          [:li [:a {:href "#"} "Separated link"]]]]
]

       [:h3 "Sizes"]
       [:p
        "Utilize the extra button classes "
        [:code ".btn-mini"]
        ", "
        [:code ".btn-small"]
        ", or "
        [:code ".btn-large"]
        " for sizing."]
       [:div.btn-toolbar
        [:div.btn-group
         [:button.btn.btn-large "Large action"]
         [:button.btn.btn-large.dropdown-toggle
          {:data-toggle "dropdown"}
          [:span.caret]]
         [:ul.dropdown-menu
          [:li [:a {:href "#"} "Action"]]
          [:li [:a {:href "#"} "Another action"]]
          [:li [:a {:href "#"} "Something else here"]]
          [:li.divider]
          [:li [:a {:href "#"} "Separated link"]]]]
]

       [:div.btn-toolbar
        [:div.btn-group
         [:button.btn.btn-small "Small action"]
         [:button.btn.btn-small.dropdown-toggle
          {:data-toggle "dropdown"}
          [:span.caret]]
         [:ul.dropdown-menu
          [:li [:a {:href "#"} "Action"]]
          [:li [:a {:href "#"} "Another action"]]
          [:li [:a {:href "#"} "Something else here"]]
          [:li.divider]
          [:li [:a {:href "#"} "Separated link"]]]]
]

       [:div.btn-toolbar
        [:div.btn-group
         [:button.btn.btn-mini "Mini action"]
         [:button.btn.btn-mini.dropdown-toggle
          {:data-toggle "dropdown"}
          [:span.caret]]
         [:ul.dropdown-menu
          [:li [:a {:href "#"} "Action"]]
          [:li [:a {:href "#"} "Another action"]]
          [:li [:a {:href "#"} "Something else here"]]
          [:li.divider]
          [:li [:a {:href "#"} "Separated link"]]]]
]

       [:pre.prettyprint.linenums
        (format-code
         [:div.btn-group
          "..."
          [:ul.dropdown-menu.pull-right
           (comment "dropdown menu links")]])]]
      [:div.span8
       [:h3 "Example markup"]
       [:p
        "We expand on the normal button dropdowns to provide a second button
action that operates as a separate dropdown trigger."]
       [:pre.prettyprint.linenums
        (format-code
         [:div.btn-group
          [:button.btn "Action"]
          [:button.btn.dropdown-toggle {:data-toggle "dropdown"}
           [:span.caret]]
          [:ul.dropdown-menu
           (comment "dropdown menu links")]
          ])
]
       [:h3 "Dropup menus"]
       [:p
        "Dropdown menus can also be toggled from the bottom up by adding a
single class to the immediate parent of "
        [:code ".dropdown-menu"]
        ". It will flip the direction of the "
        [:code ".caret"]
        " and reposition the menu itself to move from the bottom up instead
of top down."]
       [:div.btn-toolbar
        {:style "margin-top: 9px;"}
        [:div.btn-group.dropup
         [:button.btn "Dropup"]
         [:button.btn.dropdown-toggle
          {:data-toggle "dropdown"}
          [:span.caret]]
         [:ul.dropdown-menu
          [:li [:a {:href "#"} "Action"]]
          [:li [:a {:href "#"} "Another action"]]
          [:li [:a {:href "#"} "Something else here"]]
          [:li.divider]
          [:li [:a {:href "#"} "Separated link"]]]]

        [:div.btn-group.dropup
         [:button.btn.primary "Right dropup"]
         [:button.btn.primary.dropdown-toggle
          {:data-toggle "dropdown"}
          [:span.caret]]
         [:ul.dropdown-menu.pull-right
          [:li [:a {:href "#"} "Action"]]
          [:li [:a {:href "#"} "Another action"]]
          [:li [:a {:href "#"} "Something else here"]]
          [:li.divider]
          [:li [:a {:href "#"} "Separated link"]]]]
  ]
       [:pre.prettyprint.linenums
        (format-code
         [:div.btn-group.dropup
    [:button.btn "Dropup"]
    [:button.btn.dropdown-toggle
     {:data-toggle "dropdown"}
     [:span.caret]]
    [:ul.dropdown-menu (comment "dropdown menu links")]])]]]])
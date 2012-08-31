(ns bootstrap-docs.controllers.scaffolding
  (:use [noir.core]
        [hiccup.core]
        [hiccup.element]
        [hiccup.bootstrap]
        [bootstrap-docs.views.common]
        [bootstrap-docs.views.scaffolding.global]
        [bootstrap-docs.views.scaffolding.grid-system]
        bootstrap-docs.views.scaffolding.fluid-grid-system
        [bootstrap-docs.views.scaffolding.grid-customization]
        [bootstrap-docs.views.scaffolding.layouts]
        [bootstrap-docs.views.scaffolding.responsive]
        ))

(def content
  (list
   (navigator
      [:ul.nav
       [:li (link-to "/base-css" "Base CSS")]
       [:li.active (link-to "/scaffolding" "Scaffolding")]
       [:li (link-to "/components" "Components")]
       [:li {:class "divider-vertical"}]
       [:li (link-to "/javascript" "Javascript plugins")]
       ])

   [:div.container
    (greeter "Scaffolding"
             "Bootstrap is built on a responsive 12-column grid. We've also
included fixed- and fluid-width layouts based on that system.")

    (subnav [(link-to "#global" "Global styles")
             (link-to "#gridSystem" "Grid system")
             (link-to "#fluidGridSystem" "Fluid grid system")
             (link-to "#gridCustomization" "Customizing")
             (link-to "#layouts" "Layouts")
             (link-to "#responsive" "Responsive design")])

    global
    grid-system
    fluid-grid-system
    grid-customization
    layouts
    responsive
    footer]))

(defpage "/scaffolding" []
  (layout "Scaffolding · Twitter Bootstrap"
          :all :all
          content))

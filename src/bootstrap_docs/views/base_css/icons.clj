(ns bootstrap-docs.views.base-css.icons
  (:use [hiccup.core]
        [hiccup.element]
        [hiccup.form]
        [hiccup.page]))

(def icons
  [:section#icons
     [:div.page-header
      [:h1
       "Icons "
       [:small
        "Graciously provided by "
        [:a
         {:target "_blank", :href "http://glyphicons.com"}
         "Glyphicons"]]]]
     [:div.row
      [:div.span3
       [:ul.the-icons
        [:li [:i.icon-glass] " icon-glass"]
        [:li [:i.icon-music] " icon-music"]
        [:li [:i.icon-search] " icon-search"]
        [:li [:i.icon-envelope] " icon-envelope"]
        [:li [:i.icon-heart] " icon-heart"]
        [:li [:i.icon-star] " icon-star"]
        [:li [:i.icon-star-empty] " icon-star-empty"]
        [:li [:i.icon-user] " icon-user"]
        [:li [:i.icon-film] " icon-film"]
        [:li [:i.icon-th-large] " icon-th-large"]
        [:li [:i.icon-th] " icon-th"]
        [:li [:i.icon-th-list] " icon-th-list"]
        [:li [:i.icon-ok] " icon-ok"]
        [:li [:i.icon-remove] " icon-remove"]
        [:li [:i.icon-zoom-in] " icon-zoom-in"]
        [:li [:i.icon-zoom-out] " icon-zoom-out"]
        [:li [:i.icon-off] " icon-off"]
        [:li [:i.icon-signal] " icon-signal"]
        [:li [:i.icon-cog] " icon-cog"]
        [:li [:i.icon-trash] " icon-trash"]
        [:li [:i.icon-home] " icon-home"]
        [:li [:i.icon-file] " icon-file"]
        [:li [:i.icon-time] " icon-time"]
        [:li [:i.icon-road] " icon-road"]
        [:li [:i.icon-download-alt] " icon-download-alt"]
        [:li [:i.icon-download] " icon-download"]
        [:li [:i.icon-upload] " icon-upload"]
        [:li [:i.icon-inbox] " icon-inbox"]
        [:li [:i.icon-play-circle] " icon-play-circle"]
        [:li [:i.icon-repeat] " icon-repeat"]
        [:li [:i.icon-refresh] " icon-refresh"]
        [:li [:i.icon-list-alt] " icon-list-alt"]
        [:li [:i.icon-lock] " icon-lock"]
        [:li [:i.icon-flag] " icon-flag"]
        [:li [:i.icon-headphones] " icon-headphones"]]]
      [:div.span3
       [:ul.the-icons
        [:li [:i.icon-volume-off] " icon-volume-off"]
        [:li [:i.icon-volume-down] " icon-volume-down"]
        [:li [:i.icon-volume-up] " icon-volume-up"]
        [:li [:i.icon-qrcode] " icon-qrcode"]
        [:li [:i.icon-barcode] " icon-barcode"]
        [:li [:i.icon-tag] " icon-tag"]
        [:li [:i.icon-tags] " icon-tags"]
        [:li [:i.icon-book] " icon-book"]
        [:li [:i.icon-bookmark] " icon-bookmark"]
        [:li [:i.icon-print] " icon-print"]
        [:li [:i.icon-camera] " icon-camera"]
        [:li [:i.icon-font] " icon-font"]
        [:li [:i.icon-bold] " icon-bold"]
        [:li [:i.icon-italic] " icon-italic"]
        [:li [:i.icon-text-height] " icon-text-height"]
        [:li [:i.icon-text-width] " icon-text-width"]
        [:li [:i.icon-align-left] " icon-align-left"]
        [:li [:i.icon-align-center] " icon-align-center"]
        [:li [:i.icon-align-right] " icon-align-right"]
        [:li [:i.icon-align-justify] " icon-align-justify"]
        [:li [:i.icon-list] " icon-list"]
        [:li [:i.icon-indent-left] " icon-indent-left"]
        [:li [:i.icon-indent-right] " icon-indent-right"]
        [:li [:i.icon-facetime-video] " icon-facetime-video"]
        [:li [:i.icon-picture] " icon-picture"]
        [:li [:i.icon-pencil] " icon-pencil"]
        [:li [:i.icon-map-marker] " icon-map-marker"]
        [:li [:i.icon-adjust] " icon-adjust"]
        [:li [:i.icon-tint] " icon-tint"]
        [:li [:i.icon-edit] " icon-edit"]
        [:li [:i.icon-share] " icon-share"]
        [:li [:i.icon-check] " icon-check"]
        [:li [:i.icon-move] " icon-move"]
        [:li [:i.icon-step-backward] " icon-step-backward"]
        [:li [:i.icon-fast-backward] " icon-fast-backward"]]]
      [:div.span3
       [:ul.the-icons
        [:li [:i.icon-backward] " icon-backward"]
        [:li [:i.icon-play] " icon-play"]
        [:li [:i.icon-pause] " icon-pause"]
        [:li [:i.icon-stop] " icon-stop"]
        [:li [:i.icon-forward] " icon-forward"]
        [:li [:i.icon-fast-forward] " icon-fast-forward"]
        [:li [:i.icon-step-forward] " icon-step-forward"]
        [:li [:i.icon-eject] " icon-eject"]
        [:li [:i.icon-chevron-left] " icon-chevron-left"]
        [:li [:i.icon-chevron-right] " icon-chevron-right"]
        [:li [:i.icon-plus-sign] " icon-plus-sign"]
        [:li [:i.icon-minus-sign] " icon-minus-sign"]
        [:li [:i.icon-remove-sign] " icon-remove-sign"]
        [:li [:i.icon-ok-sign] " icon-ok-sign"]
        [:li [:i.icon-question-sign] " icon-question-sign"]
        [:li [:i.icon-info-sign] " icon-info-sign"]
        [:li [:i.icon-screenshot] " icon-screenshot"]
        [:li [:i.icon-remove-circle] " icon-remove-circle"]
        [:li [:i.icon-ok-circle] " icon-ok-circle"]
        [:li [:i.icon-ban-circle] " icon-ban-circle"]
        [:li [:i.icon-arrow-left] " icon-arrow-left"]
        [:li [:i.icon-arrow-right] " icon-arrow-right"]
        [:li [:i.icon-arrow-up] " icon-arrow-up"]
        [:li [:i.icon-arrow-down] " icon-arrow-down"]
        [:li [:i.icon-share-alt] " icon-share-alt"]
        [:li [:i.icon-resize-full] " icon-resize-full"]
        [:li [:i.icon-resize-small] " icon-resize-small"]
        [:li [:i.icon-plus] " icon-plus"]
        [:li [:i.icon-minus] " icon-minus"]
        [:li [:i.icon-asterisk] " icon-asterisk"]
        [:li [:i.icon-exclamation-sign] " icon-exclamation-sign"]
        [:li [:i.icon-gift] " icon-gift"]
        [:li [:i.icon-leaf] " icon-leaf"]
        [:li [:i.icon-fire] " icon-fire"]
        [:li [:i.icon-eye-open] " icon-eye-open"]]]
      [:div.span3
       [:ul.the-icons
        [:li [:i.icon-eye-close] " icon-eye-close"]
        [:li [:i.icon-warning-sign] " icon-warning-sign"]
        [:li [:i.icon-plane] " icon-plane"]
        [:li [:i.icon-calendar] " icon-calendar"]
        [:li [:i.icon-random] " icon-random"]
        [:li [:i.icon-comment] " icon-comment"]
        [:li [:i.icon-magnet] " icon-magnet"]
        [:li [:i.icon-chevron-up] " icon-chevron-up"]
        [:li [:i.icon-chevron-down] " icon-chevron-down"]
        [:li [:i.icon-retweet] " icon-retweet"]
        [:li [:i.icon-shopping-cart] " icon-shopping-cart"]
        [:li [:i.icon-folder-close] " icon-folder-close"]
        [:li [:i.icon-folder-open] " icon-folder-open"]
        [:li [:i.icon-resize-vertical] " icon-resize-vertical"]
        [:li [:i.icon-resize-horizontal] " icon-resize-horizontal"]
        [:li [:i.icon-hdd] " icon-hdd"]
        [:li [:i.icon-bullhorn] " icon-bullhorn"]
        [:li [:i.icon-bell] " icon-bell"]
        [:li [:i.icon-certificate] " icon-certificate"]
        [:li [:i.icon-thumbs-up] " icon-thumbs-up"]
        [:li [:i.icon-thumbs-down] " icon-thumbs-down"]
        [:li [:i.icon-hand-right] " icon-hand-right"]
        [:li [:i.icon-hand-left] " icon-hand-left"]
        [:li [:i.icon-hand-up] " icon-hand-up"]
        [:li [:i.icon-hand-down] " icon-hand-down"]
        [:li [:i.icon-circle-arrow-right] " icon-circle-arrow-right"]
        [:li [:i.icon-circle-arrow-left] " icon-circle-arrow-left"]
        [:li [:i.icon-circle-arrow-up] " icon-circle-arrow-up"]
        [:li [:i.icon-circle-arrow-down] " icon-circle-arrow-down"]
        [:li [:i.icon-globe] " icon-globe"]
        [:li [:i.icon-wrench] " icon-wrench"]
        [:li [:i.icon-tasks] " icon-tasks"]
        [:li [:i.icon-filter] " icon-filter"]
        [:li [:i.icon-briefcase] " icon-briefcase"]
        [:li [:i.icon-fullscreen] " icon-fullscreen"]]]]
     [:br]
     [:div.row
      [:div.span4
       [:h3 "Built as a sprite"]
       [:p
        "Instead of making every icon an extra request, we've compiled them into
 a sprite—a bunch of images in one file that uses CSS to position the images
with "
        [:code "background-position"]
        ". This is the same method we use on Twitter.com and it has worked well
 for us."]
       [:p
        "All icons classes are prefixed with "
        [:code ".icon-"]
        " for proper namespacing and scoping, much like our other components.
 This will help avoid conflicts with other tools."]
       [:p
        [:a
         {:target "_blank", :href "http://glyphicons.com"}
         "Glyphicons"]
        " has granted us use of the Halflings set in our open-source toolkit so
 long as we provide a link and credit here in the docs. Please consider doing
the same in your projects."]]
      [:div.span4
       [:h3 "How to use"]
       [:p
        "Bootstrap uses an "
        [:code "[:i]"]
        " tag for all icons, but they have no case class—only a shared prefix.
 To use, place the following code just about anywhere:"]
       [:pre.prettyprint.linenums
        (str (quote [:i.icon-search]))]
       [:p
        "There are also styles available for inverted (white) icons,
made ready with one extra class:"]
       [:pre.prettyprint.linenums
        (str (quote [:i.icon-search.icon-white]))]
       [:p
        "There are 140 classes to choose from for your icons. Just add an "
        [:code "[:i]"]
        " tag with the right classes and you're set.
You can find the full list in "
        [:strong "sprites.less"]
        " or right here in this document."]
       [:p
        [:span.label.label-info "Heads up!"]
        "When using beside strings of text, as in buttons or nav links,
 be sure to leave a space after the "
        [:code "[:i]"]
        " tag for proper spacing."]]
      [:div.span4
       [:h3 "Use cases"]
       [:p
        "Icons are great, but where would one use them? Here are a few ideas:"]
       (unordered-list
        ["As visuals for your sidebar navigation"
         "For a purely icon-driven navigation"
         "For buttons to help convey the meaning of an action"
         "With links to share context on a user's destination"])
       [:p
        "Essentially, anywhere you can put an "
        [:code "[:i]"]
        " tag, you can put an icon."]]]
     [:h3 "Examples"]
     [:p
      "Use them in buttons, button groups for a toolbar, navigation,
or prepended form inputs."]
     [:div.row
      [:div.span4
       [:div.btn-toolbar
        {:style "margin-bottom: 9px"}
        [:div.btn-group
         [:a.btn {:href "#"} [:i.icon-align-left]]
         [:a.btn {:href "#"} [:i.icon-align-center]]
         [:a.btn {:href "#"} [:i.icon-align-right]]
         [:a.btn {:href "#"} [:i.icon-align-justify]]]
        [:div.btn-group
         [:a.btn.btn-primary
          {:href "#"}
          [:i.icon-user.icon-white]
          " User"]
         [:a.btn.btn-primary.dropdown-toggle
          {:href "#", :data-toggle "dropdown"}
          [:span.caret]]
         (unordered-list {:class "dropdown-menu"}
                         [[:a {:href "#"} [:i.icon-pencil] " Edit"]
                          [:a {:href "#"} [:i.icon-trash] " Delete"]
                          [:a {:href "#"} [:i.icon-ban-circle] " Ban"]
                          {:class "divider"}
                          [:a {:href "#"} [:i.i] " Make admin"]])]]
       [:p
        [:a.btn {:href "#"} [:i.icon-refresh] " Refresh"]
        [:a.btn.btn-success
         {:href "#"}
         [:i.icon-shopping-cart.icon-white]
         " Checkout"]
        [:a.btn.btn-danger
         {:href "#"}
         [:i.icon-trash.icon-white]
         " Delete"]]
       [:p
        [:a.btn.btn-large {:href "#"} [:i.icon-comment] " Comment"]
        [:a.btn.btn-small {:href "#"} [:i.icon-cog] " Settings"]
        [:a.btn.btn-small.btn-info
         {:href "#"}
         [:i.icon-info-sign.icon-white]
         " More Info"]]]
      [:div.span4
       [:div.well
        {:style "padding: 8px 0;"}
        [:ul.nav.nav-list
         [:li.active
          [:a {:href "#"} [:i.icon-home.icon-white] " Home"]]
         [:li [:a {:href "#"} [:i.icon-book] " Library"]]
         [:li [:a {:href "#"} [:i.icon-pencil] " Applications"]]
         [:li [:a {:href "#"} [:i.i] " Misc"]]]]
       " "
 ]
      [:div.span4
       [:form
        [:div.control-group
         [:label.control-label {:for "inputIcon"} "Email address"]
         [:div.controls
          [:div.input-prepend
           [:span.add-on [:i.icon-envelope]]
           [:input#inputIcon.span2 {:type "text"}]]]]]]]])
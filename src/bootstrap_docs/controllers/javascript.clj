(ns bootstrap-docs.controllers.javascript
  (:use [noir.core]
        [hiccup.core]
        [hiccup.element]
        [hiccup.form]
        [hiccup.page]
        [bootstrap-docs.views.common]
        [hiccup.bootstrap]
        ))

(def content
  (list
   (navigator
    [:ul.nav
       [:li (link-to "/base-css" "Base CSS")]
       [:li (link-to "/scaffolding" "Scaffolding")]
       [:li (link-to "/components" "Components")]
       [:li {:class "divider-vertical"}]
       [:li.active (link-to "/javascript" "Javascript plugins")]
       ])

   [:div.container
    (greeter "Javascript for Bootstrap"
             (html "Bring Bootstrap's components to life—now with 12 custom "
                   [:a {:target "_blank", :href "http://jquery.com/"} "jQuery"]
                   " plugins."))

    (subnav [(link-to "#javascript" "All plugins")
             (link-to "#modals" "Modal")
             (link-to "#dropdowns" "Dropdown")
             (link-to "#scrollspy" "Scrollspy")
             (link-to "#tabs" "Tab")
             (link-to "#tooltips" "Tooltip")
             (link-to "#popovers" "Popover")
             (link-to "#alerts" "Alert")
             (link-to "#buttons" "Button")
             (link-to "#collapse" "Collapse")
             (link-to "#carousel" "Carousel")
             (link-to "#typeahead" "Typeahead")])

    [:section#javascript
     [:div.page.header
      [:h1
       "jQuery plugins "
       [:small "A dozen Bootstrap plugins to get you started"]]]
     [:div.row
      [:div.span3
       [:h3 [:a {:href "./javascript.html#modals"} "Modals"]]
       [:p
        "A streamlined, but flexible, take on the traditional javascript modal
plugin with only the minimum required functionality and smart defaults."]]
      [:div.span3
       [:h3 [:a {:href "./javascript.html#dropdowns"} "Dropdowns"]]
       [:p
        "Add dropdown menus to nearly anything in Bootstrap with this simple
plugin. Bootstrap features full dropdown menu support on in the navbar, tabs,
and pills."]]
      [:div.span3
       [:h3 [:a {:href "./javascript.html#scrollspy"} "Scrollspy"]]
       [:p
        "Use scrollspy to automatically update the links in your navbar to show
the current active link based on scroll position."]]
      [:div.span3
       [:h3 [:a {:href "./javascript.html#tabs"} "Togglable tabs"]]
       [:p
        "Use this plugin to make tabs and pills more useful by allowing them to
toggle through tabbable panes of local content."]]]

     [:div.row
      [:div.span3
       [:h3 [:a {:href "./javascript.html#tooltips"} "Tooltips"]]
       [:p
        "A new take on the jQuery Tipsy plugin, Tooltips don't rely on
images—they use CSS3 for animations and data-attributes for local title
storage."]]
      [:div.span3
       [:h3
        [:a {:href "./javascript.html#popovers"} "Popovers"]
        " "
        [:small.muted "*"]]
       [:p
        "Add small overlays of content, like those on the iPad, to any element
for housing secondary information."]
       [:p.muted
        [:strong "*"]
        " Requires "
        [:a {:href "#tooltips"} "Tooltips"]
        " to be included"]]
      [:div.span3
       [:h3 [:a {:href "./javascript.html#alerts"} "Alert messages"]]
       [:p
        "The alert plugin is a tiny class for adding close functionality to
alerts."]]
      [:div.span3
       [:h3 [:a {:href "./javascript.html#buttons"} "Buttons"]]
       [:p
        "Do more with buttons. Control button states or create groups of buttons
 for more components like toolbars."]]]

     [:div.row
      {:style "margin-bottom: 9px;"}
      [:div.span3
       [:h3 [:a {:href "./javascript.html#collapse"} "Collapse"]]
       [:p
        "Get base styles and flexible support for collapsible components like
accordions and navigation."]]
      [:div.span3
       [:h3 [:a {:href "./javascript.html#carousel"} "Carousel"]]
       [:p
        "Create a merry-go-round of any content you wish to provide an
interactive slideshow of content."]]
      [:div.span3
       [:h3 [:a {:href "./javascript.html#typeahead"} "Typeahead"]]
       [:p
        "A basic, easily extended plugin for quickly creating elegant typeaheads
with any form text input."]]
      [:div.span3
       [:h3 "Transitions " [:small.muted "*"]]
       [:p
        "For simple transition effects, include bootstrap-transition.js once to
slide in modals or fade out alerts."]
       [:p.muted [:strong "*"] " Required for animation in plugins"]]]

     [:div.alert.alert-info
      [:strong "Heads up!"]
      " All javascript plugins require the latest version of jQuery."]]

    [:section#modals
     [:div.page-header [:h1 "Modals " [:small "bootstrap-modal.js"]]]
     [:div.row
      [:div.span3.columns
       [:h3 "About modals"]
       [:p
        "A streamlined, but flexible, take on the traditional javascript modal
plugin with only the minimum required functionality and smart defaults."]
       [:a.btn
        {:target "_blank", :href "assets/js/bootstrap-modal.js"}
        "Download file"]]
      [:div.span9.columns
       [:h2 "Static example"]
       [:p "Below is a statically rendered modal."]
       [:div.well.modal-example
        {:style "background-color: #888; border: none;"}
        [:div.modal
         {:style
          "position: relative;
top: auto; left: auto; margin: 0 auto;
z-index: 1; max-width: 100%;"}
         [:div.modal-header
          [:button.close {:data-dismiss "modal", :type "button"} "×"]
          [:h3 "Modal header"]]
         [:div.modal-body [:p "One fine body…"]]
         [:div.modal-footer
          [:a.btn {:href "#"} "Close"]
          [:a.btn.btn-primary {:href "#"} "Save changes"]]]]

       [:h2 "Live demo"]
       [:p
        "Toggle a modal via javascript by clicking the button below. It will
slide down and fade in from the top of the page."]

       [:div#myModal.modal.hide.fade
        [:div.modal-header
         [:button.close {:data-dismiss "modal", :type "button"} "×"]
         [:h3 "Modal Heading"]]
        [:div.modal-body
         [:h4 "Text in a modal"]
         [:p
          "Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget
lacinia odio sem."]
         [:h4 "Popover in a modal"]
         [:p
          "This "
          [:a.btn.popover-test
           {:data-content
            "And here's some amazing content. It's very engaging. right?",
            :title "A Title",
            :href "#"}
           "button"]
          " should trigger a popover on hover."]
         [:h4 "Tooltips in a modal"]
         [:p
          [:a.tooltip-test {:title "Tooltip", :href "#"} "This link"]
          " and "
          [:a.tooltip-test {:title "Tooltip", :href "#"} "that link"]
          " should have tooltips on hover."]
         [:hr]
         [:h4 "Overflowing text to show optional scrollbar"]
         [:p
          "We set a fixed "
          [:code "max-height"]
          " on the "
          [:code ".modal-body"]
          ". Watch it overflow with all this extra lorem ipsum text we've
included."]
         [:p
          "Cras mattis consectetur purus sit amet fermentum. Cras justo odio,
dapibus ac facilisis in, egestas eget quam. Morbi leo risus, porta ac
consectetur ac, vestibulum at eros."]
         [:p
          "Praesent commodo cursus magna, vel scelerisque nisl consectetur et.
Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor."]
         [:p
          "Aenean lacinia bibendum nulla sed consectetur. Praesent commodo
cursus magna, vel scelerisque nisl consectetur et. Donec sed odio dui. Donec
ullamcorper nulla non metus auctor fringilla."]
         [:p
          "Cras mattis consectetur purus sit amet fermentum. Cras justo odio,
dapibus ac facilisis in, egestas eget quam. Morbi leo risus, porta ac
consectetur ac, vestibulum at eros."]
         [:p
          "Praesent commodo cursus magna, vel scelerisque nisl consectetur et.
Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor."]
         [:p
          "Aenean lacinia bibendum nulla sed consectetur. Praesent commodo
cursus magna, vel scelerisque nisl consectetur et. Donec sed odio dui. Donec
ullamcorper nulla non metus auctor fringilla."]]
        [:div.modal-footer
         [:a.btn {:data-dismiss "modal", :href "#"} "Close"]
         [:a.btn.btn-primary {:href "#"} "Save changes"]]]
       [:a.btn.btn-primary.btn-large
        {:href "#myModal", :data-toggle "modal"}
        "Launch demo modal"]
       [:hr]
       [:h2 "Using bootstrap-modal"]
       [:p "Call the modal via javascript:"]
       [:pre.prettyprint.linenums
        "$('#myModal').modal(options)"]
       [:h3 "Options"]
       [:table.table.table-bordered.table-striped
        [:thead
         [:tr
          [:th {:style "width: 100px;"} "Name"]
          [:th {:style "width: 50px;"} "type"]
          [:th {:style "width: 50px;"} "default"]
          [:th "description"]]]
        [:tbody
         [:tr
          [:td "backdrop"]
          [:td "boolean"]
          [:td "true"]
          [:td
           "Includes a modal-backdrop element. Alternatively, specify "
           [:code "static"]
           " for a backdrop which doesn't close the modal on click."]]
         [:tr
          [:td "keyboard"]
          [:td "boolean"]
          [:td "true"]
          [:td "Closes the modal when escape key is pressed"]]
         [:tr
          [:td "show"]
          [:td "boolean"]
          [:td "true"]
          [:td "Shows the modal when initialized."]]]]
       [:h3 "Markup"]
       [:p
        "You can activate modals on your page easily without having to write a
single line of javascript. Just set "
        [:code "data-toggle=\"modal\""]
        " on a controller element with a "
        [:code "data-target=\"#foo\""]
        " or "
        [:code "href=\"#foo\""]
        " which corresponds to a modal element id, and when clicked, it will
launch your modal."]
       [:p
        "Also, to add options to your modal instance, just include them as
additional data attributes on either the control element or the modal markup
itself."]
       [:pre.prettyprint.linenums
        (format-code
         [:a.btn {:data-toggle "modal" :href "#myModal"} "Launch Modal"])]
       [:pre.prettyprint.linenums
        (format-code
         [:div#myModal.modal.hide
          [:div.modal-header
           [:button.close {:data-dismiss "modal", :type "button"} "×"]
           [:h3 "Modal header"]]
          [:div.modal-body [:p "One fine body…"]]
          [:div.modal-footer
           [:a.btn {:data-dismiss "modal", :href "#"} "Close"]
           [:a.btn.btn-primary {:href "#"} "Save changes"]]])]

       [:div.alert.alert-info
        [:strong "Heads up!"]
        " If you want your modal to animate in and out, just add a "
        [:code ".fade"]
        " class to the "
        [:code ".modal"]
        " element (refer to the demo to see this in action) and include
bootstrap-transition.js."]
       [:h3 "Methods"]
       [:h4 ".modal(options)"]
       [:p
        "Activates your content as a modal. Accepts an optional options "
        [:code "object"]
        "."]
       [:pre.prettyprint.linenums
        "\n$('#myModal').modal({\n  keyboard: false\n})"]
       [:h4 ".modal('toggle')"]
       [:p "Manually toggles a modal."]
       [:pre.prettyprint.linenums "$('#myModal').modal('toggle')"]
       [:h4 ".modal('show')"]
       [:p "Manually opens a modal."]
       [:pre.prettyprint.linenums "$('#myModal').modal('show')"]
       [:h4 ".modal('hide')"]
       [:p "Manually hides a modal."]
       [:pre.prettyprint.linenums "$('#myModal').modal('hide')"]
       [:h3 "Events"]
       [:p
        "Bootstrap's modal class exposes a few events for hooking into modal
functionality."]
       [:table.table.table-bordered.table-striped
        [:thead
         [:tr
          [:th {:style "width: 150px;"} "Event"]
          [:th "Description"]]]
        [:tbody
         [:tr
          [:td "show"]
          [:td
           "This event fires immediately when the "
           [:code "show"]
           " instance method is called."]]
         [:tr
          [:td "shown"]
          [:td
           "This event is fired when the modal has been made visible to the
user (will wait for css transitions to complete)."]]
         [:tr
          [:td "hide"]
          [:td
           "This event is fired immediately when the "
           [:code "hide"]
           " instance method has been called."]]
         [:tr
          [:td "hidden"]
          [:td
           "This event is fired when the modal has finished being hidden from
the user (will wait for css transitions to complete)."]]]]
       [:pre.prettyprint.linenums
        "\n$('#myModal').on('hidden', function () {\n  // do something…\n})"]]]]

    [:section#dropdowns
     [:div.page-header
      [:h1 "Dropdowns " [:small "bootstrap-dropdown.js"]]]
     [:div.row
      [:div.span3.columns
       [:h3 "About dropdowns"]
       [:p
        "Add dropdown menus to nearly anything in Bootstrap with this simple
plugin. Bootstrap features full dropdown menu support on in the navbar, tabs,
and pills."]
       [:a.btn
        {:target "_blank", :href "assets/js/bootstrap-dropdown.js"}
        "Download file"]]
      [:div.span9.columns
       [:h2 "Examples"]
       [:p
        "Click on the dropdown nav links in the navbar and pills below to test
dropdowns."]
       [:div#navbar-example.navbar.navbar-static
        [:div.navbar-inner
         [:div.container
          {:style "width: auto;"}
          [:a.brand {:href "#"} "Project Name"]
          [:ul.nav
           [:li.dropdown
            [:a.dropdown.toggle
             {:data-toggle "dropdown", :href "#"}
             "Dropdown "
             [:b.caret]]
            [:ul.dropdown-menu
             [:li [:a {:href "#"} "Action"]]
             [:li [:a {:href "#"} "Another action"]]
             [:li [:a {:href "#"} "Something else here"]]
             [:li.divider]
             [:li [:a {:href "#"} "Separated link"]]]]
           [:li.dropdown
            [:a.dropdown-toggle
             {:data-toggle "dropdown", :href "#"}
             "Dropdown 2 "
             [:b.caret]]
            [:ul.dropdown-menu
             [:li [:a {:href "#"} "Action"]]
             [:li [:a {:href "#"} "Another action"]]
             [:li [:a {:href "#"} "Something else here"]]
             [:li.divider]
             [:li [:a {:href "#"} "Separated link"]]]]]
          [:ul.nav.pull-right
           [:li#fat-menu.dropdown
            [:a.dropdown-toggle
             {:data-toggle "dropdown", :href "#"}
             "Dropdown 3 "
             [:b.caret]]
            [:ul.dropdown-menu
             [:li [:a {:href "#"} "Action"]]
             [:li [:a {:href "#"} "Another action"]]
             [:li [:a {:href "#"} "Something else here"]]
             [:li.divider]
             [:li [:a {:href "#"} "Separated link"]]]]]]]]

       [:ul.nav.nav-pills
        [:li.active [:a {:href "#"} "Regular link"]]
        [:li.dropdown
         [:a.dropdown-toggle
          {:href "#", :data-toggle "dropdown"}
          "Dropdown "
          [:b.caret]]
         [:ul#menu1.dropdown-menu
          [:li [:a {:href "#"} "Action"]]
          [:li [:a {:href "#"} "Another action"]]
          [:li [:a {:href "#"} "Something else here"]]
          [:li.divider]
          [:li [:a {:href "#"} "Separated link"]]]]
        [:li.dropdown
         [:a.dropdown-toggle
          {:href "#", :data-toggle "dropdown"}
          "Dropdown 2 "
          [:b.caret]]
         [:ul#menu2.dropdown-menu
          [:li [:a {:href "#"} "Action"]]
          [:li [:a {:href "#"} "Another action"]]
          [:li [:a {:href "#"} "Something else here"]]
          [:li.divider]
          [:li [:a {:href "#"} "Separated link"]]]]
        [:li.dropdown
         [:a.dropdown-toggle
          {:href "#", :data-toggle "dropdown"}
          "Dropdown 3 "
          [:b.caret]]
         [:ul#menu3.dropdown-menu
          [:li [:a {:href "#"} "Action"]]
          [:li [:a {:href "#"} "Another action"]]
          [:li [:a {:href "#"} "Something else here"]]
          [:li.divider]
          [:li [:a {:href "#"} "Separated link"]]]]]

       [:hr]
       [:h2 "Using bootstrap-dropdown.js"]
       [:p "Call the dropdowns via javascript:"]
       [:pre.prettyprint.linenums "$('.dropdown-toggle').dropdown()"]
       [:h3 "Markup"]
       [:p
        "To quickly add dropdown functionality to any element just add "
        [:code "data-toggle=\"dropdown\""]
        " and any valid bootstrap dropdown will automatically be activated."]
       [:div.alert.alert.info
        [:strong "Heads up!"]
        " You may optionally target a specific dropdown by using "
        [:code "data-target=\"#fat\""]
        " or "
        [:code "href=\"#fat\""]
        ".\n          "]
       [:pre.prettyprint.linenums
        (format-code
         [:ul.nav.nav-pills
          [:li.active [:a {:href "#"} "Regular link"]]
          [:li#menu1.dropdown
           [:a.dropdown-toggle
            {:href "#menu1", :data-toggle "dropdown"}
            "Dropdown"
            [:b.caret]]
           [:ul.dropdown-menu
            [:li [:a {:href "#"} "Action"]]
            [:li [:a {:href "#"} "Another action"]]
            [:li [:a {:href "#"} "Something else here"]]
            [:li.divider]
            [:li [:a {:href "#"} "Separated link"]]]]
          "..."])]
       [:p
        "To keep URLs intact, use the "
        [:code "data-target"]
        " attribute instead of "
        [:code "href=\"#\""]
        "."]
       [:pre.prettyprint.linenums
        (format-code
         [:ul.nav.nav-pills
          [:li.dropdown
           [:a.dropdown-toggle
            {:href "path/to/page.html",
             :data-target "#",
             :data-toggle "dropdown"}
            "Dropdown"
            [:b.caret]]
           [:ul.dropdown-menu "..."]]])
        ]
       [:h3 "Methods"]
       [:h4 "$().dropdown()"]
       [:p
        "A programatic api for activating menus for a given navbar or tabbed
navigation."]]]]

    [:section#scrollspy
     [:div.page-header
      [:h1 "ScrollSpy " [:small "bootstrap-scrollspy.js"]]]
     [:div.row
      [:div.span3.columns
       [:p
        "The ScrollSpy plugin is for automatically updating nav targets based on
scroll position."]
       [:a.btn
        {:target "_blank", :href "assets/js/bootstrap-scrollspy.js"}
        "Download file"]]
      [:div.span9.columns
       [:h2 "Example navbar with scrollspy"]
       [:p
        "Scroll the area below and watch the navigation update. The dropdown sub
items will be highlighted as well. Try it!"]
       [:div#navbarExample.navbar.navbar-static
        [:div.navbar-inner
         [:div.container
          {:style "width: auto;"}
          [:a.brand {:href "#"} "Project Name"]
          [:ul.nav
           [:li [:a {:href "#fat"} "@fat"]]
           [:li [:a {:href "#mdo"} "@mdo"]]
           [:li.dropdown
            [:a.dropdown-toggle
             {:data-toggle "dropdown", :href "#"}
             "Dropdown "
             [:b.caret]]
            [:ul.dropdown-menu
             [:li [:a {:href "#one"} "one"]]
             [:li [:a {:href "#two"} "two"]]
             [:li.divider]
             [:li [:a {:href "#three"} "three"]]]]]]]]
       [:div.scrollspy-example
        {:data-offset "0",
         :data-target "#navbarExample",
         :data-spy "scroll"}
        [:h4#fat "@fat"]
        [:p
         "Ad leggings keytar, brunch id art party dolor labore. Pitchfork yr
enim lo-fi before they sold out qui. Tumblr farm-to-table bicycle rights
whatever. Anim keffiyeh carles cardigan. Velit seitan mcsweeney's photo booth 3
wolf moon irure. Cosby sweater lomo jean shorts, williamsburg hoodie minim qui
you probably haven't heard of them et cardigan trust fund culpa biodiesel wes
anderson aesthetic. Nihil tattooed accusamus, cred irony biodiesel keffiyeh
artisan ullamco consequat."]
        [:h4#mdo "@mdo"]
        [:p
         "Veniam marfa mustache skateboard, adipisicing fugiat velit pitchfork
beard. Freegan beard aliqua cupidatat mcsweeney's vero. Cupidatat four loko
nisi, ea helvetica nulla carles. Tattooed cosby sweater food truck, mcsweeney's
quis non freegan vinyl. Lo-fi wes anderson +1 sartorial. Carles non aesthetic
exercitation quis gentrify. Brooklyn adipisicing craft beer vice keytar
deserunt."]
        [:h4#one "one"]
        [:p
         "Occaecat commodo aliqua delectus. Fap craft beer deserunt skateboard
ea. Lomo bicycle rights adipisicing banh mi, velit ea sunt next level locavore
single-origin coffee in magna veniam. High life id vinyl, echo park consequat
quis aliquip banh mi pitchfork. Vero VHS est adipisicing. Consectetur nisi DIY
minim messenger bag. Cred ex in, sustainable delectus consectetur fanny pack
iphone."]
        [:h4#two "two"]
        [:p
         "In incididunt echo park, officia deserunt mcsweeney's proident master
cleanse thundercats sapiente veniam. Excepteur VHS elit, proident shoreditch +1
biodiesel laborum craft beer. Single-origin coffee wayfarers irure four loko,
cupidatat terry richardson master cleanse. Assumenda you probably haven't heard
of them art party fanny pack, tattooed nulla cardigan tempor ad. Proident wolf
nesciunt sartorial keffiyeh eu banh mi sustainable. Elit wolf voluptate, lo-fi
ea portland before they sold out four loko. Locavore enim nostrud mlkshk
brooklyn nesciunt."]
        [:h4#three "three"]
        [:p
         "Ad leggings keytar, brunch id art party dolor labore. Pitchfork yr
enim lo-fi before they sold out qui. Tumblr farm-to-table bicycle rights
whatever. Anim keffiyeh carles cardigan. Velit seitan mcsweeney's photo booth 3
wolf moon irure. Cosby sweater lomo jean shorts, williamsburg hoodie minim qui
you probably haven't heard of them et cardigan trust fund culpa biodiesel wes
anderson aesthetic. Nihil tattooed accusamus, cred irony biodiesel keffiyeh
artisan ullamco consequat."]
        [:p
         "Keytar twee blog, culpa messenger bag marfa whatever delectus food
truck. Sapiente synth id assumenda. Locavore sed helvetica cliche irony,
thundercats you probably haven't heard of them consequat hoodie gluten-free lo-
fi fap aliquip. Labore elit placeat before they sold out, terry richardson
proident brunch nesciunt quis cosby sweater pariatur keffiyeh ut helvetica
artisan. Cardigan craft beer seitan readymade velit. VHS chambray laboris tempor
veniam. Anim mollit minim commodo ullamco thundercats."]]
       [:hr]
       [:h2 "Using bootstrap-scrollspy.js"]
       [:p "Call the scrollspy via javascript:"]
       [:pre.prettyprint.linenums "$('#navbar').scrollspy()"]
       [:h3 "Markup"]
       [:p
        "To easily add scrollspy behavior to your topbar navigation, just add "
        [:code (format-code {:data-spy "scroll"})]
        " to the element you want to spy on (most typically this would be the
 body)."]
       [:pre.prettyprint.linenums
        (format-code
         [:body {:data-spy "scroll"} "..."])]
       [:div.alert.alert-info
        [:strong "Heads up!"]
        " Navbar links must have resolvable id targets. For example, a "
        [:code
         (format-code
          (link-to "#home" "home"))]
        " must correspond to something in the dom like "
        [:code
         (format-code
          [:div#home])]
        "."]
       [:h3 "Methods"]
       [:h4 ".scrollspy('refresh')"]
       [:p
        "When using scrollspy in conjunction with adding or removing of elements
 from the DOM, you'll need to call the refresh method like so:"]
       [:pre.prettyprint.linenums
        "\n$('[data-spy=\"scroll\"]').each(function () {
  var $spy = $(this).scrollspy('refresh')\n});\n"]
       [:h3 "Options"]
       [:table.table.table-bordered.table-striped
        [:thead
         [:tr
          [:th {:style "width: 100px;"} "Name"]
          [:th {:style "width: 100px;"} "type"]
          [:th {:style "width: 50px;"} "default"]
          [:th "description"]]]
        [:tbody
         [:tr
          [:td "offset"]
          [:td "number"]
          [:td "10"]
          [:td
           "Pixels to offset from top when calculating position of scroll."]]]]
       [:h3 "Events"]
       [:table.table.table-bordered.table-striped
        [:thead
         [:tr
          [:th {:style "width: 150px;"} "Event"]
          [:th "Description"]]]
        [:tbody
         [:tr
          [:td "activate"]
          [:td
           "This event fires whenever a new item becomes activated by the
scrollspy."]]]]]]]

    [:section#tabs
     [:div.page-header
      [:h1 "Togglable tabs " [:small "bootstrap-tab.js"]]]
     [:div.row
      [:div.span3.columns
       [:p
        "This plugin adds quick, dynamic tab and pill functionality for
transitioning through local content."]
       [:a.btn
        {:target "_blank", :href "assets/js/bootstrap-tab.js"}
        "Download file"]]
      [:div.span9.columns
       [:h2 "Example tabs"]
       [:p
        "Click the tabs below to toggle between hidden panes, even via dropdown
menus."]
       [:ul#myTab.nav.nav-tabs
        [:li.active [:a {:data-toggle "tab", :href "#home"} "Home"]]
        [:li [:a {:data-toggle "tab", :href "#profile"} "Profile"]]
        [:li.dropdown
         [:a.dropdown-toggle
          {:data-toggle "dropdown", :href "#"}
          "Dropdown "
          [:b.caret]]
         [:ul.dropdown-menu
          [:li [:a {:data-toggle "tab", :href "#dropdown1"} "@fat"]]
          [:li [:a {:data-toggle "tab", :href "#dropdown2"} "@mdo"]]]]]
       [:div#myTabContent.tab-content
        [:div#home.tab-pane.fade-in.active
         [:p
          "Raw denim you probably haven't heard of them jean shorts Austin.
Nesciunt tofu stumptown aliqua, retro synth master cleanse. Mustache cliche
tempor, williamsburg carles vegan helvetica. Reprehenderit butcher retro
keffiyeh dreamcatcher synth. Cosby sweater eu banh mi, qui irure terry
richardson ex squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis
cardigan american apparel, butcher voluptate nisi qui."]]
        [:div#profile.tab-pane.fade
         [:p
          "Food truck fixie locavore, accusamus mcsweeney's marfa nulla
single-origin coffee squid. Exercitation +1 labore velit, blog sartorial PBR
leggings next level wes anderson artisan four loko farm-to-table craft beer
twee. Qui photo booth letterpress, commodo enim craft beer mlkshk aliquip jean
shorts ullamco ad vinyl cillum PBR. Homo nostrud organic, assumenda labore
aesthetic magna delectus mollit. Keytar helvetica VHS salvia yr, vero magna
velit sapiente labore stumptown. Vegan fanny pack odio cillum wes anderson
8-bit, sustainable jean shorts beard ut DIY ethical culpa terry richardson
biodiesel. Art party scenester stumptown, tumblr butcher vero sint qui sapiente
accusamus tattooed echo park."]]
        [:div#dropdown1.tab-pane.fade
         [:p
          "Etsy mixtape wayfarers, ethical wes anderson tofu before they sold
out mcsweeney's organic lomo retro fanny pack lo-fi farm-to-table readymade.
Messenger bag gentrify pitchfork tattooed craft beer, iphone skateboard locavore
carles etsy salvia banksy hoodie helvetica. DIY synth PBR banksy irony. Leggings
gentrify squid 8-bit cred pitchfork. Williamsburg banh mi whatever gluten-free,
carles pitchfork biodiesel fixie etsy retro mlkshk vice blog. Scenester cred you
probably haven't heard of them, vinyl craft beer blog stumptown. Pitchfork
sustainable tofu synth chambray yr."]]
        [:div#dropdown2.tab-pane.fade
         [:p
          "Trust fund seitan letterpress, keytar raw denim keffiyeh etsy art
party before they sold out master cleanse gluten-free squid scenester freegan
cosby sweater. Fanny pack portland seitan DIY, art party locavore wolf cliche
high life echo park Austin. Cred vinyl keffiyeh DIY salvia PBR, banh mi before
they sold out farm-to-table VHS viral locavore cosby sweater. Lomo wolf viral,
mustache readymade thundercats keffiyeh craft beer marfa ethical. Wolf salvia
freegan, sartorial keffiyeh echo park vegan."]]]
       [:hr]
       [:h2 "Using bootstrap-tab.js"]
       [:p
        "Enable tabbable tabs via javascript (each tab needs to be activated
individually):"]
       [:pre.prettyprint.linenums
        "\n$('#myTab a').click(function (e) {
  e.preventDefault();\n  $(this).tab('show');\n})"]
       [:p "You can activate individual tabs in several ways:"]
       [:pre.prettyprint.linenums
        "\n$('#myTab a[href=\"#profile\"]').tab('show'); // Select tab by name
$('#myTab a:first').tab('show'); // Select first tab
$('#myTab a:last').tab('show'); // Select last tab
$('#myTab li:eq(2) a').tab('show'); // Select third tab (0-indexed)\n"]
       [:h3 "Markup"]
       [:p
        "You can activate a tab or pill navigation without writing any
javascript by simply specifying "
        [:code
         (format-code {:data-toggle "tab"})]
        " or "
        [:code
         (format-code {:data-toggle "pill"})]
        " on an element. Adding the "
        [:code "nav"]
        " and "
        [:code "nav-tabs"]
        " classes to the tab "
        [:code "ul"]
        " will apply the bootstrap tab styling."]
       [:pre.prettyprint.linenums
        (format-code
         [:ul.nav.nav-tabs
          [:li [:a {:data-toggle "tab", :href "#home"} "Home"]]
          [:li [:a {:data-toggle "tab", :href "#profile"} "Profile"]]
          [:li [:a {:data-toggle "tab", :href "#messages"} "Messages"]]
          [:li [:a {:data-toggle "tab", :href "#settings"} "Settings"]]])]
       [:h3 "Methods"]
       [:h4 "$().tab"]
       [:p
        "Activates a tab element and content container. Tab should have either
a "
        [:code "data-target"]
        " or an "
        [:code "href"]
        " targeting a container node in the DOM."]
       [:pre.prettyprint.linenums
        (format-code
         [:ul#myTab.nav.nav-tabs
          [:li.active [:a {:href "#home"} "Home"]]
          [:li [:a {:href "#profile"} "Profile"]]
          [:li [:a {:href "#messages"} "Messages"]]
          [:li [:a {:href "#settings"} "Settings"]]])
        "\n"
        (format-code
         [:div.tab-content
          [:div#home.tab.pane.active "..."]
          [:div#profile.tab.pane "..."]
          [:div#messages.tab.pane "..."]
          [:div#settings.tab.pane "..."]])
        "\n"
        (format-code
         [:script
          "$(function () {
    $('#myTab a:last').tab('show');
    })"])]
       [:h3 "Events"]
       [:table.table.table-bordered.table-striped
        [:thead
         [:tr
          [:th {:style "width: 150px;"} "Event"]
          [:th "Description"]]]
        [:tbody
         [:tr
          [:td "show"]
          [:td
           "This event fires on tab show, but before the new tab has been shown.
Use "
           [:code "event.target"]
           " and "
           [:code "event.relatedTarget"]
           " to target the active tab and the previous active tab (if available)
respectively."]]
         [:tr
          [:td "shown"]
          [:td
           "This event fires on tab show after a tab has been shown. Use "
           [:code "event.target"]
           " and "
           [:code "event.relatedTarget"]
           " to target the active tab and the previous active tab (if available)
respectively."]]]]
       [:pre.prettyprint.linenums
        "\n$('a[data-toggle=\"tab\"]').on('shown', function (e) {
  e.target // activated tab
  e.relatedTarget // previous tab\n})"]]]]

    [:section#tooltips
     [:div.page-header
      [:h1 "Tooltips " [:small "bootstrap-tooltip.js"]]]
     [:div.row
      [:div.span3.columns
       [:h3 "About Tooltips"]
       [:p
        "Inspired by the excellent jQuery.tipsy plugin written by Jason Frame;
Tooltips are an updated version, which don't rely on images, use css3 for
animations, and data-attributes for local title storage."]
       [:a.btn
        {:target "_blank", :href "assets/js/bootstrap-tooltip.js"}
        "Download file"]]
      [:div.span9.columns
       [:h2 "Example use of Tooltips"]
       [:p "Hover over the links below to see tooltips:"]
       [:div.tooltip-demo.well
        [:p.muted
         {:style "margin-bottom: 0;"}
         "Tight pants next level keffiyeh "
         [:a
          {:title "first tooltip", :rel "tooltip", :href "#"}
          "you probably"]
         " haven't heard of them. Photo booth beard raw denim letterpress vegan
messenger bag stumptown. Farm-to-table seitan, mcsweeney's fixie sustainable
quinoa 8-bit american apparel "
         [:a
          {:title "Another tooltip", :rel "tooltip", :href "#"}
          "have a"]
         " terry richardson vinyl chambray. Beard stumptown, cardigans banh mi
lomo thundercats. Tofu biodiesel williamsburg marfa, four loko mcsweeney's
cleanse vegan chambray. A really ironic artisan "
         [:a
          {:title "Another one here too", :rel "tooltip", :href "#"}
          "whatever keytar"]
         ", scenester farm-to-table banksy Austin "
         [:a
          {:title "The last tip!", :rel "tooltip", :href "#"}
          "twitter handle"]
         " freegan cred raw denim single-origin coffee viral."]]
       [:hr]
       [:h2 "Using bootstrap-tooltip.js"]
       [:p "Trigger the tooltip via javascript:"]
       [:pre.prettyprint.linenums "$('#example').tooltip(options)"]
       [:h3 "Options"]
       [:table.table.table-bordered.table-striped
        [:thead
         [:tr
          [:th {:style "width: 100px;"} "Name"]
          [:th {:style "width: 100px;"} "type"]
          [:th {:style "width: 50px;"} "default"]
          [:th "description"]]]
        [:tbody
         [:tr
          [:td "animation"]
          [:td "boolean"]
          [:td "true"]
          [:td "apply a css fade transition to the tooltip"]]
         [:tr
          [:td "placement"]
          [:td "string|function"]
          [:td "'top'"]
          [:td
           "how to position the tooltip - top | bottom | left | right"]]
         [:tr
          [:td "selector"]
          [:td "string"]
          [:td "false"]
          [:td
           "If a selector is provided, tooltip objects will be delegated to the
specified targets."]]
         [:tr
          [:td "title"]
          [:td "string | function"]
          [:td "''"]
          [:td "default title value if `title` tag isn't present"]]
         [:tr
          [:td "trigger"]
          [:td "string"]
          [:td "'hover'"]
          [:td "how tooltip is triggered - hover | focus | manual"]]
         [:tr
          [:td "delay"]
          [:td "number | object"]
          [:td "0"]
          [:td
           [:p
            "delay showing and hiding the tooltip (ms) - does not apply to
manual trigger type"]
           [:p
            "If a number is supplied, delay is applied to both hide/show"]
           [:p
            "Object structure is: "
            [:code "delay: { show: 500, hide: 100 }"]]]]]]
       [:div.alert.alert-info
        [:strong "Heads up!"]
        " Options for individual tooltips can alternatively be specified through
the use of data attributes."]
       [:h3 "Markup"]
       [:p
        "For performance reasons, the Tooltip and Popover data-apis are opt in.
If you would like to use them just specify a selector option."]
       [:pre.prettyprint.linenums
        (format-code
         [:a {:href "#" :rel "tooltip" :title "first tooltip"}
          "hover over me"]) ]
       [:h3 "Methods"]
       [:h4 "$().tooltip(options)"]
       [:p "Attaches a tooltip handler to an element collection."]
       [:h4 ".tooltip('show')"]
       [:p "Reveals an element's tooltip."]
       [:pre.prettyprint.linenums "$('#element').tooltip('show')"]
       [:h4 ".tooltip('hide')"]
       [:p "Hides an element's tooltip."]
       [:pre.prettyprint.linenums "$('#element').tooltip('hide')"]
       [:h4 ".tooltip('toggle')"]
       [:p "Toggles an element's tooltip."]
       [:pre.prettyprint.linenums "$('#element').tooltip('toggle')"]]]]

    [:section#popovers
     [:div.page-header
      [:h1 "Popovers " [:small "bootstrap-popover.js"]]]
     [:div.row
      [:div.span3.columns
       [:h3 "About popovers"]
       [:p
        "Add small overlays of content, like those on the iPad, to any element
for housing secondary information."]
       [:p.muted
        [:strong "*"]
        " Requires "
        [:a {:href "#tooltips"} "Tooltip"]
        " to be included"]
       [:a.btn
        {:target "_blank", :href "assets/js/bootstrap-popover.js"}
        "Download file"]]
      [:div.span9.columns
       [:h2 "Example hover popover"]
       [:p "Hover over the button to trigger the popover."]
       [:div.well
        [:a.btn.btn-danger
         {:data-content
          "And here's some amazing content. It's very engaging. right?",
          :title "A Title",
          :rel "popover",
          :href "#"}
         "hover for popover"]]
       [:hr]
       [:h2 "Using bootstrap-popover.js"]
       [:p "Enable popovers via javascript:"]
       [:pre.prettyprint.linenums "$('#example').popover(options)"]
       [:h3 "Options"]
       [:table.table.table-bordered.table-striped
        [:thead
         [:tr
          [:th {:style "width: 100px;"} "Name"]
          [:th {:style "width: 100px;"} "type"]
          [:th {:style "width: 50px;"} "default"]
          [:th "description"]]]
        [:tbody
         [:tr
          [:td "animation"]
          [:td "boolean"]
          [:td "true"]
          [:td "apply a css fade transition to the tooltip"]]
         [:tr
          [:td "placement"]
          [:td "string|function"]
          [:td "'right'"]
          [:td
           "how to position the popover - top | bottom | left | right"]]
         [:tr
          [:td "selector"]
          [:td "string"]
          [:td "false"]
          [:td
           "if a selector is provided, tooltip objects will be delegated to the
specified targets"]]
         [:tr
          [:td "trigger"]
          [:td "string"]
          [:td "'hover'"]
          [:td "how tooltip is triggered - hover | focus | manual"]]
         [:tr
          [:td "title"]
          [:td "string | function"]
          [:td "''"]
          [:td
           "default title value if `title` attribute isn't present"]]
         [:tr
          [:td "content"]
          [:td "string | function"]
          [:td "''"]
          [:td
           "default content value if `data-content` attribute isn't present"]]
         [:tr
          [:td "delay"]
          [:td "number | object"]
          [:td "0"]
          [:td
           [:p
            "delay showing and hiding the popover (ms) - does not apply to
manual trigger type"]
           [:p
            "If a number is supplied, delay is applied to both hide/show"]
           [:p
            "Object structure is: "
            [:code "delay: { show: 500, hide: 100 }"]]]]]]
       [:div.alert.alert-info
        [:strong "Heads up!"]
        " Options for individual popovers can alternatively be specified through
the use of data attributes."]
       [:h3 "Markup"]
       [:p
        "For performance reasons, the Tooltip and Popover data-apis are opt in.
If you would like to use them just specify a selector option."]
       [:h3 "Methods"]
       [:h4 "$().popover(options)"]
       [:p "Initializes popovers for an element collection."]
       [:h4 ".popover('show')"]
       [:p "Reveals an elements popover."]
       [:pre.prettyprint.linenums "$('#element').popover('show')"]
       [:h4 ".popover('hide')"]
       [:p "Hides an elements popover."]
       [:pre.prettyprint.linenums "$('#element').popover('hide')"]
       [:h4 ".popover('toggle')"]
       [:p "Toggles an elements popover."]
       [:pre.prettyprint.linenums "$('#element').popover('toggle')"]]]]

    [:section#alerts
     [:div.page-header
      [:h1 "Alert messages " [:small "bootstrap-alert.js"]]]
     [:div.row
      [:div.span3.columns
       [:h3 "About alerts"]
       [:p
        "The alert plugin is a tiny class for adding close functionality to
alerts."]
       [:a.btn
        {:target "_blank", :href "assets/js/bootstrap-alert.js"}
        "Download"]]
      [:div.span9.columns
       [:h2 "Example alerts"]
       [:p
        "The alerts plugin works on regular alert messages, and block
messages."]
       [:div.alert.fade-in
        [:button.close {:data-dismiss "alert", :type "button"} "×"]
        [:strong "Holy guacamole!"]
        " Best check yo self, you're not looking too good.\n          "]
       [:div.alert.alert-block.alert-error.fade-in
        [:button.close {:data-dismiss "alert", :type "button"} "×"]
        [:h4.alert-heading "Oh snap! You got an error!"]
        [:p
         "Change this and that and try again. Duis mollis, est non commodo
luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Cras mattis
consectetur purus sit amet fermentum."]
        [:p
         [:a.btn.btn-danger {:href "#"} "Take this action"]
         " "
         [:a.btn {:href "#"} "Or do this"]]]
       [:hr]
       [:h2 "Using bootstrap-alert.js"]
       [:p "Enable dismissal of an alert via javascript:"]
       [:pre.prettyprint.linenums "$(\".alert\").alert()"]
       [:h3 "Markup"]
       [:p
        "Just add "
        [:code
         (format-code
          {:data-dismiss "alert"})]
        " to your close button to automatically give an alert close
functionality."]
       [:pre.prettyprint.linenums
        (format-code
         [:a.close {:data-dismiss "alert" :href "#"} "×"])]
       [:h3 "Methods"]
       [:h4 "$().alert()"]
       [:p
        "Wraps all alerts with close functionality. To have your alerts animate
out when closed, make sure they have the "
        [:code ".fade"]
        " and "
        [:code ".in"]
        " class already applied to them."]
       [:h4 ".alert('close')"]
       [:p "Closes an alert."]
       [:pre.prettyprint.linenums "$(\".alert\").alert('close')"]
       [:h3 "Events"]
       [:p
        "Bootstrap's alert class exposes a few events for hooking into alert
functionality."]
       [:table.table.table-bordered.table-striped
        [:thead
         [:tr
          [:th {:style "width: 150px;"} "Event"]
          [:th "Description"]]]
        [:tbody
         [:tr
          [:td "close"]
          [:td
           "This event fires immediately when the "
           [:code "close"]
           " instance method is called."]]
         [:tr
          [:td "closed"]
          [:td
           "This event is fired when the alert has been closed (will wait for
css transitions to complete)."]]]]
       [:pre.prettyprint.linenums
        "\n$('#my-alert').bind('closed', function () {
  // do something…\n})"]]]]

    [:section#buttons
     [:div.page-header [:h1 "Buttons " [:small "bootstrap-button.js"]]]
     [:div.row
      [:div.span3.columns
       [:h3 "About"]
       [:p
        "Do more with buttons. Control button states or create groups of buttons
for more components like toolbars."]
       [:a.btn
        {:target "_blank", :href "assets/js/bootstrap-button.js"}
        "Download file"]]
      [:div.span9.columns
       [:h2 "Example uses"]
       [:p "Use the buttons plugin for states and toggles."]
       [:table.table.table-bordered.table-striped
        [:tbody
         [:tr
          [:td "Stateful"]
          [:td
           [:button#fat-btn.btn.btn-primary
            {:data-loading-text "loading..."}
            "Loading State"]]]
         [:tr
          [:td "Single toggle"]
          [:td
           [:button.btn.btn-primary
            {:data-toggle "button"}
            "Single Toggle"]]]
         [:tr
          [:td "Checkbox"]
          [:td
           [:div.btn-group
            {:data-toggle "buttons-checkbox"}
            [:button.btn.btn-primary "Left"]
            [:button.btn.btn-primary "Middle"]
            [:button.btn.btn-primary "Right"]]]]
         [:tr
          [:td "Radio"]
          [:td
           [:div.btn-group
            {:data-toggle "buttons-radio"}
            [:button.btn.btn-primary "Left"]
            [:button.btn.btn-primary "Middle"]
            [:button.btn.btn-primary "Right"]]]]]]
       [:hr]
       [:h2 "Using bootstrap-button.js"]
       [:p "Enable buttons via javascript:"]
       [:pre.prettyprint.linenums "$('.nav-tabs').button()"]
       [:h3 "Markup"]
       [:p
        "Data attributes are integral to the button plugin. Check out the
example code below for the various markup types."]
       [:pre.prettyprint.linenums
        (format-code
         (comment
           "Add {:data-toggle \"button\"} to activate toggling on a
 single button"))
        "\n\n"
        (format-code
         [:button.btn {:data-toggle "button"} "Single Toggle"])
        "\n\n"
        (format-code
         (comment
           "Add {:data-toggle \"buttons-checkbox\"}
for checkbox style toggling on btn-group"))
        "\n\n"
        (format-code
         [:div.btn-group
          {:data-toggle "buttons-checkbox"}
          [:button.btn "Left"]
          [:button.btn "Middle"]
          [:button.btn "Right"]])
        "\n\n"
        (format-code
         (comment
           "Add {:data-toggle \"buttons-radio\"}
 for radio style toggling on btn-group"))
        "\n\n"
        (format-code
         [:div.btn-group
          {:data-toggle "buttons-radio"}
          [:button.btn "Left"]
          [:button.btn "Middle"]
          [:button.btn "Right"]])]
       [:h3 "Methods"]
       [:h4 "$().button('toggle')"]
       [:p
        "Toggles push state. Gives the button the appearance that it has been
activated."]
       [:div.alert.alert-info
        [:strong "Heads up!"]
        " You can enable auto toggling of a button by using the "
        [:code ":data-toggle"]
        " attribute.\n          "]
       [:pre.prettyprint.linenums
        (format-code
         [:button.btn {:data-toggle "button"} "…"])]
       [:h4 "$().button('loading')"]
       [:p
        "Sets button state to loading - disables button and swaps text to
loading text. Loading text should be defined on the button element using the
data attribute "
        [:code ":data-loading-text"]
        ".\n          "]
       [:pre.prettyprint.linenums
        (format-code
         [:button.btn {:data-loading-text "loading stuff..."} "…"])]
       [:div.alert.alert-info
        [:strong "Heads up!"]
        [:a
         {:href "https://github.com/twitter/bootstrap/issues/793"}
         " Firefox persists the disabled state across page loads"]
        ". A workaround for this is to use "
        [:code "{:autocomplete \"off\"}"]
        ".\n          "]
       [:h4 "$().button('reset')"]
       [:p "Resets button state - swaps text to original text."]
       [:h4 "$().button(string)"]
       [:p
        "Resets button state - swaps text to any data defined text state."]
       [:pre.prettyprint.linenums
        (format-code
         [:button.btn {:data-complete-text "finished!..."} "…"])]]]]

    [:section#collapse
     [:div.page-header
      [:h1 "Collapse " [:small "bootstrap-collapse.js"]]]
     [:div.row
      [:div.span3.columns
       [:h3 "About"]
       [:p
        "Get base styles and flexible support for collapsible components like
accordions and navigation."]
       [:a.btn
        {:target "_blank", :href "assets/js/bootstrap-collapse.js"}
        "Download file"]
       [:p.muted
        [:strong "*"]
        " Requires the Transitions plugin to be included."]]
      [:div.span9.columns
       [:h2 "Example accordion"]
       [:p
        "Using the collapse plugin, we built a simple accordion style widget:"]
       [:div#accordion2.accordion
        [:div.accordion-group
         [:div.accordion-heading
          [:a.accordion-toggle
           {:href "#collapseOne",
            :data-parent "#accordion2",
            :data-toggle "collapse"}
           "Collapsible Group Item #1"]]
         [:div#collapseOne.accordion-body.collapse-in
          [:div.accordion-inner
           "Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS."]]]
        [:div.accordion-group
         [:div.accordion-heading
          [:a.accordion-toggle
           {:href "#collapseTwo",
            :data-parent "#accordion2",
            :data-toggle "collapse"}
           "Collapsible Group Item #2"]]
         [:div#collapseTwo.accordion-body.collapse
          [:div.accordion-inner
           "Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS."]]]
        [:div.accordion-group
         [:div.accordion-heading
          [:a.accordion-toggle
           {:href "#collapseThree",
            :data-parent "#accordion2",
            :data-toggle "collapse"}
           "Collapsible Group Item #3"]]
         [:div#collapseThree.accordion-body.collapse
          [:div.accordion-inner
           "Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS."]]]]
       [:hr]
       [:h2 "Using bootstrap-collapse.js"]
       [:p "Enable via javascript:"]
       [:pre.prettyprint.linenums "$(\".collapse\").collapse()"]
       [:h3 "Options"]
       [:table.table.table-bordered.table-striped
        [:thead
         [:tr
          [:th {:style "width: 100px;"} "Name"]
          [:th {:style "width: 50px;"} "type"]
          [:th {:style "width: 50px;"} "default"]
          [:th "description"]]]
        [:tbody
         [:tr
          [:td "parent"]
          [:td "selector"]
          [:td "false"]
          [:td
           "If selector then all collapsible elements under the specified parent will be closed when this collapsible item is shown. (similar to traditional accordion behavior)"]]
         [:tr
          [:td "toggle"]
          [:td "boolean"]
          [:td "true"]
          [:td "Toggles the collapsible element on invocation"]]]]
       [:h3 "Markup"]
       [:p
        "Just add "
        [:code
         (format-code {:data-toggle "collapse"})]
        " and a "
        [:code "data-target"]
        " to element to automatically assign control of a collapsible element.
The "
        [:code "data-target"]
        " attribute accepts a css selector to apply the collapse to. Be sure to
add the class "
        [:code "collapse"]
        " to the collapsible element. If you'd like it to default open, add the
additional class "
        [:code "in"]
        "."]
       [:pre.prettyprint.linenums
        (format-code
         [:button.btn.btn-danger
          {:data-target "#demo", :data-toggle "collapse"}
          "simple collapsible"])
        "\n\n"
        (format-code
         [:div#demo.collapse-in "…"])]
       [:div.alert.alert-info
        [:strong "Heads up!"]
        " To add accordion-like group management to a collapsible control, add
the data attribute "
        [:code (format-code {:data-parent "#selector"})]
        ". Refer to the demo to see this in action."]
       [:h3 "Methods"]
       [:h4 ".collapse(options)"]
       [:p
        "Activates your content as a collapsible element. Accepts an optional
options "
        [:code "object"]
        ".\n"]
       [:pre.prettyprint.linenums
        "\n$('#myCollapsible').collapse({\n  toggle: false\n})"]
       [:h4 ".collapse('toggle')"]
       [:p "Toggles a collapsible element to shown or hidden."]
       [:h4 ".collapse('show')"]
       [:p "Shows a collapsible element."]
       [:h4 ".collapse('hide')"]
       [:p "Hides a collapsible element."]
       [:h3 "Events"]
       [:p
        "Bootstrap's collapse class exposes a few events for hooking into
collapse functionality."]
       [:table.table.table-bordered.table-striped
        [:thead
         [:tr
          [:th {:style "width: 150px;"} "Event"]
          [:th "Description"]]]
        [:tbody
         [:tr
          [:td "show"]
          [:td
           "This event fires immediately when the "
           [:code "show"]
           " instance method is called."]]
         [:tr
          [:td "shown"]
          [:td
           "This event is fired when a collapse element has been made visible to
the user (will wait for css transitions to complete)."]]
         [:tr
          [:td "hide"]
          [:td
           "This event is fired immediately when the "
           [:code "hide"]
           " method has been called."]]
         [:tr
          [:td "hidden"]
          [:td
           "This event is fired when a collapse element has been hidden from the
user (will wait for css transitions to complete)."]]]]
       [:pre.prettyprint.linenums
        "\n$('#myCollapsible').on('hidden', function () {
  // do something…\n})"]]]]

    [:section#carousel
     [:div.page-header
      [:h1 "Carousel " [:small "bootstrap-carousel.js"]]]
     [:div.row
      [:div.span3.columns
       [:h3 "About"]
       [:p
        "A generic plugin for cycling through elements. A merry-go-round."]
       [:a.btn
        {:target "_blank", :href "assets/js/bootstrap-carousel.js"}
        "Download file"]]
      [:div.span9.columns
       [:h2 "Example carousel"]
       [:p "Watch the slideshow below."]
       [:div#myCarousel.carousel.slide
        [:div.carousel-inner
         [:div.item.active
          [:img
           {:alt "", :src "assets/img/bootstrap-mdo-sfmoma-01.jpg"}]
          [:div.carousel-caption
           [:h4 "First Thumbnail label"]
           [:p
            "Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec
id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies
vehicula ut id elit."]]]
         [:div.item
          [:img
           {:alt "", :src "assets/img/bootstrap-mdo-sfmoma-02.jpg"}]
          [:div.carousel-caption
           [:h4 "Second Thumbnail label"]
           [:p
            "Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec
id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies
vehicula ut id elit."]]]
         [:div.item
          [:img
           {:alt "", :src "assets/img/bootstrap-mdo-sfmoma-03.jpg"}]
          [:div.carousel-caption
           [:h4 "Third Thumbnail label"]
           [:p
            "Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec
id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies
vehicula ut id elit."]]]]
        [:a.left.carousel-control
         {:data-slide "prev", :href "#myCarousel"}
         "‹"]
        [:a.right.carousel-control
         {:data-slide "next", :href "#myCarousel"}
         "›"]]
       [:div.alert.alert-info
        [:strong "Heads up!"]
        "When implementing this carousel, remove the images we have provided and
replace them with your own."]
       [:hr]
       [:h2 "Using bootstrap-carousel.js"]
       [:p "Call via javascript:"]
       [:pre.prettyprint.linenums "$('.carousel').carousel()"]
       [:h3 "Options"]
       [:table.table.table-bordered.table-striped
        [:thead
         [:tr
          [:th {:style "width: 100px;"} "Name"]
          [:th {:style "width: 50px;"} "type"]
          [:th {:style "width: 50px;"} "default"]
          [:th "description"]]]
        [:tbody
         [:tr
          [:td "interval"]
          [:td "number"]
          [:td "5000"]
          [:td
           "The amount of time to delay between automatically cycling an item.
If false, carousel will not automatically cycle."]]
         [:tr
          [:td "pause"]
          [:td "string"]
          [:td "\"hover\""]
          [:td
           "Pauses the cycling of the carousel on mouseenter and resumes the
cycling of the carousel on mouseleave."]]]]
       [:h3 "Markup"]
       [:p
        "Data attributes are used for the previous and next conrols. Check out
the example markup below."]
       [:pre.prettyprint.linenums
        (format-code
         [:div#myCarousel.carousel.slide
          (comment "Carousel items")
          [:div.carousel-inner
           [:div.active.item "…"]
           [:div.item "…"]
           [:div.item "…"]]
          (comment "Carousel nav")
          [:a.carousel-control.left
           {:data-slide "prev", :href "#myCarousel"}
           "‹"]
          [:a.carousel-control.right
           {:data-slide "next", :href "#myCarousel"}
           "›"]])]
       [:h3 "Methods"]
       [:h4 ".carousel(options)"]
       [:p
        "Initializes the carousel with an optional options "
        [:code "object"]
        " and starts cycling through items."]
       [:pre.prettyprint.linenums
        "\n$('.carousel').carousel({\n  interval: 2000\n})\n"]
       [:h4 ".carousel('cycle')"]
       [:p "Cycles through the carousel items from left to right."]
       [:h4 ".carousel('pause')"]
       [:p "Stops the carousel from cycling through items."]
       [:h4 ".carousel(number)"]
       [:p
        "Cycles the carousel to a particular frame (0 based, similar to an
array)."]
       [:h4 ".carousel('prev')"]
       [:p "Cycles to the previous item."]
       [:h4 ".carousel('next')"]
       [:p "Cycles to the next item."]
       [:h3 "Events"]
       [:p
        "Bootstrap's carousel class exposes two events for hooking into carousel
functionality."]
       [:table.table.table-bordered.table-striped
        [:thead
         [:tr
          [:th {:style "width: 150px;"} "Event"]
          [:th "Description"]]]
        [:tbody
         [:tr
          [:td "slide"]
          [:td
           "This event fires immediately when the "
           [:code "slide"]
           " instance method is invoked."]]
         [:tr
          [:td "slid"]
          [:td
           "This event is fired when the carousel has completed its slide
transition."]]]]]]]

    [:section#typeahead
     [:div.page-header
      [:h1 "Typeahead " [:small "bootstrap-typeahead.js"]]]
     [:div.row
      [:div.span3.columns
       [:h3 "About"]
       [:p
        "A basic, easily extended plugin for quickly creating elegant typeaheads
with any form text input."]
       [:a.btn
        {:target "_blank", :href "assets/js/bootstrap-typeahead.js"}
        "Download file"]]
      [:div.span9.columns
       [:h2 "Example"]
       [:p
        "Start typing in the field below to show the typeahead results."]
       [:div.well
        [:input.span3
         {:data-source
          (typeahead-data
           ["Alaska" "Arizona" "Arkansas" "California" "Colorado" "Connecticut"
            "Delaware" "Florida" "Georgia" "Hawaii" "Idaho" "Illinois" "Indiana"
            "Iowa" "Kansas" "Kentucky" "Louisiana" "Maine" "Maryland"
            "Massachusetts" "Michigan" "Minnesota" "Mississippi" "Missouri"
            "Montana" "Nebraska" "Nevada" "New Hampshire" "New Jersey"
            "New Mexico" "New York" "North Dakota" "North Carolina" "Ohio"
            "Oklahoma" "Oregon" "Pennsylvania" "Rhode Island" "South Carolina"
            "South Dakota" "Tennessee" "Texas" "Utah" "Vermont" "Virginia"
            "Washington" "West Virginia" "Wisconsin" "Wyoming"])
          :data-items "4",
          :data-provide "typeahead",
          :style "margin: 0 auto;",
          :type "text"}]]
       [:hr]
       [:h2 "Using bootstrap-typeahead.js"]
       [:p "Call the typeahead via javascript:"]
       [:pre.prettyprint.linenums "$('.typeahead').typeahead()"]
       [:h3 "Options"]
       [:table.table.table-bordered.table-striped
        [:thead
         [:tr
          [:th {:style "width: 100px;"} "Name"]
          [:th {:style "width: 50px;"} "type"]
          [:th {:style "width: 100px;"} "default"]
          [:th "description"]]]
        [:tbody
         [:tr
          [:td "source"]
          [:td "array"]
          [:td "[ ]"]
          [:td "The data source to query against."]]
         [:tr
          [:td "items"]
          [:td "number"]
          [:td "8"]
          [:td "The max number of items to display in the dropdown."]]
         [:tr
          [:td "matcher"]
          [:td "function"]
          [:td "case insensitive"]
          [:td
           "The method used to determine if a query matches an item. Accepts a
single argument, the "
           [:code "item"]
           " against which to test the query. Access the current query with "
           [:code "this.query"]
           ". Return a boolean "
           [:code "true"]
           " if query is a match."]]
         [:tr
          [:td "sorter"]
          [:td "function"]
          [:td
           "exact match,"
           [:br]
           " case sensitive,"
           [:br]
           " case insensitive"]
          [:td
           "Method used to sort autocomplete results. Accepts a single
argument "
           [:code "items"]
           " and has the scope of the typeahead instance. Reference the current
query with "
           [:code "this.query"]
           "."]]
         [:tr
          [:td "highlighter"]
          [:td "function"]
          [:td "highlights all default matches"]
          [:td
           "Method used to highlight autocomplete results. Accepts a single
argument "
           [:code "item"]
           " and has the scope of the typeahead instance. Should return
html."]]]]
       [:h3 "Markup"]
       [:p
        "Add data attributes to register an element with typeahead
functionality."]
       [:pre.prettyprint.linenums
        (format-code
         (text-field {:data-provide "typeahead"} "field-name"))]
       [:h3 "Methods"]
       [:h4 ".typeahead(options)"]
       [:p "Initializes an input with a typeahead."]]]]

    footer]))

(defpage "/javascript" []
  (layout "Javascript"
          :all :all
          content))

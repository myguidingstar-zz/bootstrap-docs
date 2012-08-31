(ns bootstrap-docs.views.base-css.code
  (:use [hiccup.core]
        [hiccup.element]
        [hiccup.form]
        [hiccup.page]
        [hiccup.bootstrap]
        ))

(def code
  [:section#code
     [:div.page-header
      [:h1 "Code " [:small "Inline and block code snippets"]]]
     [:div.row
      [:div.span4
       [:h2 "Inline"]
       [:p "Wrap inline snippets of code with " [:code "[:code]"] "."]
       [:pre.prettyprint.linenums
        "For example, [:code \"section\"] should be wrapped as inline."]]

      [:div.span4
       [:h2 "Basic block"]
       [:p
        "Use "
        [:code "[:pre]"]
        " for multiple lines of code.
Be sure to escape any angle brackets in the code for proper rendering."]

       [:pre (format-code [:p "Sample text here..."])]
       [:pre.prettyprint.linenums
        {:style "margin-bottom: 9px;"}
        (format-code
         [:pre (format-code [:p "Sample text here..."])])]

       [:p
        [:strong "Note:"]
        " Be sure to keep code within "
        [:code "[:pre]"]
        " tags as close to the left as possible; it will render all tabs."]
       [:p
        "You may optionally add the "
        [:code ".pre-scrollable"]
        " class which will set a max-height of 350px
and provide a y-axis scrollbar."]]

      [:div.span4
       [:h2 "Google Prettify"]
       [:p
        "Take the same "
        [:code "[:pre]"]
        " element and add two optional classes for enhanced rendering."]
       [:pre.prettyprint.linenums
        {:style "margin-bottom: 9px;"}
        (format-code [:p "Sample text here..."])]
       [:pre.prettyprint.linenums
        {:style "margin-bottom: 9px;"}
        (format-code
         [:pre.prettyprint.linenums
          (format-code [:p "Sample text here..."])])]
       [:p
        [:a
         {:href "http://code.google.com/p/google-code-prettify/"}
         "Download google-code-prettify"]
        " and view the readme for "
        [:a
         {:href
          "http://google-code-prettify.googlecode.com/svn/trunk/README.html"}
         "how to use"]
        "."]]
      ]])
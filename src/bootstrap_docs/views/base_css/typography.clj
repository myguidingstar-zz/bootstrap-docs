(ns bootstrap-docs.views.base-css.typography
  (:use [hiccup.core]
        [hiccup.element]
        [hiccup.form]
        [hiccup.page]
        [hiccup.bootstrap]
        ))

(def typography
  [:section#typography
     [:div.page-header
      [:h1 "Typography "
       [:small
        "Headings, paragraphs, lists, and other inline type elements"]]]
     [:h2 "Headings & body copy"]

     [:div.row
      [:div.span4
       [:h3 "Typographic scale"]
       [:p
        "The entire typographic grid is based on two Less variables
 in our variables.less file: "
        [:code "@baseFontSize"]
        " and "
        [:code "@baseLineHeight"]
        ". The first is the base font-size used throughout
 and the second is the base line-height."]
       [:p
        "We use those variables, and some math, to create the margins,
 paddings, and line-heights of all our type and more."]]
      [:div.span4
       [:h3 "Example body text"]
       [:p
        "Nullam quis risus eget urna mollis ornare vel eu leo.
 Cum sociis natoque penatibus et magnis dis parturient montes,
 nascetur ridiculus mus. Nullam id dolor id nibh ultricies vehicula."]
       [:h3 "Lead body copy"]
       [:p "Make a paragraph stand out by adding " [:code ".lead"] "."]
       [:p.lead
        "Vivamus sagittis lacus vel augue laoreet rutrum
faucibus dolor auctor. Duis mollis, est non commodo luctus."]]
      [:div.span4
       [:div.well
        [:h1 "h1. Heading 1"]
        [:h2 "h2. Heading 2"]
        [:h3 "h3. Heading 3"]
        [:h4 "h4. Heading 4"]
        [:h5 "h5. Heading 5"]
        [:h6 "h6. Heading 6"]]]]

     [:h2 "Emphasis, address, and abbreviation"]
     [:table.table.table-bordered.table-striped
      [:thead [:tr [:th "Element"] [:th "Usage"] [:th "Optional"]]]
      [:tbody
       [:tr
        [:td [:code "[:strong]"]]
        [:td
         "For emphasizing a snippet of text with "
         [:strong "important"]]
        [:td [:span.muted "None"]]]
       [:tr
        [:td [:code "[:em]"]]
        [:td
         "For emphasizing a snippet of text with "
         [:em "stress"]]
        [:td [:span.muted "None"]]]
       [:tr
        [:td [:code "[:abbr]"]]
        [:td
         "Wraps abbreviations and acronyms to show
the expanded version on hover"]
        [:td
         [:p
          "Include optional "
          [:code "title"]
          " attribute for expanded text"]
         "Use " [:code ".initialism"]
         " class for uppercase abbreviations."]]
       [:tr
        [:td [:code "[:address]"]]
        [:td
         "For contact information for its nearest
ancestor or the entire body of work"]
        [:td
         "Preserve formatting by ending all lines with "
         [:code "[:br]"]]]]]
     [:div.row
      [:div.span4
       [:h3 "Using emphasis"]
       [:p
        (link-to "#" "Fusce dapibus")
        ", "
        [:strong "tellus ac cursus commodo"]
        ", "
        [:em "tortor mauris condimentum nibh"]
        ", ut fermentum massa justo sit amet risus.
 Maecenas faucibus mollis interdum.
 Nulla vitae elit libero, a pharetra augue."]
       [:p
        [:strong "Note:"]
        " Feel free to use "
        [:code "[:b]"]
        " and "
        [:code "[:i]"]
        " in HTML5, but their usage has changed a bit. "
        [:code "[:b]"]
        " is meant to highlight words or phrases without
conveying additional importance while "
        [:code "[:i]"]
        " is mostly for voice, technical terms, etc."]]
      [:div.span4
       [:h3 "Example addresses"]
       [:p
        "Here are two examples of how the "
        [:code "[:address]"]
        " tag can be used:"]
       [:address
        [:strong "Twitter, Inc."]
        [:br]
        "795 Folsom Ave, Suite 600"
        [:br]
        "San Francisco, CA 94107"
        [:br]
        [:abbr {:title "Phone"} "P:"]
        " (123) 456-7890\n      "]
       [:address
        [:strong "Full Name"]
        [:br]
        (mail-to "first.last@gmail.com")]]
      [:div.span4
       [:h3 "Example abbreviations"]
       [:p
        "Abbreviations with a "
        [:code "title"]
        " attribute have a light dotted bottom border and
 a help cursor on hover. This gives users extra indication
 something will be shown on hover."]
       [:p
        "Add the "
        [:code "initialism"]
        " class to an abbreviation to increase typographic
 harmony by giving it a slightly smaller text size."]
       [:p
        [:abbr.initialism {:title "HyperText Markup Language"} "HTML"]
        " is the best thing since sliced bread."]
       [:p
        "An abbreviation of the word attribute is "
        [:abbr {:title "attribute"} "attr"]
        "."]]]

     [:h2 "Blockquotes"]
     [:table.table.table-bordered.table-striped
      [:thead [:tr [:th "Element"] [:th "Usage"] [:th "Optional"]]]
      [:tbody
       [:tr
        [:td [:code "[:blockquote]"]]
        [:td
         "Block-level element for quoting content from another source"]
        [:td
         [:p "Add " [:code "cite"] " attribute for source URL"]
         "Use "
         [:code ".pull-left"]
         " and "
         [:code ".pull-right"]
         " classes for floated options"]]
       [:tr
        [:td [:code "[:small]"]]
        [:td
         "Optional element for adding a user-facing citation,
typically an author with title of work"]
        [:td
         "Place the "
         [:code "[:cite]"]
         " around the title or name of source"]]]]
     [:div.row
      [:div.span4
       [:p
        "To include a blockquote, wrap "
        [:code "[:blockquote]"]
        " around any "
        [:abbr {:title "HyperText Markup Language"} "HTML"]
        " as the quote. For straight quotes we recommend a "
        [:code "[:p]"]
        "."]
       [:p
        "Include an optional "
        [:code "[:small]"]
        " element to cite your source and you'll get an em dash "
        [:code "&mdash;"]
        " before it for styling purposes."]]
      [:div.span8
       [:pre.prettyprint.linenums
        (format-code
         [:blockquote
          [:p "Lorem ipsum dolor sit amet, consectetur
 adipiscing elit. Integer posuere erat a ante venenatis."]
          [:small "Someone famous"]])]]]

     [:h3 "Example blockquotes"]
     [:div.row
      [:div.span6
       [:p "Default blockquotes are styled as such:"]
       [:blockquote
        [:p
         "Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 Integer posuere erat a ante venenatis."]
        [:small
         "Someone famous in "
         [:cite {:title ""} "Body of work"]]]]
      [:div.span6
       [:p
        "To float your blockquote to the right, add "
        [:code "{:class \"pull-right\"}"]
        ":"]
       [:blockquote.pull-right
        [:p
         "Lorem ipsum dolor sit amet, consectetur adipiscing elit.
Integer posuere erat a ante venenatis."]
        [:small
         "Someone famous in "
         [:cite {:title ""} "Body of work"]]]]]

     [:h2 "Lists"]
     [:div.row
      [:div.span4
       [:h3 "Unordered"]
       [:p [:code "(unordered-list)"]]
       [:ul
        [:li "Lorem ipsum dolor sit amet"]
        [:li "Consectetur adipiscing elit"]
        [:li "Integer molestie lorem at massa"]
        [:li "Facilisis in pretium nisl aliquet"]
        [:li "Nulla volutpat aliquam velit"
         (unordered-list
          ["Phasellus iaculis neque"
           "Purus sodales ultricies"
           "Vestibulum laoreet porttitor sem"
           "Ac tristique libero volutpat at"])]
        [:li "Faucibus porta lacus fringilla vel"]
        [:li "Aenean sit amet erat nunc"]
        [:li "Eget porttitor lorem"]]]
      [:div.span4
       [:h3 "Unstyled"]
       [:p [:code "(unordered-list {:class \"unstyled\"})"]]
       [:ul.unstyled
        [:li "Lorem ipsum dolor sit amet"]
        [:li "Consectetur adipiscing elit"]
        [:li "Integer molestie lorem at massa"]
        [:li "Facilisis in pretium nisl aliquet"]
        [:li "Nulla volutpat aliquam velit"
         (unordered-list
          ["Phasellus iaculis neque"
           "Purus sodales ultricies"
           "Vestibulum laoreet porttitor sem"
           "Ac tristique libero volutpat at"])]
        [:li "Faucibus porta lacus fringilla vel"]
        [:li "Aenean sit amet erat nunc"]
        [:li "Eget porttitor lorem"]]]
      [:div.span4
       [:h3 "Ordered"]
       [:p [:code "(ordered-list)"]]
       (ordered-list
        ["Lorem ipsum dolor sit amet"
         "Consectetur adipiscing elit"
         "Integer molestie lorem at massa"
         "Facilisis in pretium nisl aliquet"
         "Nulla volutpat aliquam velit"
         "Faucibus porta lacus fringilla vel"
         "Aenean sit amet erat nunc"
         "Eget porttitor lorem"])]]

     [:br]
     [:div.row
      [:div.span4
       [:h3 "Description"]
       [:p [:code "[:dl]"]]
       [:dl
        [:dt "Description lists"]
        [:dd "A description list is perfect for defining terms."]
        [:dt "Euismod"]
        [:dd
         "Vestibulum id ligula porta felis euismod semper eget
lacinia odio sem nec elit."]
        [:dd "Donec id elit non mi porta gravida at eget metus."]
        [:dt "Malesuada porta"]
        [:dd "Etiam porta sem malesuada magna mollis euismod."]]]
      [:div.span8
       [:h3 "Horizontal description"]
       [:p [:code "[:dl.dl-horizontal]"]]
       [:dl.dl-horizontal
        [:dt "Description lists"]
        [:dd "A description list is perfect for defining terms."]
        [:dt "Euismod"]
        [:dd
         "Vestibulum id ligula porta felis euismod semper eget
lacinia odio sem nec elit."]
        [:dd "Donec id elit non mi porta gravida at eget metus."]
        [:dt "Malesuada porta"]
        [:dd "Etiam porta sem malesuada magna mollis euismod."]
        [:dt "Felis euismod semper eget lacinia"]
        [:dd
         "Fusce dapibus, tellus ac cursus commodo, tortor mauris
condimentum nibh, ut fermentum massa justo sit amet risus."]]
       [:hr]
       [:p
        [:span.label.label-info "Heads up!"]
        "Horizontal description lists will truncate terms
that are too long to fit in the left column fix "
        [:code "text-overflow"]
        ". In narrower viewports, they will change to the default
stacked layout."]]]
    ])
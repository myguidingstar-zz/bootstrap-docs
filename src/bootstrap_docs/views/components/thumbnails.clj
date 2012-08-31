(ns bootstrap-docs.views.components.thumbnails
  (:use [noir.core]
        [hiccup.core]
        [hiccup.element]
        [hiccup.bootstrap]
        [bootstrap-docs.views.common]
        [hiccup.form]
        [hiccup.page]
        ))

(def thumbnails
  [:section#thumbnails
     [:div.page-header
      [:h1
       "Thumbnails "
       [:small "Grids of images, videos, text, and more"]]]
     [:div.row
      [:div.span6
       [:h2 "Default thumbnails"]
       [:p
        "By default, Bootstrap's thumbnails are designed to showcase linked
images with minimal required markup."]
       [:ul.thumbnails
        [:li.span3
         [:a.thumbnail
          {:href "#"}
          [:img {:alt "", :src "http://placehold.it/260x180"}]]]
        [:li.span3
         [:a.thumbnail
          {:href "#"}
          [:img {:alt "", :src "http://placehold.it/260x180"}]]]
        [:li.span3
         [:a.thumbnail
          {:href "#"}
          [:img {:alt "", :src "http://placehold.it/260x180"}]]]
        [:li.span3
         [:a.thumbnail
          {:href "#"}
          [:img {:alt "", :src "http://placehold.it/260x180"}]]]]]
      [:div.span6
       [:h2 "Highly customizable"]
       [:p
        "With a bit of extra markup, it's possible to add any kind of HTML
content like headings, paragraphs, or buttons into thumbnails."]
       [:ul.thumbnails
        [:li.span3
         [:div.thumbnail
          [:img {:alt "", :src "http://placehold.it/260x180"}]
          [:div.caption
           [:h5 "Thumbnail label"]
           [:p
            "Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec
id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies
vehicula ut id elit."]
           [:p
            [:a.btn.btn-primary {:href "#"} "Action"]
            " "
            [:a.btn {:href "#"} "Action"]]]]]
        [:li.span3
         [:div.thumbnail
          [:img {:alt "", :src "http://placehold.it/260x180"}]
          [:div.caption
           [:h5 "Thumbnail label"]
           [:p
            "Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec
id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies
vehicula ut id elit."]
           [:p
            [:a.btn.btn-primary {:href "#"} "Action"]
            " "
            [:a.btn {:href "#"} "Action"]]]]]]]]
     [:div.row
      [:div.span4
       [:h3 "Why use thumbnails"]
       [:p
        "Thumbnails (previously "
        [:code ".media-grid"]
        " up until v1.4) are great for grids of photos or videos, image search
results, retail products, portfolios, and much more. They can be links or static
content."]]
      [:div.span4
       [:h3 "Simple, flexible markup"]
       [:p
        "Thumbnail markup is simple—a "
        [:code "ul"]
        " with any number of "
        [:code "li"]
        " elements is all that is required. It's also super flexible, allowing
for any type of content with just a bit more markup to wrap your contents."]]
      [:div.span4
       [:h3 "Uses grid column sizes"]
       [:p
        "Lastly, the thumbnails component uses existing grid system
classes—like "
        [:code ".span2"]
        " or "
        [:code ".span3"]
        "—for control of thumbnail dimensions."]]]
     [:div.row
      [:div.span6
       [:h2 "The markup"]
       [:p
        "As mentioned previously, the required markup for thumbnails is light
and straightforward. Here's a look at the default setup "
        [:strong "for linked images"]
        ":"]
       [:pre.prettyprint.linenums
        (format-code
         [:ul.thumbnails
          [:li.span3
           [:a.thumbnail
            {:href "#"}
            [:img {:alt "", :src "http://placehold.it/260x180"}]]]
          "..."])]
       [:p
        "For custom HTML content in thumbnails, the markup changes slightly. To
allow block level content anywhere, we swap the "
        [:code "[:a]"]
        " for a "
        [:code "[:div]"]
        " like so:"]
       [:pre.prettyprint.linenums
        (format-code
            [:ul.thumbnails
    [:li.span3
     [:div.thumbnail
      [:img {:alt "", :src "http://placehold.it/260x180"}]
      [:h5 "Thumbnail label"]
      [:p "Thumbnail caption right here..."]]
     "..."]])]]
      [:div.span6
       [:h2 "More examples"]
       [:p
        "Explore all your options with the various grid classes available to
you. You can also mix and match different sizes."]
       [:ul.thumbnails
        [:li.span4
         [:a.thumbnail
          {:href "#"}
          [:img {:alt "", :src "http://placehold.it/360x268"}]]]
        [:li.span2
         [:a.thumbnail
          {:href "#"}
          [:img {:alt "", :src "http://placehold.it/160x120"}]]]
        [:li.span2
         [:a.thumbnail
          {:href "#"}
          [:img {:alt "", :src "http://placehold.it/160x120"}]]]
        [:li.span2
         [:a.thumbnail
          {:href "#"}
          [:img {:alt "", :src "http://placehold.it/160x120"}]]]
        [:li.span2
         [:a.thumbnail
          {:href "#"}
          [:img {:alt "", :src "http://placehold.it/160x120"}]]]
        [:li.span2
         [:a.thumbnail
          {:href "#"}
          [:img {:alt "", :src "http://placehold.it/160x120"}]]]]]]])
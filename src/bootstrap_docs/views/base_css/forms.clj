(ns bootstrap-docs.views.base-css.forms
  (:use [hiccup.core]
        [hiccup.element]
        [hiccup.form]
        [hiccup.page]
        [hiccup.bootstrap]
        ))

(def forms
  [:section#forms
     [:div.page-header [:h1 "Forms"]]
     [:div.row
      [:div.span4
       [:h2 "Flexible HTML and CSS"]
       [:p
        "The best part about forms in Bootstrap is that all your inputs
and controls look great no matter how you build them in your markup.
No superfluous HTML is required, but we provide the patterns for those
 who require it."]
       [:p
        "More complicated layouts come with succinct and scalable classes
 for easy styling and event binding, so you're covered at every step."]]
      [:div.span4
       [:h2 "Four layouts included"]
       [:p
        "Bootstrap comes with support for four types of form layouts:"]
       (unordered-list
        [ "Vertical (default)"
          "Search"
          "Inline"
          "Horizontal"])
       [:p
        "Different types of form layouts require some changes to markup,
 but the controls themselves remain and behave the same."]]
      [:div.span4
       [:h2 "Control states and more"]
       [:p
        "Bootstrap's forms include styles for all the base form controls
like input, textarea, and select you'd expect. But it also comes with a
 number of custom components like appended and prepended inputs and support
for lists of checkboxes."]
       [:p
        "States like error, warning, and success are included for each type
of form control. Also included are styles for disabled controls."]]]
     [:h2 "Four types of forms"]
     [:p
      "Bootstrap provides simple markup and styles for four styles of
 common web forms."]
     [:table.table.table-bordered.table-striped
      [:thead [:tr [:th "Name"] [:th "Class"] [:th "Description"]]]
      [:tbody
       [:tr
        [:th "Vertical (default)"]
        [:td
         [:code ".form-vertical"]
         " "
         [:span.muted "(not required)"]]
        [:td "Stacked, left-aligned labels over controls"]]
       [:tr
        [:th "Inline"]
        [:td [:code ".form-inline"]]
        [:td
         "Left-aligned label and inline-block controls for compact style"]]
       [:tr
        [:th "Search"]
        [:td [:code ".form-search"]]
        [:td
         "Extra-rounded text input for a typical search aesthetic"]]
       [:tr
        [:th "Horizontal"]
        [:td [:code ".form-horizontal"]]
        [:td
         "Float left, right-aligned labels on same line as controls"]]]]
     [:h2
      "Example forms "
      [:small "using just form controls, no extra markup"]]
     [:div.row
      [:div.span6
       [:h3 "Basic form"]
       [:p "Smart and lightweight defaults without extra markup."]
       [:form.well
        (label nil "Label name")
        (text-field {:class "span3" :placeholder "Type something…"}
                    nil)
        [:p.help-block "Example block-level help text here."]
        [:label.checkbox
         [:input {:type "checkbox"}]
         " Check me out"]
        [:button.btn {:type "submit"} "Submit"]]
       [:pre.prettyprint.linenums
        (format-code
         [:form.well
          (label nil "Label name")
          (text-field {:class "span3" :placeholder "Type something…"}
                      nil)
          [:p.help-block "Example block-level help text here."]
          [:label.checkbox
           [:input {:type "checkbox"}]
           " Check me out"]
          [:button.btn {:type "submit"} "Submit"]])]]
      [:div.span6
       [:h3 "Search form"]
       [:p
        "Add "
        [:code ".form-search"]
        " to the form and "
        [:code ".search-query"]
        " to the "
        [:code "input"]
        "."]
       [:form.well.form-search
        [:input.input-medium.search-query {:type "text"}]
        [:button.btn {:type "submit"} "Search"]]
       [:pre.prettyprint.linenums
        (format-code
         [:form.well.form-search
          [:input.input-medium.search-query {:type "text"}]
          [:button.btn {:type "submit"} "Search"]])]
       [:h3 "Inline form"]
       [:p
        "Add "
        [:code ".form-inline"]
        " to finesse the vertical alignment and spacing of form controls."]
       [:form.well.form-inline
        [:input.input-small {:placeholder "Email", :type "text"}]
        [:input.input-small
         {:placeholder "Password", :type "password"}]
        [:label.checkbox
         [:input {:type "checkbox"}]
         " Remember me"]
        [:button.btn {:type "submit"} "Sign in"]]
       [:pre.prettyprint.linenums
        (format-code
         [:form.well.form-inline
          [:input.input-small {:placeholder "Email", :type "text"}]
          [:input.input-small
           {:placeholder "Password", :type "password"}]
          [:label.checkbox
           [:input {:type "checkbox"}]
           " Remember me"]
          [:button.btn {:type "submit"} "Sign in"]])]]]
     [:br]
     [:h2 "Horizontal forms"]
     [:div.row
      [:div.span4
       [:p]
       [:p
        "Shown on the right are all the default form controls we support.
Here's the bulleted list:"]
       (unordered-list
        ["text inputs (text, password, email, etc)"
         "checkbox"
         "radio"
         "select"
         "multiple select"
         "file input"
         "textarea"])]
      [:div.span8
       [:form.form-horizontal
        [:fieldset
         [:div.control-group
          [:label.control-label {:for "input01"} "Text input"]
          [:div.controls
           [:input#input01.input-xlarge {:type "text"}]
           [:p.help-block
            "In addition to freeform text,
any HTML5 text-based input appears like so."]]]
         [:div.control-group
          [:label.control-label {:for "optionsCheckbox"} "Checkbox"]
          [:div.controls
           [:label.checkbox
            (check-box "optionsCheckbox" nil "option1")
            "Option one is this and that—be sure to include why it's great"]]]
         [:div.control-group
          [:label.control-label {:for "select01"} "Select list"]
          [:div.controls
           (drop-down "select01"
                      ["something"
                       "2"
                       "3"
                       "4"
                       "5"])]]
         [:div.control-group
          [:label.control-label {:for "multiSelect"} "Multicon-select"]
          [:div.controls
           (drop-down {:multiple "multiple"}
                      "multiSelect"
                      (map str (range 1 6)))]]
         [:div.control-group
          [:label.control-label {:for "fileInput"} "File input"]
          [:div.controls
           (file-upload {:class "input-file"} "fileInput")]]
         [:div.control-group
          [:label.control-label {:for "textarea"} "Textarea"]
          [:div.controls
           (text-area {:class "input-xlarge" :rows "3"} "textarea")]]
         [:div.form-actions
          (submit-button {:class "btn btn-primary"} "Save changes")
          [:button.btn "Cancel"]]]]
       [:h3 "Example markup"]
       [:p
        "Given the above example form layout, here's the markup
associated with the first input and control group. The "
        [:code ".control-group"]
        ", "
        [:code ".control-label"]
        ", and "
        [:code ".controls"]
        " classes are all required for styling."]
       [:pre.prettyprint.linenums
        (format-code
         [:form.form-horizontal
          [:fieldset
           [:legend "Legend text"]
           [:div.control-group
            [:label.control-label {:for "input01"} "Text input"]
            [:div.controls
             [:input#input01.input-xlarge {:type "text"}]
             [:p.help-block "Supporting help text"]]]]])]]]
     [:br]
     [:h2 "Form control states"]
     [:div.row
      [:div.span4
       [:p
        "Bootstrap features styles for browser-supported focused and "
        [:code "disabled"]
        " states. We remove the default Webkit "
        [:code "outline"]
        " and apply a "
        [:code "box-shadow"]
        " in its place for "
        [:code ":focus"]
        "."]
       [:hr]
       [:h3 "Form validation"]
       [:p
        "It also includes validation styles for errors, warnings, and success.
To use, add the error class to the surrounding "
        [:code ".control-group"]
        "."]
       [:pre.prettyprint.linenums
        (str (quote [:fieldset.control-group.error "..."]))]]
      [:div.span8
       [:form.form-horizontal
        [:fieldset
         [:div.control-group
          [:label.control-label {:for "focusedInput"} "Focused input"]
          [:div.controls
           [:input#focusedInput.input-xlarge.focused
            {:value "This is focused…", :type "text"}]]]
         [:div.control-group
          [:label.control-label "Uneditable input"]
          [:div.controls
           [:span.input-xlarge.uneditable-input "Some value here"]]]
         [:div.control-group
          [:label.control-label
           {:for "disabledInput"}
           "Disabled input"]
          [:div.controls
           [:input#disabledInput.input-xlarge.disabled
            {:disabled "disabled",
             :placeholder "Disabled input here…",
             :type "text"}]]]
         [:div.control-group
          [:label.control-label
           {:for "optionsCheckbox2"}
           "Disabled checkbox"]
          [:div.controls
           [:label.checkbox
            [:input#optionsCheckbox2
             {:disabled "disabled",
              :value "option1",
              :type "checkbox"}]
            "This is a disabled checkbox"]]]
         [:div.control-group.warning
          [:label.control-label
           {:for "inputWarning"}
           "Input with warning"]
          [:div.controls
           [:input#inputWarning {:type "text"}]
           [:span.help.inline "Something may have gone wrong"]]]
         [:div.control-group.error
          [:label.control-label {:for "inputError"} "Input with error"]
          [:div.controls
           [:input#inputError {:type "text"}]
           [:span.help-inline "Please correct the error"]]]
         [:div.control-group.success
          [:label.control-label
           {:for "inputSuccess"}
           "Input with success"]
          [:div.controls
           [:input#inputSuccess {:type "text"}]
           [:span.help-inline "Woohoo!"]]]
         [:div.control-group.success
          [:label.control-label
           {:for "selectError"}
           "Select with success"]
          [:div.controls
           [:select#selectError
            [:option "1"]
            [:option "2"]
            [:option "3"]
            [:option "4"]
            [:option "5"]]
           [:span.help-inline "Woohoo!"]]]
         [:div.form-actions
          [:button.btn.btn-primary {:type "submit"} "Save changes"]
          [:button.btn "Cancel"]]]]]]
     [:br]
     [:h2 "Extending form controls"]
     [:div.row
      [:div.span4
       [:h3 "Prepend & append inputs"]
       [:p
        "Input groups—with appended or prepended text—provide an easy way
to give more context for your inputs. Great examples include the @ sign
for Twitter usernames or $ for finances."]
       [:hr]
       [:h3 "Checkboxes and radios"]
       [:p
        "Up to v1.4, Bootstrap required extra markup around checkboxes and
radios to stack them. Now, it's a simple matter of repeating the "
        [:code "[:label.checkbox]"]
        " that wraps the "
        [:code "[:input.checkbox]"]
        "."]
       [:p
        "Inline checkboxes and radios are also supported. Just add "
        [:code ".inline"]
        " to any "
        [:code ".checkbox"]
        " or "
        [:code ".radio"]
        " and you're done."]
       [:hr]
       [:h4 "Inline forms and append/prepend"]
       [:p
        "To use prepend or append inputs in an inline form,
 be sure to place the "
        [:code ".add-on"]
        " and "
        [:code "input"]
        " on the same line, without spaces."]
       [:hr]
       [:h4 "Form help text"]
       [:p
        "To add help text for your form inputs, include inline help text with "
        [:code "[:span.help-inline]"]
        " or a help text block with "
        [:code "[:p.help-block]"]
        " after the input element."]]
      [:div.span8
       [:form.form-horizontal
        [:fieldset
         [:div.control-group
          [:label.control-label "Form grid sizes"]
          [:div.controls.docs-input-sizes
           [:input.span1 {:placeholder ".span1", :type "text"}]
           [:input.span2 {:placeholder ".span2", :type "text"}]
           [:input.span3 {:placeholder ".span3", :type "text"}]
           [:select.span1
            [:option "1"]
            [:option "2"]
            [:option "3"]
            [:option "4"]
            [:option "5"]]
           [:select.span2
            [:option "1"]
            [:option "2"]
            [:option "3"]
            [:option "4"]
            [:option "5"]]
           [:select.span3
            [:option "1"]
            [:option "2"]
            [:option "3"]
            [:option "4"]
            [:option "5"]]
           [:p.help-block
            "Use the same "
            [:code ".span*"]
            " classes from the grid system for input sizes."]]]
         [:div.control-group
          [:label.control-label "Alternate sizes"]
          [:div.controls.docs-input-sizes
           [:input.input-mini
            {:placeholder ".input-mini", :type "text"}]
           [:input.input-small
            {:placeholder ".input-small", :type "text"}]
           [:input.input-medium
            {:placeholder ".input-medium", :type "text"}]
           [:p.help-block
            "You may also use static classes that don't map to the grid, adapt
to the responsive CSS styles, or account for varying types of controls (e.g., "
            [:code "input"]
            " vs. "
            [:code "select"]
            ")."]]]
         [:div.control-group
          [:label.control-label
           {:for "prependedInput"}
           "Prepended text"]
          [:div.controls
           [:div.input-prepend
            [:span.add-on "@"]
            [:input#prependedInput.span2 {:type "text", :size "16"}]]
           [:p.help-block "Here's some help text"]]]
         [:div.control-group
          [:label.control-label {:for "appendedInput"} "Appended text"]
          [:div.controls
           [:div.input-append
            [:input#appendedInput.span2 {:type "text", :size "16"}]
            [:span.add-on ".00"]]
           [:span.help-inline "Here's more help text"]]]
         [:div.control-group
          [:label.control-label
           {:for "appendedPrependedInput"}
           "Append and prepend"]
          [:div.controls
           [:div.input-prepend.input-append
            [:span.add-on "$"]
            [:input#appendedPrependedInput.span2
             {:type "text", :size "16"}]
            [:span.add-on ".00"]]]]
         [:div.control-group
          [:label.control-label
           {:for "appendedInputButton"}
           "Append with button"]
          [:div.controls
           [:div.input-append
            [:input#appendedInputButton.span2
             {:type "text", :size "16"}]
            [:button.btn {:type "button"} "Go!"]]]]
         [:div.control-group
          [:label.control-label
           {:for "appendedInputButtons"}
           "Two-button append"]
          [:div.controls
           [:div.input-append
            [:input#appendedInputButtons.span2
             {:type "text", :size "16"}]
            [:button.btn {:type "button"} "Search"]
            [:button.btn {:type "button"} "Options"]]]]
         [:div.control-group
          [:label.control-label
           {:for "inlineCheckboxes"}
           "Inline checkboxes"]
          [:div.controls
           [:label.checkbox.inline
            [:input#inlineCheckbox1
             {:value "option1", :type "checkbox"}]
            " 1"]
           [:label.checkbox.inline
            [:input#inlineCheckbox2
             {:value "option2", :type "checkbox"}]
            " 2"]
           [:label.checkbox.inline
            [:input#inlineCheckbox3
             {:value "option3", :type "checkbox"}]
            " 3"]]]
         [:div.control-group
          [:label.control-label
           {:for "optionsCheckboxList"}
           "Checkboxes"]
          [:div.controls
           [:label.checkbox
            [:input
             {:value "option1",
              :name "optionsCheckboxList1",
              :type "checkbox"}]
            "Option one is this and that—be sure to include why it's great"]
           [:label.checkbox
            [:input
             {:value "option2",
              :name "optionsCheckboxList2",
              :type "checkbox"}]
            "Option two can also be checked and included in form results"]
           [:label.checkbox
            [:input
             {:value "option3",
              :name "optionsCheckboxList3",
              :type "checkbox"}]
            "Option three can—yes, you guessed it—also be checked and
included in form results"]
           [:p.help-block
            [:strong "Note:"]
            " Labels surround all the options for much larger click areas
and a more usable form."]]]
         [:div.control-group
          [:label.control-label "Radio buttons"]
          [:div.controls
           [:label.radio
            [:input#optionsRadios1
             {:checked "checked",
              :value "option1",
              :name "optionsRadios",
              :type "radio"}]
            "Option one is this and that—be sure to include why it's great"]
           [:label.radio
            [:input#optionsRadios2
             {:value "option2", :name "optionsRadios", :type "radio"}]
            "Option two can be something else and selecting it will
deselect option one"]]]
         [:div.form-actions
          [:button.btn.btn-primary {:type "submit"} "Save changes"]
          [:button.btn "Cancel"]]]]]]])
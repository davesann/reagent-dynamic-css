(ns dsann.reagent.components.dynamic-css
  (:require
   [reagent.core :as r]
   [garden.core  :as g]))

; --------------------------------------------------
; setting css

(defn set-css! [style-id css]
  (-> js/document
      (.getElementById (name style-id))
      (.-innerHTML)
      (set! css)))

(defn dynamic-css [style-id css]
   (r/create-class
     {:component-did-mount
      (fn [this]
        (let [[_ style-id css] (r/argv this)]
          (set-css! style-id (g/css css))))

      :component-did-update
      (fn [this old-argv old-state snapshot]
        (let [[_ style-id css] (r/argv this)]
          (set-css! style-id (g/css css))))

      :reagent-render (fn [style-id css] nil)}))


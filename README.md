# reagent-dynamic-css

* Clojurescript reagent library

* Load CSS dynamically into your page

## Usage
include a script tag in your page header

```html
 <style id="dynamic-style"></style>
```

You can choose the id

Then somewhere in your reagent app:

```clojure
(ns your-ns
  (:require [dsann.reagent.components.dynamic-css :as dcss])


(defn your-reagent-component []
  ...
  [dcss/dynamic-css :dynamic-style style]
 )

```

**style** is a variable containing garden css syntax

It can be from a fixed var that you edit while reloading or from your app state.

```clojure
[[:.my-selector {:color :red}]
 ...
 ] 
```

* see: https://github.com/noprompt/garden for syntax

## Deps

```clojure
io.github.davesann/reagent-dynamic-css {:git/sha "f624a38" :git/tag "v1"}
```


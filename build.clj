(ns build
  (:require [clojure.tools.build.api :as b]))

(defn copy-static-assets
  [_]
  (println "Deleting docs folder...")
  (b/delete {:path "docs"})
  (println "Copying static assets...")
  (b/copy-dir {:src-dirs ["resources/public"] :target-dir "docs"})
  (println "Done"))

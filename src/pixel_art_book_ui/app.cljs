(ns pixel-art-book-ui.app
  (:require [preact]))

(def h js/preact.h)
(defn f [children]
  (apply h js/preact.Fragment nil children))

(defn game [_]
  (f [(h "div" #js {:class "book-top-left"})
      (h "div" #js {:class "book-top-middle"})
      (h "div" #js {:class "book-top-right"})
      (h "div" #js {:class "book-content"}
         (h "h2" nil "Dungeon Diagrams")
         (h "p" nil "On the design of Dungeons."))
      (h "div" #js {:class "book-left-marker"})
      (h "div" #js {:class "book-left"})
      (h "div" #js {:class "book-right"}
         (h "div" #js {:class "book-tab"})
         (h "div" #js {:class "book-tab-selected"})
         (h "div" #js {:class "book-tab"})
         (h "div" #js {:class "book-tab"})
         (h "div" #js {:class "book-tab"}))
      (h "div" #js {:class "book-bottom-left"})
      (h "div" #js {:class "book-bottom-middle"})
      (h "div" #js {:class "book-bottom-right"})]))

(let [container (.getElementById js/document "app")]
  (defn renderer [full-state]
    (js/preact.render (game full-state) container)))

(renderer nil)

;; TODO: fix tab overflow
;; TODO: change page tapping on tab
;; TODO: rotate 3D book cover
;; TODO: page turn sound
;; TODO: page transition?
;; TODO: tab icons (with animations)


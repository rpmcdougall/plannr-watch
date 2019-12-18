(ns plannr-watch.core
  (:gen-class)
  (:require [plannr-watch.watch.watch :as watch]
            [overtone.at-at :as at-at]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (def tp (at-at/mk-pool))
  (future (watch/watch-events tp)))

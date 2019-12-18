(ns plannr-watch.watch.watch
  (:require [config.core :refer [env]]
            [plannr-watch.db.conn :refer [db]]
            [plannr-watch.db.sql :as sql]
            [overtone.at-at :as at-at]))


(defn event-listing
  "Fetches events from database selecting name and time"
  []
  (sql/events-name-time db))

(defn watch-events
  "Watches events in plannr database for upcoming events"
  [tp]
  (at-at/every 10000 #(event-listing) tp))



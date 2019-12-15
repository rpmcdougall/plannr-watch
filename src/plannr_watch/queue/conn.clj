(ns plannr-watch.queue.conn
  (:require [taoensso.carmine :as car :refer (wcar)]
            [config.core :refer [env]]))

(def redis-conn {:pool {} :spec {:host (:q_host env) :port (:port env) :password (:q_pass env)}})
(defmacro wcar* [& body] `(car/wcar redis-conn ~@body))

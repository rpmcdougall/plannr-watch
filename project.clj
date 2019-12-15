(defproject plannr-watch "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :plugins [[lein-cljfmt "0.6.6"]]
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [overtone/at-at "1.2.0"]
                 [yogthos/config "1.1.7"]
                 [amperity/greenlight "0.1.7"]
                 [com.taoensso/carmine "2.19.1"]
                 [com.layerware/hugsql "0.5.1"]
                 [org.postgresql/postgresql "9.4.1207"]]
  :main ^:skip-aot plannr-watch.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :prod {:resource-paths ["config/prod"]}
             :dev  {:resource-paths ["config/dev"]}})

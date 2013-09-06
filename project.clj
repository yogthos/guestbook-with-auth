(defproject guestbook "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.5"]
                 [hiccup "1.0.4"]
                 [ring-server "0.2.8"]
                 ;;JDBC dependencies
                 [org.clojure/java.jdbc "0.2.3"]
                 [org.xerial/sqlite-jdbc "3.7.2"]
                 [lib-noir "0.6.8"]]
  :plugins [[lein-ring "0.8.5"]]
  :ring {:handler guestbook.handler/war-handler
         :init guestbook.handler/init
         :destroy guestbook.handler/destroy}
  :profiles
  {:production
   {:ring
    {:open-browser? false
     :stacktraces? false
     :auto-reload? false}}
   :dev
   {:dependencies [[ring-mock "0.1.3"]
                   [ring/ring-devel "1.1.8"]]}})

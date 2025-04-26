(defproject ndevreeze/starter "0.1.0-SNAPSHOT"
  :description "Clojure Genie starter library"
  :url "https://github.com/ndevreeze/starter"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.12.0"]
                 [org.clojure/tools.cli "1.1.230"]
                 [org.clojure/data.xml "0.0.8"]
                 [org.clojure/data.csv "1.1.0"]
                 [clj-commons/conch "0.9.2"]
                 [clj-commons/fs "1.6.311"]
                 [commons-codec "1.18.0"]
                 [hiccup/hiccup "2.0.0-RC3"]
                 [nrepl "1.3.1"]

                 ;; 2024-04-21: make explicit because of confusing
                 ;; deps. Check periodically if it can be removed.
                 [org.clojure/tools.reader "1.5.2"]
                 [org.apache.commons/commons-compress "1.27.1"]
                 [commons-io "2.19.0"]

                 ;; 2024-04-03: wrt time/interval, also needs threeten.
                 [clojure.java-time/clojure.java-time "1.4.3"]
                 [org.threeten/threeten-extra "1.8.0"]

                 ;; own libraries
                 [ndevreeze/cmdline "0.2.0"]
                 [ndevreeze/excel "0.3.2-SNAPSHOT"]
                 [ndevreeze/flexdb "0.4.2-SNAPSHOT"]
                 [ndevreeze/logger "0.6.2"]

                 ;; some older libraries to be moved and made public.
                 [nl.nicodevreeze/org-log-db "0.3.2-SNAPSHOT"]
                 [nl.nicodevreeze/unison-log "0.2.0-SNAPSHOT"]
                 [nl.nicodevreeze/xml-db "0.3.0-SNAPSHOT"]]

  :target-path "target/%s"

  :resource-paths ["resources"]
  
  :profiles {:dev {:dependencies [[midje "1.10.10"]]}}

  :repl-options {:init-ns ndevreeze.starter}

  :codox
  {:output-path "docs/api"
   :metadata {:doc/format :markdown}
   :source-uri "https://github.com/ndevreeze/starter/blob/master/{filepath}#L{line}"}

  :repositories [["releases" {:url "https://clojars.org/repo/"
                              :creds :gpg}]])

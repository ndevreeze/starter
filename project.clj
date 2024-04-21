(defproject ndevreeze/starter "0.1.0-SNAPSHOT"
  :description "Clojure Genie starter library"
  :url "https://github.com/ndevreeze/starter"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.2"]
                 [clojure.java-time/clojure.java-time "1.4.2"]   ; 2024-04-03: wrt time/interval in missed-sales.
                 [org.threeten/threeten-extra "1.7.2"]           ; 2024-04-03: prb this needs to be close to java-time
                 ]

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
  

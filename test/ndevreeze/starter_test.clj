(ns ndevreeze.starter-test
  "Test functions with Midje for starter."
  (:require [midje.sweet :as midje]
            [clojure.test :refer :all]
            [ndevreeze.starter :as starter]
            [ontodev.excel :as excel]))

(declare =>)

(midje/facts
 "Test starter"

 (midje/fact "Test version"
             (starter/version)
             => "Starter v0.1.0-SNAPSHOT (2024-04-21)")

 )

;; [2024-08-10 11:35] Some issues with Excel, including not sure if the right version of the lib is used. So a test to at least show it.

(deftest show-versions
  (testing "Showing excel-lib version"
    (println (format "Excel lib version: %s" (excel/version)))
    (is (= (excel/version) (excel/version)))))

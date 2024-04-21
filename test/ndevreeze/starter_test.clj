(ns ndevreeze.starter-test
  "Test functions with Midje for starter."
  (:require [midje.sweet :as midje]
            [ndevreeze.starter :as starter]))

(declare =>)

(midje/facts
 "Test starter"

 (midje/fact "Test version"
             (starter/version)
             => "Starter v0.1.0-SNAPSHOT (2024-04-21)")

 )

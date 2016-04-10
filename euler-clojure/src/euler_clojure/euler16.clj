(ns euler-clojure.euler16
  (:require [clojure.math.numeric-tower :as math]))

;; 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
;; What is the sum of the digits of the number 2^1000?


(defn explode-to-digits [number]
  (map #(Character/getNumericValue %) (str number)))

(defn sum-digits
  [n]
  (reduce + (explode-to-digits (math/expt 2 n))))

(sum-digits 1000) ;;1366

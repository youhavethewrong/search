(ns search.astar-test
  (:require [clojure.test :refer :all]
            [search.core :refer :all]
            [search.astar :refer :all]
            [clojure.data.priority-map :as pmap]))

(def initial-node
  (->SearchNode [1 0 2 3 4 5 6 7 8]
                nil
                nil
                0
                0))

(def goal-state [0 1 2 3 4 5 6 7 8])

(defn misplaced-tiles [goal-state state]
  (count
   (filter #(= false %)
           (map (fn [g s]
                  (= g s))
                goal-state state))))

(deftest estimateDistance
  (testing "should estimate the distance all nodes are from their correct place"
    (is
     (=
      2
      (misplaced-tiles goal-state (:state initial-node))))))

(deftest nodePriority
  (testing "should order nodes by least path cost"
    (let [a (->SearchNode [1 2 0 3 4 5 6 7 8] nil nil 0 0)
          b (->SearchNode [1 0 2 3 4 5 6 7 8] nil nil 0 0)]
      (is
       (=
        {b 2 a 4}
        (pmap/priority-map a 4 b 2))))))


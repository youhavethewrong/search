(ns search.core)

(defrecord Problem [initial-state goal-state])

(defrecord Strategy [function])

(defrecord SearchNode [state parentNode action pathCost treeDepth])

(defn goal-test [problem maybe-goal-state]
  (= (:goal-state problem) maybe-goal-state))

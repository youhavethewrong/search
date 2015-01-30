(ns search.astar
  (:require [search.core :as core]
            [clojure.data.priority-map :as pmap]))

(defn selectFrom [fringe]
  )

(defn expand [problem node]
  )

(defn search-tree [problem heuristic]
  (loop [fringe (pmap/priority-map (:initial-state problem))]
    (if (or (nil? fringe) (empty? fringe))
      (println "Failed to find a solution.")
      (let [node (selectFrom fringe)]
        (cond
         (nil? node) (println "No more nodes in fringe.")
         (core/goal-test problem (:state node)) node
         :else (recur (expand problem node)))))))

(defn search-graph [problem heuristic]
  )

(ns search.astar
  (:require [search.core :as core]))

(defn selectFrom
  "pick the lowest cost node"
  [fringe]
  (first fringe))

(defn search-tree [problem heuristic]
  (loop [fringe (vec (:initial-state problem))]
    (if (or (nil? fringe) (empty? fringe))
      (println "Failed to find a solution.")
      (let [node (selectFrom fringe)]
        (cond
         (nil? node) (println "No more nodes in fringe.")
         (core/goal-test problem (:state node)) node
         :else (recur (expand problem node)))))))

(defn search-graph [problem heuristic]
  (loop [fringe (vec (:initial-state problem))]
    (if (or (nil? fringe) (empty? fringe))
      (println "Failed to find a solution.")
      (let [node (selectFrom fringe heuristic)]
        (cond
         (nil? node) (println "No more nodes in fringe.")
         (core/goal-test problem (:state node)) node
         :else (recur (expand fringe node)))))))

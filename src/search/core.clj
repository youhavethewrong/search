(ns search.core)

;; /*
;; * Initializing graph
;; * ------------------
;; * G: graph to be initialized
;; * s: start node
;; */
;; initialize (G, s)
;; {
;;  // set distance to all nodes to infinity
;;  forall v do
;;  d [v] := ?
;;  // set distance to start node to zero
;;  d [s] := 0;
;;  }

;; /*
;; * A*-algorithm
;; * ------------------------------
;; * G: graph to run algorithm on
;; * s: start node
;; * g: goal node
;; * w: weight function for computing weight of edge
;; * f: combination of distance and heuristic (f [v] = d [v] + h [v])
;; * Q: priority Queue for nodes of graph
;; */
;; A-Star (s, g, w, h, G) {
;; 01      initialize (G, s);
;; 02      Q := V [G]; // add all nodes to
;;                 ; priority queue
;; 03      while not isEmpty (Q) {
;; 04         // examine node with least distance to start node
;; 05         u := pop (Q);
;; 06        if (u == g) then
;; 07           return reconstructShortestPath (g);
;; 08        else {
;; 09            // examine all neighbours of current node u
;; 10            forall v := sucessors (u) do {
;; 11               // relax edge between u and its sucessor v
;; 12               relax (u, v, w);
;; 13}
;; 14}
;; 15}
;; 15      // no path found
;; 16      return fail;
;; 17}

;; /*
;; * relaxin an edge
;; * ---------------
;; * u: current node being explored
;; * v: currently considered sucessor of u
;; * w: weight function for computing weight of edge
;; * f: combination of distance and heuristic (f [v] = d [v] + h [v])
;; */
;; relax (u,v,w,h)
;; {
;;  // check if going through  u results in shorter path
;;  if f [v] > d [u] + w (u,v) + h [v] {
;;                                      // new path is shorter
;;                                      // update estimated path lenght to goal
;;                                      f [v] := d [u] + w (u,v) + h [v];
;;                                      // update predecessor pointer for shortest path
;;                                      ? [v] := u;
;;                                      }
;;  else
;;                                         ; // no change since already shorter path known
;;  }




(defn astar []
  )

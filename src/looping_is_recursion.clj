(ns looping-is-recursion)

(defn power [base exp]
  (let [f (fn [acc n]
            (if (zero? n)
              acc
              (recur (* acc base) (dec n))))]
    (f 1 exp)))

(defn last-element [a-seq]
  (let [f (fn [acc coll]
            (if (empty? coll)
              acc
              (recur (first coll) (rest coll))))]
    (f (first a-seq) a-seq)))

(defn seq= [seq1 seq2]
  (let [f (fn [coll1 coll2]
            (cond
              (and (empty? coll1) (empty? coll2)) true
              (and (empty? coll1) (seq coll2)) false
              (and (empty? coll2) (seq coll1)) false
              (not= (first coll1) (first coll2)) false
              :else (recur (rest coll1) (rest coll2))))]
    (f seq1 seq2)))

(defn find-first-index [pred a-seq]
  ":(")

(defn avg [a-seq]
  -1)

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])


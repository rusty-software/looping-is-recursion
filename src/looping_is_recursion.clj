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
  (cond
    (and (empty? seq1) (empty? seq2)) true
    (and (empty? seq1) (seq seq2)) false
    (and (empty? seq2) (seq seq1)) false
    (not= (first seq1) (first seq2)) false
    :else (recur (rest seq1) (rest seq2))))

(defn find-first-index [pred a-seq]
  (loop [acc 0
         coll a-seq]
    (cond
      (empty? coll) nil
      (pred (first coll)) acc
      :else (recur (inc acc) (rest coll)))))

(defn avg [a-seq]
  -1)

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])


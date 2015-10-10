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
  ":(")

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


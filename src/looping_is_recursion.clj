(ns looping-is-recursion)

; Harjoitus 1
; J‰i kesken, Math/Pow:illa olisi onnistunut, mutta
; sit‰ ei varmaan ollut tarkoitus k‰ytt‰‰
(defn power
        [base exp]
  (let [helper (fn [acc n]
                 (if (zero? n)
                   acc
                   (recur (* acc acc) (dec n))))]
    (helper base exp))
)

; Harjoitus 2
(defn last-element
        [a-seq]
        (last a-seq)
)

; Harjoitus 3
(defn seq=
        [seq1 seq2]
        (if (= seq1 seq2)
                true
                false
        )
)

; Harjoitus 4
(defn find-first-index [pred a-seq]
  ":(")

; Harjoitus 5
(defn avg
        [a-seq]
        (/ (apply + a-seq) (count a-seq))
)


(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])


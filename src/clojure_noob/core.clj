(ns clojure-noob.core
  (:gen-class))
;new function
(defn hello
  "I'm trying to do a whole lot ... now."
  [& args]
  (println "I try"))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (println "Hi mikey")
  (println "Joyie say, How are you doing??")
  (println (+ 23 45))
  (println (str "Hello " "my " "man"))

  (def zeus "By Zeus's hammer!")
  (def Aqua "By Aquaman trident")
  (def cond "hey")

  (if (= cond "hey")
    (println (* 1/2 10))
    (println Aqua)
    )

  (def hmap {:firstname "Mike" :lastname "Basweti" :thirdname "Alex" :added_info {:dob "2nd Feb" :school "dropout"}})
  (def examplemap (hash-map :subject1 "Math" :subject2 "Physics"))
  (println hmap)
  (println examplemap)

;  get value using keyword
  (println (get hmap :lastname))
; get a key that doesn't exist, returns `nil`
  (println (get hmap :lastname2))
;  keyword example :thirdname
;  usage of get-in in accessing nested values
  (println (get-in hmap [:added_info :school]))

  (println zeus)

;  call function
  (hello)

;  vectors
  (def exampvector [34 89 90 55])
;  get second value from vector
  (println (get exampvector 1))
  (println (get exampvector 3))

  (def createVector (vector "Mike" "Basweti"))
  (println (get createVector 1))
;  element added at the end
  (println (conj createVector "hello"))
  (println createVector)
;  lists
  (def listexamp '(4 7 9 12))
  (println listexamp)
;  get value
  (println (nth listexamp 2))
;  creating a list with `list` function
  (def exlist (list 78 56 34 29 98))
  (println (nth exlist 2))
;  conjure in list, item added at the beginning
  (println (conj exlist 77))
;  sets
;  collection of unique values
  (def exhashsest #{"sasa" "hello" 34 9.6})
  (println exhashsest)
;  create using `hash-set` function
  (def create-hasset (hash-set 2 4 8 7 3 2))
  (println create-hasset)
;  convert list int set (set [2 4 8 3 2])
;  contains?
  (println (contains? create-hasset 2))
;  get
  (println (get create-hasset 4))
  )

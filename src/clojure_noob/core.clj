(ns clojure-noob.core
  (:gen-class))

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

  (def hmap {:firstname "Mike" :lastname "Basweti" :thirdname "Alex"})
  (def examplemap (hash-map :subject1 "Math" :subject2 "Physics"))
  (println hmap)
  (println examplemap)

;  get value using keyword
  (println (get hmap :lastname))
; get a key that doesn't exist, returns `nil`
  (println (get hmap :lastname2))
;  keyword example :thirdname

  ;  (println zeus)

;  (defn greeting
;    "this is a greeting"
;    [& args]
;    (println "Joyie say, How are you doing??")
;    )
  )

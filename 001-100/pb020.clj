(->> (range 100)
     (map inc)
     (reduce *')
     (str)
     (char-array)
     (map str)
     (map read-string)
     (reduce +')
     (println)
     )

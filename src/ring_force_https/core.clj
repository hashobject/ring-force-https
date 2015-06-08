(ns ring-force-https.core
    (:require [ring.util.response :as resp]))


(defn- https-url [request-url]
  (str "https://" (:server-name request-url) ":443" (:uri request-url)))


(defn force-https
  [handler]
  (fn [request]
    (if (= (:scheme request) :http)
      (resp/redirect (https-url request))
      (handler request))))

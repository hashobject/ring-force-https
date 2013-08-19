# ring-force-https

Ring middleware to force HTTPS on web app.

## Install

```
[ring-force-https "0.1.0-SNAPSHOT"]
```

## Usage

Import middleware inside your main Ring handler file:

```
(:require
  ;some other imports
  [ring-force-https.core :refer [force-https]]
  ;some other imports
  )
```

Attach `force-https` middleware in the following way

```
(def war-handler
  (-> app
    (force-https)
    ;some other middlewares can go here. Next 3 lines are just example.
    (wrap-resource "public")
    (wrap-base-url)
    (wrap-file-info)))
```

## Contributions

We love contributions. Please submit your pull requests.


## License

Copyright © 2013 Hashobject Ltd (team@hashobject.com).

Distributed under the [Eclipse Public License](http://opensource.org/licenses/eclipse-1.0).

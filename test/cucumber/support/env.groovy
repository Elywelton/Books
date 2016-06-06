import geb.binding.BindingUpdater
import geb.Browser
import data.Data

import static cucumber.api.groovy.Hooks.*


Before () {
    Data.clearBooks ()  // added to cleanup the database

    bindingUpdater = new BindingUpdater (binding, new Browser ())
    bindingUpdater.initialize ()
}

After () {
    bindingUpdater.remove ()
}
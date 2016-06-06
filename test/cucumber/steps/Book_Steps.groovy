import static cucumber.api.groovy.EN.*

import pages.book.NewPage
import pages.book.ListPage
import page.books.ShowPage

Given(~'^I have already added "([^"]*)"$') { String bookTitle ->
    Data.createBookByTitle (bookTitle)
}

When(~'^I add "([^"]*)"$') { String bookTitle ->
    page.toNewPage ()
    at NewPage

    page.add (bookTitle)
}

Then(~'^my book list contains "([^"]*)"$') { String bookTitle ->
    at ListPage

    page.checkBookAtRow (bookTitle, 0)
}
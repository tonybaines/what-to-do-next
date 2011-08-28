package org.tonyb.wtdn

import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers
import org.tonyb.wtdn.domain.ToDoItem
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ToDoItemSpec extends Spec with ShouldMatchers {
  describe("Creating a simple ToDo Item") {
    val todo = new ToDoItem("Write some Scala code")

    it("should remember it's description") {
      todo.description should be ("Write some Scala code")
    }
  }
}
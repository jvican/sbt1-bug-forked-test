package test

import org.specs2.matcher.MustMatchers
import org.specs2.{ScalaCheck, Specification}

trait Spec extends Specification with MustMatchers with ScalaCheck
class PrivateTest extends Spec {
  def is = s2"""

  """
}

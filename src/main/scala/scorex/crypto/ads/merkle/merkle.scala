package scorex.crypto.ads

import scorex.crypto.hash.Blake2b256

package object merkle {
  type Position = Long
  val DefaultHashFunction = Blake2b256
}
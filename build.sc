import mill._, scalalib._

import $file.framework.build

object shared extends ScalaModule {
    override def scalaVersion = framework.build.shared.scalaVersion

    override def moduleDeps = Seq(framework.build.shared)
}
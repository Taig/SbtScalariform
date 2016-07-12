package io.taig

import com.typesafe.sbt.SbtScalariform
import com.typesafe.sbt.SbtScalariform.{ScalariformKeys, scalariformSettings}
import sbt._
import sbt.plugins.JvmPlugin

import scalariform.formatter.preferences._

object FormatPlugin extends AutoPlugin {
    override def requires = JvmPlugin && SbtScalariform

    override def trigger = allRequirements

    override def projectSettings: Seq[Def.Setting[_]] = scalariformSettings ++ Seq(
        ScalariformKeys.preferences := ScalariformKeys.preferences.value
            .setPreference( AlignParameters, true )
            .setPreference( AlignArguments, true )
            .setPreference( AlignSingleLineCaseStatements, true )
            .setPreference( CompactControlReadability, false )
            .setPreference( CompactStringConcatenation, false )
            .setPreference( DoubleIndentClassDeclaration, true )
            .setPreference( DanglingCloseParenthesis, Force )
            .setPreference( FormatXml, true )
            .setPreference( IndentLocalDefs, false )
            .setPreference( IndentPackageBlocks, true )
            .setPreference( IndentSpaces, 4 )
            .setPreference( IndentWithTabs, false )
            .setPreference( MultilineScaladocCommentsStartOnFirstLine, false )
            .setPreference( PlaceScaladocAsterisksBeneathSecondAsterisk, false )
            .setPreference( PreserveSpaceBeforeArguments, true )
            .setPreference( RewriteArrowSymbols, true )
            .setPreference( SpaceBeforeColon, false )
            .setPreference( SpaceInsideBrackets, false )
            .setPreference( SpaceInsideParentheses, true )
            .setPreference( SpacesWithinPatternBinders, true )
            .setPreference( SpacesAroundMultiImports, true )
        )
}
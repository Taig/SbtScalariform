description := "Scalariform auto plugin with custom formatting settings"

homepage := Some( url( "https://github.com/taig/sbtscalariform" ) )

licenses := Seq( "MIT" -> url( "https://raw.githubusercontent.com/taig/sbtscalariform/master/LICENSE" ) )

organizationHomepage := Some( url( "http://taig.io" ) )

pomExtra := {
    <issueManagement>
        <url>https://github.com/taig/sbtscalariform/issues</url>
        <system>GitHub Issues</system>
    </issueManagement>
        <developers>
            <developer>
                <id>Taig</id>
                <name>Niklas Klein</name>
                <email>mail@taig.io</email>
                <url>http://taig.io/</url>
            </developer>
        </developers>
}

pomIncludeRepository := { _ => false }

publishArtifact in Test := false

publishMavenStyle := true

publishTo <<= version ( version => {
    val url = Some( "https://oss.sonatype.org/" )

    if( version.endsWith( "SNAPSHOT" ) ) {
        url.map( "snapshot" at _ + "content/repositories/snapshots" )
    }
    else {
        url.map( "release" at _ + "service/local/staging/deploy/maven2" )
    }
} )

scmInfo := Some(
    ScmInfo(
        url( "https://github.com/taig/sbtscalariform" ),
        "scm:git:git://github.com/taig/sbtscalariform.git",
        Some( "scm:git:git@github.com:taig/sbtscalariform.git" )
    )
)

startYear := Some( 2015 )
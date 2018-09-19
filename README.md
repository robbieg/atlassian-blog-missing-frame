This is the sample code for [this blog post](http://go.atlassian.com/engineering-blog-missing-frame).

Useful commands if you are playing along at home:

Build and run the test code:

    :::sh
    gradle jar
    java -jar build/libs/missing-frame.jar

Use `javap` to show the test code bytecode:

    :::sh
    javap -v -p -c -classpath build/libs/missing-frame.jar com.atlassian.rgates.missingframe.Main

The blog details using an IDE debugger to get the bytecode of the class built on the fly. You can
also do this using a JDK system property to dump the class that is built in a `dumps` directory:

    :::sh
    mkdir -p dumps && java -Djdk.internal.lambda.dumpProxyClasses=dumps -jar build/libs/missing-frame.jar

And then you can use `javap` to show the bytecode:

    :::sh
    javap -v -p -c -classpath dumps 'com.atlassian.rgates.missingframe.Main$$Lambda$1'

Show the java diagnostic flags:

    :::sh
    java -XX:+UnlockDiagnosticVMOptions -XX:+PrintFlagsFinal

Run with a flag to show hidden frames:

    :::sh
    java -XX:+UnlockDiagnosticVMOptions -XX:+ShowHiddenFrames -cp build/libs/missing-frame.jar com.atlassian.rgates.missingframe.Main

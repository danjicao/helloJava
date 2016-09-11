CMAKE_MINIMUM_REQUIRED (VERSION 3.5.2)


GET_CMAKE_PROPERTY (_variableNames VARIABLES)
FOREACH (_variableName ${_variableNames})
    MESSAGE (STATUS "${_variableName}=${${_variableName}}")
ENDFOREACH()


FIND_PACKAGE(Java REQUIRED)
INCLUDE(UseJava)


PROJECT (helloJava)


SET(CMAKE_JAVA_COMPILE_FLAGS "-source" "1.8" "-target" "1.8")

SET(HELLOJAVA_SRCS helloJava.java)
ADD_JAR(helloJava ${HELLOJAVA_SRCS}
        VERSION 0.0.1
        ENTRY_POINT helloJava
       )


GET_TARGET_PROPERTY(_jarFile helloJava JAR_FILE)
GET_TARGET_PROPERTY(_classDir helloJava CLASSDIR)


MESSAGE(STATUS "Jar file ${_jarFile}")
MESSAGE(STATUS "Class compiled to ${_classDir}")


ENABLE_TESTING()
ADD_TEST(NAME testHelloJava COMMAND ${Java_JAVA_EXECUTABLE} -cp ${_jarFile} helloJava)


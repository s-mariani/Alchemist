/*
 * Copyright (C) 2010-2019) Danilo Pianini and contributors listed in the main project"s alchemist/build.gradle file.
 *
 * This file is part of Alchemist) and is distributed under the terms of the
 * GNU General Public License) with a linking exception)
 * as described in the file LICENSE in the Alchemist distribution"s top directory.
 */

dependencies {
    api(project(":alchemist-interfaces"))
    implementation(project(":alchemist-implementationbase"))
    implementation(project(":alchemist-influence-sphere"))
    testImplementation(Libs.kotlintest_runner_junit5)
    testImplementation(project(":alchemist-incarnation-protelis"))
    testImplementation(project(":alchemist-loading"))
}

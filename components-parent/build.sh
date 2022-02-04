#!/bin/bash

echo "build ..."
if [ "local_bundle_mock" = $1 ] ; then
    mvn clean package -pl components-bundle-mock -am -Dbdmgc.skip=false -Dcodeg.author=fastjrun
elif [ "provider_mock" = $1 ] ; then
    mvn clean package -pl components-provider-mock -am -Dbdmgc.skip=false -Dcodeg.author=fastjrun
    cp components-provider-mock/target/components-provider-mock.war ~/server/tomcat8/webapps/components-provider-mock.war
elif [ "package_api_test" = $1 ] ; then
    mvn clean package -pl components-api-test -am -Dclientgc.skip=false -Dcodeg.author=fastjrun
elif [ "unitTest" = $1 ] ; then
    mvn clean verify -pl components-test -PunitTest -am
elif [ "mock_test" = $1 ] ; then
    mvn clean package -pl components-api-test -Dclientgc.skip=false -Dcodeg.author=fastjrun -Pmock
elif [ "package_provider" = $1 ] ; then
    mvn clean package -pl components-provider -am -Dbasegc.skip=false -Dbdgc.skip=false -Dcodeg.author=fastjrun -P$2
    cp components-provider/target/components-provider.war ~/server/tomcat8/webapps/components-provider.war
elif [ "api_test" = $1 ] ; then
    mvn clean package -pl components-api-test -Dclientgc.skip=false -Dcodeg.author=fastjrun -P$2
elif [ "package_task" = $1 ] ; then
    mvn clean package -pl components-task -am -Dbasegc.skip=false -Dbdgc.skip=false -Dcodeg.author=fastjrun -P$2
    rm -rf ~/app/components/components-task
    cp -r components-task/target/components-task/components-task ~/app/components/components-task
elif [ "package_ci" = $1 ] ; then
    mvn clean package -pl components-base -am -Dbasegc.skip=false -Dcodeg.author=fastjrun
    mvn clean package -pl components-bundle -am -Dbdgc.skip=false -Dcodeg.author=fastjrun
    mvn clean package -pl components-api-test -am -Dclientgc.skip=false -Dcodeg.author=fastjrun -Dmaven.test.skip=true
    mvn clean package -pl components-bundle-mock -am -Dbdmgc.skip=false -Dcodeg.author=fastjrun
    mvn clean package -pl components-api -am -Dapigc.skip=false -Dcodeg.author=fastjrun
elif [ "service_ut" = $1 ] ; then
    mvn clean package -pl components-test -am -Dbasegc.skip=false -Dbdgc.skip=false -Dcodeg.author=fastjrun -P$2
fi
echo "build done."
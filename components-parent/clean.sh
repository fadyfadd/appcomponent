#!/bin/bash

echo "clean ..."
# rm components-api
rm -rf components-api/src/

# rm components-api-test
rm -rf components-api-test/src/main/
rm -rf components-api-test/src/test/java/
rm -rf components-api-test/src/test/resources/testng.xml
rm -rf components-api-test/src/test/data/

# rm components-base
rm -rf components-base/src/

# rm components-api
rm -rf components-api/src/

# rm components-bundle
rm -rf components-bundle/src/

# rm components-bundle-mock
rm -rf components-bundle-mock/src/

mvn clean
echo "clean done."
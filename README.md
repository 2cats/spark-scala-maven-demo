### Build:
```bash
mvn clean package
```
### Run:
```bash
SPARK_HOME="/hd/app/spark"
JAR_FILE=`find . -name "*.jar"`
"$SPARK_HOME"/bin/spark-submit \
    --class com.examples.Main\
    --master local \
    $JAR_FILE \
    $SPARK_HOME
```
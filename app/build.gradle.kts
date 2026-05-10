插件{
id("com.android.application")
ID("org.jetbrains.kotlin.android")
}

安卓{
namespace="com.example.btasciisender"
compileSdk=34

DefaultConfig{
ApplicationID="com.example.btasciisender"
minSdk=21
targetSdk=34
版本代码=1
VersionName="1.0"
    }

buildTypes{
发布{
isMinifyEnabled=false
        }
    }
buildFeatures{
viewBinding=true
    }
}

依赖关系{
实施("androidx.core:core-ktx:1.12.0")
实施("androidx.AppCompat:appcompat:1.6.1")
实施("com.谷歌。安卓。材料：材料：1.10.0")
testImplementation("junit:junit:4.13.2")
androidTestImplementation(“androidx.测试。分机：JUnit:1.1.5英寸)
androidTestImplementation(“androidx.测试。浓缩咖啡：浓缩咖啡芯：3.5.1")
}

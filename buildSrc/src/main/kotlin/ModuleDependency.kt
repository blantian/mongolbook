import kotlin.reflect.full.memberProperties

// "Module" means "subproject" in terminology of Gradle API.
// To be specific each "Android module" is a Gradle "subproject"
@Suppress("unused")
object ModuleDependency {
    // All consts are accessed via reflection
    const val kotlinVersion = "1.5.0"
    const val APP = ":app"
    const val COMMON = ":common"
    const val BASIC = ":basic"
    const val WIDGET = ":widget"
    const val LOGIN = ":login"
    const val MEMBER = ":member"
    const val gradleVersion = "4.1.2"
    const val appcompatVersion = "1.1.0"
    const val cardviewVersion = "1.0.0"
    const val coreKtxVersion = "1.3.2"
    const val fragmentKtxVersion = "1.2.5"
    const val constraintLayoutVersion = "1.1.3"
    const val lifecycleExtensionsVersion = "2.2.0"
    const val retrofitVersion = "2.9.0"
    const val lifecycleVersion = "2.2.0"
    const val circleimageview  ="3.0.0"
    const val materialDialogsVersion = "3.3.0"
    const val klogVersion = "1.6.0"
    const val downloadVersion = "1.7.7"
    const val viewpagerVersion = "1.0.0"
    const val materialVersion = "1.2.1"
    const val toastVersion = "8.6"
    const val blankj = "1.30.6"
    const val adapterVersion = "3.0.4"
    const val swiperefreshlayoutVersion = "1.1.0"
    const val rxhttpVersion = "2.5.5"
    const val okhttpVersion = "4.9.0"
    const val rxhttpCompilerVersion = "2.5.5"
    const val rxlifeCoroutineVersion = "2.0.1"
    const val anchorsVersion = "1.1.1"
    const val mmkvVersion = "1.2.7"
    const val immersionbarVersion = "3.0.0"
    const val smartrefreshVersion = "2.0.1"
    const val backgroundVersion = "1.6.5"
    const val unpeekLivedataVersion = "4.4.1-beta1"
    const val coroutineVersion = "1.3.9"
    const val glideVersion = "4.11.0"
    const val coilVersion = "1.2.0"
    const val xopouVersion = "2.2.5"
    const val loadsirVersion = "1.3.8"
    const val rxlife3 = "3.0.0"
    const val kodein = "7.5.0"
    const val lottie = "3.6.1"
    const val assent = "3.0.0-RC4"
    const val channel = "1.1.2"
    const val flycoTabLayout = "2.1.2@aar"
    const val basePopup = "2.2.20"
    const val rxjava3 = "3.0.7"
    const val flexbox = "1.1.0"
    const val banner = "2.1.0"
    const val zxing = "1.3.7"
    const val roomVersion = "2.2.6"
    const val imagePicker = "v2.7.3-rc03"


    // False positive" function can be private"
    // See: https://youtrack.jetbrains.com/issue/KT-33610
    /*
    Return list of all modules in the project
     */
    fun getAllModules() = ModuleDependency::class.memberProperties
        .filter { it.isConst }
        .map { it.getter.call().toString() }
        .toSet()

    /*
     Return list of feature modules in the project
     */
//    fun getFeatureModules(): Set<String> {
//        val featurePrefix = ":feature_"
//
//        return getAllModules()
//            .filter { it.startsWith(featurePrefix) }
//            .toSet()
//    }
}

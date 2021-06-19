import cocoapods.AFNetworking.*
import cocoapods.Alamofire.AlamofireVersionString
// These next import should work when StarIO imports successfully
//import cocoapods.StarIO.*
//import cocoapods.StarIO_Extension.*

// Sample file that should have access to the iOS imports for the StarIO Sdk
fun sampleFunction() {
    println(AFNetworkingReachabilityNotificationStatusItem)
    println(AlamofireVersionString)
}

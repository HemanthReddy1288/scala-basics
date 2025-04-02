object functions extends App{
  var a=(x:String,y:String)=>x+y
  var b=(_:String)+(_:String)
  println(a("hello","world"))
  println(b("hello","world"))

  var myfun=()=>{"Wellcome to GeeksForGeeks"}
  println(myfun())


}

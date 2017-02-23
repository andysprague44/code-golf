
val p = "abba"
val n = "abab"
def x = (s:String)=>s.reverse==s//s==esrever.s>=)gnirtS:s(

implicit class a(self: (String, Char) => String) {
  def ~(x: ((String, Char) => String) => String) =  x(self)
}
implicit class b(self: ((Char, String) => String)=>String) {
  def ~(x: (Char, String) => String) = self(x)
}

def y = (s: String) =>
  ("":\s).~((l,r)=>(l:Char)+(r:String)) == ((r: String,l: Char)=>l+r).~(""/:s)


x("abab")
x("abba")
y("abab")
y("abba")





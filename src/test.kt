fun main() {
    var tu = Customer("tri",2,3)
    var tuy = Customer("tra",4,5)
    var tu1 = Bill(tu,200,300,300-200)
    var tuy1 = Bill(tuy,300,500,500-300)
    var lit = Manage()
    lit.add(tu1)
    lit.add(tuy1)
    lit.show()

}
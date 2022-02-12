class Manage {
    var list:MutableList<Bill> = mutableListOf()

    fun add(bill:Bill){
        list.add(bill)
    }

    fun show(){
        for(i in list){
            println(i)
        }
    }
}
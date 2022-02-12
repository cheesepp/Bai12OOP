class Customer(name:String,homeNum:Int,id:Int) {
    private var name = ""
    private var homeNum = 0
    private var id = 0
    public var Name:String
        get() = name
        set(value) {name = value}
    public var HomeNum:Int
        get() = homeNum
        set(value) {homeNum = value}
    public var Id:Int
        get() = id
        set(value) {id = value}
    init {
        this.name = name
        this.homeNum = homeNum
        this.id = id
    }

}
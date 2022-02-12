class Bill {
    private lateinit var hodan:Customer
    public var Hodan:Customer
        get() = hodan
        set(value) {hodan = value}
    private var cscu = 0
    public var Cscu:Int
        get() = cscu
        set(value) {cscu = value}
    private var csmo = 0
    public var Csmo:Int
        get() = csmo
        set(value) {csmo = value}
    private var tien = csmo - cscu
    public var Tien:Int
        get() = tien
        set(value) {tien = value}
    constructor(hodan:Customer,cscu:Int,cscmoi:Int,tien:Int){
        this.hodan = hodan
        this.cscu = cscu
        this.csmo = cscmoi
        this.tien = tien
    }
    override fun toString(): String {
        return """
Ho va ten chu ho: ${hodan.Name}
So nha: ${hodan.HomeNum}
ID: ${hodan.Id}
Chi so nuoc cu: $cscu
Chi so nuoc moi: $csmo
Tien: $tien
        """.trimIndent()
    }
}
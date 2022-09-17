package uz.jahongir.viewpager_2

object User {
    val list = ArrayList<MyData>()

    fun addList(){
        list.add(MyData(R.drawable.pic1,"Click va Paymega o’tish xizmati","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum."))
        list.add(MyData(R.drawable.pic2,"Barcha operatorlar bo’yicha statistika","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum."))
        list.add(MyData(R.drawable.pic4,"Tariflarni filtrlash","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum."))
        list.add(MyData(R.drawable.pic3,"Yangi imkoniyatlar","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum."))
    }

}
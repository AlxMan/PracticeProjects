const app = new Vue({
  el:"#app",
  data:{
    books:[
      {
        id:1,
        name:"《java编程思想》",
        date:'2020-9',
        price:98.00,
        count:1
      },
      {
        id:2,
        name:"《数据分析与数据原理》",
        date:'2019-2',
        price:39.00,
        count:1
      },
      {
        id:3,
        name:"《hadoop权威指南》",
        date:'2019-10',
        price:39.00,
        count:1
      },
      {
        id:4,
        name:"《代码大全》",
        date:'2018-8',
        price:128.00,
        count:1
      },
      
    ]
  },
  methods: {
  	//这里我们放弃使用方法的形式来求总价格，转而使用计算属性，因为它的效率更高。
    // getFinalPrice(price){
    //   return "￥"+price.toFixed(2)
    // },
    increment(index){
      this.books[index].count++
    },
    decrement(index){
      this.books[index].count--
    },
    removeHandle(index){
      this.books.splice(index,1);
    }

  },
  computed: {
    totalPrice(){
      // 方案一：普通的for循环
      // let totalPrice = 0;
      // for(let i=0;i<this.books.length;i++){
      //   totalPrice += this.books[i].price * this.books[i].count
      // }
      // return totalPrice

      // 方案二：for in
      // let totalPrice = 0;
      // for(let i in this.books){
      //   // console.log(i);//1 2 3 4
      //   totalPrice += this.books[i].price * this.books[i].count
      // }
      // return totalPrice

      // 方案三：for of
      // let totalPrice = 0;
      // for(let item of this.books){
      //   // console.log(item);//这里拿到的就是数组里的每个对象
      //   totalPrice += item.price * item.count
      // }
      // return totalPrice

      // 方案四:reduce
      return this.books.reduce(function (preValue, book) {
        // console.log(book);//分别输出四个对象
        return preValue + book.price * book.count
      }, 0)
    }
  },
  // 过滤器
  filters:{
    showPrice(price){
      return "￥"+price.toFixed(2)
    }
  }
})

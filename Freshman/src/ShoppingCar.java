public class ShoppingCar {
    String userName;
    CarItem[] items = new CarItem[5];
    int count = 0; //商品种类数目
    int totaPrice;

    ShoppingCar(String userName) {
        this.userName = userName;
    }

    void setUserName(String userName) {
        this.userName = userName;
    }

    void setItems(CarItem[] items) {
        this.items = items;
    }

    void setCount(int count) {
        this.count = count;
    }

    void setTotaPrice(int totaPrice) {
        this.totaPrice = totaPrice;
    }

    public void addItem(CarItem i) {
        // 增加数据
        boolean boo = false; // 判断有没有一样类型的
        if (count == 0) {
            items[0] = i;
            count++;
        } else {
            for (int a = 0; a < count; a++) {
                if (i.id.equals(items[a].id)) {
                    items[a].quantity += i.quantity;
                    boo = false;
                } else {
                    boo = true;
                }
            }
            if (boo && count < 5) {
                items[count] = i;
                count++;
            }
        }
    }

    public void removeItem(int i) {
        // 删除数据
        for (int a = i - 1; a < count; a++){
            items[a] = items[a];
        }
        items[count] = null;
        count--;
    }

    public void setQuantity(int i, int quantity) {
        // 修改
        items[i - 1].setQuantity(quantity);
    }

    public String toString() {
        //  返回购物车信息
        if (this.count == 0) {
            return "此用户的购物车是空的";
        } else {
            int num = 0; // 合计
            String str = "";
            for (int i = 1; i <= this.count; i++) {
                str = str + items[i - 1].toString() + "\n";
                num += (items[i - 1].price * items[i - 1].quantity);
            }
            return "id  " + "商品名  " + "单价 " + "数量 " + "总价" + "\n" + str + "\n" + "合计: " + num;
        }
    }

    public void clearCart() {
        // 删除购物车中所有数据
        this.items = new CarItem[5];
        this.count = 0;
        this.totaPrice = 0;
    }
}

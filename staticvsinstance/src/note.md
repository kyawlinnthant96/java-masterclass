Java Notes 

<p>POJO vs JavaBeans
    Pojo က plain old java object ပဲ ပုံမှန် class object တခုပဲ constructor, getter setter တွေနဲ့
    JavaBeans ကြတော့တူတူတော့တူတူပဲ ဒါပေမယ့် သူက constructor no-arg နဲ့သွားတယ် ဘာလို့လဲဆို
    object တခု creation လုပ်စဥ◌်မှာ primitive values တွေကို default assign လုပ်ခြင်လို ဘာလို့လုပ်ရလဲဆို JPA လိုကောင်တွေမှာကြ database table တခုက class တခုကိုကိုယ်စာပြုတော့ framework ကobject creation လုပ်ဖို့ persistence ဖြစ်အောင်လို့,နောက်တခုက record class java14 မှာစပါလာတာ no boilerplate constructor, getter ,setter တွေကိုတိုင်ရေးစရာမလိုသလို immutable ဖြစ်တဲ့ data carrier object အနေနဲ့ကောင်းတယ် သူကိုယူသုံးတဲ့ concurrent threads တွေများလဲ immutabel ဖြစ်တဲ့အတွက် စိတ်ပူစရာမလိုဘူး performance overhead တခုလောက်ကလွဲလို့ အကုန်ကောင်း</p>

``` 
java beans
public class Product {

  // Private member variables for data encapsulation
  private String name;
  private double price;

  // Public no-arg constructor (optional, but recommended for JavaBeans)
  public Product() {
  }

  // Public getter and setter methods for controlled access
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    // You can add validation logic here to ensure a valid price range (e.g., non-negative)
    this.price = price;
  }
}
```

```
PoJo
public class Person {
  private String name;
  private int age;

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}

```

```
record type
public record Person(String name, int age) {}
```


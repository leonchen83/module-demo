import cn.nextop.sub.module1.ExampleInterfaceImpl1;
import cn.nextop.sub.module2.ExampleInterface;

module module1 {
	requires module2;
//	requires transitive module2;
	exports cn.nextop.sub.module1;
//	provides ExampleInterface with ExampleInterfaceImpl1;
}
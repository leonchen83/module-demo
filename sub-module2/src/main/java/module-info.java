import cn.nextop.sub.module2.ExampleInterface;
import cn.nextop.sub.module2.ExampleInterfaceImpl2;

module module2 {
	exports cn.nextop.sub.module2;
	opens cn.nextop.sub.module2;
	provides ExampleInterface with ExampleInterfaceImpl2;
}
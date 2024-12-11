package section10.access2;

import section10.access1.Parent;

public class NotChild {
	Parent p2 = new Parent();
	//p2.accessProtected(); // 에러
}

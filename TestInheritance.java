package cyber.demos;
class Mobile
{
	void doSms()
	{
		System.out.println("you can do sms");
	}
	void doCall()
	{
		System.out.println("we can do call");
	}
}
class SamrtPhone extends Mobile
{
	void doWifi()
	{
		System.out.println("we can access wifi");
	}
	void doBluetooth()
	{
		System.out.println("we can access bt");
	}
}
public class TestInheritance {

	public static void main(String[] args) {
		SamrtPhone sm=new SamrtPhone();
		sm.doBluetooth();
		sm.doCall();
		sm.doSms();
		sm.doWifi();

	}

}

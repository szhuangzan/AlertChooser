#Usage
You can use like this:
##STEP1
In you project,"Properties -> Android -> Library -> Add -> AlertChooser”,and add this lib.
##STEP2
In you project,add the following code:

```java
{
new AlertChooser.Builder(this)
.setTitle("温馨提示")
.addItem("选项一", new AlertChooser.OnItemClickListener() {
					
	@Override
	public void OnItemClick(DialogInterface chooser) {
		Toast.makeText(this, "你点击了选项一", 0).show();
	}
})
.addItem("选项二", new AlertChooser.OnItemClickListener() {
					
	@Override
	public void OnItemClick(DialogInterface chooser) {
		Toast.makeText(this, "你点击了选项二", 0).show();
	}
})
.setNegativeItem("取消", new AlertChooser.OnItemClickListener() {

	@Override
	public void OnItemClick(DialogInterface chooser) {
		chooser.dismiss();
	}
})
.show();
```

#Snapshot
![Snapshot](http://s12.sinaimg.cn/middle/0021tin2zy6MKY25X4feb&690)



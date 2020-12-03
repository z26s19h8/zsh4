# zsh4
第5次 Java作业
## 实验目的
掌握字符串String及其方法的使用，掌握文件的读取/写入方法，掌握异常处理结构
## 实验要求
每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
允许提供输入参数，统计古诗中某个字或词出现的次数
输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A
考虑操作中可能出现的异常，在程序中设计异常处理程序
## 实验过程
运用String及其方法，实例化，文件的读取和写入
## 核心代码
```
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.age = age;
		Scanner sc = new Scanner(System.in);
		System.out.println("姓名");
		name = sc.next();
		System.out.println("学号");
		id = sc.nextInt();
		System.out.println("性别");
		gender = sc.next();
		System.out.println("年龄");
		age = sc.nextInt();
		System.out.println("你输入的姓名" + name + "学号：" + id + "性别:" + gender + "年龄"
				+ age);

```
```
try (FileReader fInputStream = new FileReader("F:\\作业\\B.txt");
				FileWriter fOutputStream = new FileWriter("F:\\作业\\A.txt")) {
			StringBuffer st = new StringBuffer();
			char[] ch = new char[14];
			while ((fInputStream.read(ch)) != -1) {
				st.append(ch, 0, 7);
				st.append("，");
				st.append(ch, 7, 7);
				st.append("。" + "\n");
			}
			System.out.println(st);
			fOutputStream.write(new String(st));
		} catch (IOException e) {
			e.printStackTrace();
		}
```
```
Student stu = new Student();
		stu.toshows();
		Test test = new Test();
		Test.txt();
		File file = new File("F:\\作业\\B.txt");
		FileInputStream fis = new FileInputStream(file);
		ByteOutputStream bos = new ByteOutputStream();
		int len;
		byte[] data = null;
		byte[] buffer = new byte[(int) file.length()];

		while ((len = fis.read(buffer)) != -1) {
			bos.write(buffer, 0, len);
		}
		data = bos.toByteArray();
		String str = new String(data);

		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("输入你要查找的字或词：");
		char o = sc.next().charAt(0);
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (o == ch[i]) {
				count++;
			}
```
## 实验感想
通过这次实验，我学会了字符串String及其方法的使用，掌握文件的读取/写入方法，掌握异常处理结构，再次巩固了实例化的使用。

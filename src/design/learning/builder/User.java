package design.learning.builder;

public class User {
	private int id;
	private String name;
	private int age;
	
	private User() {
	}
	
	/**
	 * 充当导演角色， 决定按照盒子顺序装配，构建对象。
	 * @param builder
	 */
	private User(Builder builder) {
		id = builder.id;
		name = builder.name;
		age = builder.age;
	}
	
	public static Builder getUserBuilder() {
		return new Builder();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	 * 构建对象各个组件
	 */
	public static class Builder  {
		private int id;
		private String name;
		private int age;
		
		private Builder() {
			
		}
		
		/**
		 * 最终构建方法
		 * @return
		 */
		public User build() {
			return new User(this);
		}
		
		public Builder setId(int id) {
			this.id = id;
			return this;
		}
		
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder setAge(int age) {
			this.age = age;
			return this;
		}
	}
	
}

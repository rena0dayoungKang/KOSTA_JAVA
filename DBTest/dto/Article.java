package dto;

//db에 있는 article 테이블 그대로 따옴

public class Article {
	private Integer num;
	private String title;
	private String content;
	private String writer;
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	/**
	 * @param num
	 * @param title
	 * @param content
	 * @param writer
	 */
	public Article(String title, String content, String writer) {
		super();
		//this.num = num; number는 auto_increment라서 
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	/**
	 * 
	 */
	public Article() {
		
	}
	@Override
	public String toString() {
		return "Article [num=" + num + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	/**
	 * @param num
	 * @param title
	 * @param content
	 * @param writer
	 */
	public Article(Integer num, String title, String content, String writer) {
		super();
		this.num = num;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	
}

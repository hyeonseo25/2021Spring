package kr.hs.study.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.TodoDAO;
import kr.hs.study.dto.TodoDTO;

public class MainClass {

   public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
      AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);

      TodoDAO dao = ctx.getBean(TodoDAO.class);
      
      int num = 0;
      while(num!=5) {
    	  
    	  System.out.println("============Todo List============");
    	  System.out.println("1. 할 일 조회");
    	  System.out.println("2. 할 일 추가");
	      System.out.println("3. 할 일 삭제");
	      System.out.println("4. 할 일 수정");
	      System.out.println("5. EXIT");
	      System.out.print("==>");
	      num = scan.nextInt();
	      String str = scan.nextLine();
	      switch (num) {
	  		case 1:
	  			System.out.println("============Todo List============");
	  			System.out.println("제목\t\t시기\t종류\t날짜/마감일");
	  			List<TodoDTO> list = dao.select();
	  			for(TodoDTO dto : list) {
	  				System.out.printf("%-12s\t",dto.getContent());
		  	    	System.out.print(dto.getPeriod()+"\t");
		  	    	System.out.print(dto.getType()+"\t");
		  	    	System.out.println(dto.getDeadline()+"\t");
	  			}
	  			System.out.println("");
	  			break;
	  		case 2:
	  			TodoDTO bean1 = ctx.getBean(TodoDTO.class);
	  			System.out.println("\n=========================");
	  			System.out.println("TodoList에 추가할 내용을 작성해주세요");
	  			System.out.println("할 일 내용");
	  			System.out.print("==> ");
	  			String input=scan.nextLine();
	  			System.out.println(input);
		  	    bean1.setContent(input);
		  	    
		  	    System.out.println("기간 (1. 오늘 / 2. 내일 / 3. 이번주 / 4. 이번달 / 5. 올해 / 6. 기한없음)");
	  			System.out.print("==> ");
	  			input=scan.nextLine();
	  			bean1.setPeriod(Integer.parseInt(input));
	  			
	  			System.out.println("카테고리 (ex) 취업준비 / 과제 ...)");
	  			System.out.print("==> ");
	  			input=scan.nextLine();
	  			bean1.setType(input);
		  	    
		  	    System.out.println("마감일 (YYYY-MM-DD)");
	  			System.out.print("==> ");
	  			input=scan.nextLine();
	  			java.sql.Date d = java.sql.Date.valueOf(input);
		  	    bean1.setDeadline(d); 
		  	    
		  	    bean1.setDone("0");
		  	    
		  	    dao.insert_data(bean1);
		  	    System.out.println("입력완료");
	  			break;
	  		case 3:
	  	
	  			break;
	  		case 4:
	  			
	  			break;
	  		case 5:
	  			num = 5;
	  			break;
	
	  		default:
	  			System.out.println("다시 입력해주세요");
	  			break;
	  		}
      }
      System.out.println("프로그램 종료");
      /**/
      
      /*BookDTO bean2 = ctx.getBean(BookDTO.class);
      bean2.setTitle("책책");
      bean2.setAuthor("김작가"); 
      bean2.setPrice(30000);
      bean2.setEmail("booklove@gmail.com"); 
      dao.update_data(bean2);
      System.out.println("수정완료");*/
      
      /*BookDTO bean3 = ctx.getBean(BookDTO.class);
      bean3.setTitle("책책");
      bean3.setAuthor("김작가"); 
      bean3.setPrice(20000);
      bean3.setEmail("booklove@gmail.com"); 
      dao.delete_data(bean3);
      System.out.println("삭제완료");*/
      
      
      //ctx.close();
   }
   
}
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        //Variable Declaration
        Scanner sc = new Scanner(System.in);
        int menuNo;

        while(true){
            System.out.println("메뉴:");
            System.out.println("  1: 게시글 목록");
            System.out.println("  2: 게시글 상세보기");

            System.out.print("\n메뉴를 선택하세요[1..2]: (0:종료)");
            menuNo = sc.nextInt();
            sc.nextLine();

            if(menuNo==0){
                System.out.println("안녕히가세요!");
                break;
            }

            while(menuNo<1 || menuNo>2){
                System.out.print("1에서 2사이의 메뉴 번호를 입력하세요: ");
                menuNo = sc.nextInt();
            }

            if(menuNo==1){
                System.out.println("[게시글 목록]");
                System.out.println("번호 제목 조회수 작성자 등록일");

                System.out.print(1);
                System.out.print("\t");
                System.out.print("제목입니다");
                System.out.print("\t");
                System.out.print(20 + "\t");
                System.out.print("홍길동\t");
                System.out.print("2022-07-08\n");

                System.out.print(2 + "\t" + "제목입니다2\t" + 11 + "\t" + "홍길동\t" + "2022-07-08\n");
                System.out.println(3 + "\t" + "제목입니다3\t" + 31 + "\t" + "임꺽정\t" + "2022-07-08");

                System.out.printf("%d\t%s\t%d\t%s\t%s\n", 4, "제목입니다4", 41, "임깍장", "2022-07-08");
            }else{
                if(menuNo==2){
                    System.out.println("[게시판 상세보기]");

                    System.out.printf("번호: %d\n", 1);
                    System.out.printf("제목: %s\n", "제목입니다1.");
                    System.out.printf("내용: %s\n", "내용입니다.");
                    System.out.printf("조회수: %d\n", 100);
                    System.out.printf("작성자: %s\n", "홍길동");
                    System.out.printf("등록일: %s\n", "2022-07-08");
                }else{
                    System.out.println("메뉴 번호가 옳지 않습니다.");
                }
            }
        }
        sc.close();
    }
}

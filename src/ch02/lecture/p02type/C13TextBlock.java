package ch02.lecture.p02type;

public class C13TextBlock {
    public static void main(String[] args) {
        //"""로 묶음
        //newline, 따옴표등을 탈출문자 없이 사용 가능
        // 가장 왼쪽에 있는 문자 기준으로 들여쓰기 결정
        String html = """
                <head>
                     <title>웹 페이지
                     dfjkajb "dkjafkb" dfkb;
                     dafj; "abfafd" bkafe
                     </title>
                </head>
                """;
    }
}

package ch07.p5super;

import ch07.sec07.exam03.Parent;

public class C03Super {
}

class C03Parent {
    // 파라미터 있는 생성자 만들면
    // 파라미터 없는 생성자가 자동 생성되지 않음

    public C03Parent(int age) {
    }
}

class C03Child extends C03Parent {
    C03Child() {
        // 상위 타입의 파마리멑 없는 생성자가 없으므로 super에서 오류남
        // 그래서 파라미터 있는 상위생성자를 명시적으로 작성해주어야 함
        super(33);
    }
}

// package ex03;

// public class MyStar01 {
// public static void main(String[] args) {

// // *
// // System.out.println("*"); // * n
// // System.out.println("**"); // * + * n + n
// // System.out.println("***"); // * + * + * n + n + n
// // System.out.println("****"); // * + * + * + * n + n + n + n
// // System.out.println("*****"); // * + * + * + * + * n + n + n + n + n (n *
// i)

// // System.out.println("*"); // i = 0
// // System.out.println("*" + "*"); // i = 1
// // System.out.println("*" + "*" + "*"); // i = 2
// // System.out.println("*" + "*" + "*" + "*"); // i = 3
// // System.out.println("*" + "*" + "*" + "*" + "*"); // i = 4

// // for한번이 지날때마다 +"*" 해주면 되는데 ...

// // 1. 처음에는 코드를 삽질
// // System.out.println("c");
// // System.out.println("c" + "c");
// // System.out.println("c" + "c" + "c");
// // System.out.println("c" + "c" + "c" + "c");
// // System.out.println("c" + "c" + "c" + "c" + "c");

// // 2. 두번째에는 문법이 들어간 코드를 삽질
// // 2-1 for 구문을 사용하는데 별 한개 출력

// int end = 0;

// for (int i = 0; i < 5; i++) {
// end = end + 1;
// for (int j = 0; j < end; j++) {
// System.out.print("c");
// }
// System.out.println();

// System.out.println("=========================");

// for (int i = 0; i < end; i++) {
// System.out.print("c");
// }
// System.out.println();

// // 2-2 for 구문을 사용하는데 별 두개 출력
// // -> 여기서 이상한걸 느껴야지, 값은 ** 이거를 원했는데 * * 이게 출력되었으니까
// // 의문점을 가지고 수정을 했어야지
// for (int i = 0; i < end; i++) {
// System.out.print("c");
// }
// System.out.println();

// // 2-3 for 구문을 사용하는데 별 세개 출력
// for (int i = 0; i < end; i++) {
// System.out.print("c");
// }
// System.out.println();

// // 2-4 for 구문을 사용하는데 별 네개 출력
// for (int i = 0; i < end; i++) {
// System.out.print("c");
// }
// System.out.println();

// for (int i = 0; i < end; i++) {
// System.out.print("c");
// }
// System.out.println();

// // 3. 완성됬으면 이제 코드를 리팩토링 하는거야
// // 각각의 코드를 봐봐 뭐가 같은지
// // 코드가 같은 부분을 다시 간소화 하는것을 리펙토링이라고 부른다.

// }
// }

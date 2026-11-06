# String과 StringBuffer의 차이

`String`은 만들어진 문자열 내용을 바꾸지 않는 불변 객체이고, `StringBuffer`는 같은 객체의 내용을 바꿀 수 있는 가변 객체입니다. 문자열을 다루는 방식과 사용 목적이 다르므로 작업 상황에 맞게 선택합니다.

## 1. `String`: 내용을 바꾸지 않음

`String`의 메서드는 원래 문자열을 수정하지 않습니다. 변환이나 결합 결과를 사용하려면 반환된 문자열을 변수에 저장해야 합니다.

```java
String text = "Hello";
String upper = text.toUpperCase();

System.out.println(text);  // Hello
System.out.println(upper); // HELLO
```

`toUpperCase()`는 대문자로 변환한 결과를 반환하며, `text`의 값은 그대로입니다.

## 2. `StringBuffer`: 내용을 변경할 수 있음

`StringBuffer`는 문자열을 추가하거나 특정 위치에 삽입할 때 같은 객체의 내용을 변경합니다.

```java
StringBuffer buffer = new StringBuffer("Hello");
buffer.append(" Java");
buffer.insert(5, "!");

System.out.println(buffer); // Hello! Java
```

`toString()`을 호출하면 현재 내용을 `String`으로 가져올 수 있습니다.

```java
String result = buffer.toString();
```

`StringBuffer`의 주요 메서드는 동기화되어 있어 여러 스레드가 같은 객체를 사용할 때 동기화가 필요한 경우에 고려할 수 있습니다. 다만 여러 메서드 호출로 이루어진 작업 전체가 하나의 원자적 동작이 되는 것은 아닙니다.

## 3. 언제 무엇을 사용할까?

`StringBuffer`가 항상 `String`보다 느리거나 메모리를 더 사용한다고 단정할 수는 없습니다. 반복해서 내용을 바꾸는 작업에서는 가변 문자열을 사용하는 편이 적절할 수 있고, 한 스레드에서 문자열을 조립하는 경우에는 동기화 오버헤드가 없는 `StringBuilder`를 주로 사용합니다.

| 상황 | 선택 |
| --- | --- |
| 값이 바뀌지 않는 문자열을 표현하거나 일반적인 문자열 결합을 할 때 | `String` |
| 한 스레드에서 반복적으로 문자열을 조립할 때 | `StringBuilder` |
| 동기화가 필요한 가변 문자열을 사용할 때 | `StringBuffer` |

문자열을 몇 번 수정하는지뿐 아니라 여러 스레드가 같은 객체를 공유하는지도 고려해 선택합니다.

## 정리

- `String`은 불변이므로 변환 결과를 사용하려면 반환값을 받아야 합니다.
- `StringBuffer`는 기존 객체의 내용을 변경할 수 있고, 메서드가 동기화되어 있습니다.
- 반복 조립에는 보통 `StringBuilder`를, 동기화가 필요한 가변 문자열에는 `StringBuffer`를 고려합니다.

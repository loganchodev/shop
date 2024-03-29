package com.shop.entity;

import com.shop.constant.ItemSellStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity // JPA의 엔티티임을 나타냄. 이 클래스의 인스턴스들은 JPA로 관리되는 데이터베이스 테이블의 행과 매핑됩니다.
@Table(name="item") // 데이터베이스 내에서 엔티티가 매핑될 테이블을 지정합니다. 여기서는 'item' 테이블과 매핑됩니다.
@Getter // Lombok 라이브러리를 사용하여 모든 필드에 대한 getter 메서드를 자동으로 생성합니다.
@Setter // Lombok 라이브러리를 사용하여 모든 필드에 대한 setter 메서드를 자동으로 생성합니다.
@ToString // Lombok 라이브러리를 사용하여 toString 메서드를 자동으로 생성합니다.
public class Item {

    @Id // 이 필드의 값을 기본 키(primary key)로 사용함을 나타냅니다.
    @Column(name="item_id") // 데이터베이스 테이블의 컬럼을 지정합니다. 여기서는 'item_id' 컬럼과 매핑됩니다.
    @GeneratedValue(strategy = GenerationType.AUTO) // 기본 키의 값을 자동으로 생성합니다. 전략은 AUTO로, 특정 데이터베이스에 맞게 자동 선택됩니다.
    private Long id;  // 상품코드

    @Column(nullable = false, length = 50) // 이 필드는 null을 허용하지 않고, 최대 길이는 50입니다.
    private String itemNm;  // 상품명

    @Column(name = "price", nullable = false) // 'price' 컬럼과 매핑되며, null을 허용하지 않습니다.
    private int price;  // 가격

    @Column(nullable = false) // null을 허용하지 않습니다.
    private int stockNumber;    // 재고수량

    @Lob // Large Object를 나타내며, 대용량 데이터를 저장하는 데 사용됩니다. 여기서는 문자열이지만, CLOB으로 처리됩니다.
    @Column(nullable = false) // null을 허용하지 않습니다.
    private String itemDetail;  // 상품 상세 설명

    @Enumerated(EnumType.STRING) // 열거형 타입을 데이터베이스에 문자열로 저장합니다.
    private ItemSellStatus itemSellStatus;  // 상품 판매 상태

    private LocalDateTime regTime;  // 등록 시간. 별도의 어노테이션 지정 없이 사용됩니다.

    private LocalDateTime updateTime;   // 수정 시간. 별도의 어노테이션 지정 없이 사용됩니다.
}

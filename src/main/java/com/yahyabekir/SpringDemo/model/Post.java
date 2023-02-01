package com.yahyabekir.SpringDemo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name= "activity", schema="public")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Post {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_one_generator")
    @SequenceGenerator(name = "sequence_one_generator", sequenceName = "sequence_one_id", allocationSize = 1)
    @Id private String id;
    @Column @NonNull private String user_id;
    @Column @NonNull private String title;
    @Column @NonNull private List<String> likes;
}

package com.lostorfound.lostorfound2.Model;
import jakarta.persistence.*;

import java.util.List;

@Entity
    @Table(name = "users")
    public class UserModel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "username", nullable = false)
        private String username;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

        @Column(name = "password", nullable = false)
        private String password;

        @Enumerated(EnumType.STRING)
        @Column(name = "role", nullable = false)
        private Role role;

        @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
        private List<ItemModel> itemsReported;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Role getRole() {
            return role;
        }

        public void setRole(Role role) {
            this.role = role;
        }
    public List<ItemModel> getItemsReported() { return itemsReported; }
    public void setItemsReported(List<ItemModel> itemsReported) { this.itemsReported = itemsReported; }
    }


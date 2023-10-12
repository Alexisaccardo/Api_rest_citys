package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

@RestController
public class Controlador {
    @PostMapping("/register_users")
    public Users register_users(@RequestBody Users users) throws SQLException, ClassNotFoundException {

        String document = users.getDocument();
        String cellphone = users.getCellphone();
        String code_residence = users.getCode_residence();
        String code_city = users.getCode_city();
        String address = users.getAddress();


        if (document == null || document.equals("") || document.length() < 0 || cellphone == null || cellphone.equals("") || cellphone.length() < 0 ||
                code_residence == null || code_residence.equals("") || code_residence.length() < 0 || code_city == null || code_city.equals("") ||
                code_city.length() < 0 || address == null || address.equals("") || address.length() < 0) {

            return new Users(null,null,null,null,null);
        } else {
            BD bd = new BD();
            String code_BD = BD.Select_code_bd(code_city);

            if (code_BD.equals("")) {
                return new Users(null,null,null,Errors.code_city,null);
            } else {
                bd = new BD();
                users = bd.register(document, cellphone, code_residence, code_city, address);
            }
        }
        return users;
    }

    @PostMapping("/edit")
    public Users edit(@RequestBody Users users) throws SQLException, ClassNotFoundException {

        String document = users.getDocument();
        String cellphone = users.getCellphone();
        String code_residence = users.getCode_residence();
        String code_city = users.getCode_city();
        String address = users.getAddress();


        if (document == null || document.equals("") || document.length() < 0 || cellphone == null || cellphone.equals("") || cellphone.length() < 0 ||
                code_residence == null || code_residence.equals("") || code_residence.length() < 0 || code_city == null || code_city.equals("") ||
                code_city.length() < 0 || address == null || address.equals("") || address.length() < 0) {

            return new Users(null,null,null,null,null);
        } else {
            BD bd = new BD();
            String code_BD = BD.Select_code_bd(code_city);

            if (code_BD.equals("")){
                return new Users(null,null,null,Errors.code_city,null);
            } else {
                users = bd.editar(document, cellphone, code_residence, code_city, address);
            }
        }
        return users;
    }

    @GetMapping("/search/{code}")
    public Users search(@PathVariable String code) throws SQLException, ClassNotFoundException {
        BD bd = new BD();
        Users users;

        if (code == null || code.equals("") || code.length() < 0) {

            return new Users(Errors.search, null, null, null, null);

        } else {
            users = BD.Select_user(code);
        }
        return users;
    }


    @GetMapping("/search")
    public List<Users> search() throws SQLException, ClassNotFoundException {
        BD bd = new BD();
        List<Users> list = bd.search();

        return list;
    }

    @DeleteMapping("/delete")
    public Users delete(@RequestBody Users users) throws SQLException, ClassNotFoundException {
        String code = users.getDocument();
        if (users.getDocument() == null || users.getDocument().equals("") || users.getDocument().length() < 0) {
            return new Users(null, null, null, null, null);
        } else {

            int f = BD.Delete(code);
            if (f == 0) {
                return new Users(Errors.error_delete, null, null, null, null);
            }
        }

        return users;
    }



}

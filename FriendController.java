package syksy24.backend.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import syksy24.backend.domain.Friend;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FriendController {
     private List<Friend> friends = new ArrayList<>();

    @GetMapping("/addfriend")
    public String addFriendForm(Model model) {
        model.addAttribute("friends", friends);
        return "addfriend";
    }

    @PostMapping("/addfriend")
    public String addFriend(@RequestParam String firstName,
    @RequestParam String lastName,
    Model model) {

Friend newFriend = new Friend(firstName, lastName);
friends.add(newFriend);

return "redirect:/friends";
    }
    @GetMapping("/friends")
    public String listFriends(Model model) {
        model.addAttribute("friends", friends);
        return "friendlist";
    }
}

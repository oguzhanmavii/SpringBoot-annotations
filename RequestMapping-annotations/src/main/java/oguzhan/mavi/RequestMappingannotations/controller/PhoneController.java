package oguzhan.mavi.RequestMappingannotations.controller;

import oguzhan.mavi.RequestMappingannotations.entity.Phone;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/phone/")
public class PhoneController {

    @RequestMapping("/details")
    public Phone getPhone()
    {
      Phone phone = new Phone(1,"Iphone 14",2000);
      return phone;
    }
}

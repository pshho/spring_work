package orders.order;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Menu {
	Map<String, Map<String, Integer>> menus = new HashMap<>();
	
	@Autowired
	Food fd;
	
	public Map<String, Map<String, Integer>> getMenus() {
		return menus;
	}

	public void addMenu(String kinds) {
		if(menus.containsKey(kinds)) {
			menus.get(kinds).putAll(fd.getMenu());
		}else {
			menus.put(kinds, fd.getMenu());
		}
	}

	@Override
	public String toString() {
		return "Menu [menus=" + menus + ", fd=" + fd + "]";
	}
}

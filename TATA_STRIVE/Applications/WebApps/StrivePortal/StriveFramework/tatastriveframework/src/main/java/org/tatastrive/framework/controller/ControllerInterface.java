package org.tatastrive.framework.controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/default")
public interface ControllerInterface {
    public static final String CREATE="CREATE";
    public static final String UPDATE="UPDATE";
    public static final String DELETE="DELETE";
    public static final String VIEW="VIEW";
    @PostMapping("/requestProcess")
    public String processRequest(@RequestParam(required = false,defaultValue = "") String data);
}
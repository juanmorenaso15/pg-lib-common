package com.pulse_gym.lb_common.dto;

import lombok.Data;

@Data
public class ChangePasswordByAdminRequestDTO {
    
    /** email del usuario*/
    private String email;   
    
    /** nueva contraseña */
    private String newPassword;    
    
    /** confirmar contraseña */
    private String confirmPassword;
}
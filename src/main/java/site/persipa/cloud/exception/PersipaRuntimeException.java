package site.persipa.cloud.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import site.persipa.cloud.enums.ExceptionLevelEnum;

/**
 * @author persipa
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public abstract class PersipaRuntimeException extends RuntimeException implements PersipaException{

    protected int code;

    protected String msg;

    protected String description;

    protected ExceptionLevelEnum level;

    protected PersipaRuntimeException(PersipaException baseExceptionEnum) {
        this.code = baseExceptionEnum.getCode();
        this.msg = baseExceptionEnum.getMsg();
        this.level = baseExceptionEnum.getLevel();
    }

}

package site.persipa.cloud.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import site.persipa.cloud.enums.ExceptionLevelEnum;
import site.persipa.cloud.enums.PersipaExceptionDef;

/**
 * @author persipa
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class PersipaCustomException extends Exception implements PersipaBaseException {

    protected int code;

    protected String msg;

    protected String description;

    protected ExceptionLevelEnum level;

    public PersipaCustomException(PersipaExceptionDef baseExceptionEnum) {
        this.code = baseExceptionEnum.getCode();
        this.msg = baseExceptionEnum.getMsg();
        this.level = baseExceptionEnum.getLevel();
    }

    public PersipaCustomException(PersipaExceptionDef exception, String description) {
        this(exception);
        this.description = description;
    }

}

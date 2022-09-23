package JsonTest;

public abstract class AbstractBaseResp {

    protected String status;

    protected String errorCode;

    protected String errorMsg;

    public abstract String getStatus();

    public abstract void setStatus(String status);

    public abstract String getErrorCode();

    public abstract void setErrorCode(String errorCode);

    public abstract String getErrorMsg();

    public abstract void setErrorMsg(String errorMsg);
}


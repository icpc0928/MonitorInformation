package MonitorInfo;

public interface IMonitorService {
    /** *//**
     * 獲得當前監控對像.
     * @return 返回監測對象
     * @throws Exception
     */
    public MonitorInfoBean getMonitorInfoBean() throws Exception;
}

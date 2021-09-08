import MonitorInfo.MonitorInfoBean;
import MonitorInfo.MonitorServiceImpl;

public class Test {
    public static void main(String[] args){
        MonitorServiceImpl MSImpl = new MonitorServiceImpl();
        try{
            Thread.sleep(MonitorServiceImpl.CPUTIME);   //執行緒睡五秒

            MonitorInfoBean bean = MSImpl.getMonitorInfoBean();
            System.out.println("OSName: "+bean.getOsName());
            System.out.println("CPU Ratio: "+bean.getCpuRatio());
            System.out.println("Available Mem in JVM: "+String.valueOf(bean.getTotalMemory()/1000.0)+" MB");
            System.out.println("Free Mem in JVM: "+bean.getFreeMemory()/1000.0+" MB");
            System.out.println("Max Available Mem for JVM: "+bean.getMaxMemory()/1000.0+" MB");
            System.out.println("============================");
            System.out.println("Total Physical Mem Size: "+bean.getTotalMemorySize()/1000.0+" MB");
            System.out.println("Total Physical Free Mem: "+bean.getFreePhysicalMemorySize()/1000.0+" MB");
            System.out.println("Total Physical Used Memory: "+bean.getUsedMemory()/1000.0+" MB");
            System.out.println("============================");
            System.out.println("Total Thread in Java: "+bean.getTotalThread());


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

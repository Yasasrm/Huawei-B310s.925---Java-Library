package org.example;

import com.nic.router.AccessPoint;

/**
 * Sample Project
 */
public class App {

    //Router ip address
    private static final String ip = "192.168.1.1";

    public static void main(String[] args) {
        try {
            String session = AccessPoint.getSession(ip);
            System.out.println(AccessPoint.getBasicInformation(session, ip));
            System.out.println(AccessPoint.getTrafficStatistics(session, ip));
            System.out.println(AccessPoint.getMobileDataswitch(session, ip));
            System.out.println(AccessPoint.getStatus(session, ip));
            System.out.println(AccessPoint.getMonthStatistics(session, ip));


            /******************
            Output:
            BasicInformation{productfamily=LTE, classify=cpe, multimode=0, restore_default_status=0, autoupdate_restore_default_status=0, sim_save_pin_enable=0, devicename=B310s-925, softwareVersion=21.333.01.32.1226, webUIVersion=17.100.09.00.03}
            TrafficStatistics{currentConnectTime=8460, currentUpload=27402227, currentDownload=194216758, currentDownloadRate=23746, currentUploadRate=591, totalUpload=438774960906, totalDownload=3983373001432, totalConnectTime=44727897, showtraffic=1}
            MobileDataswitch{dataswitch=1}
            Status{connectionStatus=901, wifiConnectionStatus=, signalStrength=, signalIcon=4, currentNetworkType=19, currentServiceDomain=2, roamingStatus=0, batteryStatus=, batteryLevel=, batteryPercent=, simlockStatus=0, primaryDns=222.165.171.1, secondaryDns=222.165.171.2, primaryIPv6Dns=::, secondaryIPv6Dns=::, currentWifiUser=5, totalWifiUser=32, currenttotalwifiuser=32, serviceStatus=2, simStatus=1, wifiStatus=1, currentNetworkTypeEx=101, maxsignal=5, wifiindooronly=0, wififrequence=0, classify=cpe, flymode=0, cellroam=1, voice_busy=0}
            MonthStatistics{currentMonthDownload=152175269209, currentMonthUpload=13322636712, monthDuration=1480483, monthLastClearTime=2021-6-16}
             ******************/

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

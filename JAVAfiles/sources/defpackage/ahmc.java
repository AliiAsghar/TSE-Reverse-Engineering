package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.net.Uri;
import android.os.SystemClock;
import android.os.health.HealthStats;
import android.os.health.TimerStat;
import android.system.Os;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.android.vcard.VCardConfig;
import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.R;
import com.google.android.gms.common.api.Status;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ahmc {
    private static Method a;

    public ahmc() {
    }

    public static boolean A(String str) {
        if (!str.equals("001")) {
            return true;
        }
        return false;
    }

    public static Map B() {
        HashMap hashMap = new HashMap(286);
        ArrayList arrayList = new ArrayList(25);
        arrayList.add("US");
        arrayList.add("AG");
        arrayList.add("AI");
        arrayList.add("AS");
        arrayList.add("BB");
        arrayList.add("BM");
        arrayList.add("BS");
        arrayList.add("CA");
        arrayList.add("DM");
        arrayList.add("DO");
        arrayList.add("GD");
        arrayList.add("GU");
        arrayList.add("JM");
        arrayList.add("KN");
        arrayList.add("KY");
        arrayList.add("LC");
        arrayList.add("MP");
        arrayList.add("MS");
        arrayList.add("PR");
        arrayList.add("SX");
        arrayList.add("TC");
        arrayList.add("TT");
        arrayList.add("VC");
        arrayList.add("VG");
        arrayList.add("VI");
        hashMap.put(1, arrayList);
        ArrayList arrayList2 = new ArrayList(2);
        arrayList2.add("RU");
        arrayList2.add("KZ");
        hashMap.put(7, arrayList2);
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add("EG");
        hashMap.put(20, arrayList3);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add("ZA");
        hashMap.put(27, arrayList4);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add("GR");
        hashMap.put(30, arrayList5);
        ArrayList arrayList6 = new ArrayList(1);
        arrayList6.add("NL");
        hashMap.put(31, arrayList6);
        ArrayList arrayList7 = new ArrayList(1);
        arrayList7.add("BE");
        hashMap.put(32, arrayList7);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add("FR");
        hashMap.put(33, arrayList8);
        ArrayList arrayList9 = new ArrayList(1);
        arrayList9.add("ES");
        hashMap.put(34, arrayList9);
        ArrayList arrayList10 = new ArrayList(1);
        arrayList10.add("HU");
        hashMap.put(36, arrayList10);
        ArrayList arrayList11 = new ArrayList(2);
        arrayList11.add("IT");
        arrayList11.add("VA");
        hashMap.put(39, arrayList11);
        ArrayList arrayList12 = new ArrayList(1);
        arrayList12.add("RO");
        hashMap.put(40, arrayList12);
        ArrayList arrayList13 = new ArrayList(1);
        arrayList13.add("CH");
        hashMap.put(41, arrayList13);
        ArrayList arrayList14 = new ArrayList(1);
        arrayList14.add("AT");
        hashMap.put(43, arrayList14);
        ArrayList arrayList15 = new ArrayList(4);
        arrayList15.add("GB");
        arrayList15.add("GG");
        arrayList15.add("IM");
        arrayList15.add("JE");
        hashMap.put(44, arrayList15);
        ArrayList arrayList16 = new ArrayList(1);
        arrayList16.add("DK");
        hashMap.put(45, arrayList16);
        ArrayList arrayList17 = new ArrayList(1);
        arrayList17.add("SE");
        hashMap.put(46, arrayList17);
        ArrayList arrayList18 = new ArrayList(2);
        arrayList18.add("NO");
        arrayList18.add("SJ");
        hashMap.put(47, arrayList18);
        ArrayList arrayList19 = new ArrayList(1);
        arrayList19.add("PL");
        hashMap.put(48, arrayList19);
        ArrayList arrayList20 = new ArrayList(1);
        arrayList20.add("DE");
        hashMap.put(49, arrayList20);
        ArrayList arrayList21 = new ArrayList(1);
        arrayList21.add("PE");
        hashMap.put(51, arrayList21);
        ArrayList arrayList22 = new ArrayList(1);
        arrayList22.add("MX");
        hashMap.put(52, arrayList22);
        ArrayList arrayList23 = new ArrayList(1);
        arrayList23.add("CU");
        hashMap.put(53, arrayList23);
        ArrayList arrayList24 = new ArrayList(1);
        arrayList24.add("AR");
        hashMap.put(54, arrayList24);
        ArrayList arrayList25 = new ArrayList(1);
        arrayList25.add("BR");
        hashMap.put(55, arrayList25);
        ArrayList arrayList26 = new ArrayList(1);
        arrayList26.add("CL");
        hashMap.put(56, arrayList26);
        ArrayList arrayList27 = new ArrayList(1);
        arrayList27.add("CO");
        hashMap.put(57, arrayList27);
        ArrayList arrayList28 = new ArrayList(1);
        arrayList28.add("VE");
        hashMap.put(58, arrayList28);
        ArrayList arrayList29 = new ArrayList(1);
        arrayList29.add("MY");
        hashMap.put(60, arrayList29);
        ArrayList arrayList30 = new ArrayList(3);
        arrayList30.add("AU");
        arrayList30.add("CC");
        arrayList30.add("CX");
        hashMap.put(61, arrayList30);
        ArrayList arrayList31 = new ArrayList(1);
        arrayList31.add("ID");
        hashMap.put(62, arrayList31);
        ArrayList arrayList32 = new ArrayList(1);
        arrayList32.add("PH");
        hashMap.put(63, arrayList32);
        ArrayList arrayList33 = new ArrayList(1);
        arrayList33.add("NZ");
        hashMap.put(64, arrayList33);
        ArrayList arrayList34 = new ArrayList(1);
        arrayList34.add("SG");
        hashMap.put(65, arrayList34);
        ArrayList arrayList35 = new ArrayList(1);
        arrayList35.add("TH");
        hashMap.put(66, arrayList35);
        ArrayList arrayList36 = new ArrayList(1);
        arrayList36.add("JP");
        hashMap.put(81, arrayList36);
        ArrayList arrayList37 = new ArrayList(1);
        arrayList37.add("KR");
        hashMap.put(82, arrayList37);
        ArrayList arrayList38 = new ArrayList(1);
        arrayList38.add("VN");
        hashMap.put(84, arrayList38);
        ArrayList arrayList39 = new ArrayList(1);
        arrayList39.add("CN");
        hashMap.put(86, arrayList39);
        ArrayList arrayList40 = new ArrayList(1);
        arrayList40.add("TR");
        hashMap.put(90, arrayList40);
        ArrayList arrayList41 = new ArrayList(1);
        arrayList41.add("IN");
        hashMap.put(91, arrayList41);
        ArrayList arrayList42 = new ArrayList(1);
        arrayList42.add("PK");
        hashMap.put(92, arrayList42);
        ArrayList arrayList43 = new ArrayList(1);
        arrayList43.add("AF");
        hashMap.put(93, arrayList43);
        ArrayList arrayList44 = new ArrayList(1);
        arrayList44.add("LK");
        hashMap.put(94, arrayList44);
        ArrayList arrayList45 = new ArrayList(1);
        arrayList45.add("MM");
        hashMap.put(95, arrayList45);
        ArrayList arrayList46 = new ArrayList(1);
        arrayList46.add("IR");
        hashMap.put(98, arrayList46);
        ArrayList arrayList47 = new ArrayList(1);
        arrayList47.add("SS");
        hashMap.put(211, arrayList47);
        ArrayList arrayList48 = new ArrayList(2);
        arrayList48.add("MA");
        arrayList48.add("EH");
        hashMap.put(212, arrayList48);
        ArrayList arrayList49 = new ArrayList(1);
        arrayList49.add("DZ");
        hashMap.put(213, arrayList49);
        ArrayList arrayList50 = new ArrayList(1);
        arrayList50.add("TN");
        hashMap.put(216, arrayList50);
        ArrayList arrayList51 = new ArrayList(1);
        arrayList51.add("LY");
        hashMap.put(218, arrayList51);
        ArrayList arrayList52 = new ArrayList(1);
        arrayList52.add("GM");
        hashMap.put(220, arrayList52);
        ArrayList arrayList53 = new ArrayList(1);
        arrayList53.add("SN");
        hashMap.put(221, arrayList53);
        ArrayList arrayList54 = new ArrayList(1);
        arrayList54.add("MR");
        hashMap.put(222, arrayList54);
        ArrayList arrayList55 = new ArrayList(1);
        arrayList55.add("ML");
        hashMap.put(223, arrayList55);
        ArrayList arrayList56 = new ArrayList(1);
        arrayList56.add("GN");
        hashMap.put(224, arrayList56);
        ArrayList arrayList57 = new ArrayList(1);
        arrayList57.add("CI");
        hashMap.put(225, arrayList57);
        ArrayList arrayList58 = new ArrayList(1);
        arrayList58.add("BF");
        hashMap.put(226, arrayList58);
        ArrayList arrayList59 = new ArrayList(1);
        arrayList59.add("NE");
        hashMap.put(227, arrayList59);
        ArrayList arrayList60 = new ArrayList(1);
        arrayList60.add("TG");
        hashMap.put(228, arrayList60);
        ArrayList arrayList61 = new ArrayList(1);
        arrayList61.add("BJ");
        hashMap.put(229, arrayList61);
        ArrayList arrayList62 = new ArrayList(1);
        arrayList62.add("MU");
        hashMap.put(230, arrayList62);
        ArrayList arrayList63 = new ArrayList(1);
        arrayList63.add("LR");
        hashMap.put(231, arrayList63);
        ArrayList arrayList64 = new ArrayList(1);
        arrayList64.add("SL");
        hashMap.put(232, arrayList64);
        ArrayList arrayList65 = new ArrayList(1);
        arrayList65.add("GH");
        hashMap.put(233, arrayList65);
        ArrayList arrayList66 = new ArrayList(1);
        arrayList66.add("NG");
        hashMap.put(234, arrayList66);
        ArrayList arrayList67 = new ArrayList(1);
        arrayList67.add("TD");
        hashMap.put(235, arrayList67);
        ArrayList arrayList68 = new ArrayList(1);
        arrayList68.add("CF");
        hashMap.put(236, arrayList68);
        ArrayList arrayList69 = new ArrayList(1);
        arrayList69.add("CM");
        hashMap.put(237, arrayList69);
        ArrayList arrayList70 = new ArrayList(1);
        arrayList70.add("CV");
        hashMap.put(238, arrayList70);
        ArrayList arrayList71 = new ArrayList(1);
        arrayList71.add("ST");
        hashMap.put(239, arrayList71);
        ArrayList arrayList72 = new ArrayList(1);
        arrayList72.add("GQ");
        hashMap.put(240, arrayList72);
        ArrayList arrayList73 = new ArrayList(1);
        arrayList73.add("GA");
        hashMap.put(241, arrayList73);
        ArrayList arrayList74 = new ArrayList(1);
        arrayList74.add("CG");
        hashMap.put(242, arrayList74);
        ArrayList arrayList75 = new ArrayList(1);
        arrayList75.add("CD");
        hashMap.put(243, arrayList75);
        ArrayList arrayList76 = new ArrayList(1);
        arrayList76.add("AO");
        hashMap.put(244, arrayList76);
        ArrayList arrayList77 = new ArrayList(1);
        arrayList77.add("GW");
        hashMap.put(245, arrayList77);
        ArrayList arrayList78 = new ArrayList(1);
        arrayList78.add("IO");
        hashMap.put(246, arrayList78);
        ArrayList arrayList79 = new ArrayList(1);
        arrayList79.add("AC");
        hashMap.put(247, arrayList79);
        ArrayList arrayList80 = new ArrayList(1);
        arrayList80.add("SC");
        hashMap.put(248, arrayList80);
        ArrayList arrayList81 = new ArrayList(1);
        arrayList81.add("SD");
        hashMap.put(249, arrayList81);
        ArrayList arrayList82 = new ArrayList(1);
        arrayList82.add("RW");
        hashMap.put(250, arrayList82);
        ArrayList arrayList83 = new ArrayList(1);
        arrayList83.add("ET");
        hashMap.put(251, arrayList83);
        ArrayList arrayList84 = new ArrayList(1);
        arrayList84.add("SO");
        hashMap.put(252, arrayList84);
        ArrayList arrayList85 = new ArrayList(1);
        arrayList85.add("DJ");
        hashMap.put(253, arrayList85);
        ArrayList arrayList86 = new ArrayList(1);
        arrayList86.add("KE");
        hashMap.put(254, arrayList86);
        ArrayList arrayList87 = new ArrayList(1);
        arrayList87.add(VCardConstants.PROPERTY_TZ);
        hashMap.put(255, arrayList87);
        ArrayList arrayList88 = new ArrayList(1);
        arrayList88.add("UG");
        hashMap.put(256, arrayList88);
        ArrayList arrayList89 = new ArrayList(1);
        arrayList89.add("BI");
        hashMap.put(257, arrayList89);
        ArrayList arrayList90 = new ArrayList(1);
        arrayList90.add("MZ");
        hashMap.put(258, arrayList90);
        ArrayList arrayList91 = new ArrayList(1);
        arrayList91.add("ZM");
        hashMap.put(260, arrayList91);
        ArrayList arrayList92 = new ArrayList(1);
        arrayList92.add("MG");
        hashMap.put(261, arrayList92);
        ArrayList arrayList93 = new ArrayList(2);
        arrayList93.add("RE");
        arrayList93.add("YT");
        hashMap.put(262, arrayList93);
        ArrayList arrayList94 = new ArrayList(1);
        arrayList94.add("ZW");
        hashMap.put(263, arrayList94);
        ArrayList arrayList95 = new ArrayList(1);
        arrayList95.add("NA");
        hashMap.put(264, arrayList95);
        ArrayList arrayList96 = new ArrayList(1);
        arrayList96.add("MW");
        hashMap.put(265, arrayList96);
        ArrayList arrayList97 = new ArrayList(1);
        arrayList97.add("LS");
        hashMap.put(266, arrayList97);
        ArrayList arrayList98 = new ArrayList(1);
        arrayList98.add("BW");
        hashMap.put(267, arrayList98);
        ArrayList arrayList99 = new ArrayList(1);
        arrayList99.add("SZ");
        hashMap.put(268, arrayList99);
        ArrayList arrayList100 = new ArrayList(1);
        arrayList100.add("KM");
        hashMap.put(269, arrayList100);
        ArrayList arrayList101 = new ArrayList(2);
        arrayList101.add("SH");
        arrayList101.add("TA");
        hashMap.put(290, arrayList101);
        ArrayList arrayList102 = new ArrayList(1);
        arrayList102.add("ER");
        hashMap.put(291, arrayList102);
        ArrayList arrayList103 = new ArrayList(1);
        arrayList103.add("AW");
        hashMap.put(297, arrayList103);
        ArrayList arrayList104 = new ArrayList(1);
        arrayList104.add("FO");
        hashMap.put(298, arrayList104);
        ArrayList arrayList105 = new ArrayList(1);
        arrayList105.add("GL");
        hashMap.put(299, arrayList105);
        ArrayList arrayList106 = new ArrayList(1);
        arrayList106.add("GI");
        hashMap.put(350, arrayList106);
        ArrayList arrayList107 = new ArrayList(1);
        arrayList107.add("PT");
        hashMap.put(351, arrayList107);
        ArrayList arrayList108 = new ArrayList(1);
        arrayList108.add("LU");
        hashMap.put(352, arrayList108);
        ArrayList arrayList109 = new ArrayList(1);
        arrayList109.add("IE");
        hashMap.put(353, arrayList109);
        ArrayList arrayList110 = new ArrayList(1);
        arrayList110.add("IS");
        hashMap.put(354, arrayList110);
        ArrayList arrayList111 = new ArrayList(1);
        arrayList111.add("AL");
        hashMap.put(355, arrayList111);
        ArrayList arrayList112 = new ArrayList(1);
        arrayList112.add("MT");
        hashMap.put(356, arrayList112);
        ArrayList arrayList113 = new ArrayList(1);
        arrayList113.add("CY");
        hashMap.put(357, arrayList113);
        ArrayList arrayList114 = new ArrayList(2);
        arrayList114.add("FI");
        arrayList114.add("AX");
        hashMap.put(358, arrayList114);
        ArrayList arrayList115 = new ArrayList(1);
        arrayList115.add("BG");
        hashMap.put(359, arrayList115);
        ArrayList arrayList116 = new ArrayList(1);
        arrayList116.add("LT");
        hashMap.put(370, arrayList116);
        ArrayList arrayList117 = new ArrayList(1);
        arrayList117.add("LV");
        hashMap.put(371, arrayList117);
        ArrayList arrayList118 = new ArrayList(1);
        arrayList118.add("EE");
        hashMap.put(372, arrayList118);
        ArrayList arrayList119 = new ArrayList(1);
        arrayList119.add("MD");
        hashMap.put(373, arrayList119);
        ArrayList arrayList120 = new ArrayList(1);
        arrayList120.add("AM");
        hashMap.put(374, arrayList120);
        ArrayList arrayList121 = new ArrayList(1);
        arrayList121.add("BY");
        hashMap.put(375, arrayList121);
        ArrayList arrayList122 = new ArrayList(1);
        arrayList122.add("AD");
        hashMap.put(376, arrayList122);
        ArrayList arrayList123 = new ArrayList(1);
        arrayList123.add("MC");
        hashMap.put(377, arrayList123);
        ArrayList arrayList124 = new ArrayList(1);
        arrayList124.add("SM");
        hashMap.put(378, arrayList124);
        ArrayList arrayList125 = new ArrayList(1);
        arrayList125.add("UA");
        hashMap.put(380, arrayList125);
        ArrayList arrayList126 = new ArrayList(1);
        arrayList126.add("RS");
        hashMap.put(381, arrayList126);
        ArrayList arrayList127 = new ArrayList(1);
        arrayList127.add("ME");
        hashMap.put(382, arrayList127);
        ArrayList arrayList128 = new ArrayList(1);
        arrayList128.add("XK");
        hashMap.put(383, arrayList128);
        ArrayList arrayList129 = new ArrayList(1);
        arrayList129.add("HR");
        hashMap.put(385, arrayList129);
        ArrayList arrayList130 = new ArrayList(1);
        arrayList130.add("SI");
        hashMap.put(386, arrayList130);
        ArrayList arrayList131 = new ArrayList(1);
        arrayList131.add("BA");
        hashMap.put(387, arrayList131);
        ArrayList arrayList132 = new ArrayList(1);
        arrayList132.add("MK");
        hashMap.put(389, arrayList132);
        ArrayList arrayList133 = new ArrayList(1);
        arrayList133.add("CZ");
        hashMap.put(420, arrayList133);
        ArrayList arrayList134 = new ArrayList(1);
        arrayList134.add("SK");
        hashMap.put(421, arrayList134);
        ArrayList arrayList135 = new ArrayList(1);
        arrayList135.add("LI");
        hashMap.put(423, arrayList135);
        ArrayList arrayList136 = new ArrayList(1);
        arrayList136.add("FK");
        hashMap.put(500, arrayList136);
        ArrayList arrayList137 = new ArrayList(1);
        arrayList137.add("BZ");
        hashMap.put(501, arrayList137);
        ArrayList arrayList138 = new ArrayList(1);
        arrayList138.add("GT");
        hashMap.put(502, arrayList138);
        ArrayList arrayList139 = new ArrayList(1);
        arrayList139.add("SV");
        hashMap.put(503, arrayList139);
        ArrayList arrayList140 = new ArrayList(1);
        arrayList140.add("HN");
        hashMap.put(504, arrayList140);
        ArrayList arrayList141 = new ArrayList(1);
        arrayList141.add("NI");
        hashMap.put(505, arrayList141);
        ArrayList arrayList142 = new ArrayList(1);
        arrayList142.add("CR");
        hashMap.put(506, arrayList142);
        ArrayList arrayList143 = new ArrayList(1);
        arrayList143.add("PA");
        hashMap.put(507, arrayList143);
        ArrayList arrayList144 = new ArrayList(1);
        arrayList144.add("PM");
        hashMap.put(508, arrayList144);
        ArrayList arrayList145 = new ArrayList(1);
        arrayList145.add("HT");
        hashMap.put(509, arrayList145);
        ArrayList arrayList146 = new ArrayList(3);
        arrayList146.add("GP");
        arrayList146.add("BL");
        arrayList146.add("MF");
        hashMap.put(590, arrayList146);
        ArrayList arrayList147 = new ArrayList(1);
        arrayList147.add("BO");
        hashMap.put(591, arrayList147);
        ArrayList arrayList148 = new ArrayList(1);
        arrayList148.add("GY");
        hashMap.put(592, arrayList148);
        ArrayList arrayList149 = new ArrayList(1);
        arrayList149.add("EC");
        hashMap.put(593, arrayList149);
        ArrayList arrayList150 = new ArrayList(1);
        arrayList150.add("GF");
        hashMap.put(594, arrayList150);
        ArrayList arrayList151 = new ArrayList(1);
        arrayList151.add("PY");
        hashMap.put(595, arrayList151);
        ArrayList arrayList152 = new ArrayList(1);
        arrayList152.add("MQ");
        hashMap.put(596, arrayList152);
        ArrayList arrayList153 = new ArrayList(1);
        arrayList153.add("SR");
        hashMap.put(597, arrayList153);
        ArrayList arrayList154 = new ArrayList(1);
        arrayList154.add("UY");
        hashMap.put(598, arrayList154);
        ArrayList arrayList155 = new ArrayList(2);
        arrayList155.add("CW");
        arrayList155.add("BQ");
        hashMap.put(599, arrayList155);
        ArrayList arrayList156 = new ArrayList(1);
        arrayList156.add("TL");
        hashMap.put(670, arrayList156);
        ArrayList arrayList157 = new ArrayList(1);
        arrayList157.add("NF");
        hashMap.put(672, arrayList157);
        ArrayList arrayList158 = new ArrayList(1);
        arrayList158.add("BN");
        hashMap.put(673, arrayList158);
        ArrayList arrayList159 = new ArrayList(1);
        arrayList159.add("NR");
        hashMap.put(674, arrayList159);
        ArrayList arrayList160 = new ArrayList(1);
        arrayList160.add("PG");
        hashMap.put(675, arrayList160);
        ArrayList arrayList161 = new ArrayList(1);
        arrayList161.add("TO");
        hashMap.put(676, arrayList161);
        ArrayList arrayList162 = new ArrayList(1);
        arrayList162.add("SB");
        hashMap.put(677, arrayList162);
        ArrayList arrayList163 = new ArrayList(1);
        arrayList163.add("VU");
        hashMap.put(678, arrayList163);
        ArrayList arrayList164 = new ArrayList(1);
        arrayList164.add("FJ");
        hashMap.put(679, arrayList164);
        ArrayList arrayList165 = new ArrayList(1);
        arrayList165.add("PW");
        hashMap.put(680, arrayList165);
        ArrayList arrayList166 = new ArrayList(1);
        arrayList166.add("WF");
        hashMap.put(681, arrayList166);
        ArrayList arrayList167 = new ArrayList(1);
        arrayList167.add("CK");
        hashMap.put(682, arrayList167);
        ArrayList arrayList168 = new ArrayList(1);
        arrayList168.add("NU");
        hashMap.put(683, arrayList168);
        ArrayList arrayList169 = new ArrayList(1);
        arrayList169.add("WS");
        hashMap.put(685, arrayList169);
        ArrayList arrayList170 = new ArrayList(1);
        arrayList170.add("KI");
        hashMap.put(686, arrayList170);
        ArrayList arrayList171 = new ArrayList(1);
        arrayList171.add("NC");
        hashMap.put(687, arrayList171);
        ArrayList arrayList172 = new ArrayList(1);
        arrayList172.add("TV");
        hashMap.put(688, arrayList172);
        ArrayList arrayList173 = new ArrayList(1);
        arrayList173.add("PF");
        hashMap.put(689, arrayList173);
        ArrayList arrayList174 = new ArrayList(1);
        arrayList174.add("TK");
        hashMap.put(690, arrayList174);
        ArrayList arrayList175 = new ArrayList(1);
        arrayList175.add("FM");
        hashMap.put(691, arrayList175);
        ArrayList arrayList176 = new ArrayList(1);
        arrayList176.add("MH");
        hashMap.put(692, arrayList176);
        ArrayList arrayList177 = new ArrayList(1);
        arrayList177.add("001");
        hashMap.put(800, arrayList177);
        ArrayList arrayList178 = new ArrayList(1);
        arrayList178.add("001");
        hashMap.put(808, arrayList178);
        ArrayList arrayList179 = new ArrayList(1);
        arrayList179.add("KP");
        hashMap.put(850, arrayList179);
        ArrayList arrayList180 = new ArrayList(1);
        arrayList180.add("HK");
        hashMap.put(852, arrayList180);
        ArrayList arrayList181 = new ArrayList(1);
        arrayList181.add("MO");
        hashMap.put(853, arrayList181);
        ArrayList arrayList182 = new ArrayList(1);
        arrayList182.add("KH");
        hashMap.put(855, arrayList182);
        ArrayList arrayList183 = new ArrayList(1);
        arrayList183.add("LA");
        hashMap.put(856, arrayList183);
        ArrayList arrayList184 = new ArrayList(1);
        arrayList184.add("001");
        hashMap.put(870, arrayList184);
        ArrayList arrayList185 = new ArrayList(1);
        arrayList185.add("001");
        hashMap.put(878, arrayList185);
        ArrayList arrayList186 = new ArrayList(1);
        arrayList186.add("BD");
        hashMap.put(880, arrayList186);
        ArrayList arrayList187 = new ArrayList(1);
        arrayList187.add("001");
        hashMap.put(881, arrayList187);
        ArrayList arrayList188 = new ArrayList(1);
        arrayList188.add("001");
        hashMap.put(882, arrayList188);
        ArrayList arrayList189 = new ArrayList(1);
        arrayList189.add("001");
        hashMap.put(883, arrayList189);
        ArrayList arrayList190 = new ArrayList(1);
        arrayList190.add("TW");
        hashMap.put(886, arrayList190);
        ArrayList arrayList191 = new ArrayList(1);
        arrayList191.add("001");
        hashMap.put(888, arrayList191);
        ArrayList arrayList192 = new ArrayList(1);
        arrayList192.add("MV");
        hashMap.put(960, arrayList192);
        ArrayList arrayList193 = new ArrayList(1);
        arrayList193.add("LB");
        hashMap.put(961, arrayList193);
        ArrayList arrayList194 = new ArrayList(1);
        arrayList194.add("JO");
        hashMap.put(962, arrayList194);
        ArrayList arrayList195 = new ArrayList(1);
        arrayList195.add("SY");
        hashMap.put(963, arrayList195);
        ArrayList arrayList196 = new ArrayList(1);
        arrayList196.add("IQ");
        hashMap.put(964, arrayList196);
        ArrayList arrayList197 = new ArrayList(1);
        arrayList197.add("KW");
        hashMap.put(965, arrayList197);
        ArrayList arrayList198 = new ArrayList(1);
        arrayList198.add("SA");
        hashMap.put(966, arrayList198);
        ArrayList arrayList199 = new ArrayList(1);
        arrayList199.add("YE");
        hashMap.put(967, arrayList199);
        ArrayList arrayList200 = new ArrayList(1);
        arrayList200.add("OM");
        hashMap.put(968, arrayList200);
        ArrayList arrayList201 = new ArrayList(1);
        arrayList201.add("PS");
        hashMap.put(970, arrayList201);
        ArrayList arrayList202 = new ArrayList(1);
        arrayList202.add("AE");
        hashMap.put(971, arrayList202);
        ArrayList arrayList203 = new ArrayList(1);
        arrayList203.add("IL");
        hashMap.put(972, arrayList203);
        ArrayList arrayList204 = new ArrayList(1);
        arrayList204.add("BH");
        hashMap.put(973, arrayList204);
        ArrayList arrayList205 = new ArrayList(1);
        arrayList205.add("QA");
        hashMap.put(974, arrayList205);
        ArrayList arrayList206 = new ArrayList(1);
        arrayList206.add("BT");
        hashMap.put(975, arrayList206);
        ArrayList arrayList207 = new ArrayList(1);
        arrayList207.add("MN");
        hashMap.put(976, arrayList207);
        ArrayList arrayList208 = new ArrayList(1);
        arrayList208.add("NP");
        hashMap.put(977, arrayList208);
        ArrayList arrayList209 = new ArrayList(1);
        arrayList209.add("001");
        hashMap.put(979, arrayList209);
        ArrayList arrayList210 = new ArrayList(1);
        arrayList210.add("TJ");
        hashMap.put(992, arrayList210);
        ArrayList arrayList211 = new ArrayList(1);
        arrayList211.add("TM");
        hashMap.put(993, arrayList211);
        ArrayList arrayList212 = new ArrayList(1);
        arrayList212.add("AZ");
        hashMap.put(994, arrayList212);
        ArrayList arrayList213 = new ArrayList(1);
        arrayList213.add("GE");
        hashMap.put(995, arrayList213);
        ArrayList arrayList214 = new ArrayList(1);
        arrayList214.add("KG");
        hashMap.put(996, arrayList214);
        ArrayList arrayList215 = new ArrayList(1);
        arrayList215.add("UZ");
        hashMap.put(998, arrayList215);
        return hashMap;
    }

    public static void C(ListenableFuture listenableFuture) {
        listenableFuture.c(new ahsa(listenableFuture, 5), andi.a);
    }

    public static void D(JSONObject jSONObject, String str, CharSequence charSequence) {
        if (charSequence.length() != 0) {
            jSONObject.putOpt(str, charSequence);
        }
    }

    public static void E(JSONObject jSONObject, String str, Number number) {
        if (number.intValue() != 0) {
            jSONObject.putOpt(str, number);
        }
    }

    public static void F(JSONObject jSONObject, String str, Collection collection) {
        if (!collection.isEmpty()) {
            jSONObject.putOpt(str, new JSONArray(collection));
        }
    }

    public static void G(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        if (jSONObject2.length() != 0) {
            jSONObject.putOpt(str, jSONObject2);
        }
    }

    public static String H(String str) {
        return a.bW(str, "sticker-", ".pbg.gz");
    }

    public static String I(String str, Locale locale, aouz aouzVar) {
        return String.format(Locale.US, "%s-%s-%016X", locale, str, Long.valueOf(Arrays.hashCode(aouzVar.toByteArray())));
    }

    public static int J(int i, float f, float f2, float f3) {
        return (int) ((i - (f3 + f3)) / (f + (f2 + f2)));
    }

    public static Drawable K(Drawable drawable, View view, int i, int i2) {
        int i3;
        int i4 = view.getLayoutParams().width;
        if (i4 > i) {
            i3 = (i4 - i) / 2;
        } else {
            i3 = 0;
        }
        InsetDrawable insetDrawable = new InsetDrawable(drawable, i3);
        insetDrawable.setAlpha(i2);
        return insetDrawable;
    }

    public static String L(String str) {
        int indexOf = str.indexOf(47, 6);
        if (indexOf == -1) {
            return "";
        }
        return str.substring(0, indexOf);
    }

    public static void M(View view, String str) {
        Context context = view.getContext();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
            obtain.getText().add(str);
            obtain.setClassName(view.getClass().getName());
            obtain.setSource(view);
            obtain.setPackageName(context.getPackageName());
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    public static boolean N(int i) {
        if (i == 1) {
            return true;
        }
        return false;
    }

    public static String O(Context context, String str, long j, int i) {
        Resources resources = context.getApplicationContext().getResources();
        InputStream openRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.id.dummy_placeholder)));
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            openRawResource.skip(j);
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            while (i > 0) {
                int read = openRawResource.read(bArr, 0, Math.min(i, 1024));
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i -= read;
            }
            openRawResource.close();
            try {
                return byteArrayOutputStream.toString("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e);
            }
        } catch (IOException e2) {
            throw new RuntimeException("Failed to read license or metadata text.", e2);
        }
    }

    public static String P(aiom aiomVar) {
        int indexOf;
        String j = aiomVar.j("CSeq");
        if (j != null && (indexOf = j.indexOf(32)) != -1) {
            return j.substring(indexOf + 1);
        }
        return null;
    }

    public static void Q(ainh ainhVar, String str) {
        try {
            ailc a2 = ainx.a(str.trim() + "\n");
            if (a2 == null) {
                advr.g("Unable to create parser", new Object[0]);
            } else {
                ainhVar.k(a2.h());
            }
        } catch (ailb e) {
            advr.i(e, "Unable to add header", new Object[0]);
        }
    }

    public static ailt R(int i, String str) {
        if (i >= 0) {
            ailt ailtVar = new ailt();
            ailtVar.f(str);
            ailtVar.g(i);
            return ailtVar;
        }
        throw new IllegalArgumentException(a.bV(i, "bad arg "));
    }

    public static ailu S(String str) {
        if (str != null) {
            ailu ailuVar = new ailu();
            ailuVar.b(str);
            return ailuVar;
        }
        throw new IllegalArgumentException("null arg callId");
    }

    public static aima T(int i) {
        aima aimaVar = new aima();
        aimaVar.b(i);
        return aimaVar;
    }

    public static aimb U(String str, String str2) {
        aimb aimbVar = new aimb();
        aimbVar.g(str);
        aimbVar.f(str2);
        return aimbVar;
    }

    public static aime V(int i) {
        if (i >= 0) {
            aime aimeVar = new aime();
            aimeVar.e(i);
            return aimeVar;
        }
        throw new IllegalArgumentException(a.bV(i, "bad value "));
    }

    public static aimg W(aikn aiknVar, String str) {
        aimg aimgVar = new aimg();
        aimgVar.a = aiknVar;
        aimgVar.e(str);
        return aimgVar;
    }

    public static aimh X(String str, String str2) {
        String concat;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(":");
        stringBuffer.append(str2);
        String stringBuffer2 = stringBuffer.toString();
        Class cls = (Class) aiml.a.get(str.toLowerCase(Locale.US));
        if (cls == null) {
            aimf aimfVar = new aimf();
            aimfVar.c = str;
            aimfVar.d = str2;
            return aimfVar;
        }
        if (str2 == null) {
            try {
                ((aimh) cls.newInstance()).c = str;
            } catch (Exception unused) {
                throw new ailb("Problems creating header!");
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            concat = stringBuffer2.concat("\n\n");
            if (concat.charAt(i) != '\n' && concat.charAt(i) != '\t' && concat.charAt(i) != ' ') {
                break;
            }
            i++;
        }
        while (i < concat.length()) {
            if (i < concat.length() - 1 && concat.charAt(i) == '\n') {
                int i2 = i + 1;
                if (concat.charAt(i2) == '\t' || concat.charAt(i2) == ' ') {
                    sb.append(' ');
                    i = i2;
                    i++;
                }
            }
            sb.append(concat.charAt(i));
            i++;
        }
        sb.append("\n");
        ailc a2 = ainx.a(sb.toString());
        if (a2 != null) {
            aimh h = a2.h();
            if (h instanceof aimi) {
                aimi aimiVar = (aimi) h;
                if (aimiVar.b() <= 1) {
                    return aimiVar.f();
                }
                throw new ailb("Only singleton allowed !");
            }
            return h;
        }
        throw new ailb("could not create parser");
    }

    public static aimj Y(int i) {
        aimj aimjVar = new aimj();
        aimjVar.b(i);
        return aimjVar;
    }

    public static aimy Z(aikn aiknVar, String str) {
        aimy aimyVar = new aimy();
        aimyVar.a = aiknVar;
        if (str != null) {
            aimyVar.f(str);
        }
        return aimyVar;
    }

    private static IOException a(File file, IOException iOException, String str) {
        String concat;
        try {
            concat = "Inoperable file:" + String.format(Locale.US, " canonical[%s] freeSpace[%d] protoName[%s]", file.getCanonicalPath(), Long.valueOf(file.getFreeSpace()), str);
            try {
                concat = concat + String.format(Locale.US, " mode[%d]", Integer.valueOf(Os.stat(file.getCanonicalPath()).st_mode));
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            concat = "Inoperable file:".concat(" failed");
        }
        return new IOException(concat, iOException);
    }

    public static ainb aa(String str, int i, String str2, String str3) {
        if (str != null && str2 != null) {
            ainb ainbVar = new ainb();
            ainbVar.e(str3);
            ainbVar.b.a = new aikv(str);
            ainbVar.b.b = i;
            ainbVar.p(str2);
            return ainbVar;
        }
        throw new IllegalArgumentException("null arg");
    }

    public static /* synthetic */ String ab(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "KEEP_ALIVE_RESPONSE";
                }
                return "KEEP_ALIVE_REQUEST";
            }
            return "RESPONSE";
        }
        return "REQUEST";
    }

    public static Uri ac(Uri uri, String str) {
        return uri.buildUpon().path(String.valueOf(uri.getPath()).concat(str)).build();
    }

    public static ListenableFuture ad(ListenableFuture listenableFuture) {
        return ancj.f(listenableFuture, new algm(null), andi.a);
    }

    public static void ae(aiwv aiwvVar, HashMap hashMap) {
        String a2 = aiwvVar.a();
        albo.N(!hashMap.containsKey(a2), "There is already a factory registered for the ID %s", a2);
        hashMap.put(a2, aiwvVar);
    }

    public static void af(boolean z, String str, Object... objArr) {
        if (z) {
        } else {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static File ag(Uri uri) {
        if (uri.getScheme().equals("file")) {
            if (TextUtils.isEmpty(uri.getQuery())) {
                if (TextUtils.isEmpty(uri.getAuthority())) {
                    return new File(uri.getPath());
                }
                throw new aivl("Did not expect uri to have authority");
            }
            throw new aivl("Did not expect uri to have query");
        }
        throw new aivl("Scheme must be 'file'");
    }

    public static Uri ah(Uri.Builder builder, alob alobVar) {
        return builder.encodedFragment(aivv.a(alobVar.g())).build();
    }

    public static void ai(File file, Uri.Builder builder) {
        builder.path(file.getAbsolutePath());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static File aj(Uri uri, Context context) {
        char c;
        Context createDeviceProtectedStorageContext;
        File filesDir;
        Context createDeviceProtectedStorageContext2;
        boolean z;
        Account account;
        if (uri.getScheme().equals("android")) {
            if (!uri.getPathSegments().isEmpty()) {
                if (TextUtils.isEmpty(uri.getQuery())) {
                    ArrayList arrayList = new ArrayList(uri.getPathSegments());
                    String str = (String) arrayList.get(0);
                    switch (str.hashCode()) {
                        case -1820761141:
                            if (str.equals("external")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 94416770:
                            if (str.equals("cache")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 97434231:
                            if (str.equals("files")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 835260319:
                            if (str.equals("managed")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 988548496:
                            if (str.equals("directboot-cache")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 991565957:
                            if (str.equals("directboot-files")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                        filesDir = createDeviceProtectedStorageContext.getFilesDir();
                    } else if (c == 1) {
                        createDeviceProtectedStorageContext2 = context.createDeviceProtectedStorageContext();
                        filesDir = createDeviceProtectedStorageContext2.getCacheDir();
                    } else if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                if (c == 5) {
                                    filesDir = context.getExternalFilesDir(null);
                                } else {
                                    throw new aivl(String.format("Path must start with a valid logical location: %s", uri));
                                }
                            } else {
                                File file = new File(ak(context), "managed");
                                if (arrayList.size() >= 3) {
                                    try {
                                        String str2 = (String) arrayList.get(2);
                                        Account account2 = aiux.a;
                                        if ("shared".equals(str2)) {
                                            account = aiux.a;
                                        } else {
                                            int indexOf = str2.indexOf(58);
                                            if (indexOf >= 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            af(z, "Malformed account", new Object[0]);
                                            account = new Account(str2.substring(indexOf + 1), str2.substring(0, indexOf));
                                        }
                                        if (!aiux.a(account)) {
                                            throw new aivl("AccountManager cannot be null");
                                        }
                                    } catch (IllegalArgumentException e) {
                                        throw new aivl(e);
                                    }
                                }
                                filesDir = file;
                            }
                        } else {
                            filesDir = context.getCacheDir();
                        }
                    } else {
                        filesDir = ak(context);
                    }
                    return new File(filesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new aivl("Did not expect uri to have query");
            }
            throw new aivl(String.format("Path must start with a valid logical location: %s", uri));
        }
        throw new aivl("Scheme must be 'android'");
    }

    public static File ak(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            SystemClock.sleep(100L);
            filesDir = context.getFilesDir();
            if (filesDir == null) {
                throw new IllegalStateException("getFilesDir returned null twice.");
            }
        }
        return filesDir;
    }

    public static void al(da daVar) {
        if (a == null) {
            try {
                Method declaredMethod = da.class.getDeclaredMethod("noteStateNotSaved", null);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                c(e);
            }
        }
        try {
            Method method = a;
            method.getClass();
            method.invoke(daVar, null);
        } catch (IllegalAccessException e2) {
            c(e2);
        } catch (InvocationTargetException e3) {
            c(e3);
        }
    }

    public static agcp am(String str, StringBuilder sb, ArrayList arrayList) {
        return new agcp(str, sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public static IOException an(agcp agcpVar, Uri uri, IOException iOException, String str) {
        try {
            aivy aivyVar = new aivy();
            aivyVar.a = true;
            File file = (File) agcpVar.s(uri, aivyVar);
            if (file.exists()) {
                if (file.isFile()) {
                    if (file.canRead()) {
                        if (file.canWrite()) {
                            return b(file, iOException, str);
                        }
                        return b(file, iOException, str);
                    }
                    if (file.canWrite()) {
                        return b(file, iOException, str);
                    }
                    return b(file, iOException, str);
                }
                if (file.canRead()) {
                    if (file.canWrite()) {
                        return b(file, iOException, str);
                    }
                    return b(file, iOException, str);
                }
                if (file.canWrite()) {
                    return b(file, iOException, str);
                }
                return b(file, iOException, str);
            }
            return b(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    public static aiwu ao(String str, ListenableFuture listenableFuture, apbt apbtVar, aozs aozsVar, Executor executor, algw algwVar, agcp agcpVar) {
        return new aiwu(new aiws(str, listenableFuture, new aiwy(apbtVar, aozsVar), executor, agcpVar, algwVar, new akqq()), albo.bI(""), true);
    }

    private static IOException b(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return a(file, iOException, str);
        }
        if (parentFile.exists()) {
            if (parentFile.isDirectory()) {
                if (parentFile.canRead()) {
                    if (parentFile.canWrite()) {
                        return a(file, iOException, str);
                    }
                    return a(file, iOException, str);
                }
                if (parentFile.canWrite()) {
                    return a(file, iOException, str);
                }
                return a(file, iOException, str);
            }
            if (parentFile.canRead()) {
                if (parentFile.canWrite()) {
                    return a(file, iOException, str);
                }
                return a(file, iOException, str);
            }
            if (parentFile.canWrite()) {
                return a(file, iOException, str);
            }
            return a(file, iOException, str);
        }
        return a(file, iOException, str);
    }

    private static void c(Throwable th) {
        throw new IllegalStateException("Could not access method FragmentManager#noteStateNotSaved", th);
    }

    public static long k(HealthStats healthStats, int i) {
        boolean hasMeasurement;
        long measurement;
        if (healthStats != null) {
            hasMeasurement = healthStats.hasMeasurement(i);
            if (hasMeasurement) {
                measurement = healthStats.getMeasurement(i);
                return measurement;
            }
            return 0L;
        }
        return 0L;
    }

    public static List l(HealthStats healthStats, int i) {
        boolean hasTimers;
        Map timers;
        if (healthStats != null) {
            hasTimers = healthStats.hasTimers(i);
            if (hasTimers) {
                ahml ahmlVar = ahml.a;
                timers = healthStats.getTimers(i);
                return ahmlVar.d(timers);
            }
        }
        return Collections.emptyList();
    }

    public static Map m(HealthStats healthStats, int i) {
        boolean hasStats;
        Map stats;
        if (healthStats != null) {
            hasStats = healthStats.hasStats(i);
            if (hasStats) {
                stats = healthStats.getStats(i);
                return stats;
            }
        }
        return Collections.emptyMap();
    }

    public static ashh n(String str) {
        aozy createBuilder = ashh.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ashh ashhVar = (ashh) createBuilder.b;
        ashhVar.b |= 2;
        ashhVar.d = str;
        return (ashh) createBuilder.s();
    }

    public static ashm o(HealthStats healthStats, int i) {
        boolean hasTimer;
        TimerStat timer;
        if (healthStats != null) {
            hasTimer = healthStats.hasTimer(i);
            if (hasTimer) {
                timer = healthStats.getTimer(i);
                return q(null, timer);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ashm p(ashm ashmVar, ashm ashmVar2) {
        if (ashmVar != null && ashmVar2 != null) {
            int i = ashmVar.c - ashmVar2.c;
            long j = ashmVar.d - ashmVar2.d;
            if (i == 0) {
                if (j != 0) {
                    i = 0;
                } else {
                    return null;
                }
            }
            aozy createBuilder = ashm.a.createBuilder();
            if ((ashmVar.b & 4) != 0) {
                ashh ashhVar = ashmVar.e;
                if (ashhVar == null) {
                    ashhVar = ashh.a;
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ashm ashmVar3 = (ashm) createBuilder.b;
                ashhVar.getClass();
                ashmVar3.e = ashhVar;
                ashmVar3.b |= 4;
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            ashm ashmVar4 = (ashm) apagVar;
            ashmVar4.b |= 1;
            ashmVar4.c = i;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            ashm ashmVar5 = (ashm) createBuilder.b;
            ashmVar5.b |= 2;
            ashmVar5.d = j;
            return (ashm) createBuilder.s();
        }
        return ashmVar;
    }

    public static ashm q(String str, TimerStat timerStat) {
        int count;
        long time;
        aozy createBuilder = ashm.a.createBuilder();
        count = timerStat.getCount();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ashm ashmVar = (ashm) createBuilder.b;
        ashmVar.b |= 1;
        ashmVar.c = count;
        time = timerStat.getTime();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ashm ashmVar2 = (ashm) apagVar;
        ashmVar2.b |= 2;
        ashmVar2.d = time;
        if (ashmVar2.c < 0) {
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            ashm ashmVar3 = (ashm) createBuilder.b;
            ashmVar3.b |= 1;
            ashmVar3.c = 0;
        }
        if (str != null) {
            ashh n = n(str);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashm ashmVar4 = (ashm) createBuilder.b;
            n.getClass();
            ashmVar4.e = n;
            ashmVar4.b |= 4;
        }
        ashm ashmVar5 = (ashm) createBuilder.b;
        if (ashmVar5.c == 0 && ashmVar5.d == 0) {
            return null;
        }
        return (ashm) createBuilder.s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ashn r(ashn ashnVar, ashn ashnVar2) {
        ashm ashmVar;
        ashm ashmVar2;
        ashm ashmVar3;
        ashm ashmVar4;
        ashm ashmVar5;
        ashm ashmVar6;
        ashm ashmVar7;
        ashm ashmVar8;
        ashm ashmVar9;
        ashm ashmVar10;
        ashm ashmVar11;
        ashm ashmVar12;
        ashm ashmVar13;
        ashm ashmVar14;
        ashm ashmVar15;
        ashm ashmVar16;
        ashm ashmVar17;
        ashm ashmVar18;
        ashm ashmVar19;
        ashm ashmVar20;
        ashm ashmVar21;
        ashm ashmVar22;
        ashm ashmVar23;
        ashm ashmVar24;
        ashm ashmVar25;
        ashm ashmVar26;
        ashm ashmVar27;
        ashm ashmVar28;
        ashm ashmVar29;
        ashm ashmVar30;
        ashm ashmVar31;
        ashm ashmVar32;
        if (ashnVar != null && ashnVar2 != null) {
            aozy createBuilder = ashn.a.createBuilder();
            if ((ashnVar.b & 1) != 0) {
                long j = ashnVar.d - ashnVar2.d;
                if (j != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar3 = (ashn) createBuilder.b;
                    ashnVar3.b |= 1;
                    ashnVar3.d = j;
                }
            }
            if ((ashnVar.b & 2) != 0) {
                long j2 = ashnVar.e - ashnVar2.e;
                if (j2 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar4 = (ashn) createBuilder.b;
                    ashnVar4.b |= 2;
                    ashnVar4.e = j2;
                }
            }
            if ((ashnVar.b & 4) != 0) {
                long j3 = ashnVar.f - ashnVar2.f;
                if (j3 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar5 = (ashn) createBuilder.b;
                    ashnVar5.b |= 4;
                    ashnVar5.f = j3;
                }
            }
            if ((ashnVar.b & 8) != 0) {
                long j4 = ashnVar.g - ashnVar2.g;
                if (j4 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar6 = (ashn) createBuilder.b;
                    ashnVar6.b |= 8;
                    ashnVar6.g = j4;
                }
            }
            createBuilder.cf(ahml.a.e(ashnVar.h, ashnVar2.h));
            createBuilder.cg(ahml.a.e(ashnVar.i, ashnVar2.i));
            createBuilder.ch(ahml.a.e(ashnVar.j, ashnVar2.j));
            createBuilder.ce(ahml.a.e(ashnVar.k, ashnVar2.k));
            createBuilder.cd(ahml.a.e(ashnVar.l, ashnVar2.l));
            createBuilder.bZ(ahml.a.e(ashnVar.m, ashnVar2.m));
            if ((ashnVar.b & 16) != 0) {
                ashmVar = ashnVar.n;
                if (ashmVar == null) {
                    ashmVar = ashm.a;
                }
            } else {
                ashmVar = null;
            }
            if ((ashnVar2.b & 16) != 0) {
                ashmVar2 = ashnVar2.n;
                if (ashmVar2 == null) {
                    ashmVar2 = ashm.a;
                }
            } else {
                ashmVar2 = null;
            }
            ashm p = p(ashmVar, ashmVar2);
            if (p != null) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ashn ashnVar7 = (ashn) createBuilder.b;
                ashnVar7.n = p;
                ashnVar7.b |= 16;
            }
            createBuilder.ca(ahml.a.e(ashnVar.o, ashnVar2.o));
            createBuilder.cc(ahmi.a.e(ashnVar.q, ashnVar2.q));
            createBuilder.cb(ahmh.a.e(ashnVar.r, ashnVar2.r));
            if ((ashnVar.b & 32) != 0) {
                long j5 = ashnVar.s - ashnVar2.s;
                if (j5 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar8 = (ashn) createBuilder.b;
                    ashnVar8.b |= 32;
                    ashnVar8.s = j5;
                }
            }
            if ((ashnVar.b & 64) != 0) {
                long j6 = ashnVar.t - ashnVar2.t;
                if (j6 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar9 = (ashn) createBuilder.b;
                    ashnVar9.b |= 64;
                    ashnVar9.t = j6;
                }
            }
            if ((ashnVar.b & 128) != 0) {
                long j7 = ashnVar.u - ashnVar2.u;
                if (j7 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar10 = (ashn) createBuilder.b;
                    ashnVar10.b |= 128;
                    ashnVar10.u = j7;
                }
            }
            if ((ashnVar.b & 256) != 0) {
                long j8 = ashnVar.v - ashnVar2.v;
                if (j8 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar11 = (ashn) createBuilder.b;
                    ashnVar11.b |= 256;
                    ashnVar11.v = j8;
                }
            }
            if ((ashnVar.b & 512) != 0) {
                long j9 = ashnVar.w - ashnVar2.w;
                if (j9 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar12 = (ashn) createBuilder.b;
                    ashnVar12.b |= 512;
                    ashnVar12.w = j9;
                }
            }
            if ((ashnVar.b & 1024) != 0) {
                long j10 = ashnVar.x - ashnVar2.x;
                if (j10 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar13 = (ashn) createBuilder.b;
                    ashnVar13.b |= 1024;
                    ashnVar13.x = j10;
                }
            }
            if ((ashnVar.b & 2048) != 0) {
                long j11 = ashnVar.y - ashnVar2.y;
                if (j11 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar14 = (ashn) createBuilder.b;
                    ashnVar14.b |= 2048;
                    ashnVar14.y = j11;
                }
            }
            if ((ashnVar.b & 4096) != 0) {
                long j12 = ashnVar.z - ashnVar2.z;
                if (j12 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar15 = (ashn) createBuilder.b;
                    ashnVar15.b |= 4096;
                    ashnVar15.z = j12;
                }
            }
            if ((ashnVar.b & 8192) != 0) {
                long j13 = ashnVar.A - ashnVar2.A;
                if (j13 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar16 = (ashn) createBuilder.b;
                    ashnVar16.b |= 8192;
                    ashnVar16.A = j13;
                }
            }
            if ((ashnVar.b & 16384) != 0) {
                long j14 = ashnVar.B - ashnVar2.B;
                if (j14 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar17 = (ashn) createBuilder.b;
                    ashnVar17.b |= 16384;
                    ashnVar17.B = j14;
                }
            }
            if ((ashnVar.b & 32768) != 0) {
                long j15 = ashnVar.C - ashnVar2.C;
                if (j15 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar18 = (ashn) createBuilder.b;
                    ashnVar18.b |= 32768;
                    ashnVar18.C = j15;
                }
            }
            if ((ashnVar.b & 65536) != 0) {
                long j16 = ashnVar.D - ashnVar2.D;
                if (j16 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar19 = (ashn) createBuilder.b;
                    ashnVar19.b |= 65536;
                    ashnVar19.D = j16;
                }
            }
            if ((ashnVar.b & 131072) != 0) {
                long j17 = ashnVar.E - ashnVar2.E;
                if (j17 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar20 = (ashn) createBuilder.b;
                    ashnVar20.b |= 131072;
                    ashnVar20.E = j17;
                }
            }
            if ((ashnVar.b & 262144) != 0) {
                long j18 = ashnVar.F - ashnVar2.F;
                if (j18 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar21 = (ashn) createBuilder.b;
                    ashnVar21.b |= 262144;
                    ashnVar21.F = j18;
                }
            }
            if ((ashnVar.b & 524288) != 0) {
                ashmVar3 = ashnVar.G;
                if (ashmVar3 == null) {
                    ashmVar3 = ashm.a;
                }
            } else {
                ashmVar3 = null;
            }
            if ((ashnVar2.b & 524288) != 0) {
                ashmVar4 = ashnVar2.G;
                if (ashmVar4 == null) {
                    ashmVar4 = ashm.a;
                }
            } else {
                ashmVar4 = null;
            }
            ashm p2 = p(ashmVar3, ashmVar4);
            if (p2 != null) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ashn ashnVar22 = (ashn) createBuilder.b;
                ashnVar22.G = p2;
                ashnVar22.b |= 524288;
            }
            if ((ashnVar.b & 1048576) != 0) {
                long j19 = ashnVar.H - ashnVar2.H;
                if (j19 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar23 = (ashn) createBuilder.b;
                    ashnVar23.b |= 1048576;
                    ashnVar23.H = j19;
                }
            }
            if ((ashnVar.b & 2097152) != 0) {
                ashmVar5 = ashnVar.I;
                if (ashmVar5 == null) {
                    ashmVar5 = ashm.a;
                }
            } else {
                ashmVar5 = null;
            }
            if ((ashnVar2.b & 2097152) != 0) {
                ashmVar6 = ashnVar2.I;
                if (ashmVar6 == null) {
                    ashmVar6 = ashm.a;
                }
            } else {
                ashmVar6 = null;
            }
            ashm p3 = p(ashmVar5, ashmVar6);
            if (p3 != null) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ashn ashnVar24 = (ashn) createBuilder.b;
                ashnVar24.I = p3;
                ashnVar24.b |= 2097152;
            }
            if ((ashnVar.b & 4194304) != 0) {
                ashmVar7 = ashnVar.J;
                if (ashmVar7 == null) {
                    ashmVar7 = ashm.a;
                }
            } else {
                ashmVar7 = null;
            }
            if ((ashnVar2.b & 4194304) != 0) {
                ashmVar8 = ashnVar2.J;
                if (ashmVar8 == null) {
                    ashmVar8 = ashm.a;
                }
            } else {
                ashmVar8 = null;
            }
            ashm p4 = p(ashmVar7, ashmVar8);
            if (p4 != null) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ashn ashnVar25 = (ashn) createBuilder.b;
                ashnVar25.J = p4;
                ashnVar25.b |= 4194304;
            }
            if ((ashnVar.b & VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT) != 0) {
                ashmVar9 = ashnVar.K;
                if (ashmVar9 == null) {
                    ashmVar9 = ashm.a;
                }
            } else {
                ashmVar9 = null;
            }
            if ((ashnVar2.b & VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT) != 0) {
                ashmVar10 = ashnVar2.K;
                if (ashmVar10 == null) {
                    ashmVar10 = ashm.a;
                }
            } else {
                ashmVar10 = null;
            }
            ashm p5 = p(ashmVar9, ashmVar10);
            if (p5 != null) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ashn ashnVar26 = (ashn) createBuilder.b;
                ashnVar26.K = p5;
                ashnVar26.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
            }
            if ((ashnVar.b & 16777216) != 0) {
                ashmVar11 = ashnVar.L;
                if (ashmVar11 == null) {
                    ashmVar11 = ashm.a;
                }
            } else {
                ashmVar11 = null;
            }
            if ((ashnVar2.b & 16777216) != 0) {
                ashmVar12 = ashnVar2.L;
                if (ashmVar12 == null) {
                    ashmVar12 = ashm.a;
                }
            } else {
                ashmVar12 = null;
            }
            ashm p6 = p(ashmVar11, ashmVar12);
            if (p6 != null) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ashn ashnVar27 = (ashn) createBuilder.b;
                ashnVar27.L = p6;
                ashnVar27.b |= 16777216;
            }
            if ((ashnVar.b & VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING) != 0) {
                ashmVar13 = ashnVar.M;
                if (ashmVar13 == null) {
                    ashmVar13 = ashm.a;
                }
            } else {
                ashmVar13 = null;
            }
            if ((ashnVar2.b & VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING) != 0) {
                ashmVar14 = ashnVar2.M;
                if (ashmVar14 == null) {
                    ashmVar14 = ashm.a;
                }
            } else {
                ashmVar14 = null;
            }
            ashm p7 = p(ashmVar13, ashmVar14);
            if (p7 != null) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ashn ashnVar28 = (ashn) createBuilder.b;
                ashnVar28.M = p7;
                ashnVar28.b |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
            }
            if ((ashnVar.b & VCardConfig.FLAG_APPEND_TYPE_PARAM) != 0) {
                ashmVar15 = ashnVar.N;
                if (ashmVar15 == null) {
                    ashmVar15 = ashm.a;
                }
            } else {
                ashmVar15 = null;
            }
            if ((ashnVar2.b & VCardConfig.FLAG_APPEND_TYPE_PARAM) != 0) {
                ashmVar16 = ashnVar2.N;
                if (ashmVar16 == null) {
                    ashmVar16 = ashm.a;
                }
            } else {
                ashmVar16 = null;
            }
            ashm p8 = p(ashmVar15, ashmVar16);
            if (p8 != null) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ashn ashnVar29 = (ashn) createBuilder.b;
                ashnVar29.N = p8;
                ashnVar29.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
            }
            if ((ashnVar.b & VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS) != 0) {
                ashmVar17 = ashnVar.O;
                if (ashmVar17 == null) {
                    ashmVar17 = ashm.a;
                }
            } else {
                ashmVar17 = null;
            }
            if ((ashnVar2.b & VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS) != 0) {
                ashmVar18 = ashnVar2.O;
                if (ashmVar18 == null) {
                    ashmVar18 = ashm.a;
                }
            } else {
                ashmVar18 = null;
            }
            ashm p9 = p(ashmVar17, ashmVar18);
            if (p9 != null) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ashn ashnVar30 = (ashn) createBuilder.b;
                ashnVar30.O = p9;
                ashnVar30.b |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
            }
            if ((ashnVar.b & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) != 0) {
                ashmVar19 = ashnVar.P;
                if (ashmVar19 == null) {
                    ashmVar19 = ashm.a;
                }
            } else {
                ashmVar19 = null;
            }
            if ((ashnVar2.b & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) != 0) {
                ashmVar20 = ashnVar2.P;
                if (ashmVar20 == null) {
                    ashmVar20 = ashm.a;
                }
            } else {
                ashmVar20 = null;
            }
            ashm p10 = p(ashmVar19, ashmVar20);
            if (p10 != null) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ashn ashnVar31 = (ashn) createBuilder.b;
                ashnVar31.P = p10;
                ashnVar31.b |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
            }
            if ((ashnVar.b & 536870912) != 0) {
                ashmVar21 = ashnVar.Q;
                if (ashmVar21 == null) {
                    ashmVar21 = ashm.a;
                }
            } else {
                ashmVar21 = null;
            }
            if ((ashnVar2.b & 536870912) != 0) {
                ashmVar22 = ashnVar2.Q;
                if (ashmVar22 == null) {
                    ashmVar22 = ashm.a;
                }
            } else {
                ashmVar22 = null;
            }
            ashm p11 = p(ashmVar21, ashmVar22);
            if (p11 != null) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ashn ashnVar32 = (ashn) createBuilder.b;
                ashnVar32.Q = p11;
                ashnVar32.b |= 536870912;
            }
            if ((ashnVar.b & 1073741824) != 0) {
                ashmVar23 = ashnVar.R;
                if (ashmVar23 == null) {
                    ashmVar23 = ashm.a;
                }
            } else {
                ashmVar23 = null;
            }
            if ((ashnVar2.b & 1073741824) != 0) {
                ashmVar24 = ashnVar2.R;
                if (ashmVar24 == null) {
                    ashmVar24 = ashm.a;
                }
            } else {
                ashmVar24 = null;
            }
            ashm p12 = p(ashmVar23, ashmVar24);
            if (p12 != null) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ashn ashnVar33 = (ashn) createBuilder.b;
                ashnVar33.R = p12;
                ashnVar33.b |= 1073741824;
            }
            if ((ashnVar.b & Integer.MIN_VALUE) != 0) {
                ashmVar25 = ashnVar.S;
                if (ashmVar25 == null) {
                    ashmVar25 = ashm.a;
                }
            } else {
                ashmVar25 = null;
            }
            if ((ashnVar2.b & Integer.MIN_VALUE) != 0) {
                ashmVar26 = ashnVar2.S;
                if (ashmVar26 == null) {
                    ashmVar26 = ashm.a;
                }
            } else {
                ashmVar26 = null;
            }
            ashm p13 = p(ashmVar25, ashmVar26);
            if (p13 != null) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ashn ashnVar34 = (ashn) createBuilder.b;
                ashnVar34.S = p13;
                ashnVar34.b |= Integer.MIN_VALUE;
            }
            if ((ashnVar.c & 1) != 0) {
                ashmVar27 = ashnVar.T;
                if (ashmVar27 == null) {
                    ashmVar27 = ashm.a;
                }
            } else {
                ashmVar27 = null;
            }
            if ((ashnVar2.c & 1) != 0) {
                ashmVar28 = ashnVar2.T;
                if (ashmVar28 == null) {
                    ashmVar28 = ashm.a;
                }
            } else {
                ashmVar28 = null;
            }
            ashm p14 = p(ashmVar27, ashmVar28);
            if (p14 != null) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ashn ashnVar35 = (ashn) createBuilder.b;
                ashnVar35.T = p14;
                ashnVar35.c |= 1;
            }
            if ((ashnVar.c & 2) != 0) {
                ashmVar29 = ashnVar.U;
                if (ashmVar29 == null) {
                    ashmVar29 = ashm.a;
                }
            } else {
                ashmVar29 = null;
            }
            if ((ashnVar2.c & 2) != 0) {
                ashmVar30 = ashnVar2.U;
                if (ashmVar30 == null) {
                    ashmVar30 = ashm.a;
                }
            } else {
                ashmVar30 = null;
            }
            ashm p15 = p(ashmVar29, ashmVar30);
            if (p15 != null) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ashn ashnVar36 = (ashn) createBuilder.b;
                ashnVar36.U = p15;
                ashnVar36.c |= 2;
            }
            if ((ashnVar.c & 4) != 0) {
                long j20 = ashnVar.V - ashnVar2.V;
                if (j20 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar37 = (ashn) createBuilder.b;
                    ashnVar37.c |= 4;
                    ashnVar37.V = j20;
                }
            }
            if ((ashnVar.c & 8) != 0) {
                long j21 = ashnVar.W - ashnVar2.W;
                if (j21 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar38 = (ashn) createBuilder.b;
                    ashnVar38.c |= 8;
                    ashnVar38.W = j21;
                }
            }
            if ((ashnVar.c & 16) != 0) {
                long j22 = ashnVar.X - ashnVar2.X;
                if (j22 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar39 = (ashn) createBuilder.b;
                    ashnVar39.c |= 16;
                    ashnVar39.X = j22;
                }
            }
            if ((ashnVar.c & 32) != 0) {
                long j23 = ashnVar.Y - ashnVar2.Y;
                if (j23 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar40 = (ashn) createBuilder.b;
                    ashnVar40.c |= 32;
                    ashnVar40.Y = j23;
                }
            }
            if ((ashnVar.c & 64) != 0) {
                long j24 = ashnVar.Z - ashnVar2.Z;
                if (j24 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar41 = (ashn) createBuilder.b;
                    ashnVar41.c |= 64;
                    ashnVar41.Z = j24;
                }
            }
            if ((ashnVar.c & 128) != 0) {
                long j25 = ashnVar.aa - ashnVar2.aa;
                if (j25 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar42 = (ashn) createBuilder.b;
                    ashnVar42.c |= 128;
                    ashnVar42.aa = j25;
                }
            }
            if ((ashnVar.c & 256) != 0) {
                long j26 = ashnVar.ab - ashnVar2.ab;
                if (j26 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar43 = (ashn) createBuilder.b;
                    ashnVar43.c |= 256;
                    ashnVar43.ab = j26;
                }
            }
            if ((ashnVar.c & 512) != 0) {
                long j27 = ashnVar.ac - ashnVar2.ac;
                if (j27 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar44 = (ashn) createBuilder.b;
                    ashnVar44.c |= 512;
                    ashnVar44.ac = j27;
                }
            }
            if ((ashnVar.c & 1024) != 0) {
                long j28 = ashnVar.ad - ashnVar2.ad;
                if (j28 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar45 = (ashn) createBuilder.b;
                    ashnVar45.c |= 1024;
                    ashnVar45.ad = j28;
                }
            }
            if ((ashnVar.c & 2048) != 0) {
                long j29 = ashnVar.ae - ashnVar2.ae;
                if (j29 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar46 = (ashn) createBuilder.b;
                    ashnVar46.c |= 2048;
                    ashnVar46.ae = j29;
                }
            }
            if ((ashnVar.c & 4096) != 0) {
                long j30 = ashnVar.af - ashnVar2.af;
                if (j30 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar47 = (ashn) createBuilder.b;
                    ashnVar47.c |= 4096;
                    ashnVar47.af = j30;
                }
            }
            if ((ashnVar.c & 8192) != 0) {
                long j31 = ashnVar.ag - ashnVar2.ag;
                if (j31 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar48 = (ashn) createBuilder.b;
                    ashnVar48.c |= 8192;
                    ashnVar48.ag = j31;
                }
            }
            if ((ashnVar.c & 16384) != 0) {
                long j32 = ashnVar.ah - ashnVar2.ah;
                if (j32 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar49 = (ashn) createBuilder.b;
                    ashnVar49.c |= 16384;
                    ashnVar49.ah = j32;
                }
            }
            if ((ashnVar.c & 32768) != 0) {
                long j33 = ashnVar.ai - ashnVar2.ai;
                if (j33 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar50 = (ashn) createBuilder.b;
                    ashnVar50.c = 32768 | ashnVar50.c;
                    ashnVar50.ai = j33;
                }
            }
            if ((ashnVar.c & 65536) != 0) {
                long j34 = ashnVar.aj - ashnVar2.aj;
                if (j34 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar51 = (ashn) createBuilder.b;
                    ashnVar51.c |= 65536;
                    ashnVar51.aj = j34;
                }
            }
            if ((ashnVar.c & 131072) != 0) {
                ashmVar31 = ashnVar.ak;
                if (ashmVar31 == null) {
                    ashmVar31 = ashm.a;
                }
            } else {
                ashmVar31 = null;
            }
            if ((ashnVar2.c & 131072) != 0) {
                ashmVar32 = ashnVar2.ak;
                if (ashmVar32 == null) {
                    ashmVar32 = ashm.a;
                }
            } else {
                ashmVar32 = null;
            }
            ashm p16 = p(ashmVar31, ashmVar32);
            if (p16 != null) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ashn ashnVar52 = (ashn) createBuilder.b;
                ashnVar52.ak = p16;
                ashnVar52.c |= 131072;
            }
            if ((ashnVar.c & 262144) != 0) {
                long j35 = ashnVar.al - ashnVar2.al;
                if (j35 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar53 = (ashn) createBuilder.b;
                    ashnVar53.c |= 262144;
                    ashnVar53.al = j35;
                }
            }
            if ((ashnVar.c & 524288) != 0) {
                long j36 = ashnVar.am - ashnVar2.am;
                if (j36 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar54 = (ashn) createBuilder.b;
                    ashnVar54.c |= 524288;
                    ashnVar54.am = j36;
                }
            }
            if ((ashnVar.c & 1048576) != 0) {
                long j37 = ashnVar.an - ashnVar2.an;
                if (j37 != 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashn ashnVar55 = (ashn) createBuilder.b;
                    ashnVar55.c |= 1048576;
                    ashnVar55.an = j37;
                }
            }
            ashnVar = (ashn) createBuilder.s();
            if (v(ashnVar)) {
                return null;
            }
        }
        return ashnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean s(ashi ashiVar) {
        if (ashiVar == null) {
            return true;
        }
        if (ashiVar.c.size() == 0 && ashiVar.d.size() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean t(ashk ashkVar) {
        if (ashkVar == null) {
            return true;
        }
        if (ashkVar.c > 0 || ashkVar.d > 0 || ashkVar.e > 0 || ashkVar.f > 0 || ashkVar.g > 0) {
            return false;
        }
        if (ashkVar.h <= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean u(ashl ashlVar) {
        if (ashlVar == null) {
            return true;
        }
        if (ashlVar.c <= 0 && ashlVar.d <= 0) {
            return true;
        }
        return false;
    }

    static boolean v(ashn ashnVar) {
        if (ashnVar == null) {
            return true;
        }
        if (ashnVar.d > 0 || ashnVar.e > 0 || ashnVar.f > 0 || ashnVar.g > 0 || ashnVar.h.size() != 0 || ashnVar.i.size() != 0 || ashnVar.j.size() != 0 || ashnVar.k.size() != 0 || ashnVar.l.size() != 0 || ashnVar.m.size() != 0 || ashnVar.o.size() != 0 || ashnVar.p.size() != 0 || ashnVar.q.size() != 0 || ashnVar.r.size() != 0 || ashnVar.s > 0 || ashnVar.t > 0 || ashnVar.u > 0 || ashnVar.v > 0 || ashnVar.w > 0 || ashnVar.x > 0 || ashnVar.y > 0 || ashnVar.z > 0 || ashnVar.A > 0 || ashnVar.B > 0 || ashnVar.C > 0 || ashnVar.D > 0 || ashnVar.E > 0 || ashnVar.F > 0 || ashnVar.H > 0 || ashnVar.V > 0 || ashnVar.W > 0 || ashnVar.X > 0 || ashnVar.Y > 0 || ashnVar.Z > 0 || ashnVar.aa > 0 || ashnVar.ab > 0 || ashnVar.ac > 0 || ashnVar.ad > 0 || ashnVar.ae > 0 || ashnVar.af > 0 || ashnVar.ag > 0 || ashnVar.ah > 0 || ashnVar.ai > 0 || ashnVar.aj > 0 || ashnVar.al > 0 || ashnVar.am > 0) {
            return false;
        }
        if (ashnVar.an <= 0) {
            return true;
        }
        return false;
    }

    public static ahlx w(algw algwVar, armf armfVar) {
        return (ahlx) ((armf) algwVar.d(armfVar)).b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ahmm x(Long l, Long l2, HealthStats healthStats, ashd ashdVar, ashu ashuVar, ahoq ahoqVar) {
        Object obj;
        aozy createBuilder = ashn.a.createBuilder();
        long k = k(healthStats, 10001);
        if (k != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar = (ashn) createBuilder.b;
            ashnVar.b |= 1;
            ashnVar.d = k;
        }
        long k2 = k(healthStats, 10002);
        if (k2 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar2 = (ashn) createBuilder.b;
            ashnVar2.b |= 2;
            ashnVar2.e = k2;
        }
        long k3 = k(healthStats, 10003);
        if (k3 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar3 = (ashn) createBuilder.b;
            ashnVar3.b |= 4;
            ashnVar3.f = k3;
        }
        long k4 = k(healthStats, 10004);
        if (k4 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar4 = (ashn) createBuilder.b;
            ashnVar4.b |= 8;
            ashnVar4.g = k4;
        }
        createBuilder.cf(l(healthStats, 10005));
        createBuilder.cg(l(healthStats, 10006));
        createBuilder.ch(l(healthStats, 10007));
        createBuilder.ce(l(healthStats, 10008));
        createBuilder.cd(l(healthStats, 10009));
        createBuilder.bZ(l(healthStats, 10010));
        ashm o = o(healthStats, 10011);
        if (o != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar5 = (ashn) createBuilder.b;
            ashnVar5.n = o;
            ashnVar5.b |= 16;
        }
        createBuilder.ca(l(healthStats, 10012));
        createBuilder.cc(ahmi.a.d(m(healthStats, 10014)));
        createBuilder.cb(ahmh.a.d(m(healthStats, 10015)));
        long k5 = k(healthStats, 10016);
        if (k5 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar6 = (ashn) createBuilder.b;
            ashnVar6.b |= 32;
            ashnVar6.s = k5;
        }
        long k6 = k(healthStats, 10017);
        if (k6 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar7 = (ashn) createBuilder.b;
            ashnVar7.b |= 64;
            ashnVar7.t = k6;
        }
        long k7 = k(healthStats, 10018);
        if (k7 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar8 = (ashn) createBuilder.b;
            ashnVar8.b |= 128;
            ashnVar8.u = k7;
        }
        long k8 = k(healthStats, 10019);
        if (k8 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar9 = (ashn) createBuilder.b;
            ashnVar9.b |= 256;
            ashnVar9.v = k8;
        }
        long k9 = k(healthStats, 10020);
        if (k9 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar10 = (ashn) createBuilder.b;
            ashnVar10.b |= 512;
            ashnVar10.w = k9;
        }
        long k10 = k(healthStats, 10021);
        if (k10 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar11 = (ashn) createBuilder.b;
            ashnVar11.b |= 1024;
            ashnVar11.x = k10;
        }
        long k11 = k(healthStats, 10022);
        if (k11 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar12 = (ashn) createBuilder.b;
            ashnVar12.b |= 2048;
            ashnVar12.y = k11;
        }
        long k12 = k(healthStats, 10023);
        if (k12 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar13 = (ashn) createBuilder.b;
            ashnVar13.b |= 4096;
            ashnVar13.z = k12;
        }
        long k13 = k(healthStats, 10024);
        if (k13 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar14 = (ashn) createBuilder.b;
            ashnVar14.b |= 8192;
            ashnVar14.A = k13;
        }
        long k14 = k(healthStats, 10025);
        if (k14 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar15 = (ashn) createBuilder.b;
            ashnVar15.b |= 16384;
            ashnVar15.B = k14;
        }
        long k15 = k(healthStats, 10026);
        if (k15 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar16 = (ashn) createBuilder.b;
            ashnVar16.b |= 32768;
            ashnVar16.C = k15;
        }
        long k16 = k(healthStats, 10027);
        if (k16 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar17 = (ashn) createBuilder.b;
            ashnVar17.b |= 65536;
            ashnVar17.D = k16;
        }
        long k17 = k(healthStats, 10028);
        if (k17 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar18 = (ashn) createBuilder.b;
            ashnVar18.b |= 131072;
            ashnVar18.E = k17;
        }
        long k18 = k(healthStats, 10029);
        if (k18 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar19 = (ashn) createBuilder.b;
            ashnVar19.b |= 262144;
            ashnVar19.F = k18;
        }
        ashm o2 = o(healthStats, 10030);
        if (o2 != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar20 = (ashn) createBuilder.b;
            ashnVar20.G = o2;
            ashnVar20.b |= 524288;
        }
        long k19 = k(healthStats, 10031);
        if (k19 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar21 = (ashn) createBuilder.b;
            ashnVar21.b |= 1048576;
            ashnVar21.H = k19;
        }
        ashm o3 = o(healthStats, 10032);
        if (o3 != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar22 = (ashn) createBuilder.b;
            ashnVar22.I = o3;
            ashnVar22.b |= 2097152;
        }
        ashm o4 = o(healthStats, 10033);
        if (o4 != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar23 = (ashn) createBuilder.b;
            ashnVar23.J = o4;
            ashnVar23.b |= 4194304;
        }
        ashm o5 = o(healthStats, 10034);
        if (o5 != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar24 = (ashn) createBuilder.b;
            ashnVar24.K = o5;
            ashnVar24.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        ashm o6 = o(healthStats, 10035);
        if (o6 != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar25 = (ashn) createBuilder.b;
            ashnVar25.L = o6;
            ashnVar25.b |= 16777216;
        }
        ashm o7 = o(healthStats, 10036);
        if (o7 != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar26 = (ashn) createBuilder.b;
            ashnVar26.M = o7;
            ashnVar26.b |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        }
        ashm o8 = o(healthStats, 10037);
        if (o8 != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar27 = (ashn) createBuilder.b;
            ashnVar27.N = o8;
            ashnVar27.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        ashm o9 = o(healthStats, 10038);
        if (o9 != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar28 = (ashn) createBuilder.b;
            ashnVar28.O = o9;
            ashnVar28.b |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        }
        ashm o10 = o(healthStats, 10039);
        if (o10 != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar29 = (ashn) createBuilder.b;
            ashnVar29.P = o10;
            ashnVar29.b |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        }
        ashm o11 = o(healthStats, 10040);
        if (o11 != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar30 = (ashn) createBuilder.b;
            ashnVar30.Q = o11;
            ashnVar30.b |= 536870912;
        }
        ashm o12 = o(healthStats, 10041);
        if (o12 != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar31 = (ashn) createBuilder.b;
            ashnVar31.R = o12;
            ashnVar31.b |= 1073741824;
        }
        ashm o13 = o(healthStats, 10042);
        if (o13 != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar32 = (ashn) createBuilder.b;
            ashnVar32.S = o13;
            ashnVar32.b |= Integer.MIN_VALUE;
        }
        ashm o14 = o(healthStats, 10043);
        if (o14 != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar33 = (ashn) createBuilder.b;
            ashnVar33.T = o14;
            ashnVar33.c |= 1;
        }
        ashm o15 = o(healthStats, 10044);
        if (o15 != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar34 = (ashn) createBuilder.b;
            ashnVar34.U = o15;
            ashnVar34.c |= 2;
        }
        long k20 = k(healthStats, 10045);
        if (k20 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar35 = (ashn) createBuilder.b;
            ashnVar35.c |= 4;
            ashnVar35.V = k20;
        }
        long k21 = k(healthStats, 10046);
        if (k21 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar36 = (ashn) createBuilder.b;
            ashnVar36.c |= 8;
            ashnVar36.W = k21;
        }
        long k22 = k(healthStats, 10047);
        if (k22 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar37 = (ashn) createBuilder.b;
            ashnVar37.c |= 16;
            ashnVar37.X = k22;
        }
        long k23 = k(healthStats, 10048);
        if (k23 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar38 = (ashn) createBuilder.b;
            ashnVar38.c |= 32;
            ashnVar38.Y = k23;
        }
        long k24 = k(healthStats, 10049);
        if (k24 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar39 = (ashn) createBuilder.b;
            ashnVar39.c |= 64;
            ashnVar39.Z = k24;
        }
        long k25 = k(healthStats, 10050);
        if (k25 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar40 = (ashn) createBuilder.b;
            ashnVar40.c |= 128;
            ashnVar40.aa = k25;
        }
        long k26 = k(healthStats, 10051);
        if (k26 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar41 = (ashn) createBuilder.b;
            ashnVar41.c |= 256;
            ashnVar41.ab = k26;
        }
        long k27 = k(healthStats, 10052);
        if (k27 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar42 = (ashn) createBuilder.b;
            ashnVar42.c |= 512;
            ashnVar42.ac = k27;
        }
        long k28 = k(healthStats, 10053);
        if (k28 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar43 = (ashn) createBuilder.b;
            ashnVar43.c |= 1024;
            ashnVar43.ad = k28;
        }
        long k29 = k(healthStats, 10054);
        if (k29 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar44 = (ashn) createBuilder.b;
            ashnVar44.c |= 2048;
            ashnVar44.ae = k29;
        }
        long k30 = k(healthStats, 10055);
        if (k30 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar45 = (ashn) createBuilder.b;
            ashnVar45.c |= 4096;
            ashnVar45.af = k30;
        }
        long k31 = k(healthStats, 10056);
        if (k31 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar46 = (ashn) createBuilder.b;
            ashnVar46.c |= 8192;
            ashnVar46.ag = k31;
        }
        long k32 = k(healthStats, 10057);
        if (k32 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar47 = (ashn) createBuilder.b;
            ashnVar47.c |= 16384;
            ashnVar47.ah = k32;
        }
        long k33 = k(healthStats, 10058);
        if (k33 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar48 = (ashn) createBuilder.b;
            ashnVar48.c |= 32768;
            ashnVar48.ai = k33;
        }
        long k34 = k(healthStats, 10059);
        if (k34 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar49 = (ashn) createBuilder.b;
            ashnVar49.c = 65536 | ashnVar49.c;
            ashnVar49.aj = k34;
        }
        ashm o16 = o(healthStats, 10061);
        if (o16 != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar50 = (ashn) createBuilder.b;
            ashnVar50.ak = o16;
            ashnVar50.c |= 131072;
        }
        long k35 = k(healthStats, 10062);
        if (k35 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar51 = (ashn) createBuilder.b;
            ashnVar51.c |= 262144;
            ashnVar51.al = k35;
        }
        long k36 = k(healthStats, 10063);
        if (k36 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar52 = (ashn) createBuilder.b;
            ashnVar52.c = 524288 | ashnVar52.c;
            ashnVar52.am = k36;
        }
        long k37 = k(healthStats, 10064);
        if (k37 != 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashn ashnVar53 = (ashn) createBuilder.b;
            ashnVar53.c |= 1048576;
            ashnVar53.an = k37;
        }
        aozy builder = ((ashn) createBuilder.s()).toBuilder();
        DesugarCollections.unmodifiableList(((ashn) builder.b).h);
        int i = 0;
        while (true) {
            Object obj2 = ahoqVar.c;
            int size = ((ashn) builder.b).h.size();
            obj = ((ahow) obj2).a;
            if (i >= size) {
                break;
            }
            builder.cm(i, ((ahmf) obj).b(ahme.WAKELOCK, builder.bW(i)));
            i++;
        }
        DesugarCollections.unmodifiableList(((ashn) builder.b).i);
        for (int i2 = 0; i2 < ((ashn) builder.b).i.size(); i2++) {
            builder.cn(i2, ((ahmf) obj).b(ahme.WAKELOCK, builder.bX(i2)));
        }
        DesugarCollections.unmodifiableList(((ashn) builder.b).j);
        for (int i3 = 0; i3 < ((ashn) builder.b).j.size(); i3++) {
            builder.co(i3, ((ahmf) obj).b(ahme.WAKELOCK, builder.bY(i3)));
        }
        DesugarCollections.unmodifiableList(((ashn) builder.b).k);
        for (int i4 = 0; i4 < ((ashn) builder.b).k.size(); i4++) {
            builder.cl(i4, ((ahmf) obj).b(ahme.WAKELOCK, builder.bV(i4)));
        }
        DesugarCollections.unmodifiableList(((ashn) builder.b).l);
        for (int i5 = 0; i5 < ((ashn) builder.b).l.size(); i5++) {
            builder.ck(i5, ((ahmf) obj).b(ahme.SYNC, builder.bU(i5)));
        }
        DesugarCollections.unmodifiableList(((ashn) builder.b).m);
        for (int i6 = 0; i6 < ((ashn) builder.b).m.size(); i6++) {
            builder.ci(i6, ((ahmf) obj).b(ahme.JOB, builder.bS(i6)));
        }
        DesugarCollections.unmodifiableList(((ashn) builder.b).o);
        for (int i7 = 0; i7 < ((ashn) builder.b).o.size(); i7++) {
            builder.cj(i7, ((ahmf) obj).b(ahme.SENSOR, builder.bT(i7)));
        }
        return new ahmm((ashn) builder.s(), l, l2, 683537993L, Long.valueOf(ahoqVar.b != null ? ((String) r0).hashCode() : 0L), ashdVar, null, ashuVar, null);
    }

    public static abra y(hkl hklVar) {
        int i;
        String valueOf;
        if (hklVar instanceof hjz) {
            i = 7;
        } else if (hklVar instanceof hkk) {
            i = 15;
        } else if (!(hklVar instanceof hkj) && !(hklVar instanceof hkc)) {
            if (hklVar instanceof hjr) {
                i = 9011;
            } else {
                i = 13;
            }
        } else {
            i = 8;
        }
        hka hkaVar = hklVar.a;
        if (hkaVar == null) {
            valueOf = "N/A";
        } else {
            valueOf = String.valueOf(hkaVar.a);
        }
        return new abra(new Status(i, String.format("Unexpected server error (HTTP Code: %s. Message: %s.)", valueOf, hklVar)));
    }

    public static /* synthetic */ acir z(aiba aibaVar, long j, acit acitVar, aibm aibmVar) {
        aiba aibaVar2 = aibmVar.a;
        aiax aiaxVar = aibaVar2.g;
        aiao aiaoVar = aibaVar2.i;
        aiao aiaoVar2 = aibaVar2.y;
        Integer num = aibaVar2.Z;
        if (aibaVar != null) {
            if (num == null) {
                num = aibaVar.Z;
            }
            if (aiaxVar == null) {
                aiaxVar = aibaVar.g;
            }
            if (aiaoVar == null) {
                aiaoVar = aibaVar.i;
            }
            if (aiaoVar2 == null) {
                aiaoVar2 = aibaVar.y;
            }
        }
        aiaw a2 = aiba.a();
        a2.g = aiaxVar;
        a2.h = aiaoVar;
        a2.v = aiaoVar2;
        a2.N = num;
        acitVar.b(new aibw(aiap.b(a2.a(), j)));
        return (acir) acitVar.a;
    }

    public ahmc(byte[] bArr) {
    }

    public ahmc(byte[] bArr, byte[] bArr2) {
    }
}

package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjm implements fjk, ewc {
    public static final alog a = alog.v(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final alog b = alog.v(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final alog c = alog.v(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final alog d = alog.v(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final alog e = alog.v(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final alog f = alog.v(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    private static fjm h;
    private final alor i;
    private int k;
    private long l;
    private long m;
    private long n;
    private long o;
    private long p;
    private long q;
    private int r;
    public final efu g = new efu((byte[]) null, (char[]) null);
    private final fjr j = new fjr();

    public fjm(Context context, Map map) {
        this.i = alor.j(map);
        if (context != null) {
            adfg l = adfg.l(context);
            int j = l.j();
            this.r = j;
            this.p = h(j);
            qdq qdqVar = new qdq(this);
            Iterator it = ((CopyOnWriteArrayList) l.c).iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    ((CopyOnWriteArrayList) l.c).remove(weakReference);
                }
            }
            ((CopyOnWriteArrayList) l.c).add(new WeakReference(qdqVar));
            ((Handler) l.b).post(new ewq(l, qdqVar, 1));
            return;
        }
        this.r = 0;
        this.p = h(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized fjm e(Context context) {
        fjm fjmVar;
        Context applicationContext;
        String aq;
        TelephonyManager telephonyManager;
        synchronized (fjm.class) {
            if (h == null) {
                if (context == null) {
                    applicationContext = null;
                } else {
                    applicationContext = context.getApplicationContext();
                }
                int i = eul.a;
                if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                    String networkCountryIso = telephonyManager.getNetworkCountryIso();
                    if (!TextUtils.isEmpty(networkCountryIso)) {
                        aq = albo.aq(networkCountryIso);
                        int[] g = g(aq);
                        HashMap hashMap = new HashMap(8);
                        hashMap.put(0, 1000000L);
                        alog alogVar = a;
                        hashMap.put(2, (Long) alogVar.get(g[0]));
                        hashMap.put(3, (Long) b.get(g[1]));
                        hashMap.put(4, (Long) c.get(g[2]));
                        hashMap.put(5, (Long) d.get(g[3]));
                        hashMap.put(10, (Long) e.get(g[4]));
                        hashMap.put(9, (Long) f.get(g[5]));
                        hashMap.put(7, (Long) alogVar.get(g[0]));
                        h = new fjm(applicationContext, hashMap);
                    }
                }
                aq = albo.aq(Locale.getDefault().getCountry());
                int[] g2 = g(aq);
                HashMap hashMap2 = new HashMap(8);
                hashMap2.put(0, 1000000L);
                alog alogVar2 = a;
                hashMap2.put(2, (Long) alogVar2.get(g2[0]));
                hashMap2.put(3, (Long) b.get(g2[1]));
                hashMap2.put(4, (Long) c.get(g2[2]));
                hashMap2.put(5, (Long) d.get(g2[3]));
                hashMap2.put(10, (Long) e.get(g2[4]));
                hashMap2.put(9, (Long) f.get(g2[5]));
                hashMap2.put(7, (Long) alogVar2.get(g2[0]));
                h = new fjm(applicationContext, hashMap2);
            }
            fjmVar = h;
        }
        return fjmVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x013b, code lost:
    
        if (r3.equals("YT") != false) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0526, code lost:
    
        return new int[]{2, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0145, code lost:
    
        if (r3.equals("YE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0b12, code lost:
    
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x015d, code lost:
    
        if (r3.equals("WS") != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0542, code lost:
    
        return new int[]{3, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0167, code lost:
    
        if (r3.equals("WF") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x060e, code lost:
    
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0171, code lost:
    
        if (r3.equals("VU") != false) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x072c, code lost:
    
        return new int[]{4, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01a5, code lost:
    
        if (r3.equals("VE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01af, code lost:
    
        if (r3.equals("VC") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01b9, code lost:
    
        if (r3.equals("VA") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0bf6, code lost:
    
        return new int[]{0, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01fb, code lost:
    
        if (r3.equals("UA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0ae8, code lost:
    
        return new int[]{0, 2, 1, 2, 3, 3};
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0221, code lost:
    
        if (r3.equals("TV") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0239, code lost:
    
        if (r3.equals("TR") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0be8, code lost:
    
        return new int[]{1, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x025f, code lost:
    
        if (r3.equals("TM") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0269, code lost:
    
        if (r3.equals("TL") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0a7c, code lost:
    
        return new int[]{4, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0273, code lost:
    
        if (r3.equals("TJ") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x09f2, code lost:
    
        return new int[]{3, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x027d, code lost:
    
        if (r3.equals("TH") != false) goto L804;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0ac2, code lost:
    
        return new int[]{0, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0295, code lost:
    
        if (r3.equals("TD") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0b3c, code lost:
    
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x02ad, code lost:
    
        if (r3.equals("SZ") != false) goto L866;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0b99, code lost:
    
        return new int[]{4, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x02b7, code lost:
    
        if (r3.equals("SY") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x02c1, code lost:
    
        if (r3.equals("SX") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x02e7, code lost:
    
        if (r3.equals("SS") != false) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x08be, code lost:
    
        return new int[]{4, 3, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
    
        if (r3.equals("CI") != false) goto L862;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x031b, code lost:
    
        if (r3.equals("SM") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0325, code lost:
    
        if (r3.equals("SL") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0b66, code lost:
    
        return new int[]{4, 2, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x033d, code lost:
    
        if (r3.equals("SJ") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0974, code lost:
    
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0347, code lost:
    
        if (r3.equals("SI") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0b8b, code lost:
    
        return new int[]{2, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0b2e, code lost:
    
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0351, code lost:
    
        if (r3.equals("SH") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0369, code lost:
    
        if (r3.equals("SE") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0373, code lost:
    
        if (r3.equals("SD") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x037d, code lost:
    
        if (r3.equals("SC") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0387, code lost:
    
        if (r3.equals("SB") != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x03f7, code lost:
    
        if (r3.equals("PY") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x040f, code lost:
    
        if (r3.equals("PT") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0435, code lost:
    
        if (r3.equals("PM") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        if (r3.equals("CG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0469, code lost:
    
        if (r3.equals("PG") != false) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0698, code lost:
    
        return new int[]{4, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x048f, code lost:
    
        if (r3.equals("PA") != false) goto L901;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0c12, code lost:
    
        return new int[]{2, 3, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x09c8, code lost:
    
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x04b5, code lost:
    
        if (r3.equals("NU") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x04bf, code lost:
    
        if (r3.equals("NR") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x04f3, code lost:
    
        if (r3.equals("NI") != false) goto L788;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0a8a, code lost:
    
        return new int[]{2, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x050b, code lost:
    
        if (r3.equals("NF") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0515, code lost:
    
        if (r3.equals("NE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x051f, code lost:
    
        if (r3.equals("NC") != false) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x053b, code lost:
    
        if (r3.equals("MZ") != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x058f, code lost:
    
        if (r3.equals("MT") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0599, code lost:
    
        if (r3.equals("MS") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x05a3, code lost:
    
        if (r3.equals("MR") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0ab4, code lost:
    
        return new int[]{4, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x05bb, code lost:
    
        if (r3.equals("MP") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x05e5, code lost:
    
        if (r3.equals("MM") != false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x06b0, code lost:
    
        return new int[]{3, 2, 3, 3, 4, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x05ef, code lost:
    
        if (r3.equals("ML") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x0ada, code lost:
    
        return new int[]{3, 3, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0607, code lost:
    
        if (r3.equals("MH") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0615, code lost:
    
        if (r3.equals("MG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0649, code lost:
    
        if (r3.equals("MC") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x08cc, code lost:
    
        return new int[]{1, 2, 2, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0661, code lost:
    
        if (r3.equals("LY") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x066b, code lost:
    
        if (r3.equals("LV") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0691, code lost:
    
        if (r3.equals("LS") != false) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x069f, code lost:
    
        if (r3.equals("LR") != false) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0a00, code lost:
    
        return new int[]{3, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x06a9, code lost:
    
        if (r3.equals("LK") != false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x06b7, code lost:
    
        if (r3.equals("LI") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x06f9, code lost:
    
        if (r3.equals("KY") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0703, code lost:
    
        if (r3.equals("KW") != false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0836, code lost:
    
        return new int[]{1, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x071b, code lost:
    
        if (r3.equals("KN") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0725, code lost:
    
        if (r3.equals("KM") != false) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0733, code lost:
    
        if (r3.equals("KI") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0775, code lost:
    
        if (r3.equals("JO") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x078d, code lost:
    
        if (r3.equals("JE") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0099, code lost:
    
        if (r3.equals("BQ") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x08da, code lost:
    
        return new int[]{0, 2, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x07a5, code lost:
    
        if (r3.equals("IS") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0bda, code lost:
    
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x07e7, code lost:
    
        if (r3.equals("IM") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x081b, code lost:
    
        if (r3.equals("HU") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x0825, code lost:
    
        if (r3.equals("HT") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x082f, code lost:
    
        if (r3.equals("HR") != false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0891, code lost:
    
        if (r3.equals("GQ") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x08b7, code lost:
    
        if (r3.equals("GM") != false) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x08c5, code lost:
    
        if (r3.equals("GL") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x08d3, code lost:
    
        if (r3.equals("GI") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x096d, code lost:
    
        if (r3.equals("FK") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x09b3, code lost:
    
        if (r3.equals("ER") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x09c1, code lost:
    
        if (r3.equals("EG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x09cf, code lost:
    
        if (r3.equals("EE") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x09eb, code lost:
    
        if (r3.equals("DZ") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x09f9, code lost:
    
        if (r3.equals("DO") != false) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x0a07, code lost:
    
        if (r3.equals("DM") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00cd, code lost:
    
        if (r3.equals("BL") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x0a1f, code lost:
    
        if (r3.equals("DJ") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x0a53, code lost:
    
        if (r3.equals("CX") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:739:0x0a5d, code lost:
    
        if (r3.equals("CW") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x05c2, code lost:
    
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x0a75, code lost:
    
        if (r3.equals("CU") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x0a83, code lost:
    
        if (r3.equals("CR") != false) goto L788;
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x0aad, code lost:
    
        if (r3.equals("CM") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:759:0x0abb, code lost:
    
        if (r3.equals("CL") != false) goto L804;
     */
    /* JADX WARN: Code restructure failed: missing block: B:761:0x0ac9, code lost:
    
        if (r3.equals("CK") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x0bbe, code lost:
    
        return new int[]{2, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x0ad3, code lost:
    
        if (r3.equals("CD") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x0ae1, code lost:
    
        if (r3.equals("CA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:777:0x0b0b, code lost:
    
        if (r3.equals("BI") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x0b27, code lost:
    
        if (r3.equals("BG") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x0b35, code lost:
    
        if (r3.equals("BF") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:795:0x0b5f, code lost:
    
        if (r3.equals("AZ") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e5, code lost:
    
        if (r3.equals("AT") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x0b7b, code lost:
    
        if (r3.equals("AI") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x0b84, code lost:
    
        if (r3.equals("AG") != false) goto L862;
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x0b92, code lost:
    
        if (r3.equals("AF") != false) goto L866;
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x0bae, code lost:
    
        if (r3.equals("AD") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:813:0x0bb7, code lost:
    
        if (r3.equals("BZ") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:819:0x0bd3, code lost:
    
        if (r3.equals("BB") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x09d6, code lost:
    
        return new int[]{0, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:821:0x0be1, code lost:
    
        if (r3.equals("BA") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x0bef, code lost:
    
        if (r3.equals("AX") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:829:0x0c0b, code lost:
    
        if (r3.equals("AM") != false) goto L901;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x010b, code lost:
    
        if (r3.equals("AQ") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x09ba, code lost:
    
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0115, code lost:
    
        if (r3.equals("ZW") != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x038e, code lost:
    
        return new int[]{4, 2, 4, 3, 2, 2};
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0025. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0028. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x002b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x002e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0031. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0034. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] g(java.lang.String r3) {
        /*
            Method dump skipped, instructions count: 6672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjm.g(java.lang.String):int[]");
    }

    private final long h(int i) {
        Long l = (Long) this.i.get(Integer.valueOf(i));
        if (l == null) {
            l = (Long) this.i.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    private final void i(final int i, final long j, long j2) {
        if (i == 0) {
            if (j == 0) {
                if (j2 != this.q) {
                    j = 0;
                } else {
                    return;
                }
            }
            i = 0;
        }
        this.q = j2;
        Iterator it = ((CopyOnWriteArrayList) this.g.a).iterator();
        while (it.hasNext()) {
            final hwo hwoVar = (hwo) it.next();
            if (!hwoVar.a) {
                ((Handler) hwoVar.c).post(new Runnable() { // from class: fjj
                    @Override // java.lang.Runnable
                    public final void run() {
                        fgv fgvVar;
                        fbt fbtVar = (fbt) hwo.this.b;
                        fbs fbsVar = fbtVar.b;
                        if (fbsVar.b.isEmpty()) {
                            fgvVar = null;
                        } else {
                            fgvVar = (fgv) alzz.aO(fbsVar.b);
                        }
                        final long j3 = j;
                        final int i2 = i;
                        final fbk B = fbtVar.B(fgvVar);
                        fbtVar.F(B, 1006, new etv() { // from class: fbl
                            @Override // defpackage.etv
                            public final void a(Object obj) {
                                long longValue;
                                fbk fbkVar = fbk.this;
                                fgv fgvVar2 = fbkVar.d;
                                fbw fbwVar = (fbw) obj;
                                if (fgvVar2 != null) {
                                    fbx fbxVar = fbwVar.b;
                                    erz erzVar = fbkVar.b;
                                    HashMap hashMap = fbwVar.f;
                                    String d2 = fbxVar.d(erzVar, fgvVar2);
                                    Long l = (Long) hashMap.get(d2);
                                    Long l2 = (Long) fbwVar.e.get(d2);
                                    HashMap hashMap2 = fbwVar.f;
                                    long j4 = 0;
                                    if (l == null) {
                                        longValue = 0;
                                    } else {
                                        longValue = l.longValue();
                                    }
                                    hashMap2.put(d2, Long.valueOf(longValue + j3));
                                    HashMap hashMap3 = fbwVar.e;
                                    if (l2 != null) {
                                        j4 = l2.longValue();
                                    }
                                    hashMap3.put(d2, Long.valueOf(j4 + i2));
                                }
                            }
                        });
                    }
                });
            }
        }
    }

    private static boolean j(evl evlVar, boolean z) {
        if (z && !evlVar.b(8)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ewc
    public final synchronized void a(evl evlVar, boolean z, int i) {
        if (!j(evlVar, z)) {
            return;
        }
        this.m += i;
    }

    @Override // defpackage.ewc
    public final synchronized void b(evl evlVar, boolean z) {
        boolean z2;
        gny gnyVar;
        float f2;
        if (!j(evlVar, z)) {
            return;
        }
        int i = 0;
        if (this.k > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        dzg.d(z2);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i2 = (int) (elapsedRealtime - this.l);
        this.n += i2;
        long j = this.o;
        long j2 = this.m;
        this.o = j + j2;
        if (i2 > 0) {
            float f3 = (float) j2;
            fjr fjrVar = this.j;
            int sqrt = (int) Math.sqrt(j2);
            if (fjrVar.d != 1) {
                Collections.sort(fjrVar.c, fjr.a);
                fjrVar.d = 1;
            }
            int i3 = fjrVar.g;
            if (i3 > 0) {
                gny[] gnyVarArr = fjrVar.h;
                int i4 = i3 - 1;
                fjrVar.g = i4;
                gnyVar = gnyVarArr[i4];
            } else {
                gnyVar = new gny();
            }
            int i5 = fjrVar.e;
            fjrVar.e = i5 + 1;
            gnyVar.c = i5;
            gnyVar.a = sqrt;
            gnyVar.b = (f3 * 8000.0f) / i2;
            fjrVar.c.add(gnyVar);
            fjrVar.f += sqrt;
            while (true) {
                int i6 = fjrVar.f;
                if (i6 <= 2000) {
                    break;
                }
                int i7 = i6 - 2000;
                gny gnyVar2 = (gny) fjrVar.c.get(0);
                int i8 = gnyVar2.a;
                if (i8 <= i7) {
                    fjrVar.f -= i8;
                    fjrVar.c.remove(0);
                    int i9 = fjrVar.g;
                    if (i9 < 5) {
                        gny[] gnyVarArr2 = fjrVar.h;
                        fjrVar.g = i9 + 1;
                        gnyVarArr2[i9] = gnyVar2;
                    }
                } else {
                    gnyVar2.a = i8 - i7;
                    fjrVar.f -= i7;
                }
            }
            if (this.n >= 2000 || this.o >= 524288) {
                fjr fjrVar2 = this.j;
                if (fjrVar2.d != 0) {
                    Collections.sort(fjrVar2.c, fjr.b);
                    fjrVar2.d = 0;
                }
                float f4 = fjrVar2.f;
                int i10 = 0;
                while (true) {
                    if (i < fjrVar2.c.size()) {
                        float f5 = 0.5f * f4;
                        gny gnyVar3 = (gny) fjrVar2.c.get(i);
                        i10 += gnyVar3.a;
                        if (i10 >= f5) {
                            f2 = gnyVar3.b;
                            break;
                        }
                        i++;
                    } else if (fjrVar2.c.isEmpty()) {
                        f2 = Float.NaN;
                    } else {
                        f2 = ((gny) fjrVar2.c.get(r14.size() - 1)).b;
                    }
                }
                this.p = f2;
            }
            i(i2, this.m, this.p);
            this.l = elapsedRealtime;
            this.m = 0L;
        }
        this.k--;
    }

    @Override // defpackage.ewc
    public final synchronized void d(evl evlVar, boolean z) {
        if (!j(evlVar, z)) {
            return;
        }
        if (this.k == 0) {
            this.l = SystemClock.elapsedRealtime();
        }
        this.k++;
    }

    public final synchronized void f(int i) {
        int i2;
        if (this.r != i) {
            this.r = i;
            if (i != 1 && i != 0 && i != 8) {
                this.p = h(i);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (this.k > 0) {
                    i2 = (int) (elapsedRealtime - this.l);
                } else {
                    i2 = 0;
                }
                i(i2, this.m, this.p);
                this.l = elapsedRealtime;
                this.m = 0L;
                this.o = 0L;
                this.n = 0L;
                fjr fjrVar = this.j;
                fjrVar.c.clear();
                fjrVar.d = -1;
                fjrVar.e = 0;
                fjrVar.f = 0;
            }
        }
    }

    @Override // defpackage.ewc
    public final void c() {
    }
}

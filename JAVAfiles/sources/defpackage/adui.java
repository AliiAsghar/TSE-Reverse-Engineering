package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Collection;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class adui extends Thread implements aijx {
    public static final /* synthetic */ int e = 0;
    protected final adov d;
    private final armf g;
    private alog h;
    private Optional i;
    private String j;
    private final BlockingQueue k;
    private final adwe l;
    private final Object m;
    private final acqj n;
    private final armf o;
    private volatile int p;
    static final acyz a = acyy.b("accept_messages_to_self_number");
    static final acyz b = acyy.b("validate_called_party_number");
    static final acyz c = acyy.b("log_recipient_verify_method");
    private static final advp f = new advp("ImsServiceDispatcher");

    public adui(adov adovVar, armf armfVar, adwe adweVar, acqj acqjVar, ansy ansyVar) {
        super("SipDispatcher");
        int i = alog.d;
        this.h = alsx.a;
        this.i = Optional.empty();
        this.k = new LinkedBlockingQueue();
        this.m = new Object();
        this.p = 1;
        this.d = adovVar;
        this.g = armfVar;
        this.l = adweVar;
        this.n = acqjVar;
        acss acssVar = new acss(ansyVar, 5);
        this.o = acssVar;
        acssVar.b();
        advr.d(f, "SIP dispatcher is instantiated", new Object[0]);
    }

    public static Optional c(aion aionVar) {
        String j = aionVar.j("P-Called-Party-ID");
        if (j == null) {
            return Optional.empty();
        }
        try {
            advp advpVar = adwf.a;
            return Optional.of(ahji.h(j).b.c());
        } catch (ailb unused) {
            return Optional.empty();
        }
    }

    private static String j(aion aionVar) {
        aimy aimyVar = aionVar.y().f;
        if (aimyVar != null) {
            aiks aiksVar = aimyVar.a.b;
            if (!aiksVar.l()) {
                if (aiksVar instanceof aikq) {
                    return ((aikq) aiksVar).b();
                }
            } else {
                return (String) Optional.ofNullable(((aikp) aiksVar).a.b()).orElse("");
            }
        }
        return "";
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, anhn] */
    private final boolean k(String str, String str2, String str3) {
        if (TextUtils.equals(str, str2)) {
            advr.d(f, "matches with username in configuration.", new Object[0]);
            return true;
        }
        if (((Boolean) a.a()).booleanValue() && TextUtils.equals(str, str3)) {
            advr.d(f, "matches with self number.", new Object[0]);
            return true;
        }
        try {
            String str4 = "+" + String.valueOf(this.o.b().o(str2, null).c());
            if (!str.startsWith(str4)) {
                return false;
            }
            String substring = str2.substring(str4.length());
            String substring2 = str.substring(str4.length());
            if (substring.length() > substring2.length()) {
                return substring.endsWith(substring2);
            }
            return substring2.endsWith(substring);
        } catch (anhk e2) {
            advr.j(e2, f, "%s", e2.getMessage());
            return false;
        }
    }

    private final boolean l(aion aionVar) {
        if (!j(aionVar).startsWith("anonymous")) {
            return false;
        }
        if (this.d.d(aionVar.d()).isPresent()) {
            return true;
        }
        return this.d.c(aionVar.d()).isPresent();
    }

    protected abstract void a(aion aionVar);

    protected abstract void b(aion aionVar);

    @Override // defpackage.aijx
    public final void d() {
        if (!isAlive()) {
            start();
        }
    }

    @Override // defpackage.aijx
    public final void e(List list, String str) {
        this.h = alog.n(list);
        this.i = Collection.EL.stream(list).map(new adof(12)).filter(new adru(2)).map(new adof(13)).filter(new adru(3)).findFirst();
        this.j = str;
        advr.d(f, "selfNumber:%s", advq.PHONE_NUMBER.c(this.i));
    }

    @Override // defpackage.aijx
    public final void f(aion aionVar) {
        synchronized (this.m) {
            if (!isAlive()) {
                advr.r(f, "ImsServiceDispatcher is not running, ignore the sip request", new Object[0]);
                return;
            }
            try {
                this.k.put(aionVar);
                this.p = 3;
            } catch (InterruptedException e2) {
                advr.j(e2, f, "error buffering SIP request: %s", e2.getMessage());
            }
        }
    }

    @Override // defpackage.aijx
    public final void g(aioo aiooVar) {
        synchronized (this.m) {
            if (!isAlive()) {
                advr.r(f, "ImsServiceDispatcher is not running, ignore the sip response", new Object[0]);
                return;
            }
            try {
                this.k.put(aiooVar);
                this.p = 3;
            } catch (InterruptedException e2) {
                advr.j(e2, f, "error buffering SIP response: %s", e2.getMessage());
            }
        }
    }

    protected final void h(aion aionVar) {
        try {
            ((aikc) this.g).a.r(this.l.n(aionVar));
        } catch (aild e2) {
            advr.j(e2, f, "sendFinalResponse failed to send %d response", Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED));
        }
    }

    public final void i(aion aionVar, int i, int i2) {
        try {
            ((aikc) this.g).a.r(this.l.o(aionVar, i, i2));
        } catch (aild e2) {
            advr.j(e2, f, "sendFinalFailureRespons failed to send %d response", Integer.valueOf(i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:236:0x0183, code lost:
    
        if (((java.lang.Boolean) r8.a()).booleanValue() == false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x034c A[Catch: Exception -> 0x05c4, TryCatch #11 {Exception -> 0x05c4, blocks: (B:40:0x007d, B:42:0x0092, B:43:0x009a, B:45:0x00ae, B:48:0x00bd, B:50:0x00d0, B:52:0x00e1, B:54:0x00fb, B:56:0x0101, B:57:0x0200, B:59:0x020c, B:61:0x0214, B:63:0x0220, B:65:0x0228, B:66:0x024c, B:68:0x0252, B:70:0x02bf, B:88:0x02b0, B:89:0x0517, B:92:0x0545, B:94:0x0551, B:95:0x0556, B:97:0x0562, B:99:0x0568, B:101:0x0570, B:102:0x0575, B:103:0x0584, B:109:0x0590, B:126:0x0522, B:128:0x0528, B:130:0x0530, B:132:0x0538, B:133:0x022d, B:134:0x02d4, B:136:0x02e4, B:137:0x0311, B:139:0x0317, B:141:0x0329, B:142:0x032e, B:143:0x0343, B:144:0x034c, B:146:0x035c, B:148:0x036e, B:149:0x0377, B:151:0x0383, B:152:0x039e, B:154:0x03aa, B:156:0x03b9, B:157:0x03c4, B:160:0x03f2, B:161:0x03f6, B:169:0x0401, B:174:0x03e3, B:175:0x0402, B:177:0x040e, B:181:0x0426, B:185:0x0434, B:189:0x043f, B:191:0x0447, B:192:0x044c, B:194:0x045c, B:196:0x0464, B:197:0x0469, B:199:0x0477, B:201:0x047b, B:202:0x048f, B:203:0x04bf, B:205:0x04c5, B:213:0x04d1, B:188:0x04db, B:218:0x04e4, B:219:0x04ed, B:220:0x04f6, B:222:0x0502, B:223:0x0120, B:225:0x0126, B:227:0x0145, B:229:0x014e, B:230:0x0155, B:232:0x0168, B:234:0x0171, B:235:0x0179, B:238:0x0185, B:240:0x01a3, B:242:0x01ac, B:243:0x01b2, B:245:0x01b8, B:247:0x01c1, B:248:0x01c8, B:207:0x04cb, B:72:0x0264, B:73:0x0279, B:75:0x027f, B:77:0x0289, B:79:0x0291, B:81:0x0299, B:82:0x029f, B:84:0x02a5, B:159:0x03ca, B:163:0x03f7, B:164:0x03fc), top: B:39:0x007d, inners: #0, #1, #12, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x05ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x020c A[Catch: Exception -> 0x05c4, TryCatch #11 {Exception -> 0x05c4, blocks: (B:40:0x007d, B:42:0x0092, B:43:0x009a, B:45:0x00ae, B:48:0x00bd, B:50:0x00d0, B:52:0x00e1, B:54:0x00fb, B:56:0x0101, B:57:0x0200, B:59:0x020c, B:61:0x0214, B:63:0x0220, B:65:0x0228, B:66:0x024c, B:68:0x0252, B:70:0x02bf, B:88:0x02b0, B:89:0x0517, B:92:0x0545, B:94:0x0551, B:95:0x0556, B:97:0x0562, B:99:0x0568, B:101:0x0570, B:102:0x0575, B:103:0x0584, B:109:0x0590, B:126:0x0522, B:128:0x0528, B:130:0x0530, B:132:0x0538, B:133:0x022d, B:134:0x02d4, B:136:0x02e4, B:137:0x0311, B:139:0x0317, B:141:0x0329, B:142:0x032e, B:143:0x0343, B:144:0x034c, B:146:0x035c, B:148:0x036e, B:149:0x0377, B:151:0x0383, B:152:0x039e, B:154:0x03aa, B:156:0x03b9, B:157:0x03c4, B:160:0x03f2, B:161:0x03f6, B:169:0x0401, B:174:0x03e3, B:175:0x0402, B:177:0x040e, B:181:0x0426, B:185:0x0434, B:189:0x043f, B:191:0x0447, B:192:0x044c, B:194:0x045c, B:196:0x0464, B:197:0x0469, B:199:0x0477, B:201:0x047b, B:202:0x048f, B:203:0x04bf, B:205:0x04c5, B:213:0x04d1, B:188:0x04db, B:218:0x04e4, B:219:0x04ed, B:220:0x04f6, B:222:0x0502, B:223:0x0120, B:225:0x0126, B:227:0x0145, B:229:0x014e, B:230:0x0155, B:232:0x0168, B:234:0x0171, B:235:0x0179, B:238:0x0185, B:240:0x01a3, B:242:0x01ac, B:243:0x01b2, B:245:0x01b8, B:247:0x01c1, B:248:0x01c8, B:207:0x04cb, B:72:0x0264, B:73:0x0279, B:75:0x027f, B:77:0x0289, B:79:0x0291, B:81:0x0299, B:82:0x029f, B:84:0x02a5, B:159:0x03ca, B:163:0x03f7, B:164:0x03fc), top: B:39:0x007d, inners: #0, #1, #12, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0551 A[Catch: Exception -> 0x05c4, TryCatch #11 {Exception -> 0x05c4, blocks: (B:40:0x007d, B:42:0x0092, B:43:0x009a, B:45:0x00ae, B:48:0x00bd, B:50:0x00d0, B:52:0x00e1, B:54:0x00fb, B:56:0x0101, B:57:0x0200, B:59:0x020c, B:61:0x0214, B:63:0x0220, B:65:0x0228, B:66:0x024c, B:68:0x0252, B:70:0x02bf, B:88:0x02b0, B:89:0x0517, B:92:0x0545, B:94:0x0551, B:95:0x0556, B:97:0x0562, B:99:0x0568, B:101:0x0570, B:102:0x0575, B:103:0x0584, B:109:0x0590, B:126:0x0522, B:128:0x0528, B:130:0x0530, B:132:0x0538, B:133:0x022d, B:134:0x02d4, B:136:0x02e4, B:137:0x0311, B:139:0x0317, B:141:0x0329, B:142:0x032e, B:143:0x0343, B:144:0x034c, B:146:0x035c, B:148:0x036e, B:149:0x0377, B:151:0x0383, B:152:0x039e, B:154:0x03aa, B:156:0x03b9, B:157:0x03c4, B:160:0x03f2, B:161:0x03f6, B:169:0x0401, B:174:0x03e3, B:175:0x0402, B:177:0x040e, B:181:0x0426, B:185:0x0434, B:189:0x043f, B:191:0x0447, B:192:0x044c, B:194:0x045c, B:196:0x0464, B:197:0x0469, B:199:0x0477, B:201:0x047b, B:202:0x048f, B:203:0x04bf, B:205:0x04c5, B:213:0x04d1, B:188:0x04db, B:218:0x04e4, B:219:0x04ed, B:220:0x04f6, B:222:0x0502, B:223:0x0120, B:225:0x0126, B:227:0x0145, B:229:0x014e, B:230:0x0155, B:232:0x0168, B:234:0x0171, B:235:0x0179, B:238:0x0185, B:240:0x01a3, B:242:0x01ac, B:243:0x01b2, B:245:0x01b8, B:247:0x01c1, B:248:0x01c8, B:207:0x04cb, B:72:0x0264, B:73:0x0279, B:75:0x027f, B:77:0x0289, B:79:0x0291, B:81:0x0299, B:82:0x029f, B:84:0x02a5, B:159:0x03ca, B:163:0x03f7, B:164:0x03fc), top: B:39:0x007d, inners: #0, #1, #12, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0556 A[Catch: Exception -> 0x05c4, TryCatch #11 {Exception -> 0x05c4, blocks: (B:40:0x007d, B:42:0x0092, B:43:0x009a, B:45:0x00ae, B:48:0x00bd, B:50:0x00d0, B:52:0x00e1, B:54:0x00fb, B:56:0x0101, B:57:0x0200, B:59:0x020c, B:61:0x0214, B:63:0x0220, B:65:0x0228, B:66:0x024c, B:68:0x0252, B:70:0x02bf, B:88:0x02b0, B:89:0x0517, B:92:0x0545, B:94:0x0551, B:95:0x0556, B:97:0x0562, B:99:0x0568, B:101:0x0570, B:102:0x0575, B:103:0x0584, B:109:0x0590, B:126:0x0522, B:128:0x0528, B:130:0x0530, B:132:0x0538, B:133:0x022d, B:134:0x02d4, B:136:0x02e4, B:137:0x0311, B:139:0x0317, B:141:0x0329, B:142:0x032e, B:143:0x0343, B:144:0x034c, B:146:0x035c, B:148:0x036e, B:149:0x0377, B:151:0x0383, B:152:0x039e, B:154:0x03aa, B:156:0x03b9, B:157:0x03c4, B:160:0x03f2, B:161:0x03f6, B:169:0x0401, B:174:0x03e3, B:175:0x0402, B:177:0x040e, B:181:0x0426, B:185:0x0434, B:189:0x043f, B:191:0x0447, B:192:0x044c, B:194:0x045c, B:196:0x0464, B:197:0x0469, B:199:0x0477, B:201:0x047b, B:202:0x048f, B:203:0x04bf, B:205:0x04c5, B:213:0x04d1, B:188:0x04db, B:218:0x04e4, B:219:0x04ed, B:220:0x04f6, B:222:0x0502, B:223:0x0120, B:225:0x0126, B:227:0x0145, B:229:0x014e, B:230:0x0155, B:232:0x0168, B:234:0x0171, B:235:0x0179, B:238:0x0185, B:240:0x01a3, B:242:0x01ac, B:243:0x01b2, B:245:0x01b8, B:247:0x01c1, B:248:0x01c8, B:207:0x04cb, B:72:0x0264, B:73:0x0279, B:75:0x027f, B:77:0x0289, B:79:0x0291, B:81:0x0299, B:82:0x029f, B:84:0x02a5, B:159:0x03ca, B:163:0x03f7, B:164:0x03fc), top: B:39:0x007d, inners: #0, #1, #12, #14 }] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r5v5, types: [aiom] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adui.run():void");
    }
}

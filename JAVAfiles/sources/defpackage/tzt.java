package defpackage;

import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tzt extends arrp implements arqg {
    private final /* synthetic */ int u;
    public static final tzt t = new tzt(20);
    public static final tzt s = new tzt(19);
    public static final tzt r = new tzt(18);
    public static final tzt q = new tzt(17);
    public static final tzt p = new tzt(16);
    public static final tzt o = new tzt(15);
    public static final tzt n = new tzt(14);
    public static final tzt m = new tzt(12);
    public static final tzt l = new tzt(11);
    public static final tzt k = new tzt(10);
    public static final tzt j = new tzt(9);
    public static final tzt i = new tzt(8);
    public static final tzt h = new tzt(7);
    public static final tzt g = new tzt(6);
    public static final tzt f = new tzt(5);
    public static final tzt e = new tzt(4);
    public static final tzt d = new tzt(3);
    public static final tzt c = new tzt(2);
    public static final tzt b = new tzt(1);
    public static final tzt a = new tzt(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tzt(int i2) {
        super(0);
        this.u = i2;
    }

    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        int i2 = 0;
        switch (this.u) {
            case 0:
                tzu[] values = tzu.values();
                int length = values.length;
                LinkedHashMap linkedHashMap = new LinkedHashMap(arrn.r(aqjn.i(length), 16));
                while (i2 < length) {
                    tzu tzuVar = values[i2];
                    linkedHashMap.put(new armo(tzuVar.h, tzuVar.i), tzuVar);
                    i2++;
                }
                return linkedHashMap;
            case 1:
                return (Boolean) ((utz) rwv.a.get()).e();
            case 2:
                tzv[] values2 = tzv.values();
                int length2 = values2.length;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(arrn.r(aqjn.i(length2), 16));
                while (i2 < length2) {
                    tzv tzvVar = values2[i2];
                    linkedHashMap2.put(Integer.valueOf(tzvVar.l), tzvVar);
                    i2++;
                }
                return linkedHashMap2;
            case 3:
                tzw[] values3 = tzw.values();
                int length3 = values3.length;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(arrn.r(aqjn.i(length3), 16));
                while (i2 < length3) {
                    tzw tzwVar = values3[i2];
                    linkedHashMap3.put(Integer.valueOf(tzwVar.g), tzwVar);
                    i2++;
                }
                return linkedHashMap3;
            case 4:
                arpx arpxVar = tzy.i;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(arrn.r(aqjn.i(aqjn.J(arpxVar, 10)), 16));
                arng arngVar = new arng(arpxVar);
                while (arngVar.hasNext()) {
                    Object next = arngVar.next();
                    linkedHashMap4.put(Integer.valueOf(((tzy) next).h), next);
                }
                return linkedHashMap4;
            case 5:
                return (Boolean) uwg.a.e();
            case 6:
                return aqil.r(new znj[]{(znj) xmx.a.a(), (znj) xms.a.a(), (znj) xmt.a.a(), (znj) xmv.a.a(), (znj) xmv.b.a(), (znj) xmu.b.a()});
            case 7:
                return new znj(xmr.b, xmr.a, (char[]) null);
            case 8:
                return new znj(xmr.c, xmr.d, (char[]) null);
            case 9:
                return new znj(xmr.e, xmr.f, (char[]) null);
            case 10:
                return new znj(xmr.g, xmr.h, (char[]) null);
            case 11:
                return new znj(xmr.i, xmr.j, (char[]) null);
            case 12:
                return new znj(xmr.k, xmr.l, (char[]) null);
            case 13:
                String str = (String) yig.l.e();
                str.getClass();
                Set g2 = yio.g(str);
                String str2 = (String) yig.m.e();
                str2.getClass();
                return new znj(g2, yio.g(str2), (char[]) null);
            case 14:
                return new ymp((ymq) ymt.g.a());
            case 15:
                return uuh.h(uuh.b, "spam_verdict_enforcement_policy_config_local_path", "");
            case 16:
                return uuh.h(uuh.b, "spam_verdict_enforcement_policy_config_mdd_file", "");
            case 17:
                return uuh.h(uuh.b, "spam_verdict_enforcement_policy_config_mdd_group", "");
            case 18:
                return uuh.h(uuh.b, "spam_verdict_enforcement_policy_config_target_id", "");
            case 19:
                return xze.g("Bugle", "SpamVerdictEnforcementPolicyConfigManager");
            default:
                return alvi.m("com/google/android/apps/messaging/shared/video/SafeDuoKitClientKt$log$2");
        }
    }
}

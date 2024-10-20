package defpackage;

import android.content.Context;
import android.os.Build;
import android.telephony.SubscriptionManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wvt implements wvm {
    private final AtomicBoolean A;
    public final Context b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final wpp l;
    private final arwe m;
    private final arwe n;
    private final armf o;
    private final armf p;
    private final armf q;
    private final armf r;
    private final armf s;
    private final armf t;
    private final armf u;
    private final armf v;
    private final armf w;
    private final armf x;
    private final armf y;
    private final armf z;
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl");
    private static final asgm B = new asgm();
    public static final asgm k = new asgm();

    public wvt(Context context, arwe arweVar, arwe arweVar2, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, wpp wppVar, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20, armf armfVar21, armf armfVar22, armf armfVar23, armf armfVar24) {
        context.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        wppVar.getClass();
        armfVar8.getClass();
        armfVar9.getClass();
        armfVar10.getClass();
        armfVar11.getClass();
        armfVar12.getClass();
        armfVar13.getClass();
        armfVar14.getClass();
        armfVar15.getClass();
        armfVar16.getClass();
        armfVar17.getClass();
        armfVar18.getClass();
        armfVar19.getClass();
        armfVar20.getClass();
        armfVar21.getClass();
        armfVar22.getClass();
        armfVar23.getClass();
        armfVar24.getClass();
        this.b = context;
        this.m = arweVar;
        this.n = arweVar2;
        this.c = armfVar;
        this.o = armfVar2;
        this.p = armfVar3;
        this.d = armfVar4;
        this.e = armfVar7;
        this.l = wppVar;
        this.f = armfVar8;
        this.q = armfVar10;
        this.r = armfVar11;
        this.s = armfVar12;
        this.t = armfVar13;
        this.u = armfVar14;
        this.g = armfVar16;
        this.h = armfVar17;
        this.i = armfVar18;
        this.v = armfVar19;
        this.j = armfVar20;
        this.w = armfVar21;
        this.x = armfVar22;
        this.y = armfVar23;
        this.z = armfVar24;
        this.A = new AtomicBoolean(true);
    }

    private final adwt k(int i) {
        return adwt.g(this.b).f(i);
    }

    private final String l(int i) {
        String phoneNumber;
        if (((pmp) this.z.b()).a() && Build.VERSION.SDK_INT >= 33) {
            try {
                phoneNumber = ((SubscriptionManager) adwq.b(this.b).a).getPhoneNumber(i);
                if (phoneNumber == null) {
                    return "";
                }
                return phoneNumber;
            } catch (SecurityException e) {
                throw new adwk("READ_PHONE_STATE permission is missing.", e);
            }
        }
        try {
            adwt k2 = k(i);
            if (k2 == null) {
                return "";
            }
            String i2 = k2.i();
            if (i2 == null) {
                return "";
            }
            return i2;
        } catch (adwk unused) {
            alvw i3 = a.i();
            i3.X(alwp.a, "BugleSimStateTracker");
            ((alvg) i3.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "getRawMsisdnInternal-0jkzt_0", 803, "PhoneSimsStateUpdaterImpl.kt")).q("getRawMsisdnInternal: Missing permissions for TelephonyManager");
            return "";
        }
    }

    private final void m(Set set) {
        Set set2 = (Set) this.y.b();
        if (set2.isEmpty()) {
            alvw g = a.g();
            g.X(alwp.a, "BugleSimStateTracker");
            ((alvg) g.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "handleMultiSimsLoaded", 468, "PhoneSimsStateUpdaterImpl.kt")).q("No sim loaded listeners registered.");
            return;
        }
        qjh.l(this.n, null, new uog(set2, set, (arpe) null, 13), 3);
    }

    private final void n(wwm wwmVar, String str, String str2, Set set, Set set2) {
        Object obj;
        Object obj2;
        int i;
        Iterator it = set2.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (d.F(((wxb) obj2).c, str2)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        wxb wxbVar = (wxb) obj2;
        if (wxbVar != null) {
            i = wxbVar.d;
        } else {
            i = -1;
        }
        wxc wxcVar = new wxc(i, new adiw(str2));
        Iterator it2 = set.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (d.F(((wxb) next).c, str)) {
                obj = next;
                break;
            }
        }
        new adiw(str);
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            Iterator it3 = set2.iterator();
            while (it3.hasNext() && !d.F(((wxb) it3.next()).c, str)) {
            }
        }
        alvw g = a.g();
        g.X(alwp.a, "BugleSimStateTracker");
        ((alvg) g.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "notifyDefaultSubscriptionChangeListeners", 576, "PhoneSimsStateUpdaterImpl.kt")).t("Notifying SubscriptionChangeListeners - default sim type: %s", wwmVar.toString());
        Object b = this.t.b();
        b.getClass();
        Iterator it4 = ((Iterable) b).iterator();
        while (it4.hasNext()) {
            ((wxd) it4.next()).z(wwmVar, wxcVar);
        }
    }

    private final void o(String str) {
        if (str != null) {
            ((ykw) this.o.b()).h("is_fi_device_".concat(str), true);
        }
    }

    private final boolean p(int i, String str) {
        String i2 = i(str);
        boolean z = true;
        if (i2 != null && ((ykw) this.o.b()).q("is_fi_device_".concat(i2), false)) {
            alvw g = a.g();
            g.X(alwp.a, "BugleSimStateTracker");
            ((alvg) g.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "isFiDevice-bYZ02fE", 833, "PhoneSimsStateUpdaterImpl.kt")).q("Found isFiDevice from Fi cache");
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                adwt k2 = k(i);
                if (k2 != null && k2.d() == 1989) {
                    o(i2);
                    return true;
                }
            } catch (adwk unused) {
                alvw i3 = a.i();
                i3.X(alwp.a, "BugleSimStateTracker");
                ((alvg) i3.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "isFiDevice-bYZ02fE", 849, "PhoneSimsStateUpdaterImpl.kt")).q("isFiDevice: Missing permissions for TelephonyManager");
            }
        }
        alvw g2 = a.g();
        g2.X(alwp.a, "BugleSimStateTracker");
        ((alvg) g2.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "isFiDevice-bYZ02fE", 854, "PhoneSimsStateUpdaterImpl.kt")).q("Looking up Fi through package names.");
        Object a2 = acpy.i.a();
        a2.getClass();
        String str2 = (String) a2;
        if (str2.length() == 0) {
            return false;
        }
        Iterator it = anna.g(",").a(str2).iterator();
        while (true) {
            if (it.hasNext()) {
                String obj = arsd.D((String) it.next()).toString();
                if (obj.length() != 0) {
                    try {
                        if (adwv.a(this.b).b(obj, i)) {
                            break;
                        }
                    } catch (adwk unused2) {
                        alvw g3 = a.g();
                        g3.X(alwp.a, "BugleSimStateTracker");
                        ((alvg) g3.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "hasCarrierPrivileges-0_gSl_s", 870, "PhoneSimsStateUpdaterImpl.kt")).q("Missing permissions for SystemApiManager");
                    } catch (NoSuchMethodException unused3) {
                        alvw g4 = a.g();
                        g4.X(alwp.a, "BugleSimStateTracker");
                        ((alvg) g4.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "hasCarrierPrivileges-0_gSl_s", 872, "PhoneSimsStateUpdaterImpl.kt")).q("Method not found in SystemApiManager");
                    }
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            o(i2);
        }
        return z;
    }

    private final boolean q(wxb wxbVar, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (d.F(((wxb) obj).c, wxbVar.c)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        wxb wxbVar2 = (wxb) obj;
        if (wxbVar2 == null || !d.F(wxbVar2.c, wxbVar.c) || !d.F(wxbVar2.f, wxbVar.f) || !d.F(wxbVar2.n, wxbVar.n) || !d.F(wxbVar2.k, wxbVar.k) || !d.F(wxbVar2.l, wxbVar.l) || !d.F(wxbVar2.j, wxbVar.j) || wxbVar2.m != wxbVar.m || !d.F(wxbVar2.u, wxbVar.u)) {
            return true;
        }
        return false;
    }

    private final String r(String str) {
        if (str.length() == 0) {
            return "";
        }
        String r = ((yjr) this.p.b()).r(str, false);
        r.getClass();
        return r;
    }

    private static final String s(String str, ykb ykbVar) {
        try {
            String substring = str.substring(0, 3);
            substring.getClass();
            return substring;
        } catch (StringIndexOutOfBoundsException e) {
            alvw i = a.i();
            i.X(alwp.a, "BugleSimStateTracker");
            ((alvg) ((alvg) i).g(e).h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "getMcc", 921, "PhoneSimsStateUpdaterImpl.kt")).q("Invalid simOperator provided when setting MCC");
            return String.valueOf(ykbVar.H()[0]);
        }
    }

    private static final String t(String str, ykb ykbVar) {
        try {
            String substring = str.substring(3);
            substring.getClass();
            return substring;
        } catch (StringIndexOutOfBoundsException e) {
            alvw i = a.i();
            i.X(alwp.a, "BugleSimStateTracker");
            ((alvg) ((alvg) i).g(e).h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "getMnc", 930, "PhoneSimsStateUpdaterImpl.kt")).q("Invalid simOperator provided when setting MCC");
            return String.valueOf(ykbVar.H()[1]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r1v0, types: [arpl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // defpackage.wvm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.arpe r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wvt.a(arpe):java.lang.Object");
    }

    @Override // defpackage.wvm
    public final arwl b(List list) {
        return arrn.I(this.m, null, null, new vpi(list, this, (arpe) null, 20), 3);
    }

    @Override // defpackage.wvm
    public final arwl c() {
        return arrn.I(this.m, null, null, new wvs(this, null), 3);
    }

    public final wwz d(wwz wwzVar) {
        String h = h(((yjy) this.c.b()).f());
        String str = null;
        if (h.length() <= 0) {
            h = null;
        }
        if (h == null) {
            h = wwzVar.c;
            h.getClass();
        }
        String h2 = h(((yjy) this.c.b()).c());
        if (h2.length() <= 0) {
            h2 = null;
        }
        if (h2 == null) {
            h2 = wwzVar.d;
            h2.getClass();
        }
        String h3 = h(((yjy) this.c.b()).b());
        if (h3.length() <= 0) {
            h3 = null;
        }
        if (h3 == null) {
            h3 = wwzVar.e;
            h3.getClass();
        }
        String h4 = h(((yjy) this.c.b()).f());
        if (h4.length() > 0) {
            str = h4;
        }
        if (str == null) {
            str = wwzVar.f;
            str.getClass();
        }
        alvw g = a.g();
        g.X(alwp.a, "BugleSimStateTracker");
        ((alvg) g.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "getDefaultSubscriptions", 742, "PhoneSimsStateUpdaterImpl.kt")).J("default call SIM: %s, default sms SIM %s. default data SIM %s.", advq.SIM_ID.c(h), advq.SIM_ID.c(h2), advq.SIM_ID.c(h3));
        aozy createBuilder = wwz.a.createBuilder();
        createBuilder.getClass();
        wcm.x(h, createBuilder);
        wcm.A(h2, createBuilder);
        wcm.y(h3, createBuilder);
        wcm.z(str, createBuilder);
        return wcm.w(createBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.ykb r17, defpackage.arpe r18) {
        /*
            Method dump skipped, instructions count: 807
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wvt.e(ykb, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0096 A[Catch: all -> 0x004f, TryCatch #2 {all -> 0x004f, blocks: (B:27:0x004b, B:28:0x0092, B:30:0x0096, B:32:0x00c1, B:33:0x00c4, B:35:0x00d6, B:36:0x00d9), top: B:26:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.adiv r11, defpackage.arpe r12) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wvt.f(adiv, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:245:0x0266, code lost:
    
        if (r0 != r3) goto L85;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0385 A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:13:0x004a, B:96:0x008f, B:98:0x036f, B:100:0x0376, B:101:0x037f, B:103:0x0385, B:106:0x0392, B:111:0x0396, B:112:0x03a6, B:114:0x03ac, B:117:0x03b7, B:120:0x03bd, B:126:0x03c1, B:127:0x03cf, B:129:0x03d5, B:132:0x03e8, B:137:0x03ec, B:138:0x03fa, B:140:0x0400, B:143:0x040f, B:148:0x0413, B:149:0x043f, B:151:0x0445, B:153:0x046a, B:157:0x00a8, B:159:0x0345, B:164:0x02a5, B:165:0x027f, B:167:0x0285, B:171:0x02ae, B:172:0x02d7, B:174:0x02dd, B:176:0x0302, B:178:0x0317, B:180:0x031f, B:181:0x0324, B:185:0x034e, B:192:0x00db, B:195:0x024d, B:196:0x0269, B:198:0x00ed, B:201:0x011c, B:202:0x012a, B:204:0x0130, B:207:0x01c8, B:210:0x014b, B:212:0x0151, B:216:0x016e, B:219:0x017a, B:221:0x0180, B:222:0x01c4, B:224:0x0199, B:229:0x01d4, B:230:0x01f3, B:232:0x01f9, B:234:0x020c, B:236:0x0212, B:237:0x0220, B:239:0x022e, B:241:0x0236, B:244:0x0251), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03ac A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:13:0x004a, B:96:0x008f, B:98:0x036f, B:100:0x0376, B:101:0x037f, B:103:0x0385, B:106:0x0392, B:111:0x0396, B:112:0x03a6, B:114:0x03ac, B:117:0x03b7, B:120:0x03bd, B:126:0x03c1, B:127:0x03cf, B:129:0x03d5, B:132:0x03e8, B:137:0x03ec, B:138:0x03fa, B:140:0x0400, B:143:0x040f, B:148:0x0413, B:149:0x043f, B:151:0x0445, B:153:0x046a, B:157:0x00a8, B:159:0x0345, B:164:0x02a5, B:165:0x027f, B:167:0x0285, B:171:0x02ae, B:172:0x02d7, B:174:0x02dd, B:176:0x0302, B:178:0x0317, B:180:0x031f, B:181:0x0324, B:185:0x034e, B:192:0x00db, B:195:0x024d, B:196:0x0269, B:198:0x00ed, B:201:0x011c, B:202:0x012a, B:204:0x0130, B:207:0x01c8, B:210:0x014b, B:212:0x0151, B:216:0x016e, B:219:0x017a, B:221:0x0180, B:222:0x01c4, B:224:0x0199, B:229:0x01d4, B:230:0x01f3, B:232:0x01f9, B:234:0x020c, B:236:0x0212, B:237:0x0220, B:239:0x022e, B:241:0x0236, B:244:0x0251), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03d5 A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:13:0x004a, B:96:0x008f, B:98:0x036f, B:100:0x0376, B:101:0x037f, B:103:0x0385, B:106:0x0392, B:111:0x0396, B:112:0x03a6, B:114:0x03ac, B:117:0x03b7, B:120:0x03bd, B:126:0x03c1, B:127:0x03cf, B:129:0x03d5, B:132:0x03e8, B:137:0x03ec, B:138:0x03fa, B:140:0x0400, B:143:0x040f, B:148:0x0413, B:149:0x043f, B:151:0x0445, B:153:0x046a, B:157:0x00a8, B:159:0x0345, B:164:0x02a5, B:165:0x027f, B:167:0x0285, B:171:0x02ae, B:172:0x02d7, B:174:0x02dd, B:176:0x0302, B:178:0x0317, B:180:0x031f, B:181:0x0324, B:185:0x034e, B:192:0x00db, B:195:0x024d, B:196:0x0269, B:198:0x00ed, B:201:0x011c, B:202:0x012a, B:204:0x0130, B:207:0x01c8, B:210:0x014b, B:212:0x0151, B:216:0x016e, B:219:0x017a, B:221:0x0180, B:222:0x01c4, B:224:0x0199, B:229:0x01d4, B:230:0x01f3, B:232:0x01f9, B:234:0x020c, B:236:0x0212, B:237:0x0220, B:239:0x022e, B:241:0x0236, B:244:0x0251), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0400 A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:13:0x004a, B:96:0x008f, B:98:0x036f, B:100:0x0376, B:101:0x037f, B:103:0x0385, B:106:0x0392, B:111:0x0396, B:112:0x03a6, B:114:0x03ac, B:117:0x03b7, B:120:0x03bd, B:126:0x03c1, B:127:0x03cf, B:129:0x03d5, B:132:0x03e8, B:137:0x03ec, B:138:0x03fa, B:140:0x0400, B:143:0x040f, B:148:0x0413, B:149:0x043f, B:151:0x0445, B:153:0x046a, B:157:0x00a8, B:159:0x0345, B:164:0x02a5, B:165:0x027f, B:167:0x0285, B:171:0x02ae, B:172:0x02d7, B:174:0x02dd, B:176:0x0302, B:178:0x0317, B:180:0x031f, B:181:0x0324, B:185:0x034e, B:192:0x00db, B:195:0x024d, B:196:0x0269, B:198:0x00ed, B:201:0x011c, B:202:0x012a, B:204:0x0130, B:207:0x01c8, B:210:0x014b, B:212:0x0151, B:216:0x016e, B:219:0x017a, B:221:0x0180, B:222:0x01c4, B:224:0x0199, B:229:0x01d4, B:230:0x01f3, B:232:0x01f9, B:234:0x020c, B:236:0x0212, B:237:0x0220, B:239:0x022e, B:241:0x0236, B:244:0x0251), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0445 A[Catch: all -> 0x0059, LOOP:7: B:149:0x043f->B:151:0x0445, LOOP_END, TryCatch #0 {all -> 0x0059, blocks: (B:13:0x004a, B:96:0x008f, B:98:0x036f, B:100:0x0376, B:101:0x037f, B:103:0x0385, B:106:0x0392, B:111:0x0396, B:112:0x03a6, B:114:0x03ac, B:117:0x03b7, B:120:0x03bd, B:126:0x03c1, B:127:0x03cf, B:129:0x03d5, B:132:0x03e8, B:137:0x03ec, B:138:0x03fa, B:140:0x0400, B:143:0x040f, B:148:0x0413, B:149:0x043f, B:151:0x0445, B:153:0x046a, B:157:0x00a8, B:159:0x0345, B:164:0x02a5, B:165:0x027f, B:167:0x0285, B:171:0x02ae, B:172:0x02d7, B:174:0x02dd, B:176:0x0302, B:178:0x0317, B:180:0x031f, B:181:0x0324, B:185:0x034e, B:192:0x00db, B:195:0x024d, B:196:0x0269, B:198:0x00ed, B:201:0x011c, B:202:0x012a, B:204:0x0130, B:207:0x01c8, B:210:0x014b, B:212:0x0151, B:216:0x016e, B:219:0x017a, B:221:0x0180, B:222:0x01c4, B:224:0x0199, B:229:0x01d4, B:230:0x01f3, B:232:0x01f9, B:234:0x020c, B:236:0x0212, B:237:0x0220, B:239:0x022e, B:241:0x0236, B:244:0x0251), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0285 A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:13:0x004a, B:96:0x008f, B:98:0x036f, B:100:0x0376, B:101:0x037f, B:103:0x0385, B:106:0x0392, B:111:0x0396, B:112:0x03a6, B:114:0x03ac, B:117:0x03b7, B:120:0x03bd, B:126:0x03c1, B:127:0x03cf, B:129:0x03d5, B:132:0x03e8, B:137:0x03ec, B:138:0x03fa, B:140:0x0400, B:143:0x040f, B:148:0x0413, B:149:0x043f, B:151:0x0445, B:153:0x046a, B:157:0x00a8, B:159:0x0345, B:164:0x02a5, B:165:0x027f, B:167:0x0285, B:171:0x02ae, B:172:0x02d7, B:174:0x02dd, B:176:0x0302, B:178:0x0317, B:180:0x031f, B:181:0x0324, B:185:0x034e, B:192:0x00db, B:195:0x024d, B:196:0x0269, B:198:0x00ed, B:201:0x011c, B:202:0x012a, B:204:0x0130, B:207:0x01c8, B:210:0x014b, B:212:0x0151, B:216:0x016e, B:219:0x017a, B:221:0x0180, B:222:0x01c4, B:224:0x0199, B:229:0x01d4, B:230:0x01f3, B:232:0x01f9, B:234:0x020c, B:236:0x0212, B:237:0x0220, B:239:0x022e, B:241:0x0236, B:244:0x0251), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02ae A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:13:0x004a, B:96:0x008f, B:98:0x036f, B:100:0x0376, B:101:0x037f, B:103:0x0385, B:106:0x0392, B:111:0x0396, B:112:0x03a6, B:114:0x03ac, B:117:0x03b7, B:120:0x03bd, B:126:0x03c1, B:127:0x03cf, B:129:0x03d5, B:132:0x03e8, B:137:0x03ec, B:138:0x03fa, B:140:0x0400, B:143:0x040f, B:148:0x0413, B:149:0x043f, B:151:0x0445, B:153:0x046a, B:157:0x00a8, B:159:0x0345, B:164:0x02a5, B:165:0x027f, B:167:0x0285, B:171:0x02ae, B:172:0x02d7, B:174:0x02dd, B:176:0x0302, B:178:0x0317, B:180:0x031f, B:181:0x0324, B:185:0x034e, B:192:0x00db, B:195:0x024d, B:196:0x0269, B:198:0x00ed, B:201:0x011c, B:202:0x012a, B:204:0x0130, B:207:0x01c8, B:210:0x014b, B:212:0x0151, B:216:0x016e, B:219:0x017a, B:221:0x0180, B:222:0x01c4, B:224:0x0199, B:229:0x01d4, B:230:0x01f3, B:232:0x01f9, B:234:0x020c, B:236:0x0212, B:237:0x0220, B:239:0x022e, B:241:0x0236, B:244:0x0251), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0130 A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:13:0x004a, B:96:0x008f, B:98:0x036f, B:100:0x0376, B:101:0x037f, B:103:0x0385, B:106:0x0392, B:111:0x0396, B:112:0x03a6, B:114:0x03ac, B:117:0x03b7, B:120:0x03bd, B:126:0x03c1, B:127:0x03cf, B:129:0x03d5, B:132:0x03e8, B:137:0x03ec, B:138:0x03fa, B:140:0x0400, B:143:0x040f, B:148:0x0413, B:149:0x043f, B:151:0x0445, B:153:0x046a, B:157:0x00a8, B:159:0x0345, B:164:0x02a5, B:165:0x027f, B:167:0x0285, B:171:0x02ae, B:172:0x02d7, B:174:0x02dd, B:176:0x0302, B:178:0x0317, B:180:0x031f, B:181:0x0324, B:185:0x034e, B:192:0x00db, B:195:0x024d, B:196:0x0269, B:198:0x00ed, B:201:0x011c, B:202:0x012a, B:204:0x0130, B:207:0x01c8, B:210:0x014b, B:212:0x0151, B:216:0x016e, B:219:0x017a, B:221:0x0180, B:222:0x01c4, B:224:0x0199, B:229:0x01d4, B:230:0x01f3, B:232:0x01f9, B:234:0x020c, B:236:0x0212, B:237:0x0220, B:239:0x022e, B:241:0x0236, B:244:0x0251), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x04f3 A[Catch: all -> 0x007b, TryCatch #1 {all -> 0x007b, blocks: (B:15:0x04b8, B:18:0x04d3, B:20:0x04f3, B:22:0x0505, B:23:0x058e, B:26:0x059a, B:28:0x05d0, B:29:0x05ff, B:31:0x0609, B:32:0x0631, B:35:0x0641, B:37:0x06a1, B:38:0x06aa, B:40:0x06b0, B:43:0x06bd, B:48:0x06c1, B:50:0x06c7, B:51:0x06eb, B:53:0x06f1, B:55:0x070a, B:57:0x071b, B:59:0x0729, B:60:0x0730, B:68:0x064f, B:70:0x0658, B:71:0x067c, B:73:0x0682, B:75:0x0699, B:76:0x0528, B:78:0x0536, B:79:0x054f, B:81:0x0559, B:82:0x056b, B:84:0x0575, B:89:0x0070, B:91:0x0497), top: B:88:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x01f9 A[Catch: all -> 0x0059, LOOP:10: B:230:0x01f3->B:232:0x01f9, LOOP_END, TryCatch #0 {all -> 0x0059, blocks: (B:13:0x004a, B:96:0x008f, B:98:0x036f, B:100:0x0376, B:101:0x037f, B:103:0x0385, B:106:0x0392, B:111:0x0396, B:112:0x03a6, B:114:0x03ac, B:117:0x03b7, B:120:0x03bd, B:126:0x03c1, B:127:0x03cf, B:129:0x03d5, B:132:0x03e8, B:137:0x03ec, B:138:0x03fa, B:140:0x0400, B:143:0x040f, B:148:0x0413, B:149:0x043f, B:151:0x0445, B:153:0x046a, B:157:0x00a8, B:159:0x0345, B:164:0x02a5, B:165:0x027f, B:167:0x0285, B:171:0x02ae, B:172:0x02d7, B:174:0x02dd, B:176:0x0302, B:178:0x0317, B:180:0x031f, B:181:0x0324, B:185:0x034e, B:192:0x00db, B:195:0x024d, B:196:0x0269, B:198:0x00ed, B:201:0x011c, B:202:0x012a, B:204:0x0130, B:207:0x01c8, B:210:0x014b, B:212:0x0151, B:216:0x016e, B:219:0x017a, B:221:0x0180, B:222:0x01c4, B:224:0x0199, B:229:0x01d4, B:230:0x01f3, B:232:0x01f9, B:234:0x020c, B:236:0x0212, B:237:0x0220, B:239:0x022e, B:241:0x0236, B:244:0x0251), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0212 A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:13:0x004a, B:96:0x008f, B:98:0x036f, B:100:0x0376, B:101:0x037f, B:103:0x0385, B:106:0x0392, B:111:0x0396, B:112:0x03a6, B:114:0x03ac, B:117:0x03b7, B:120:0x03bd, B:126:0x03c1, B:127:0x03cf, B:129:0x03d5, B:132:0x03e8, B:137:0x03ec, B:138:0x03fa, B:140:0x0400, B:143:0x040f, B:148:0x0413, B:149:0x043f, B:151:0x0445, B:153:0x046a, B:157:0x00a8, B:159:0x0345, B:164:0x02a5, B:165:0x027f, B:167:0x0285, B:171:0x02ae, B:172:0x02d7, B:174:0x02dd, B:176:0x0302, B:178:0x0317, B:180:0x031f, B:181:0x0324, B:185:0x034e, B:192:0x00db, B:195:0x024d, B:196:0x0269, B:198:0x00ed, B:201:0x011c, B:202:0x012a, B:204:0x0130, B:207:0x01c8, B:210:0x014b, B:212:0x0151, B:216:0x016e, B:219:0x017a, B:221:0x0180, B:222:0x01c4, B:224:0x0199, B:229:0x01d4, B:230:0x01f3, B:232:0x01f9, B:234:0x020c, B:236:0x0212, B:237:0x0220, B:239:0x022e, B:241:0x0236, B:244:0x0251), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x022e A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:13:0x004a, B:96:0x008f, B:98:0x036f, B:100:0x0376, B:101:0x037f, B:103:0x0385, B:106:0x0392, B:111:0x0396, B:112:0x03a6, B:114:0x03ac, B:117:0x03b7, B:120:0x03bd, B:126:0x03c1, B:127:0x03cf, B:129:0x03d5, B:132:0x03e8, B:137:0x03ec, B:138:0x03fa, B:140:0x0400, B:143:0x040f, B:148:0x0413, B:149:0x043f, B:151:0x0445, B:153:0x046a, B:157:0x00a8, B:159:0x0345, B:164:0x02a5, B:165:0x027f, B:167:0x0285, B:171:0x02ae, B:172:0x02d7, B:174:0x02dd, B:176:0x0302, B:178:0x0317, B:180:0x031f, B:181:0x0324, B:185:0x034e, B:192:0x00db, B:195:0x024d, B:196:0x0269, B:198:0x00ed, B:201:0x011c, B:202:0x012a, B:204:0x0130, B:207:0x01c8, B:210:0x014b, B:212:0x0151, B:216:0x016e, B:219:0x017a, B:221:0x0180, B:222:0x01c4, B:224:0x0199, B:229:0x01d4, B:230:0x01f3, B:232:0x01f9, B:234:0x020c, B:236:0x0212, B:237:0x0220, B:239:0x022e, B:241:0x0236, B:244:0x0251), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0251 A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:13:0x004a, B:96:0x008f, B:98:0x036f, B:100:0x0376, B:101:0x037f, B:103:0x0385, B:106:0x0392, B:111:0x0396, B:112:0x03a6, B:114:0x03ac, B:117:0x03b7, B:120:0x03bd, B:126:0x03c1, B:127:0x03cf, B:129:0x03d5, B:132:0x03e8, B:137:0x03ec, B:138:0x03fa, B:140:0x0400, B:143:0x040f, B:148:0x0413, B:149:0x043f, B:151:0x0445, B:153:0x046a, B:157:0x00a8, B:159:0x0345, B:164:0x02a5, B:165:0x027f, B:167:0x0285, B:171:0x02ae, B:172:0x02d7, B:174:0x02dd, B:176:0x0302, B:178:0x0317, B:180:0x031f, B:181:0x0324, B:185:0x034e, B:192:0x00db, B:195:0x024d, B:196:0x0269, B:198:0x00ed, B:201:0x011c, B:202:0x012a, B:204:0x0130, B:207:0x01c8, B:210:0x014b, B:212:0x0151, B:216:0x016e, B:219:0x017a, B:221:0x0180, B:222:0x01c4, B:224:0x0199, B:229:0x01d4, B:230:0x01f3, B:232:0x01f9, B:234:0x020c, B:236:0x0212, B:237:0x0220, B:239:0x022e, B:241:0x0236, B:244:0x0251), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x059a A[Catch: all -> 0x007b, TRY_ENTER, TryCatch #1 {all -> 0x007b, blocks: (B:15:0x04b8, B:18:0x04d3, B:20:0x04f3, B:22:0x0505, B:23:0x058e, B:26:0x059a, B:28:0x05d0, B:29:0x05ff, B:31:0x0609, B:32:0x0631, B:35:0x0641, B:37:0x06a1, B:38:0x06aa, B:40:0x06b0, B:43:0x06bd, B:48:0x06c1, B:50:0x06c7, B:51:0x06eb, B:53:0x06f1, B:55:0x070a, B:57:0x071b, B:59:0x0729, B:60:0x0730, B:68:0x064f, B:70:0x0658, B:71:0x067c, B:73:0x0682, B:75:0x0699, B:76:0x0528, B:78:0x0536, B:79:0x054f, B:81:0x0559, B:82:0x056b, B:84:0x0575, B:89:0x0070, B:91:0x0497), top: B:88:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0609 A[Catch: all -> 0x007b, TryCatch #1 {all -> 0x007b, blocks: (B:15:0x04b8, B:18:0x04d3, B:20:0x04f3, B:22:0x0505, B:23:0x058e, B:26:0x059a, B:28:0x05d0, B:29:0x05ff, B:31:0x0609, B:32:0x0631, B:35:0x0641, B:37:0x06a1, B:38:0x06aa, B:40:0x06b0, B:43:0x06bd, B:48:0x06c1, B:50:0x06c7, B:51:0x06eb, B:53:0x06f1, B:55:0x070a, B:57:0x071b, B:59:0x0729, B:60:0x0730, B:68:0x064f, B:70:0x0658, B:71:0x067c, B:73:0x0682, B:75:0x0699, B:76:0x0528, B:78:0x0536, B:79:0x054f, B:81:0x0559, B:82:0x056b, B:84:0x0575, B:89:0x0070, B:91:0x0497), top: B:88:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0682 A[Catch: all -> 0x007b, LOOP:2: B:71:0x067c->B:73:0x0682, LOOP_END, TryCatch #1 {all -> 0x007b, blocks: (B:15:0x04b8, B:18:0x04d3, B:20:0x04f3, B:22:0x0505, B:23:0x058e, B:26:0x059a, B:28:0x05d0, B:29:0x05ff, B:31:0x0609, B:32:0x0631, B:35:0x0641, B:37:0x06a1, B:38:0x06aa, B:40:0x06b0, B:43:0x06bd, B:48:0x06c1, B:50:0x06c7, B:51:0x06eb, B:53:0x06f1, B:55:0x070a, B:57:0x071b, B:59:0x0729, B:60:0x0730, B:68:0x064f, B:70:0x0658, B:71:0x067c, B:73:0x0682, B:75:0x0699, B:76:0x0528, B:78:0x0536, B:79:0x054f, B:81:0x0559, B:82:0x056b, B:84:0x0575, B:89:0x0070, B:91:0x0497), top: B:88:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x02a2 -> B:134:0x02a5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.util.List r19, defpackage.arpe r20) {
        /*
            Method dump skipped, instructions count: 1888
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wvt.g(java.util.List, arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.Map, java.lang.Object] */
    public final String h(int i) {
        String str;
        adiv c = this.l.c(i);
        if (c == null) {
            String y = ((yjy) this.c.b()).h(i).y();
            y.getClass();
            if (p(i, y)) {
                alvw g = a.g();
                g.X(alwp.a, "BugleSimStateTracker");
                ((alvg) g.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "getRcsProvisioningIdForFi-bYZ02fE", 785, "PhoneSimsStateUpdaterImpl.kt")).q("Getting RcsProvisioningId for Fi subscription.");
                String i2 = i(y);
                str = null;
                if (i2 != null) {
                    str = ((ykw) this.o.b()).f("msisdn_for_iccid_".concat(i2), null);
                }
                if (str == null) {
                    str = r(l(i));
                }
            } else {
                adwt k2 = k(i);
                if (k2 == null || (str = k2.n()) == null) {
                    str = "";
                }
            }
            adiw adiwVar = new adiw(str);
            if (adom.n(adiwVar).a.length() != 0) {
                wpp wppVar = this.l;
                if (i >= 0 && adom.n(adiwVar).a.length() != 0) {
                    ((AtomicBoolean) wppVar.b).set(true);
                    wppVar.a.put(new adix(i), adiwVar);
                }
            }
            return str;
        }
        return adom.n(c).a;
    }

    public final String i(String str) {
        return ((ykw) this.o.b()).f("rcs_user_id_".concat(str), str);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [armf, java.lang.Object] */
    public final void j(int i) {
        if (((okc) this.x.b()).a()) {
            ((mbl) ((wfh) this.w.b()).a.b()).e("Bugle.Dsdr.PhoneSimsStateUpdater", i - 1);
        }
    }
}

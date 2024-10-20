package defpackage;

import android.content.Context;
import android.telephony.SmsManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.util.SparseArray;
import j$.time.Duration;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yjz extends yjy {
    public static final acyz j = acyy.b("cache_default_sms_subscription_id");
    public List k;
    public final SubscriptionManager l;
    private final SparseArray m;
    private final armf n;
    private final armf o;
    private alhr p;

    public yjz(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
        super(context, armfVar, armfVar2, armfVar3, armfVar5);
        alhr alhrVar;
        this.m = new SparseArray();
        SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService(SubscriptionManager.class);
        this.l = subscriptionManager == null ? SubscriptionManager.from(context) : subscriptionManager;
        this.n = armfVar4;
        this.o = armfVar6;
        if (((Boolean) j.a()).booleanValue()) {
            alhrVar = albo.E(new xyn(11), Duration.ofSeconds(aczf.a()));
        } else {
            alhrVar = null;
        }
        this.p = alhrVar;
    }

    @Override // defpackage.yjy
    public final int a() {
        List<SubscriptionInfo> activeSubscriptionInfoList = this.l.getActiveSubscriptionInfoList();
        int i = 0;
        if (activeSubscriptionInfoList != null) {
            Iterator<SubscriptionInfo> it = activeSubscriptionInfoList.iterator();
            while (it.hasNext()) {
                int subscriptionId = it.next().getSubscriptionId();
                ykb h = h(subscriptionId);
                if (h.e() == 5 && h.C() && this.m.get(subscriptionId) == null) {
                    i++;
                }
            }
        }
        return i + this.m.size();
    }

    @Override // defpackage.yjy
    public final int b() {
        int defaultDataSubscriptionId;
        defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
        return Math.max(defaultDataSubscriptionId, -1);
    }

    @Override // defpackage.yjy
    public final int c() {
        int defaultSmsSubscriptionId;
        if (!((Boolean) j.a()).booleanValue() || this.p == null) {
            defaultSmsSubscriptionId = SubscriptionManager.getDefaultSmsSubscriptionId();
        } else {
            synchronized (this) {
                defaultSmsSubscriptionId = ((Integer) this.p.get()).intValue();
            }
        }
        return Math.max(defaultSmsSubscriptionId, -1);
    }

    @Override // defpackage.yjy
    public final int d() {
        int defaultVoiceSubscriptionId;
        defaultVoiceSubscriptionId = SubscriptionManager.getDefaultVoiceSubscriptionId();
        return Math.max(defaultVoiceSubscriptionId, -1);
    }

    @Override // defpackage.yjy
    public final int e() {
        return this.l.getActiveSubscriptionInfoCountMax();
    }

    @Override // defpackage.yjy
    public final int f() {
        int defaultSubscriptionId;
        defaultSubscriptionId = SubscriptionManager.getDefaultSubscriptionId();
        return Math.max(defaultSubscriptionId, -1);
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [armf, java.lang.Object] */
    @Override // defpackage.yjy
    public final ykb h(int i) {
        ykb r;
        boolean z;
        ykb ykbVar = (ykb) this.m.get(i);
        if (ykbVar == null) {
            int i2 = -1;
            if (((Boolean) aczf.o().a.am.a()).booleanValue()) {
                if (i >= -1) {
                    z = true;
                } else {
                    z = false;
                }
                albo.L(z, "SubscriptionMetadataUtils get: invalid subId = %s", i);
            }
            if (i == -1) {
                if (((yjw) this.e.b()).b()) {
                    i = c();
                } else {
                    i = SmsManager.getDefaultSmsSubscriptionId();
                }
            }
            if (i < 0) {
                alvw i3 = yjy.a.i();
                i3.X(alwp.a, "Bugle");
                alvg alvgVar = (alvg) i3;
                alvgVar.Z(alwk.SMALL);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/util/phone/SubscriptionMetadataUtils", "get", 167, "SubscriptionMetadataUtils.java")).u("Bugle: SubscriptionMetadataUtils get: unexpected subId = %d, replacing with %d", i, -1);
            } else {
                i2 = i;
            }
            this.b.lock();
            try {
                ykb ykbVar2 = (ykb) this.c.get(i2);
                if (ykbVar2 == null) {
                    zxy zxyVar = (zxy) this.g.b();
                    yjo yjoVar = (yjo) this.i.b();
                    if (yhx.f) {
                        Object obj = zxyVar.c;
                        wpp wppVar = (wpp) ((znj) obj).b.b();
                        wppVar.getClass();
                        Context context = (Context) ((znj) obj).a.b();
                        context.getClass();
                        yjoVar.getClass();
                        r = new yki(wppVar, context, yjoVar, i2);
                    } else if (yhx.d) {
                        r = ((znj) zxyVar.b).l(yjoVar, i2);
                    } else if (yhx.c) {
                        r = ((yyt) zxyVar.e).e(yjoVar, i2);
                    } else {
                        r = ((wpp) zxyVar.d).r(yjoVar, i2);
                    }
                    ykj ykjVar = new ykj(r);
                    Object obj2 = zxyVar.a;
                    yjy yjyVar = (yjy) ((yyt) obj2).d.b();
                    yjyVar.getClass();
                    mre mreVar = (mre) ((yyt) obj2).c.b();
                    mreVar.getClass();
                    yju yjuVar = (yju) ((yyt) obj2).b.b();
                    yjuVar.getClass();
                    ?? r7 = ((yyt) obj2).a;
                    yjoVar.getClass();
                    ykn yknVar = new ykn(yjyVar, mreVar, yjuVar, r7, yjoVar, ykjVar, i2);
                    this.c.put(i2, yknVar);
                    ykbVar2 = yknVar;
                }
                return ykbVar2;
            } finally {
                this.b.unlock();
            }
        }
        return ykbVar;
    }

    @Override // defpackage.yjy
    public final List l() {
        List<SubscriptionInfo> activeSubscriptionInfoList = this.l.getActiveSubscriptionInfoList();
        ArrayList arrayList = new ArrayList();
        if (activeSubscriptionInfoList != null) {
            Iterator<SubscriptionInfo> it = activeSubscriptionInfoList.iterator();
            while (it.hasNext()) {
                int subscriptionId = it.next().getSubscriptionId();
                if (this.m.get(subscriptionId) == null) {
                    ykb h = h(subscriptionId);
                    if (h.e() == 5 && h.C()) {
                        arrayList.add(h);
                    }
                }
            }
        }
        int size = this.m.size();
        while (true) {
            size--;
            if (size >= 0) {
                arrayList.add((ykb) this.m.valueAt(size));
            } else {
                return arrayList;
            }
        }
    }

    @Override // defpackage.yjy
    public final void m() {
        if (((Boolean) j.a()).booleanValue()) {
            synchronized (this) {
                this.p = albo.E(new xyn(11), Duration.ofSeconds(aczf.a()));
            }
        }
    }

    @Override // defpackage.yjy
    public final boolean p() {
        if (c() != -1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r0 == 0) goto L8;
     */
    @Override // defpackage.yjy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q() {
        /*
            r3 = this;
            alhr r0 = r3.f
            java.lang.Object r0 = r0.get()
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            r1 = 0
            int r0 = defpackage.ex$$ExternalSyntheticApiModelOutline1.m(r0, r1)
            r2 = 1
            if (r0 == r2) goto L21
            alhr r0 = r3.f
            java.lang.Object r0 = r0.get()
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            int r0 = defpackage.ex$$ExternalSyntheticApiModelOutline1.m(r0, r1)
            if (r0 != 0) goto L1f
            goto L21
        L1f:
            r1 = r2
            goto L3e
        L21:
            alhr r0 = r3.f
            java.lang.Object r0 = r0.get()
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            int r0 = defpackage.ex$$ExternalSyntheticApiModelOutline1.m(r0, r2)
            if (r0 == r2) goto L3e
            alhr r0 = r3.f
            java.lang.Object r0 = r0.get()
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            int r0 = defpackage.ex$$ExternalSyntheticApiModelOutline1.m(r0, r2)
            if (r0 == 0) goto L3e
            goto L1f
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yjz.q():boolean");
    }

    @Override // defpackage.yjy
    public final boolean r() {
        boolean isValidSubscriptionId;
        if (!yhx.d) {
            return true;
        }
        isValidSubscriptionId = SubscriptionManager.isValidSubscriptionId(SmsManager.getDefaultSmsSubscriptionId());
        if (!isValidSubscriptionId) {
            return false;
        }
        return true;
    }

    @Override // defpackage.yjy
    public final void s(int i, String str, int i2, String str2, String str3, msh mshVar, int i3, Optional optional) {
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        optional.isPresent();
        yjr yjrVar = (yjr) this.h.b();
        yjt yjtVar = (yjt) mshVar.b().orElse(null);
        yjtVar.getClass();
        String s = yjrVar.s(yjtVar);
        yju yjuVar = (yju) this.n.b();
        ykk ykkVar = new ykk();
        ykkVar.b();
        ykkVar.h(0);
        ykkVar.e = "SUB DISPLAY NAME";
        ykkVar.f = "SUB PREFERRED NAME";
        ykkVar.g = "SUB CARRIER NAME";
        ykkVar.h = "SUB SIM CARRIER NAME";
        ykkVar.p = (short) (ykkVar.p | 8);
        ykkVar.a();
        ykkVar.i = "2025550185";
        ykkVar.f();
        ykkVar.c(0);
        ykkVar.d(0);
        ykkVar.n = "1234567890000000";
        ykkVar.e("US");
        ykkVar.g("US");
        ykkVar.o = 5;
        short s2 = ykkVar.p;
        ykkVar.a = i;
        ykkVar.p = (short) (s2 | 257);
        ykkVar.b();
        ykkVar.c = str;
        ykkVar.h(i2);
        ykkVar.e = str2;
        ykkVar.g = str3;
        ykkVar.a();
        ykkVar.i = mshVar.n();
        ykkVar.f();
        ykkVar.c(214);
        ykkVar.d(i3);
        ykkVar.g(s);
        ykkVar.e(s);
        if (ykkVar.p == 511 && (str4 = ykkVar.e) != null && (str5 = ykkVar.f) != null && (str6 = ykkVar.g) != null && (str7 = ykkVar.h) != null && (str8 = ykkVar.i) != null && (str9 = ykkVar.l) != null && (str10 = ykkVar.m) != null && (str11 = ykkVar.n) != null) {
            ykm ykmVar = new ykm(yjuVar, this, new ykl(ykkVar.a, ykkVar.b, ykkVar.c, ykkVar.d, str4, str5, str6, str7, str8, ykkVar.j, ykkVar.k, str9, str10, str11, ykkVar.o), (mre) this.o.b());
            this.m.put(ykmVar.a(), ykmVar);
            List list = this.k;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((SubscriptionManager.OnSubscriptionsChangedListener) it.next()).onSubscriptionsChanged();
                }
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((ykkVar.p & 1) == 0) {
            sb.append(" subId");
        }
        if ((ykkVar.p & 2) == 0) {
            sb.append(" isAvailable");
        }
        if ((ykkVar.p & 4) == 0) {
            sb.append(" simSlotIndex");
        }
        if (ykkVar.e == null) {
            sb.append(" displayName");
        }
        if (ykkVar.f == null) {
            sb.append(" preferredName");
        }
        if (ykkVar.g == null) {
            sb.append(" carrierName");
        }
        if (ykkVar.h == null) {
            sb.append(" simCarrierName");
        }
        if ((ykkVar.p & 8) == 0) {
            sb.append(" simCarrierId");
        }
        if ((ykkVar.p & 16) == 0) {
            sb.append(" iconTint");
        }
        if (ykkVar.i == null) {
            sb.append(" phoneNumber");
        }
        if ((ykkVar.p & 32) == 0) {
            sb.append(" roaming");
        }
        if ((ykkVar.p & 64) == 0) {
            sb.append(" mcc");
        }
        if ((ykkVar.p & 128) == 0) {
            sb.append(" mnc");
        }
        if (ykkVar.l == null) {
            sb.append(" simCountryIso");
        }
        if (ykkVar.m == null) {
            sb.append(" networkCountryIso");
        }
        if (ykkVar.n == null) {
            sb.append(" subscriptionId");
        }
        if ((ykkVar.p & 256) == 0) {
            sb.append(" simState");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}

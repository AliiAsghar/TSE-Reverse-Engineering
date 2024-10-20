package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xan implements xbh {
    private final Context f;
    private final armf h;
    private final armf i;
    private final armf j;
    private final armf k;
    private static final alvi e = alvi.m("com/google/android/apps/messaging/shared/sms/apns/BugleCarrierConfigValuesLoader");
    public static final uuf b = uuh.i(uuh.b, "enable_experiment_carrier_config_override", false);
    public static final uuf c = uuh.g(uuh.b, "experiment_carrier_config_override", apeq.a);
    private final SparseArray g = new SparseArray();
    public final Bundle d = new Bundle();

    public xan(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        this.f = context;
        this.k = armfVar4;
        this.h = armfVar;
        this.i = armfVar2;
        this.j = armfVar3;
        new anew((Executor) armfVar5.b());
    }

    public static Bundle c(int i, yjy yjyVar) {
        try {
            Optional k = yjyVar.h(i).k();
            if (!k.isPresent()) {
                return null;
            }
            Bundle bundle = (Bundle) k.get();
            if (bundle.get("spamForwardingNumber") instanceof Boolean) {
                bundle.remove("spamForwardingNumber");
            }
            return bundle;
        } catch (Exception e2) {
            alvw i2 = e.i();
            i2.X(alwp.a, "Bugle");
            ((alvg) ((alvg) ((alvg) i2).g(e2)).h("com/google/android/apps/messaging/shared/sms/apns/BugleCarrierConfigValuesLoader", "loadFromSystem", (char) 219, "BugleCarrierConfigValuesLoader.java")).q("Calling system getCarrierConfigValues exception");
            return null;
        }
    }

    @Override // defpackage.ge
    @Deprecated
    public final Bundle a(int i) {
        Bundle bundle;
        int a = ((yjy) this.h.b()).h(i).a();
        synchronized (this.g) {
            bundle = (Bundle) this.g.get(a);
            if (bundle == null) {
                bundle = new Bundle();
                this.g.put(a, bundle);
                xbb xbbVar = (xbb) this.k.b();
                Bundle bundle2 = new Bundle();
                alur it = xbbVar.b.iterator();
                it.getClass();
                while (it.hasNext()) {
                    xbm xbmVar = (xbm) it.next();
                    try {
                        bundle2.putAll(xbmVar.a(a));
                    } catch (Exception e2) {
                        alvg alvgVar = (alvg) xbb.a.i();
                        alvgVar.X(alwp.a, "Bugle");
                        ((alvg) alvgVar.g(e2).h("com/google/android/apps/messaging/shared/sms/config/CarrierConfigRepository", "getConfigs", 75, "CarrierConfigRepository.kt")).t("Exception when getting configs from %s", xbmVar);
                    }
                }
                if (xbbVar.d.W()) {
                    xbl xblVar = xbbVar.c;
                    qjh.l(((xbs) xblVar).c, null, new xbr((xbs) xblVar, a, null), 3);
                }
                bundle.putAll(bundle2);
            }
        }
        return bundle;
    }

    public final Bundle b(uuf uufVar) {
        if (((yjy) this.h.b()).a() > 1) {
            return new Bundle();
        }
        apeq apeqVar = (apeq) uufVar.e();
        if (apeqVar.equals(((utx) uufVar).c)) {
            return new Bundle();
        }
        return yyb.cO(apeqVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r9, android.os.Bundle r10, int r11) {
        /*
            r8 = this;
            armf r0 = r8.j
            java.lang.Object r0 = r0.b()
            wyj r0 = (defpackage.wyj) r0
            android.content.Context r1 = r8.f
            android.content.Context r9 = r0.b(r1, r9)
            r0 = 0
            android.content.res.Resources r9 = r9.getResources()     // Catch: java.lang.Throwable -> L35 android.content.res.Resources.NotFoundException -> L38
            android.content.res.XmlResourceParser r9 = r9.getXml(r11)     // Catch: java.lang.Throwable -> L35 android.content.res.Resources.NotFoundException -> L38
            armf r11 = r8.i     // Catch: java.lang.Throwable -> L2f android.content.res.Resources.NotFoundException -> L32
            java.lang.Object r11 = r11.b()     // Catch: java.lang.Throwable -> L2f android.content.res.Resources.NotFoundException -> L32
            yjr r11 = (defpackage.yjr) r11     // Catch: java.lang.Throwable -> L2f android.content.res.Resources.NotFoundException -> L32
            xau r11 = defpackage.xau.a(r9, r11)     // Catch: java.lang.Throwable -> L2f android.content.res.Resources.NotFoundException -> L32
            xbj r1 = new xbj     // Catch: java.lang.Throwable -> L2f android.content.res.Resources.NotFoundException -> L32
            r2 = 1
            r1.<init>(r10, r2, r0)     // Catch: java.lang.Throwable -> L2f android.content.res.Resources.NotFoundException -> L32
            r11.a = r1     // Catch: java.lang.Throwable -> L2f android.content.res.Resources.NotFoundException -> L32
            r11.b()     // Catch: java.lang.Throwable -> L2f android.content.res.Resources.NotFoundException -> L32
            goto L56
        L2f:
            r10 = move-exception
            r0 = r9
            goto L5c
        L32:
            r10 = move-exception
            r0 = r9
            goto L3a
        L35:
            r9 = move-exception
            r10 = r9
            goto L5c
        L38:
            r9 = move-exception
            r10 = r9
        L3a:
            r7 = r10
            alvi r9 = defpackage.xan.e     // Catch: java.lang.Throwable -> L35
            alvw r1 = r9.i()     // Catch: java.lang.Throwable -> L35
            alvz r9 = defpackage.alwp.a     // Catch: java.lang.Throwable -> L35
            java.lang.String r10 = "Bugle"
            r1.X(r9, r10)     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = "com/google/android/apps/messaging/shared/sms/apns/BugleCarrierConfigValuesLoader"
            java.lang.String r4 = "loadFromResources"
            java.lang.String r6 = "BugleCarrierConfigValuesLoader.java"
            java.lang.String r2 = "Can not find mms_config.xml"
            r5 = 254(0xfe, float:3.56E-43)
            defpackage.a.cj(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L35
            r9 = r0
        L56:
            if (r9 == 0) goto L5b
            r9.close()
        L5b:
            return
        L5c:
            if (r0 == 0) goto L61
            r0.close()
        L61:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xan.d(int, android.os.Bundle, int):void");
    }

    public final void e(int i, Bundle bundle) {
        int cR = yyb.cR();
        if (cR != Integer.MIN_VALUE) {
            d(i, bundle, cR);
        }
    }

    @Override // defpackage.xbh
    public final void f() {
        synchronized (this.g) {
            this.g.clear();
        }
    }
}

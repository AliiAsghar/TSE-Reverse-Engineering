package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xbt implements xbm {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/sms/config/accessors/SystemCarrierConfigAccessor");
    private final armf b;
    private final yjy c;

    public xbt(armf armfVar, yjy yjyVar) {
        armfVar.getClass();
        yjyVar.getClass();
        this.b = armfVar;
        this.c = yjyVar;
    }

    @Override // defpackage.xbm
    public final Bundle a(int i) {
        ycl yclVar = (ycl) this.b.b();
        SparseArray sparseArray = yclVar.b;
        if (sparseArray != null && ((yyt) yclVar.a.b()).z() && ((Integer[]) sparseArray.get(i)) != null) {
            return new Bundle();
        }
        try {
            Optional k = this.c.h(i).k();
            Bundle bundle = new Bundle();
            if (k.isPresent()) {
                bundle.putAll((Bundle) k.get());
                if (bundle.get("spamForwardingNumber") instanceof Boolean) {
                    bundle.remove("spamForwardingNumber");
                }
            }
            return bundle;
        } catch (Exception e) {
            alvg alvgVar = (alvg) a.i();
            alvgVar.X(alwp.a, "Bugle");
            ((alvg) alvgVar.g(e).h("com/google/android/apps/messaging/shared/sms/config/accessors/SystemCarrierConfigAccessor", "get", 52, "SystemCarrierConfigAccessor.kt")).q("Error fetching system carrier config values");
            return new Bundle();
        }
    }
}

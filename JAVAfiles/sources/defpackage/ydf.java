package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.ims.provisioning.config.Configuration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ydf {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/file/FileSizeUtils");
    private final ykw b;
    private final xbf c;
    private final Optional d;
    private final armf e;

    public ydf(ykw ykwVar, xbf xbfVar, Optional optional, armf armfVar) {
        this.b = ykwVar;
        this.c = xbfVar;
        this.d = optional;
        this.e = armfVar;
    }

    public static int c(Configuration configuration) {
        int i = configuration.mInstantMessageConfiguration.mMaxSizeFileTransfer;
        if (i == 0) {
            return 104857600;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [adje, java.lang.Object] */
    private final Optional g(Optional optional) {
        if (optional.isPresent()) {
            Optional k = this.d.get().k(((Integer) optional.get()).intValue());
            if (k.isEmpty()) {
                alvw i = a.i();
                i.X(alwp.a, "Bugle");
                ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/util/file/FileSizeUtils", "getConfiguration", 155, "FileSizeUtils.java")).t("No RCS configuration found for subId: %s", optional);
                return k;
            }
            return k;
        }
        return this.d.flatMap(new ybe(4));
    }

    public final int a(int i, boolean z) {
        if (z) {
            return b(i);
        }
        return this.c.a(i).d();
    }

    public final int b(int i) {
        if (i < 0) {
            alvw i2 = a.i();
            i2.X(alwp.a, "Bugle");
            alvg alvgVar = (alvg) i2;
            alvgVar.Z(alwk.MEDIUM);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/util/file/FileSizeUtils", "getMaxRcsFileSize", 111, "FileSizeUtils.java")).r("#getMaxRcsFileSize: subId = %s", i);
        }
        return ((Integer) g(Optional.of(Integer.valueOf(i))).map(new ybe(6)).orElse(104857600)).intValue();
    }

    public final int d(Context context) {
        ykw ykwVar = this.b;
        String string = context.getString(R.string.rcs_mobile_data_auto_download_limit_pref_key);
        String string2 = context.getString(R.string.rcs_mobile_data_auto_download_limit_default_entry);
        String f = ykwVar.f(string, string2);
        if (string2.equals(f) && !f()) {
            return -1;
        }
        int e = e();
        if (!adom.u(context) && !string2.equals(f)) {
            try {
                return Integer.parseInt(f);
            } catch (NumberFormatException e2) {
                xzb.p("Bugle", e2, "Unable to parse auto downloadable file size from: ".concat(String.valueOf(f)));
                return e;
            }
        }
        return e;
    }

    public final int e() {
        return ((Integer) g(Optional.empty()).map(new ybe(5)).orElse(104857600)).intValue();
    }

    public final boolean f() {
        return ((Boolean) g(Optional.of(Integer.valueOf(((yjy) this.e.b()).b()))).map(new ybe(7)).orElse(false)).booleanValue();
    }
}

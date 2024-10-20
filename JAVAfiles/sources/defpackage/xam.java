package defpackage;

import android.os.Environment;
import android.os.StatFs;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xam {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/sms/analytics/RcsTelephonyFilePersistenceEventLogger");
    public final arwe b;
    private final armf c;

    public xam(armf armfVar, arwe arweVar) {
        armfVar.getClass();
        arweVar.getClass();
        this.c = armfVar;
        this.b = arweVar;
    }

    public static final long b() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    public final void a(amfq amfqVar) {
        mar a2 = ((mbb) this.c.b()).a();
        a2.e(amrs.TELEPHONY_PERSISTENCE_EVENT);
        a2.b(amfqVar, mbt.LOG_SPEC_TELEPHONY_PERSISTENCE_EVENTS);
    }
}

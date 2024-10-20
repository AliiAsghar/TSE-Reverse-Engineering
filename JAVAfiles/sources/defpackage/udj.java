package defpackage;

import android.os.StrictMode;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class udj implements uec {
    @Override // defpackage.uec
    public final StrictMode.ThreadPolicy a() {
        return new StrictMode.ThreadPolicy.Builder().detectNetwork().detectDiskReads().detectDiskWrites().penaltyLog().build();
    }
}

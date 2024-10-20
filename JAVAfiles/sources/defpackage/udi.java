package defpackage;

import android.os.StrictMode;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class udi implements uec {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/layer/Post29PolicyMaker");
    public final ThreadLocal b;

    public udi(ThreadLocal threadLocal) {
        this.b = threadLocal;
    }

    @Override // defpackage.uec
    public final StrictMode.ThreadPolicy a() {
        StrictMode.ThreadPolicy.Builder penaltyListener;
        penaltyListener = new StrictMode.ThreadPolicy.Builder().detectNetwork().detectDiskReads().detectDiskWrites().penaltyListener(andi.a, new udh(this));
        return penaltyListener.build();
    }
}

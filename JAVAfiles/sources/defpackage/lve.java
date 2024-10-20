package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lve {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/restore/analytics/RestoreEventLogger");
    public final armf b;
    public final arwe c;

    public lve(armf armfVar, arwe arweVar) {
        armfVar.getClass();
        arweVar.getClass();
        this.b = armfVar;
        this.c = arweVar;
    }

    public static final int a(int i, Duration duration) {
        if (duration.toMillis() == 0) {
            return 0;
        }
        double millis = (i / duration.toMillis()) * 1000.0d;
        if (millis < 0.0d) {
            return Integer.MAX_VALUE;
        }
        return (int) millis;
    }
}

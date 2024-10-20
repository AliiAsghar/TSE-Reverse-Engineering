package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agky extends ThreadLocal {
    public static final agky a = new agky();

    private agky() {
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        int myTid = Process.myTid();
        return new agkw(Thread.currentThread(), myTid, true, Process.getThreadPriority(myTid), false, 112);
    }
}

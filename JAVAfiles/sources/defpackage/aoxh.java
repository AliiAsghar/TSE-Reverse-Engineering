package defpackage;

import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aoxh implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aoxh(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Thread$UncaughtExceptionHandler, java.lang.Object] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (this.c != 0) {
            ((aiew) this.b).b(this.a, thread, th);
            return;
        }
        Object obj = this.a;
        Object obj2 = this.b;
        synchronized (obj) {
            ((aqrk) obj2).a = th;
            obj.notify();
        }
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uqa extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(long j) {
        U(new agoi("work_queue._id", 1, Long.valueOf(j)));
    }

    public final void c(Iterable iterable) {
        U(new agmf("work_queue._id", 3, X(iterable), true));
    }

    public final void d(String str) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 41030) {
            agnc.t("queue", intValue);
        }
        U(new agmd("work_queue.queue", 1, String.valueOf(str)));
    }

    public final void e(Iterable iterable) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 41030) {
            agnc.t("queue", intValue);
        }
        U(new agmf("work_queue.queue", 3, X(iterable), false));
    }

    public final void f() {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 45030) {
            agnc.t("scheduled_in_workmanager", intValue);
        }
        U(new agoi("work_queue.scheduled_in_workmanager", 1, 0));
    }

    public final void g(String str) {
        U(new agmd("work_queue.type", 1, String.valueOf(str)));
    }

    public final void h(Iterable iterable) {
        U(new agmf("work_queue.type", 4, X(iterable), false));
    }
}

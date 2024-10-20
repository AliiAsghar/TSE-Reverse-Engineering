package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class srl extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(String str) {
        U(new agmd("generic_worker_queue._id", 1, String.valueOf(str)));
    }

    public final void c(String... strArr) {
        U(new agmf("generic_worker_queue._id", 3, Z(strArr), false));
    }

    public final void d(boolean z) {
        U(new agoi("generic_worker_queue.in_flight", 1, Integer.valueOf(z ? 1 : 0)));
    }

    public final void e() {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 34000) {
            agnc.t("next_execute_timestamp", intValue);
        }
        U(new agoi("generic_worker_queue.next_execute_timestamp", 7, 0L));
    }

    public final void f(long j) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 34000) {
            agnc.t("next_execute_timestamp", intValue);
        }
        U(new agoi("generic_worker_queue.next_execute_timestamp", 10, Long.valueOf(j)));
    }

    public final void g(int i) {
        U(new agoi("generic_worker_queue.retry_count", 9, Integer.valueOf(i)));
    }

    public final void h(int i) {
        U(new agoi("generic_worker_queue.retry_count", 10, Integer.valueOf(i)));
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akxr implements dts {
    private final /* synthetic */ int a;

    @Override // defpackage.dts
    public final Object a(dtq dtqVar) {
        if (this.a != 0) {
            dtqVar.d(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
            return "default failing getForegroundInfoAsync";
        }
        return Boolean.valueOf(dtqVar.b(null));
    }
}

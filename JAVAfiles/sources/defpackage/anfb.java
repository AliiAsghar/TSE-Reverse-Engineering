package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anfb extends anej {
    final /* synthetic */ anfd a;
    private final ancr b;

    public anfb(anfd anfdVar, ancr ancrVar) {
        this.a = anfdVar;
        ancrVar.getClass();
        this.b = ancrVar;
    }

    @Override // defpackage.anej
    public final /* bridge */ /* synthetic */ Object a() {
        ListenableFuture a = this.b.a();
        a.getClass();
        return a;
    }

    @Override // defpackage.anej
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.anej
    public final void d(Throwable th) {
        this.a.setException(th);
    }

    @Override // defpackage.anej
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        this.a.m((ListenableFuture) obj);
    }

    @Override // defpackage.anej
    public final boolean g() {
        return this.a.isDone();
    }
}

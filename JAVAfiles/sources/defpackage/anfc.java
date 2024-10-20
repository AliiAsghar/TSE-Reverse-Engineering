package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anfc extends anej {
    final /* synthetic */ anfd a;
    private final Callable b;

    public anfc(anfd anfdVar, Callable callable) {
        this.a = anfdVar;
        callable.getClass();
        this.b = callable;
    }

    @Override // defpackage.anej
    public final Object a() {
        return this.b.call();
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
    public final void e(Object obj) {
        this.a.set(obj);
    }

    @Override // defpackage.anej
    public final boolean g() {
        return this.a.isDone();
    }
}

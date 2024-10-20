package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aold extends aqru {
    public apsd d;
    private final ListenableFuture e;
    private final Executor f = new anew(andi.a);
    public final Queue a = new ArrayDeque();
    public aqru b = null;
    public boolean c = false;

    public aold(ListenableFuture listenableFuture) {
        this.e = listenableFuture;
    }

    private final void b(Runnable runnable) {
        this.f.execute(akto.j(new aofk(this, runnable, 8)));
    }

    @Override // defpackage.aqru
    public final void a(apsd apsdVar, aqut aqutVar) {
        this.d = apsdVar;
        aktp.aa(this.e, new vbr(this, apsdVar, 17), this.f);
        b(new aofo((aqru) this, (Object) apsdVar, (Object) aqutVar, 6));
    }

    @Override // defpackage.aqru
    public final void c(String str, Throwable th) {
        b(new aofo((aqru) this, (Object) str, (Object) th, 5));
    }

    @Override // defpackage.aqru
    public final void d() {
        b(new akwm(this, 18));
    }

    @Override // defpackage.aqru
    public final void e(int i) {
        b(new ajbz(this, i, 4));
    }

    @Override // defpackage.aqru
    public final void f(Object obj) {
        b(new aofk(this, obj, 9));
    }

    public final String toString() {
        return super.toString() + "delegate=[" + String.valueOf(this.b) + "]";
    }
}

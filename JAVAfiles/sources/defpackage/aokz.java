package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aokz extends aqru {
    public final Object a = new Object();
    public final Queue b = new ArrayDeque();
    public aqru c;
    final /* synthetic */ aqrs d;
    final /* synthetic */ aqux e;
    final /* synthetic */ aqrr f;

    public aokz(aqrs aqrsVar, aqux aquxVar, aqrr aqrrVar) {
        this.d = aqrsVar;
        this.e = aquxVar;
        this.f = aqrrVar;
        this.c = aqrsVar.a(aquxVar, aqrrVar);
    }

    @Override // defpackage.aqru
    public final void a(apsd apsdVar, aqut aqutVar) {
        synchronized (this.a) {
            aqut aqutVar2 = new aqut();
            aqutVar2.f(aqutVar);
            this.b.add(new aofo((aqru) this, (Object) apsdVar, (Object) aqutVar2, 4));
            b().a(new aoky(this, apsdVar), aqutVar);
        }
    }

    public final aqru b() {
        aqru aqruVar;
        synchronized (this.a) {
            aqruVar = this.c;
        }
        return aqruVar;
    }

    @Override // defpackage.aqru
    public final void c(String str, Throwable th) {
        synchronized (this.a) {
            this.b.add(new aofo((aqru) this, (Object) str, (Object) th, 3));
            b().c(str, th);
        }
    }

    @Override // defpackage.aqru
    public final void d() {
        synchronized (this.a) {
            this.b.add(new akwm(this, 17));
            b().d();
        }
    }

    @Override // defpackage.aqru
    public final void e(int i) {
        synchronized (this.a) {
            this.b.add(new ajbz(this, i, 3));
            b().e(i);
        }
    }

    @Override // defpackage.aqru
    public final void f(Object obj) {
        synchronized (this.a) {
            this.b.add(new aofk(this, obj, 7));
            b().f(obj);
        }
    }
}

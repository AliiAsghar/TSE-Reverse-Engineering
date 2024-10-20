package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uei implements ueg {
    private final agna a;
    private boolean b;
    private boolean c;
    private final uce d;
    private final AtomicReference e;
    private final uqg f = new uqg();

    public uei(uci uciVar, agna agnaVar, agni agniVar) {
        ueh uehVar = new ueh(0);
        this.d = uehVar;
        AtomicReference atomicReference = new AtomicReference(uehVar);
        this.e = atomicReference;
        this.a = agnaVar;
        atomicReference.set(uciVar.N(agniVar));
    }

    @Override // defpackage.ueg
    public final agna a() {
        return this.a;
    }

    @Override // defpackage.ueg
    public final void b() {
        ((uce) this.e.getAndSet(this.d)).a();
    }

    @Override // defpackage.ueg
    public final void c(boolean z) {
        this.c = z;
    }

    @Override // defpackage.ueg
    public final /* synthetic */ boolean d() {
        return false;
    }

    @Override // defpackage.ueg
    public final boolean e() {
        return this.b;
    }

    @Override // defpackage.ueg
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.ueg
    public final void g() {
        this.b = true;
    }

    @Override // defpackage.ueg
    public final uqg h() {
        return this.f;
    }
}

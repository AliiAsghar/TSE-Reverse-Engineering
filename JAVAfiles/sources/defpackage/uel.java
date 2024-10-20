package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class uel implements ueg {
    private boolean a;
    private boolean b;
    private final AtomicReference c;
    private final uqg d = new uqg();

    public uel(uci uciVar, agni agniVar) {
        AtomicReference atomicReference = new AtomicReference();
        this.c = atomicReference;
        atomicReference.set(uciVar.N(agniVar));
    }

    @Override // defpackage.ueg
    public final /* synthetic */ agna a() {
        return null;
    }

    @Override // defpackage.ueg
    public final void b() {
        ((uce) this.c.getAndSet(new ueh(2))).a();
    }

    @Override // defpackage.ueg
    public final void c(boolean z) {
        this.b = z;
    }

    @Override // defpackage.ueg
    public final boolean d() {
        return true;
    }

    @Override // defpackage.ueg
    public final boolean e() {
        return this.a;
    }

    @Override // defpackage.ueg
    public final boolean f() {
        return this.b;
    }

    @Override // defpackage.ueg
    public final void g() {
        this.a = true;
    }

    @Override // defpackage.ueg
    public final uqg h() {
        return this.d;
    }
}

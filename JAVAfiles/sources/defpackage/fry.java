package defpackage;

import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class fry implements frd {
    private final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public long c;
    private final ArrayDeque d;
    private frw e;
    private long f;
    private long g;

    public fry() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new frw());
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.add(new frx(new qdq(this)));
        }
        this.d = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    private final void k(frw frwVar) {
        frwVar.eO();
        this.a.add(frwVar);
    }

    @Override // defpackage.ewi
    public final /* bridge */ /* synthetic */ Object a() {
        boolean z;
        if (this.e == null) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
        if (this.a.isEmpty()) {
            return null;
        }
        frw frwVar = (frw) this.a.pollFirst();
        this.e = frwVar;
        return frwVar;
    }

    @Override // defpackage.ewi
    public void c() {
        this.f = 0L;
        this.c = 0L;
        while (!this.d.isEmpty()) {
            frw frwVar = (frw) this.d.poll();
            int i = eul.a;
            k(frwVar);
        }
        frw frwVar2 = this.e;
        if (frwVar2 != null) {
            k(frwVar2);
            this.e = null;
        }
    }

    @Override // defpackage.ewi
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        boolean z;
        if (obj == this.e) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        frw frwVar = (frw) obj;
        long j = this.g;
        if (j != -9223372036854775807L && frwVar.f < j) {
            k(frwVar);
        } else {
            long j2 = this.f;
            this.f = 1 + j2;
            int i = frw.j;
            frwVar.i = j2;
            this.d.add(frwVar);
        }
        this.e = null;
    }

    @Override // defpackage.ewi
    public final void f(long j) {
        this.g = j;
    }

    protected abstract frc g();

    @Override // defpackage.ewi
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public frg b() {
        if (!this.b.isEmpty()) {
            while (!this.d.isEmpty()) {
                frw frwVar = (frw) this.d.peek();
                int i = eul.a;
                if (frwVar.f <= this.c) {
                    frw frwVar2 = (frw) this.d.poll();
                    if (frwVar2.eR()) {
                        frg frgVar = (frg) this.b.pollFirst();
                        frgVar.eP(4);
                        k(frwVar2);
                        return frgVar;
                    }
                    i(frwVar2);
                    if (j()) {
                        frc g = g();
                        frg frgVar2 = (frg) this.b.pollFirst();
                        frgVar2.i(frwVar2.f, g, Long.MAX_VALUE);
                        k(frwVar2);
                        return frgVar2;
                    }
                    k(frwVar2);
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    protected abstract void i(frf frfVar);

    protected abstract boolean j();

    @Override // defpackage.frd
    public final void p(long j) {
        this.c = j;
    }

    @Override // defpackage.ewi
    public void e() {
    }
}

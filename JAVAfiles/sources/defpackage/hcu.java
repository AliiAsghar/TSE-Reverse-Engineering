package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hcu implements hct {
    private final List a;
    private hie c = null;
    private float d = -1.0f;
    private hie b = g(brg.a);

    public hcu(List list) {
        this.a = list;
    }

    private final hie g(float f) {
        hie hieVar = (hie) this.a.get(this.a.size() - 1);
        if (f >= hieVar.c()) {
            return hieVar;
        }
        for (int size = this.a.size() - 2; size > 0; size--) {
            hie hieVar2 = (hie) this.a.get(size);
            if (this.b != hieVar2 && hieVar2.d(f)) {
                return hieVar2;
            }
        }
        return (hie) this.a.get(0);
    }

    @Override // defpackage.hct
    public final float a() {
        return ((hie) this.a.get(this.a.size() - 1)).b();
    }

    @Override // defpackage.hct
    public final float b() {
        return ((hie) this.a.get(0)).c();
    }

    @Override // defpackage.hct
    public final hie c() {
        return this.b;
    }

    @Override // defpackage.hct
    public final boolean d(float f) {
        hie hieVar = this.c;
        hie hieVar2 = this.b;
        if (hieVar == hieVar2 && this.d == f) {
            return true;
        }
        this.c = hieVar2;
        this.d = f;
        return false;
    }

    @Override // defpackage.hct
    public final boolean e() {
        return false;
    }

    @Override // defpackage.hct
    public final boolean f(float f) {
        if (this.b.d(f)) {
            if (!this.b.e()) {
                return true;
            }
            return false;
        }
        this.b = g(f);
        return true;
    }
}

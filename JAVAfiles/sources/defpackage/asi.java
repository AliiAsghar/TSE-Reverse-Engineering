package defpackage;

import defpackage.asl;
import defpackage.cva;

/* compiled from: PG */
/* loaded from: classes.dex */
final class asi implements cva, cva.a, asl.a {
    public int b;
    public cva.a c;
    private final Object e;
    private final asl f;
    public int a = -1;
    public final byn d = new byu(null, cav.a);

    public asi(Object obj, asl aslVar) {
        this.e = obj;
        this.f = aslVar;
    }

    @Override // asl.a
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cva
    public final cva.a b() {
        cva.a aVar;
        if (this.b == 0) {
            this.f.a.add(this);
            cva c = c();
            if (c != null) {
                aVar = c.b();
            } else {
                aVar = null;
            }
            this.c = aVar;
        }
        this.b++;
        return this;
    }

    public final cva c() {
        return (cva) this.d.a();
    }

    @Override // asl.a
    public final Object d() {
        return this.e;
    }

    @Override // cva.a
    public final void e() {
        if (this.b <= 0) {
            aju.d("Release should only be called once");
        }
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            this.f.a.remove(this);
            cva.a aVar = this.c;
            if (aVar != null) {
                aVar.e();
            }
            this.c = null;
        }
    }
}

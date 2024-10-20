package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agpo {
    public int a;
    public agpf b;
    public final boolean c;
    public final boolean d;
    public final akkw e;

    public agpo(akkw akkwVar, agpf agpfVar, boolean z) {
        this.a = 0;
        this.e = akkwVar;
        this.b = agpfVar;
        this.c = z;
        this.d = false;
    }

    public static agpo b() {
        return new agpo(null, agpf.a().b());
    }

    public final agox a() {
        agox g = akkw.g(this.a);
        if (this.b.t != null) {
            return new agpn(this, 0);
        }
        return g;
    }

    public final void c() {
        this.a++;
    }

    public agpo(akkw akkwVar, agpf agpfVar, boolean z, byte[] bArr) {
        this.a = 0;
        this.e = akkwVar;
        this.b = agpfVar;
        this.c = false;
        this.d = z;
    }

    public agpo(akkw akkwVar, agpf agpfVar) {
        this(akkwVar, agpfVar, false, null);
    }
}

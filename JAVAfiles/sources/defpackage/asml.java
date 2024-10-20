package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asml {
    public asmh a;
    public int b;
    public String c;
    public aslu d;
    public asmp e;
    public asmm f;
    public asmm g;
    public asmm h;
    public long i;
    public long j;
    public asnc k;
    public asuo l;
    private asmf m;

    public asml() {
        this.b = -1;
        this.l = new asuo((char[]) null);
    }

    public static final void b(String str, asmm asmmVar) {
        if (asmmVar != null) {
            if (asmmVar.g == null) {
                if (asmmVar.h == null) {
                    if (asmmVar.i == null) {
                        if (asmmVar.j != null) {
                            throw new IllegalArgumentException(str.concat(".priorResponse != null"));
                        }
                        return;
                    }
                    throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
                }
                throw new IllegalArgumentException(str.concat(".networkResponse != null"));
            }
            throw new IllegalArgumentException(str.concat(".body != null"));
        }
    }

    public final asmm a() {
        int i = this.b;
        if (i >= 0) {
            asmh asmhVar = this.a;
            if (asmhVar != null) {
                asmf asmfVar = this.m;
                if (asmfVar != null) {
                    String str = this.c;
                    if (str != null) {
                        return new asmm(asmhVar, asmfVar, str, i, this.d, this.l.h(), this.e, this.f, this.g, this.h, this.i, this.j, this.k);
                    }
                    throw new IllegalStateException("message == null");
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }
        throw new IllegalStateException(a.bV(i, "code < 0: "));
    }

    public final void c(aslv aslvVar) {
        this.l = aslvVar.e();
    }

    public final void d(asmf asmfVar) {
        asmfVar.getClass();
        this.m = asmfVar;
    }

    public asml(asmm asmmVar) {
        this.b = -1;
        this.a = asmmVar.a;
        this.m = asmmVar.b;
        this.b = asmmVar.d;
        this.c = asmmVar.c;
        this.d = asmmVar.e;
        this.l = asmmVar.f.e();
        this.e = asmmVar.g;
        this.f = asmmVar.h;
        this.g = asmmVar.i;
        this.h = asmmVar.j;
        this.i = asmmVar.k;
        this.j = asmmVar.l;
        this.k = asmmVar.m;
    }
}

package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asnv {
    public final asnh a;
    public final asnc b;
    public final asmh c;
    private final List d;
    private final int e;
    private int f;

    public asnv(asnh asnhVar, List list, int i, asnc asncVar, asmh asmhVar) {
        this.a = asnhVar;
        this.d = list;
        this.e = i;
        this.b = asncVar;
        this.c = asmhVar;
    }

    public static /* synthetic */ asnv b(asnv asnvVar, int i, asnc asncVar, asmh asmhVar, int i2) {
        if ((i2 & 1) != 0) {
            i = asnvVar.e;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            asncVar = asnvVar.b;
        }
        asnc asncVar2 = asncVar;
        if ((i2 & 4) != 0) {
            asmhVar = asnvVar.c;
        }
        asmh asmhVar2 = asmhVar;
        asmhVar2.getClass();
        return new asnv(asnvVar.a, asnvVar.d, i3, asncVar2, asmhVar2);
    }

    public final asmm a(asmh asmhVar) {
        asmhVar.getClass();
        if (this.e < this.d.size()) {
            this.f++;
            asnc asncVar = this.b;
            if (asncVar != null) {
                if (((asnd) asncVar.c).b(asmhVar.a)) {
                    if (this.f != 1) {
                        throw new IllegalStateException("network interceptor " + this.d.get(this.e - 1) + " must call proceed() exactly once");
                    }
                } else {
                    throw new IllegalStateException("network interceptor " + this.d.get(this.e - 1) + " must retain the same host and port");
                }
            }
            asnv b = b(this, this.e + 1, null, asmhVar, 58);
            asly aslyVar = (asly) this.d.get(this.e);
            asmm a = aslyVar.a(b);
            if (this.b != null && this.e + 1 < this.d.size() && b.f != 1) {
                throw new IllegalStateException(a.cc(aslyVar, "network interceptor ", " must call proceed() exactly once"));
            }
            if (a.g != null) {
                return a;
            }
            throw new IllegalStateException(a.cc(aslyVar, "interceptor ", " returned a response with no body"));
        }
        throw new IllegalStateException("Check failed.");
    }
}

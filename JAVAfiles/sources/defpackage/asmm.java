package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asmm implements Closeable {
    public final asmh a;
    public final asmf b;
    public final String c;
    public final int d;
    public final aslu e;
    public final aslv f;
    public final asmp g;
    public final asmm h;
    public final asmm i;
    public final asmm j;
    public final long k;
    public final long l;
    public final asnc m;

    public asmm(asmh asmhVar, asmf asmfVar, String str, int i, aslu asluVar, aslv aslvVar, asmp asmpVar, asmm asmmVar, asmm asmmVar2, asmm asmmVar3, long j, long j2, asnc asncVar) {
        this.a = asmhVar;
        this.b = asmfVar;
        this.c = str;
        this.d = i;
        this.e = asluVar;
        this.f = aslvVar;
        this.g = asmpVar;
        this.h = asmmVar;
        this.i = asmmVar2;
        this.j = asmmVar3;
        this.k = j;
        this.l = j2;
        this.m = asncVar;
    }

    public static /* synthetic */ String b(asmm asmmVar, String str) {
        String b = asmmVar.f.b(str);
        if (b == null) {
            return null;
        }
        return b;
    }

    public final boolean a() {
        int i = this.d;
        if (i >= 200 && i < 300) {
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        asmp asmpVar = this.g;
        if (asmpVar != null) {
            asmpVar.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + this.a.a + "}";
    }
}

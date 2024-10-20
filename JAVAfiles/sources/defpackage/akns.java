package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akns {
    public String a;
    public aknr b;
    public Executor c;
    public byte d;
    private algw e;
    private apbt f;
    private alob g;
    private alog h;
    private algw i;
    private algw j;

    public akns() {
        throw null;
    }

    public final aknt a() {
        String str;
        apbt apbtVar;
        aknr aknrVar;
        alob alobVar = this.g;
        if (alobVar != null) {
            this.h = alobVar.g();
        } else if (this.h == null) {
            int i = alog.d;
            this.h = alsx.a;
        }
        if (this.d == 1 && (str = this.a) != null && (apbtVar = this.f) != null && (aknrVar = this.b) != null) {
            return new aknt(str, this.e, apbtVar, aknrVar, this.h, this.i, this.j, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" blockingSafeReads");
        }
        if (this.a == null) {
            sb.append(" name");
        }
        if (this.f == null) {
            sb.append(" schema");
        }
        if (this.b == null) {
            sb.append(" storage");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(aiwj aiwjVar) {
        this.i = algw.i(aiwjVar);
    }

    public final void c(apbt apbtVar) {
        if (apbtVar != null) {
            this.f = apbtVar;
            return;
        }
        throw new NullPointerException("Null schema");
    }

    public final void d(aiwp aiwpVar) {
        if (this.g == null) {
            this.g = new alob();
        }
        this.g.h(aiwpVar);
    }

    public akns(byte[] bArr) {
        alfd alfdVar = alfd.a;
        this.e = alfdVar;
        this.i = alfdVar;
        this.j = alfdVar;
    }
}

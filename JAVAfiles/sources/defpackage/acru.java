package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acru extends assk {
    private final long a;
    private final acrm b;
    private final String c;

    public acru(long j, acrm acrmVar, String str) {
        super(assh.STRICT, "b".concat(aikx.a()), null);
        this.a = j;
        this.b = acrmVar;
        this.c = str;
    }

    @Override // defpackage.assk, org.apache.http.HttpEntity
    public final void writeTo(OutputStream outputStream) {
        super.writeTo(new acst(this.a, (int) getContentLength(), outputStream, this.b, this.c));
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ryh {
    public Object a;
    public final Object b;

    public ryh(byte[] bArr) {
        this.b = new alok();
    }

    public final qry a() {
        alor g = ((alok) this.b).g();
        this.a = g;
        if (g != null) {
            return new qry(g);
        }
        throw new IllegalStateException("Missing required properties: capabilities");
    }

    public final void b(String str) {
        c(str, Boolean.TRUE.toString());
    }

    public final void c(String str, String str2) {
        ((alok) this.b).h(str, str2);
    }

    public ryh() {
        int i = alog.d;
        this.a = alsx.a;
        this.b = new ryi();
    }
}

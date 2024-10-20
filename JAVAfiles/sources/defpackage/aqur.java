package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqur extends aquo {
    private final aqus d;

    public aqur(String str, boolean z, aqus aqusVar) {
        super(str, z, aqusVar);
        albo.Q(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        aqusVar.getClass();
        this.d = aqusVar;
    }

    @Override // defpackage.aquo
    public final Object a(byte[] bArr) {
        return this.d.a(bArr);
    }

    @Override // defpackage.aquo
    public final byte[] b(Object obj) {
        byte[] b = this.d.b(obj);
        b.getClass();
        return b;
    }
}

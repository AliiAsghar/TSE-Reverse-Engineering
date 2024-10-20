package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqul extends aquo {
    private final aqum d;

    public aqul(String str, aqum aqumVar) {
        super(str, false, aqumVar);
        albo.Q(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", str, "-bin");
        d.t(str.length() > 4, "empty key name");
        aqumVar.getClass();
        this.d = aqumVar;
    }

    @Override // defpackage.aquo
    public final Object a(byte[] bArr) {
        return this.d.a(bArr);
    }

    @Override // defpackage.aquo
    public final byte[] b(Object obj) {
        return this.d.b(obj);
    }
}

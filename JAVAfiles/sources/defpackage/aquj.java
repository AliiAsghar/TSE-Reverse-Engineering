package defpackage;

import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aquj extends aquo {
    private final aquk d;

    public aquj(String str, aquk aqukVar) {
        super(str, false, aqukVar);
        albo.Q(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        aqukVar.getClass();
        this.d = aqukVar;
    }

    @Override // defpackage.aquo
    public final Object a(byte[] bArr) {
        return this.d.a(new String(bArr, StandardCharsets.US_ASCII));
    }

    @Override // defpackage.aquo
    public final byte[] b(Object obj) {
        return this.d.b(obj).getBytes(StandardCharsets.US_ASCII);
    }
}

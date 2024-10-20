package defpackage;

import java.io.ByteArrayInputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqup extends aquo {
    private final aqun d;

    public aqup(String str, aqun aqunVar) {
        super(str, false, aqunVar);
        albo.Q(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", str, "-bin");
        d.t(str.length() > 4, "empty key name");
        this.d = aqunVar;
    }

    @Override // defpackage.aquo
    public final Object a(byte[] bArr) {
        return this.d.b(new ByteArrayInputStream(bArr));
    }

    @Override // defpackage.aquo
    public final byte[] b(Object obj) {
        return aqut.m(this.d.a(obj));
    }

    @Override // defpackage.aquo
    public final boolean c() {
        return true;
    }
}

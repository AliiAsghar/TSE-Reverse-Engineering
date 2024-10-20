package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class assm extends assl {
    private final byte[] a;
    private final String b;

    public assm(byte[] bArr, String str) {
        this(bArr, "application/octet-stream", str);
    }

    @Override // defpackage.asso
    public long a() {
        return this.a.length;
    }

    @Override // defpackage.asso
    public String e() {
        return null;
    }

    @Override // defpackage.assn
    public String f() {
        return this.b;
    }

    @Override // defpackage.asso
    public String g() {
        return assi.e;
    }

    @Override // defpackage.assn
    public void h(OutputStream outputStream) {
        outputStream.write(this.a);
    }

    public assm(byte[] bArr, String str, String str2) {
        super(str);
        if (bArr != null) {
            this.a = bArr;
            this.b = str2;
            return;
        }
        throw new IllegalArgumentException("byte[] may not be null");
    }
}

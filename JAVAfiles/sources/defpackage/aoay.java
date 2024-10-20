package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoay extends aobt {
    public final int a;
    private final int b;
    private final int c;
    private final String d;
    private final byte[] e;

    public aoay(aoab aoabVar) {
        String str;
        this.e = aoabVar.f.y();
        if (aoabVar.e.e.equals(aoae.a)) {
            str = "HmacSha1";
        } else if (aoabVar.e.e.equals(aoae.b)) {
            str = "HmacSha256";
        } else if (aoabVar.e.e.equals(aoae.c)) {
            str = "HmacSha512";
        } else {
            throw new GeneralSecurityException("Unknown HKDF algorithm ".concat(String.valueOf(String.valueOf(aoabVar.e.e))));
        }
        this.d = str;
        this.a = aoabVar.e.G();
        int F = aoabVar.e.F();
        this.b = F;
        this.c = F - 16;
    }

    public static Cipher i() {
        return (Cipher) aobo.a.a("AES/GCM/NoPadding");
    }

    public static GCMParameterSpec j(byte[] bArr, long j, boolean z) {
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.put(bArr);
        aode.p(allocate, j);
        allocate.put(z ? (byte) 1 : (byte) 0);
        return new GCMParameterSpec(128, allocate.array());
    }

    @Override // defpackage.aobt
    public final int c() {
        return e();
    }

    @Override // defpackage.aobt
    public final int d() {
        return this.b;
    }

    @Override // defpackage.aobt
    public final int e() {
        return this.a + 8;
    }

    @Override // defpackage.aobt
    public final int f() {
        return this.c;
    }

    @Override // defpackage.aobt
    public final /* synthetic */ aoce g() {
        return new aoaw(this);
    }

    @Override // defpackage.aobt
    public final /* synthetic */ aocf h(byte[] bArr) {
        return new aoax(this, bArr);
    }

    public final SecretKeySpec k(byte[] bArr, byte[] bArr2) {
        return new SecretKeySpec(aode.s(this.d, this.e, bArr, bArr2, this.a), "AES");
    }
}

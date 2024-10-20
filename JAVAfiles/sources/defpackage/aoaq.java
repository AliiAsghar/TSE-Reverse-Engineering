package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoaq extends aobt {
    public final int a;
    public final int b;
    private final String c;
    private final int d;
    private final int e;
    private final String f;
    private final byte[] g;

    public aoaq(anzx anzxVar) {
        String str;
        if (anme.z(1)) {
            this.g = anzxVar.f.y();
            String str2 = "HmacSha512";
            if (anzxVar.e.e.equals(anzz.a)) {
                str = "HmacSha1";
            } else if (anzxVar.e.e.equals(anzz.b)) {
                str = "HmacSha256";
            } else if (anzxVar.e.e.equals(anzz.c)) {
                str = "HmacSha512";
            } else {
                str = "";
            }
            this.f = str;
            this.a = anzxVar.e.G();
            if (anzxVar.e.f.equals(anzz.a)) {
                str2 = "HmacSha1";
            } else if (anzxVar.e.f.equals(anzz.b)) {
                str2 = "HmacSha256";
            } else if (!anzxVar.e.f.equals(anzz.c)) {
                str2 = "";
            }
            this.c = str2;
            int H = anzxVar.e.H();
            this.b = H;
            int F = anzxVar.e.F();
            this.d = F;
            this.e = F - H;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR-HMAC streaming in FIPS-mode.");
    }

    public static Cipher i() {
        return (Cipher) aobo.a.a("AES/CTR/NoPadding");
    }

    public static final byte[] n(byte[] bArr, long j, boolean z) {
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.put(bArr);
        aode.p(allocate, j);
        allocate.put(z ? (byte) 1 : (byte) 0);
        allocate.putInt(0);
        return allocate.array();
    }

    @Override // defpackage.aobt
    public final int c() {
        return e();
    }

    @Override // defpackage.aobt
    public final int d() {
        return this.d;
    }

    @Override // defpackage.aobt
    public final int e() {
        return this.a + 8;
    }

    @Override // defpackage.aobt
    public final int f() {
        return this.e;
    }

    @Override // defpackage.aobt
    public final /* synthetic */ aoce g() {
        return new aoao(this);
    }

    @Override // defpackage.aobt
    public final /* synthetic */ aocf h(byte[] bArr) {
        return new aoap(this, bArr);
    }

    public final Mac j() {
        return (Mac) aobo.b.a(this.c);
    }

    public final SecretKeySpec k(byte[] bArr) {
        return new SecretKeySpec(bArr, this.a, 32, this.c);
    }

    public final SecretKeySpec l(byte[] bArr) {
        return new SecretKeySpec(bArr, 0, this.a, "AES");
    }

    public final byte[] m(byte[] bArr, byte[] bArr2) {
        return aode.s(this.f, this.g, bArr, bArr2, this.a + 32);
    }
}

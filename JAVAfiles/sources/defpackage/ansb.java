package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ansb implements anmv {
    private static final byte[] a = new byte[0];
    private final byte[] b;
    private final ansc c;
    private final anry d;
    private final byte[] e;
    private final ahmn f;

    public ansb(aocj aocjVar, ansc anscVar, ahmn ahmnVar, anry anryVar, aocj aocjVar2) {
        this.b = aocjVar.c();
        this.c = anscVar;
        this.f = ahmnVar;
        this.d = anryVar;
        this.e = aocjVar2.c();
    }

    public static anry b(anra anraVar) {
        if (anraVar.equals(anra.a)) {
            return new anrr(16);
        }
        if (anraVar.equals(anra.b)) {
            return new anrr(32);
        }
        if (anraVar.equals(anra.c)) {
            return new anrs();
        }
        throw new GeneralSecurityException("Unrecognized HPKE AEAD identifier");
    }

    public static ansc c(anrd anrdVar) {
        if (anrdVar.equals(anrd.f)) {
            return new ansj(new ahmn("HmacSha256", null));
        }
        if (anrdVar.equals(anrd.a)) {
            return ansi.d(aobi.NIST_P256);
        }
        if (anrdVar.equals(anrd.b)) {
            return ansi.d(aobi.NIST_P384);
        }
        if (anrdVar.equals(anrd.c)) {
            return ansi.d(aobi.NIST_P521);
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    public static ahmn d(anrc anrcVar) {
        if (anrcVar.equals(anrc.a)) {
            return new ahmn("HmacSha256", null);
        }
        if (anrcVar.equals(anrc.b)) {
            return new ahmn("HmacSha384", null);
        }
        if (anrcVar.equals(anrc.c)) {
            return new ahmn("HmacSha512", null);
        }
        throw new GeneralSecurityException("Unrecognized HPKE KDF identifier");
    }

    @Override // defpackage.anmv
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        byte[] bArr4 = this.b;
        ansc anscVar = this.c;
        ahmn ahmnVar = this.f;
        anry anryVar = this.d;
        ansy c = anscVar.c(bArr4);
        Object obj = c.b;
        anrz b = anrz.b(ansf.a, (byte[]) obj, (byte[]) c.a, anscVar, ahmnVar, anryVar, bArr3);
        byte[] bArr5 = b.c;
        int length = this.e.length;
        int length2 = bArr5.length;
        byte[] bArr6 = a;
        byte[] a2 = b.a();
        byte[] d = b.a.d(b.b, a2, bArr, length + length2, bArr6);
        byte[] bArr7 = this.e;
        System.arraycopy(bArr7, 0, d, 0, bArr7.length);
        System.arraycopy(bArr5, 0, d, this.e.length, length2);
        return d;
    }
}

package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ansa implements anmu {
    private static final byte[] a = new byte[0];
    private final ansd b;
    private final ansc c;
    private final anry d;
    private final int e;
    private final byte[] f;
    private final ahmn g;

    public ansa(ansd ansdVar, ansc anscVar, ahmn ahmnVar, anry anryVar, int i, aocj aocjVar) {
        this.b = ansdVar;
        this.c = anscVar;
        this.g = ahmnVar;
        this.d = anryVar;
        this.e = i;
        this.f = aocjVar.c();
    }

    @Override // defpackage.anmu
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.f;
        int length2 = bArr3.length + this.e;
        if (length >= length2) {
            if (anuk.e(bArr3, bArr)) {
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] bArr4 = bArr2;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, this.f.length, length2);
                ansd ansdVar = this.b;
                ansc anscVar = this.c;
                ahmn ahmnVar = this.g;
                anry anryVar = this.d;
                anrz b = anrz.b(ansf.a, copyOfRange, anscVar.a(copyOfRange, ansdVar), anscVar, ahmnVar, anryVar, bArr4);
                byte[] bArr5 = a;
                return b.a.c(b.b, b.a(), bArr, length2, bArr5);
            }
            throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        throw new GeneralSecurityException("Ciphertext is too short.");
    }
}

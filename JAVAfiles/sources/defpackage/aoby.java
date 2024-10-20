package defpackage;

import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoby implements anne {
    private static final byte[] a = {0};
    private final anve b;
    private final int c;
    private final byte[] d;
    private final byte[] e;

    public aoby(anul anulVar) {
        this.b = new aobv(anulVar.h.y());
        this.c = anulVar.e.f;
        this.d = anulVar.f.c();
        if (anulVar.e.g.equals(anun.c)) {
            this.e = Arrays.copyOf(a, 1);
        } else {
            this.e = new byte[0];
        }
    }

    @Override // defpackage.anne
    public final byte[] a(byte[] bArr) {
        byte[] bArr2 = this.e;
        if (bArr2.length > 0) {
            return aode.O(this.d, this.b.a(aode.O(bArr, bArr2), this.c));
        }
        return aode.O(this.d, this.b.a(bArr, this.c));
    }

    public aoby(anur anurVar) {
        String valueOf = String.valueOf(String.valueOf(anurVar.e.h));
        this.b = new aobx("HMAC".concat(valueOf), new SecretKeySpec(anurVar.h.y(), "HMAC"));
        this.c = anurVar.e.f;
        this.d = anurVar.f.c();
        if (anurVar.e.g.equals(anuu.c)) {
            this.e = Arrays.copyOf(a, 1);
        } else {
            this.e = new byte[0];
        }
    }

    public aoby(anve anveVar, int i) {
        this.b = anveVar;
        this.c = i;
        this.d = new byte[0];
        this.e = new byte[0];
        anveVar.a(new byte[0], i);
    }
}

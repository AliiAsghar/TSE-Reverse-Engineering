package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anyo extends anzm {
    public final anyq e;
    public final aojh f;

    private anyo(anyq anyqVar, aojh aojhVar) {
        this.e = anyqVar;
        this.f = aojhVar;
    }

    public static anyo H(anyq anyqVar, aojh aojhVar) {
        if (aojhVar.x() == 32) {
            if (Arrays.equals(anyqVar.f.c(), ansu.g(ansu.f(aojhVar.y())))) {
                return new anyo(anyqVar, aojhVar);
            }
            throw new GeneralSecurityException("Ed25519 keys mismatch");
        }
        throw new GeneralSecurityException("Ed25519 key must be constructed with key of length 32 bytes, not " + aojhVar.x());
    }

    public final anyn F() {
        return this.e.e;
    }

    @Override // defpackage.anzm
    public final /* synthetic */ anzn G() {
        return this.e;
    }

    @Override // defpackage.anzm, defpackage.annf
    public final /* synthetic */ anme b() {
        return this.e;
    }
}

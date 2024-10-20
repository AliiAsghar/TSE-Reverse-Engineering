package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoab extends anme {
    public final aoaf e;
    public final aojh f;

    private aoab(aoaf aoafVar, aojh aojhVar) {
        super((byte[]) null);
        this.e = aoafVar;
        this.f = aojhVar;
    }

    public static aoab F(aoaf aoafVar, aojh aojhVar) {
        if (aoafVar.H() == aojhVar.x()) {
            return new aoab(aoafVar, aojhVar);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}

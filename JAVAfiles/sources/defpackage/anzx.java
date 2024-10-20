package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anzx extends anme {
    public final aoaa e;
    public final aojh f;

    private anzx(aoaa aoaaVar, aojh aojhVar) {
        super((byte[]) null);
        this.e = aoaaVar;
        this.f = aojhVar;
    }

    public static anzx F(aoaa aoaaVar, aojh aojhVar) {
        if (aoaaVar.I() == aojhVar.x()) {
            return new anzx(aoaaVar, aojhVar);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}

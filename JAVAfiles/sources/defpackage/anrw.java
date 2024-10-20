package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anrw {
    public static final byte[] a = new byte[0];

    public static anrv a(anqx anqxVar) {
        anme anmeVar = anqxVar.k;
        if (anmeVar instanceof anoe) {
            return new anrt((anoe) anmeVar);
        }
        if (anmeVar instanceof annu) {
            return new anru((annu) anmeVar, 1);
        }
        if (anmeVar instanceof anqm) {
            return new anru((anqm) anmeVar, 0);
        }
        throw new GeneralSecurityException("Unsupported DEM parameters: ".concat(String.valueOf(String.valueOf(anmeVar))));
    }
}

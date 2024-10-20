package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abzx {
    public static final long a = TimeUnit.HOURS.toMillis(1);

    public static abzt a(algw algwVar) {
        int i = 2;
        if (algwVar.f()) {
            algw b = b((aovk) algwVar.b());
            if (b.f()) {
                aovh b2 = aovh.b(((aovj) b.b()).d);
                if (b2 == null) {
                    b2 = aovh.UNKNOWN;
                }
                int ordinal = b2.ordinal();
                i = ordinal != 1 ? ordinal != 2 ? 3 : 4 : 1;
            }
        }
        return new abzt(i);
    }

    public static algw b(aovk aovkVar) {
        if ((aovkVar.b & 1) != 0) {
            try {
                return algw.i((aovj) apag.parseFrom(aovj.a, aovkVar.c, aozs.a()));
            } catch (apba unused) {
            }
        }
        return alfd.a;
    }
}

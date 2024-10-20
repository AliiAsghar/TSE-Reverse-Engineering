package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahru {
    static final ahrv a = new ahrs(asja.a, true);
    private final Random b;
    private final anca c;
    private final ahrl d;

    public ahru(Random random, ahrl ahrlVar, anca ancaVar) {
        this.b = random;
        this.c = ancaVar;
        this.d = ahrlVar;
    }

    public final ahrv a(asja asjaVar) {
        int aD = a.aD(asjaVar.d);
        boolean z = true;
        if (aD == 0) {
            aD = 1;
        }
        int i = aD - 1;
        if (i != 1) {
            if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        asjaVar = asja.a;
                    }
                    return new ahrs(asjaVar, true);
                }
                Random random = this.b;
                ahrl ahrlVar = this.d;
                ahrlVar.getClass();
                return new ahrt(asjaVar, random, ahrlVar, this.c);
            }
            if (this.b.nextDouble() * 1000.0d >= asjaVar.c) {
                z = false;
            }
            return new ahrs(asjaVar, z);
        }
        if (asjaVar.c != 1000) {
            z = false;
        }
        return new ahrs(asjaVar, z);
    }
}

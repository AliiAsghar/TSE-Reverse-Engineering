package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mba extends mav {
    private final alhr a;

    public mba(alhr alhrVar) {
        this.a = alhrVar;
    }

    @Override // defpackage.mav
    public final boolean a(mbu mbuVar) {
        double nextDouble = ((Random) this.a.get()).nextDouble();
        mbz mbzVar = mbuVar.c;
        if (mbzVar == null) {
            mbzVar = mbz.a;
        }
        if (nextDouble < mbzVar.c) {
            return true;
        }
        return false;
    }
}

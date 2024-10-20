package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ukp implements ukn {
    private final Optional a;
    private final /* synthetic */ int b;

    public ukp(Optional optional, int i) {
        this.b = i;
        this.a = optional;
    }

    @Override // defpackage.ukn
    public final akul a(srd srdVar) {
        if (this.b != 0) {
            d.s(b(srdVar));
            if (this.a.isEmpty()) {
                return aktp.ag(true);
            }
            throw null;
        }
        d.s(b(srdVar));
        if (this.a.isEmpty()) {
            return aktp.ag(true);
        }
        throw null;
    }

    @Override // defpackage.ukn
    public final boolean b(srd srdVar) {
        if (this.b != 0) {
            if ((srdVar.m() & 4) == 0 || srdVar.k() != 1) {
                return false;
            }
            return true;
        }
        if ((srdVar.m() & 8) == 0 || srdVar.k() != 1) {
            return false;
        }
        return true;
    }
}

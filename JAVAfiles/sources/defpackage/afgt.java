package defpackage;

import android.view.ViewGroup;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afgt implements afgq {
    private final Optional a;
    private final afgy b;
    private final afgy c;

    public afgt(afgy afgyVar, Optional optional, afgy afgyVar2) {
        this.c = afgyVar;
        this.a = optional;
        this.b = afgyVar2;
    }

    @Override // defpackage.afgq
    public final afgs a(ViewGroup viewGroup, afgo afgoVar, arqr arqrVar) {
        afgq afgqVar;
        aeke aekeVar = afgoVar.c;
        if (!(aekeVar instanceof afgl) && !(aekeVar instanceof afgm)) {
            if (aekeVar instanceof afgn) {
                afgqVar = this.b;
            } else {
                afgqVar = this.c;
            }
        } else {
            Object orElseThrow = this.a.orElseThrow(new addh(12));
            orElseThrow.getClass();
            afgqVar = (afgq) orElseThrow;
        }
        return afgqVar.a(viewGroup, afgoVar, arqrVar);
    }
}

package defpackage;

import j$.time.LocalDate;
import j$.time.MonthDay;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lpv extends arps {
    Object a;
    int b;
    int c;
    /* synthetic */ Object d;
    final /* synthetic */ lpw e;
    int f;
    lpw g;
    LocalDate h;
    MonthDay i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpv(lpw lpwVar, arpe arpeVar) {
        super(arpeVar);
        this.e = lpwVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(this);
    }
}

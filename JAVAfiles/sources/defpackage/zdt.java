package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zdt {
    public static final xze a = xze.g("BugleProfiles", "ProfileSuggestionsAdapterImpl");
    public final Context b;
    public final Optional c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final xca g;
    public final akvi h;
    public final armf i;
    public final armf j;
    public final ascv k;
    private final arwe l;
    private final zdy m;
    private final asai n;
    private final ascv o;
    private final zen p;

    public zdt(arwe arweVar, Context context, @oqd armf armfVar, zdy zdyVar, Optional optional, armf armfVar2, zen zenVar, armf armfVar3, armf armfVar4, xca xcaVar, akvi akviVar, armf armfVar5, armf armfVar6) {
        asai a2;
        arweVar.getClass();
        context.getClass();
        armfVar.getClass();
        zdyVar.getClass();
        armfVar2.getClass();
        zenVar.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        xcaVar.getClass();
        akviVar.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        this.l = arweVar;
        this.b = context;
        this.m = zdyVar;
        this.c = optional;
        this.d = armfVar2;
        this.p = zenVar;
        this.e = armfVar3;
        this.f = armfVar4;
        this.g = xcaVar;
        this.h = akviVar;
        this.i = armfVar5;
        this.j = armfVar6;
        asai b = zdyVar.b();
        this.n = b;
        qkk qkkVar = new qkk(b, this, 18);
        int i = ascp.a;
        arrn.T(qkkVar, arweVar, asco.a, arnb.a);
        mjn mjnVar = (mjn) arsd.k(optional);
        ascv T = arrn.T((mjnVar == null || (a2 = mjnVar.a()) == null) ? asah.a : a2, arweVar, asco.a(0L, 3), null);
        this.o = T;
        this.k = arrn.T(arrn.P(b, zenVar.e, T, new liy(this, 2, (char[]) null)), arweVar, asco.a(0L, 3), new zdr(null, null));
    }

    public static final msh a(arml armlVar) {
        return (msh) armlVar.a();
    }

    public final zdv b(voo vooVar, zem zemVar, msh mshVar) {
        arsb arsbVar = new arsb();
        this.h.a(new rgr(arsbVar, this, vooVar, zemVar, mshVar, 9), "ProfileSuggestionsAdapterImpl#toSuggestionUiData");
        return (zdv) arsbVar.a;
    }
}

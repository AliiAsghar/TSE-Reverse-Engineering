package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kzu implements kzg {
    private final apwt a;

    public kzu(apwt apwtVar) {
        apwtVar.getClass();
        this.a = apwtVar;
    }

    @Override // defpackage.kzg
    public final kze a() {
        return new kzs();
    }

    @Override // defpackage.kzg
    public final /* synthetic */ kzf b() {
        return new kzn(altc.a);
    }

    @Override // defpackage.kzg
    public final apwt c() {
        return this.a;
    }

    @Override // defpackage.kzg
    public final String d() {
        return "TYPING_INDICATOR_KEY";
    }

    @Override // defpackage.kzg
    public final akgh e(kyf kyfVar) {
        return new kzt(kyfVar);
    }

    @Override // defpackage.kzg
    public final /* synthetic */ void f(enh enhVar, ahiy ahiyVar) {
        lga.Q(this, enhVar, ahiyVar);
    }

    @Override // defpackage.kzg
    public final /* synthetic */ void g(aohs aohsVar, uac uacVar, kyf kyfVar, AtomicBoolean atomicBoolean) {
        lga.aI(this, aohsVar, uacVar, kyfVar, atomicBoolean);
    }
}

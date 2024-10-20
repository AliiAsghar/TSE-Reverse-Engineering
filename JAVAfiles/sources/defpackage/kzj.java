package defpackage;

import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kzj implements kzg {
    public final arwe a;
    public final Optional b;
    public final armf c;
    private final apwt d;

    public kzj(apwt apwtVar, arwe arweVar, Optional optional, armf armfVar) {
        apwtVar.getClass();
        arweVar.getClass();
        armfVar.getClass();
        this.d = apwtVar;
        this.a = arweVar;
        this.b = optional;
        this.c = armfVar;
    }

    @Override // defpackage.kzg
    public final kze a() {
        return new kzk(this, 1);
    }

    @Override // defpackage.kzg
    public final /* synthetic */ kzf b() {
        return new kzn(null);
    }

    @Override // defpackage.kzg
    public final apwt c() {
        return this.d;
    }

    @Override // defpackage.kzg
    public final String d() {
        return "GROUP_UPGRADE_KEY";
    }

    @Override // defpackage.kzg
    public final akgh e(kyf kyfVar) {
        return new kzi(this, kyfVar);
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

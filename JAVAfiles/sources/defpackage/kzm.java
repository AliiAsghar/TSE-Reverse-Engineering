package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kzm implements kzg {
    public final Context a;
    public final armf b;
    private final apwt c;
    private final armf d;
    private final apwt e;

    public kzm(Context context, apwt apwtVar, armf armfVar, armf armfVar2, apwt apwtVar2) {
        context.getClass();
        apwtVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        apwtVar2.getClass();
        this.a = context;
        this.c = apwtVar;
        this.b = armfVar;
        this.d = armfVar2;
        this.e = apwtVar2;
    }

    @Override // defpackage.kzg
    public final kze a() {
        return new kzk(this, 0);
    }

    @Override // defpackage.kzg
    public final /* synthetic */ kzf b() {
        return new kzn(null);
    }

    @Override // defpackage.kzg
    public final apwt c() {
        if (((pfn) this.d.b()).a()) {
            return this.e;
        }
        return this.c;
    }

    @Override // defpackage.kzg
    public final String d() {
        return "RCS_AVAILABILITY_DATA_SOURCE_KEY";
    }

    @Override // defpackage.kzg
    public final akgh e(kyf kyfVar) {
        return new kzl(this, kyfVar);
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

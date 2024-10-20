package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vjl extends unp {
    public static final alwo a = alwo.o("BugleNotifications");
    public final Context b;
    public final via c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final uhj h;
    public final xnv i;
    public final viq j;
    public final agnq k;
    public final armf l;
    public final qik m;
    private final anen n;

    public vjl(anen anenVar, Context context, via viaVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, uhj uhjVar, qik qikVar, xnv xnvVar, viq viqVar, agnq agnqVar, armf armfVar5) {
        this.n = anenVar;
        this.b = context;
        this.c = viaVar;
        this.d = armfVar;
        this.e = armfVar2;
        this.f = armfVar3;
        this.g = armfVar4;
        this.h = uhjVar;
        this.m = qikVar;
        this.i = xnvVar;
        this.j = viqVar;
        this.k = agnqVar;
        this.l = armfVar5;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.c = amdy.MARK_AS_NOTIFIED_ACTION;
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("MarkAsNotifiedHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        return aktp.ai(new ulo(this, (vjm) apbtVar, 17), this.n);
    }

    @Override // defpackage.unx
    public final apca e() {
        return vjm.a.getParserForType();
    }
}

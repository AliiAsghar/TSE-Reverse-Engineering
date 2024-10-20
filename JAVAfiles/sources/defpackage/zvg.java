package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zvg implements ieb {
    public final Context a;
    public final armf b;
    public final armf c;
    private final arpi d;
    private final arwe e;
    private final zmn f;

    public zvg(Context context, arpi arpiVar, arwe arweVar, armf armfVar, armf armfVar2, zmn zmnVar) {
        context.getClass();
        arpiVar.getClass();
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.a = context;
        this.d = arpiVar;
        this.e = arweVar;
        this.b = armfVar;
        this.c = armfVar2;
        this.f = zmnVar;
    }

    @Override // defpackage.ieb
    public final ascv a() {
        zmn zmnVar = this.f;
        return akec.a(armd.n(new jdn(zmnVar.a, zmnVar.b, new igb(zmnVar, (arpe) null, 20), 17, null), this.d), this.e, new zty(this, 2, (char[]) null));
    }

    @Override // defpackage.ieb
    public final boolean b() {
        utz utzVar = zvi.a;
        Object e = ((utz) zvi.c.get()).e();
        e.getClass();
        return ((Boolean) e).booleanValue();
    }
}

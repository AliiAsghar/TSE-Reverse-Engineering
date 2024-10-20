package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjx implements ieb {
    public final Context a;
    public final lkd b;
    public final kkg c;
    private final arwe d;
    private final armf e;
    private final Boolean f;

    public kjx(Context context, arwe arweVar, kkg kkgVar, lkd lkdVar, armf armfVar) {
        context.getClass();
        arweVar.getClass();
        kkgVar.getClass();
        lkdVar.getClass();
        armfVar.getClass();
        this.a = context;
        this.d = arweVar;
        this.c = kkgVar;
        this.b = lkdVar;
        this.e = armfVar;
        this.f = (Boolean) armfVar.b();
    }

    @Override // defpackage.ieb
    public final ascv a() {
        return akec.a(new asaa(new lfn(this.c, (arpe) null, 1)), this.d, new zty((Object) this, 1, (byte[]) null));
    }

    @Override // defpackage.ieb
    public final /* synthetic */ boolean b() {
        return this.f.booleanValue();
    }

    public final void c() {
        qjh.l(this.d, null, new kbl(this, (arpe) null, 11), 3);
    }
}

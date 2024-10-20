package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class adzi implements adzj {
    private static final aozb b = aozb.z("hades-persephone");
    public final ahmn a;
    private final arml c;

    public adzi(Context context) {
        context.getClass();
        anrj.a();
        this.a = new ahmn(anto.a.c(), null);
        this.c = armd.a(new zwj(context, this, 19, null));
    }

    @Override // defpackage.adzj
    public final annb a() {
        return c().c();
    }

    @Override // defpackage.adzj
    public final byte[] b(aozb aozbVar, aozb aozbVar2) {
        byte[] H;
        anmu anmuVar = (anmu) c().h(anue.e, anmu.class);
        byte[] H2 = aozbVar.H();
        if (aozbVar2 == null || (H = aozbVar2.H()) == null) {
            H = b.H();
        }
        byte[] a = anmuVar.a(H2, H);
        a.getClass();
        return a;
    }

    protected final annb c() {
        Object a = this.c.a();
        a.getClass();
        return (annb) a;
    }

    public adzi() {
        anrj.a();
        this.a = new ahmn(anto.a.c(), null);
    }
}

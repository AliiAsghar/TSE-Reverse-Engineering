package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jug {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/cameragallery/CameraGalleryInputUiAdapter");
    public final Context b;
    public final arwe c;
    public final asai d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final asgm l;
    public final jxv m;
    private final armf n;
    private final arml o;
    private final arml p;

    public jug(Context context, arwe arweVar, asai asaiVar, @nwv armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, jxv jxvVar, armf armfVar7, armf armfVar8, armf armfVar9) {
        context.getClass();
        arweVar.getClass();
        asaiVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        jxvVar.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        armfVar9.getClass();
        this.b = context;
        this.c = arweVar;
        this.d = asaiVar;
        this.e = armfVar;
        this.f = armfVar3;
        this.n = armfVar4;
        this.g = armfVar5;
        this.h = armfVar6;
        this.m = jxvVar;
        this.i = armfVar7;
        this.j = armfVar8;
        this.k = armfVar9;
        this.l = new asgm();
        this.o = armd.a(new jkq(armfVar2, this, 3, null));
        this.p = armd.a(new juf(this, 0));
    }

    public final juh a() {
        return (juh) this.o.a();
    }

    public final ascv b() {
        return (ascv) this.p.a();
    }

    public final void c(arqr arqrVar) {
        qjh.l(this.c, null, new jvy(this, arqrVar, (arpe) null, 1), 3);
    }

    public final void d() {
        juh a2 = a();
        if (a2 != null) {
            ((ksi) this.f.b()).a();
            a2.a();
            alvw d = a.d();
            d.X(alwp.a, "BugleComposeRow2");
            ((alvg) d.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/cameragallery/CameraGalleryInputUiAdapter", "onLongPress", 150, "CameraGalleryInputUiAdapter.kt")).q("Camera gallery button long press invoked.");
        }
    }

    public final void e() {
        if (((ojt) this.n.b()).a()) {
            qjh.l(this.c, null, new jpc(this, (arpe) null, 12), 3);
        }
    }
}

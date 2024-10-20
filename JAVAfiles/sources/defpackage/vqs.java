package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vqs {
    static {
        alhr alhrVar = vqu.a;
    }

    public static amxb a() {
        aozy createBuilder = amxb.a.createBuilder();
        aozy createBuilder2 = amxc.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        amxc amxcVar = (amxc) apagVar;
        amxcVar.b |= 1;
        amxcVar.c = -1;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        amxc amxcVar2 = (amxc) createBuilder2.b;
        amxcVar2.d = 2;
        amxcVar2.b |= 4;
        amxc amxcVar3 = (amxc) createBuilder2.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amxb amxbVar = (amxb) createBuilder.b;
        amxcVar3.getClass();
        amxbVar.c = amxcVar3;
        amxbVar.b |= 1;
        return (amxb) createBuilder.s();
    }

    public static vqh b(boolean z, Uri uri) {
        int i;
        if (true != z) {
            i = 3;
        } else {
            i = 1;
        }
        vqg a = vqh.a(i, 0);
        a.c = uri;
        a.b(1);
        return a.a();
    }
}

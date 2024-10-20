package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdi implements jcu {
    public final asai a;
    public final arqr b;
    public final lkd c;
    public final mgu d;
    private final Context e;
    private final asai f;
    private final asai g;
    private final arwe h;
    private final Optional i;
    private final armf j;
    private final armf k;
    private final Set l;

    /* JADX WARN: Multi-variable type inference failed */
    public jdi(Context context, asai asaiVar, asai asaiVar2, arwe arweVar, lkd lkdVar, mgu mguVar, Optional optional, armf armfVar, armf armfVar2) {
        aghw aghwVar;
        asai qjrVar;
        context.getClass();
        asaiVar.getClass();
        asaiVar2.getClass();
        arweVar.getClass();
        lkdVar.getClass();
        mguVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.e = context;
        this.f = asaiVar;
        this.g = asaiVar2;
        this.h = arweVar;
        this.c = lkdVar;
        this.d = mguVar;
        this.i = optional;
        this.j = armfVar;
        this.k = armfVar2;
        zxy zxyVar = (zxy) arsd.k(optional);
        if (zxyVar != null) {
            aghwVar = zxyVar.c;
        } else {
            aghwVar = new aghw(null, 9);
        }
        if (((odl) armfVar.b()).a()) {
            qjrVar = ((wpm) armfVar2.b()).b;
        } else {
            qjrVar = new qjr(ipf.i);
        }
        this.a = arrn.Q(asaiVar, asaiVar2, aghwVar, qjrVar, new jdh(this, null));
        this.b = qkf.f(new ghu((Object) this, 4, (int[]) null), arweVar);
        this.l = aqjn.e(khe.a);
    }

    @Override // defpackage.jcu
    public final Set a() {
        return this.l;
    }

    @Override // defpackage.jcu
    public final asai b() {
        return this.a;
    }

    public final aehz c(alog alogVar, boolean z, boolean z2) {
        String string = this.e.getString(R.string.call_action);
        string.getClass();
        return new aehz(string, aerb.M, false, false, z, z2, null, null, new gqx(this, alogVar, 19, null), 972);
    }
}

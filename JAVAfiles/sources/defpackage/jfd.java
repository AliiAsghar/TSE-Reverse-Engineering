package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfd implements jcu {
    public final Context a;
    public final Optional b;
    public final lkd c;
    private final armf d;
    private final asai e;
    private final Set f;

    public jfd(Context context, khb khbVar, lkd lkdVar, armf armfVar, Optional optional, lre lreVar) {
        Object aghwVar;
        context.getClass();
        khbVar.getClass();
        lkdVar.getClass();
        armfVar.getClass();
        lreVar.getClass();
        this.a = context;
        this.c = lkdVar;
        this.d = armfVar;
        this.b = optional;
        asai a = khbVar.a();
        if (((Optional) ((apxx) armfVar).a).isPresent()) {
            aghwVar = ((jev) ((Optional) ((apxx) armfVar).a).get()).a();
        } else {
            aghwVar = new aghw(false, 9);
        }
        this.e = new jdn(a, aghwVar, new jdu(this, (arpe) null, 3), 17, null);
        this.f = aqil.r(new khe[]{khe.b, khe.c});
    }

    @Override // defpackage.jcu
    public final Set a() {
        return this.f;
    }

    @Override // defpackage.jcu
    public final asai b() {
        return this.e;
    }
}

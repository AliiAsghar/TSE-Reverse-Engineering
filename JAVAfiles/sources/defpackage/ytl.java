package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ytl implements ytk {
    public static final xze g = xze.g("Bugle", "VerifiedSmsEnabledCheckerImpl");
    public final xnv h;
    public final mbl i;
    private final ykw j;
    private final Context k;
    private final Optional l;
    private final yul m;

    public ytl(ykw ykwVar, Context context, Optional optional, yul yulVar, xnv xnvVar, mbl mblVar) {
        this.j = ykwVar;
        this.k = context;
        this.l = optional;
        this.m = yulVar;
        this.h = xnvVar;
        this.i = mblVar;
    }

    @Override // defpackage.ytk
    public final akul a(String str) {
        return this.m.f(str).h(new yez(this, 13), andi.a);
    }

    @Override // defpackage.ytk
    public final akul b() {
        return this.m.e().h(new yeb(20), andi.a);
    }

    @Override // defpackage.ytk
    public final boolean c() {
        if (d() && e()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ytk
    public final boolean d() {
        if (((Boolean) utw.S.e()).booleanValue() && this.j.q(this.k.getResources().getString(R.string.vsms_enabled_pref_key), this.k.getResources().getBoolean(R.bool.vsms_enabled_pref_default))) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ytk
    public final boolean e() {
        if (this.l.isPresent()) {
            g.o("VSMS is not supported on wearable devices.");
            return false;
        }
        if (yhx.g(this.k)) {
            g.o("VSMS is not supported for secondary users.");
            return false;
        }
        if (!((Boolean) utw.S.e()).booleanValue()) {
            g.o("VSMS is disabled via Phenotype flag.");
            return false;
        }
        return true;
    }
}

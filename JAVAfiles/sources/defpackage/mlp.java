package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mlp implements mnk {
    final /* synthetic */ vst a;

    public mlp(vst vstVar) {
        this.a = vstVar;
    }

    @Override // defpackage.mnk
    public final Instant a() {
        apct apctVar = this.a.d;
        if (apctVar == null) {
            apctVar = apct.a;
        }
        return aotl.l(apctVar);
    }

    @Override // defpackage.mnk
    public final Integer b() {
        vst vstVar = this.a;
        if ((vstVar.b & 1) != 0) {
            return Integer.valueOf(vstVar.c);
        }
        return null;
    }
}

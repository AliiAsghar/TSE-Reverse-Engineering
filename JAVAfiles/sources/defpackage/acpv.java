package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acpv implements acpp {
    public final ahtp a;

    public acpv(ahtp ahtpVar) {
        this.a = ahtpVar;
    }

    @Override // defpackage.acpp
    public final Object a() {
        acpw.x.ifPresent(new acsa(this, 1));
        return this.a.b();
    }

    @Override // defpackage.acpp
    public final String b() {
        return this.a.d();
    }

    public final String toString() {
        return String.format(Locale.US, "%s=%s", b(), a());
    }
}

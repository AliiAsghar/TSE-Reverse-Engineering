package defpackage;

import android.content.Context;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acza implements acyz {
    public final ahtp a;

    /* JADX INFO: Access modifiers changed from: protected */
    public acza(ahtp ahtpVar) {
        this.a = ahtpVar;
    }

    @Override // defpackage.acyz
    public final Object a() {
        aczc.c.ifPresent(new acsa(this, 9));
        try {
            return this.a.b();
        } catch (IllegalStateException | NullPointerException unused) {
            ahtp.f((Context) ((aczb) acrk.a(aczb.class)).y().a);
            return this.a.b();
        }
    }

    @Override // defpackage.acyz
    public final String b() {
        return this.a.d();
    }

    public final String toString() {
        return String.format(Locale.US, "%s: %s", b(), a());
    }
}

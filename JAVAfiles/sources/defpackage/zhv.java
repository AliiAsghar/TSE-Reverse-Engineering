package defpackage;

import androidx.preference.PreferenceScreen;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zhv implements akgh<Boolean> {
    final /* synthetic */ zhw a;

    public zhv(zhw zhwVar) {
        this.a = zhwVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        zhw.a.r("Error retrieving vsms eligibility", th);
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Boolean bool = (Boolean) obj;
        xyo c = zhw.a.c();
        c.z("vsms setting eligible", bool);
        c.q();
        ((PreferenceScreen) this.a.ab.get()).N(bool.booleanValue());
    }

    @Override // defpackage.akgh
    public final void b() {
    }
}

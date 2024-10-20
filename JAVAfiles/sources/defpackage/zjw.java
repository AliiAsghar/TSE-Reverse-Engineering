package defpackage;

import androidx.preference.Preference;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zjw implements akgh<zjt> {
    final /* synthetic */ Preference a;
    final /* synthetic */ zjx b;

    public zjw(zjx zjxVar, Preference preference) {
        this.a = preference;
        this.b = zjxVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        if (((Boolean) this.b.af.b()).booleanValue()) {
            ((alwl) ((alwl) ((alwl) zjx.d.i()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/PerSubscriptionSettingsFragmentPeer$5", "onError", (char) 1566, "PerSubscriptionSettingsFragmentPeer.java")).q("Error fetching profile discovery eligibility.");
            zjx zjxVar = this.b;
            zjxVar.ah.d().af(this.a);
        }
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.b.ah.d().af(this.a);
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void b() {
    }
}

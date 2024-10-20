package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import androidx.preference.Preference;
import j$.util.Optional;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class zhs implements akgh<zhk> {
    final /* synthetic */ Preference a;
    final /* synthetic */ zhw b;

    public zhs(zhw zhwVar, Preference preference) {
        this.a = preference;
        this.b = zhwVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        this.b.f.d().af(this.a);
        ((alwl) ((alwl) ((alwl) zhw.c.i()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/ApplicationSettingsFragmentPeer$1", "onError", (char) 601, "ApplicationSettingsFragmentPeer.java")).q("Error loading profile setting");
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        final zhk zhkVar = (zhk) obj;
        zhw zhwVar = this.b;
        if (((Boolean) zhwVar.N.b()).booleanValue() && !((Optional) ((apxx) zhwVar.K).a).isEmpty()) {
            if (zhkVar.c == null) {
                ((alwl) ((alwl) zhw.c.g()).h("com/google/android/apps/messaging/ui/appsettings/ApplicationSettingsFragmentPeer", "shouldShowProfileSetting", 613, "ApplicationSettingsFragmentPeer.java")).q("Not showing profile setting, no phone number");
            } else if (zhkVar.b == null) {
                ((alwl) ((alwl) zhw.c.g()).h("com/google/android/apps/messaging/ui/appsettings/ApplicationSettingsFragmentPeer", "shouldShowProfileSetting", 618, "ApplicationSettingsFragmentPeer.java")).q("Not showing profile setting, missing android account");
            } else {
                alwl alwlVar = (alwl) zhw.c.g();
                alwlVar.X(new alvz("profile_setting_eligibility", lrx.class, false, false), zhkVar.a);
                ((alwl) alwlVar.h("com/google/android/apps/messaging/ui/appsettings/ApplicationSettingsFragmentPeer", "shouldShowProfileSetting", 627, "ApplicationSettingsFragmentPeer.java")).q("Should show profile setting");
                lrx lrxVar = zhkVar.a;
                if (lrxVar == lrx.b || lrxVar == lrx.a) {
                    this.a.G(true);
                    this.a.N(true);
                    final Preference preference = this.a;
                    preference.o = new gfb() { // from class: zhr
                        @Override // defpackage.gfb
                        public final boolean a(Preference preference2) {
                            ((alwl) ((alwl) zhw.c.g()).h("com/google/android/apps/messaging/ui/appsettings/ApplicationSettingsFragmentPeer$1", "onNewData", 573, "ApplicationSettingsFragmentPeer.java")).q("Opening profile settings page");
                            zhs zhsVar = zhs.this;
                            boolean a = ((opu) zhsVar.b.L.b()).a();
                            zhk zhkVar2 = zhkVar;
                            if (a && zhkVar2.a == lrx.b) {
                                Preference preference3 = preference;
                                zhw zhwVar2 = zhsVar.b;
                                rw rwVar = zhwVar2.ao;
                                Account account = zhkVar2.b;
                                Context y = zhwVar2.f.y();
                                account.getClass();
                                String str = zhkVar2.c;
                                str.getClass();
                                Intent intent = new Intent();
                                intent.setClassName(y, "com.google.android.libraries.user.profile.limited.view.LimitedProfileBottomSheetActivity");
                                intent.putExtra("com.google.profile.limited.PHONE_NUMBER", str);
                                intent.putExtra("com.google.profile.limited.ACCOUNT", account);
                                intent.putExtra("com.google.profile.limited.MODE", "DISCOVERABILITY_AND_CONSTELLATION");
                                rwVar.c(intent);
                                preference3.G(false);
                                return true;
                            }
                            lsb lsbVar = (lsb) ((Optional) ((apxx) zhsVar.b.K).a).get();
                            zhw zhwVar3 = zhsVar.b;
                            Account account2 = zhkVar2.b;
                            zhwVar3.f.F();
                            account2.getClass();
                            String str2 = zhkVar2.c;
                            String str3 = account2.name;
                            str2.getClass();
                            lsbVar.a();
                            return true;
                        }
                    };
                    return;
                }
            }
        } else {
            ((alwl) ((alwl) zhw.c.g()).h("com/google/android/apps/messaging/ui/appsettings/ApplicationSettingsFragmentPeer", "shouldShowProfileSetting", 608, "ApplicationSettingsFragmentPeer.java")).q("Not showing profile setting, flag off or no settings entry");
        }
        zhw zhwVar2 = this.b;
        zhwVar2.f.d().af(this.a);
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void b() {
    }
}

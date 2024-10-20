package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.ApplicationSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.RichCardsSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.SimSelectionSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.SmartsSettingsActivity;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zlb implements ajyk {
    final /* synthetic */ Object a;
    private final armf b;
    private final /* synthetic */ int c;

    public zlb(Object obj, armf armfVar, int i) {
        this.c = i;
        this.a = obj;
        this.b = armfVar;
    }

    @Override // defpackage.ajyk
    public final void b(ajxt ajxtVar) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ((kpw) this.b.b()).a(ajxtVar);
                        return;
                    } else {
                        ((kpw) this.b.b()).a(ajxtVar);
                        return;
                    }
                }
                ((kpw) this.b.b()).a(ajxtVar);
                return;
            }
            ((kpw) this.b.b()).a(ajxtVar);
            return;
        }
        ((kpw) this.b.b()).a(ajxtVar);
    }

    @Override // defpackage.ajyk
    public final void d(agxw agxwVar) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ajwt n = agxwVar.n();
                        zhf zhfVar = new zhf();
                        apxh.e(zhfVar);
                        aklw.b(zhfVar, n);
                        bd bdVar = new bd(((SmartsSettingsActivity) ((zme) this.a).a).a());
                        bdVar.z(R.id.fragment_container, zhfVar);
                        bdVar.b();
                        return;
                    }
                    bd bdVar2 = new bd(((SimSelectionSettingsActivity) ((zlz) this.a).b).a());
                    if (((xvv) ((zlz) this.a).c).b()) {
                        ajwt n2 = agxwVar.n();
                        zic zicVar = new zic();
                        apxh.e(zicVar);
                        aklw.b(zicVar, n2);
                        bdVar2.v(R.id.fragment_container, zicVar, "ChatIdentitySettingsSelectionFragmentPeer");
                        bdVar2.b();
                        return;
                    }
                    ajwt n3 = agxwVar.n();
                    zmb zmbVar = new zmb();
                    apxh.e(zmbVar);
                    aklw.b(zmbVar, n3);
                    bdVar2.v(R.id.fragment_container, zmbVar, "SimSelectionSettingsFragmentPeer");
                    bdVar2.b();
                    return;
                }
                if (((zlg) this.a).c.a() <= 1) {
                    Object obj = this.a;
                    ajwt n4 = agxwVar.n();
                    zlg zlgVar = (zlg) obj;
                    zlgVar.b.O(zlgVar.a, n4);
                } else {
                    Object obj2 = this.a;
                    ajwt n5 = agxwVar.n();
                    zlg zlgVar2 = (zlg) obj2;
                    zlgVar2.b.J(zlgVar2.a, n5);
                }
                ((zlg) this.a).a.finish();
                return;
            }
            bd bdVar3 = new bd(((ApplicationSettingsActivity) ((zhi) this.a).b).a());
            cg e = ((ApplicationSettingsActivity) ((zhi) this.a).b).a().e("ApplicationSettingsFragmentPeer");
            if (e != null) {
                bdVar3.n(e);
            }
            ajwt n6 = agxwVar.n();
            zho zhoVar = new zho();
            apxh.e(zhoVar);
            aklw.b(zhoVar, n6);
            bdVar3.v(R.id.fragment_container, zhoVar, "ApplicationSettingsFragmentPeer");
            bdVar3.b();
            return;
        }
        bd bdVar4 = new bd(((RichCardsSettingsActivity) ((zlc) this.a).d).a());
        ajwt n7 = agxwVar.n();
        zld zldVar = new zld();
        apxh.e(zldVar);
        aklw.b(zldVar, n7);
        bdVar4.z(R.id.rich_cards_preference_fragment_container, zldVar);
        bdVar4.b();
    }

    @Override // defpackage.ajyk
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.ajyk
    public final /* synthetic */ void c() {
    }
}

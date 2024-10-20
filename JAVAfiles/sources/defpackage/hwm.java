package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.receiver.DefaultSmsPackageChangedReceiver;
import com.google.android.ims.rcs.engine.impl.RcsEngineProxyImpl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwm implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public hwm(Object obj, boolean z, int i) {
        this.c = i;
        this.a = z;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [hvt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        whk whkVar;
        String defaultSharedPreferencesName;
        int i = 0;
        switch (this.c) {
            case 0:
                hyv.i();
                boolean z = this.a;
                akju akjuVar = ((hwn) this.b).a;
                boolean z2 = akjuVar.a;
                akjuVar.a = z;
                if (z2 != z) {
                    akjuVar.b.a(z);
                    return;
                }
                return;
            case 1:
                int i2 = eul.a;
                fad fadVar = ((faa) ((fdx) this.b).b).a;
                boolean z3 = fadVar.w;
                boolean z4 = this.a;
                if (z3 == z4) {
                    return;
                }
                fadVar.w = z4;
                fadVar.f.f(23, new ezy(z4, i));
                return;
            case 2:
                rae raeVar = (rae) this.b;
                ((ykw) raeVar.d).g(((Resources) raeVar.c).getString(R.string.link_preview_enabled_pref_key), this.a);
                return;
            case 3:
                rae raeVar2 = (rae) this.b;
                ((ykw) raeVar2.d).g(((Resources) raeVar2.c).getString(R.string.rich_cards_settings_enable_all_pref_key), this.a);
                return;
            case 4:
                rae raeVar3 = (rae) this.b;
                ((ykw) raeVar3.d).g(((Resources) raeVar3.c).getString(R.string.link_preview_wifi_only_pref_key), this.a);
                return;
            case 5:
                ueg uegVar = (ueg) uci.u().peekLast();
                uegVar.getClass();
                if (uegVar.e()) {
                    alvw i3 = uci.b.i();
                    i3.X(alwp.a, "BugleDatabase");
                    alwl alwlVar = (alwl) i3;
                    alwlVar.Z(alwk.MEDIUM);
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl", "setTransactionSuccessful", 866, "DatabaseInterfaceImpl.java")).q("setTransactionSuccessful called twice.");
                }
                boolean z5 = this.a;
                uegVar.g();
                uegVar.c(z5);
                if (z5 && (uegVar instanceof uei)) {
                    ((uci) this.b).k().setTransactionSuccessful();
                    return;
                }
                return;
            case 6:
                mho mhoVar = (mho) ((DefaultSmsPackageChangedReceiver) this.b).m.b();
                boolean z6 = this.a;
                mhoVar.w(!z6, z6);
                return;
            case 7:
                boolean z7 = this.a;
                Object obj = this.b;
                if (z7) {
                    aabp aabpVar = (aabp) obj;
                    aabpVar.B(false);
                    aabpVar.b.S();
                    aabe aabeVar = aabpVar.c;
                    aabeVar.l.x(48);
                    aabeVar.k = false;
                    aabpVar.m(false);
                    if (aabpVar.c.e == 1) {
                        aabpVar.b.I(aabpVar.j.b);
                    }
                }
                ixd ixdVar = (ixd) ((aabp) obj).a;
                View view = ixdVar.bR;
                if (view != null) {
                    view.setPadding(ixdVar.A.getSystemWindowInsetLeft(), 0, ixdVar.A.getStableInsetRight(), ixdVar.A.getSystemWindowInsetBottom());
                }
                ixdVar.as();
                return;
            case 8:
                Object obj2 = this.b;
                if (aczv.J()) {
                    aaxz aaxzVar = (aaxz) obj2;
                    whk b = whk.b(((adnk) aaxzVar.k.b()).e().h);
                    if (b == null) {
                        b = whk.UNRECOGNIZED;
                    }
                    aaxzVar.n(b);
                } else {
                    ((aaxz) obj2).n(whk.LEGAL_FYI_SEEN);
                }
                boolean z8 = this.a;
                xyo c = aaxz.c.c();
                c.H("RCS Default On, enableMoSmsNumberDiscovery:");
                c.I(z8);
                c.q();
                return;
            case 9:
                aaxz aaxzVar2 = (aaxz) this.b;
                aaxzVar2.m(wfo.GOOGLE_TOS_CONSENTED);
                xyo c2 = aaxz.c.c();
                c2.H("enableMoSmsNumberDiscovery:");
                c2.I(this.a);
                c2.q();
                ((adnk) aaxzVar2.k.b()).G();
                return;
            case 10:
                aozy createBuilder = whm.a.createBuilder();
                if (this.a) {
                    whkVar = whk.OOB_CONSENT;
                } else {
                    whkVar = whk.NO_OOB_CONSENT;
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj3 = this.b;
                ((whm) createBuilder.b).h = whkVar.a();
                ((adka) obj3).g.c((whm) createBuilder.s());
                return;
            case 11:
                ((RcsEngineProxyImpl) this.b).m243xb8e9e9c3(this.a);
                return;
            case 12:
                ((adrc) this.b).aX(this.a);
                return;
            case 13:
                boolean z9 = this.a;
                Object obj4 = this.b;
                if (!z9) {
                    ahap ahapVar = (ahap) obj4;
                    Context context = ahapVar.a;
                    Context a = ahbn.a(context);
                    defaultSharedPreferencesName = PreferenceManager.getDefaultSharedPreferencesName(context);
                    a.moveSharedPreferencesFrom(context, defaultSharedPreferencesName);
                    PreferenceManager.getDefaultSharedPreferences(a).edit().putBoolean("has_migrated_to_de_storage", true).apply();
                    SharedPreferences c3 = ahapVar.c(PreferenceManager.getDefaultSharedPreferences(a), true);
                    ahjj ahjjVar = ahapVar.d;
                    if (ahjjVar != null) {
                        ahan ahanVar = (ahan) ahjjVar.a;
                        ahanVar.l(ahanVar.g.get(), c3);
                    }
                }
                ahap ahapVar2 = (ahap) obj4;
                ahapVar2.b = true;
                ahapVar2.d();
                return;
            default:
                if (this.a) {
                    arbn arbnVar = ((arbk) this.b).a;
                    arbnVar.o = true;
                    if (arbnVar.l > 0) {
                        alhp alhpVar = arbnVar.n;
                        alhpVar.d();
                        alhpVar.e();
                    }
                }
                ((arbk) this.b).a.q = false;
                return;
        }
    }

    public /* synthetic */ hwm(Object obj, boolean z, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = z;
    }
}

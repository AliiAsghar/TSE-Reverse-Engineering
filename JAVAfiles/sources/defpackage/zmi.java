package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zmi implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ zmi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, arqr] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.b) {
            case 0:
                ((Preference) obj).H(((zmj) this.a).a(R.drawable.quantum_gm_ic_calendar_add_on_gm_grey_24));
                return;
            case 1:
                ((PreferenceScreen) obj).H(((zmj) this.a).a(R.drawable.quantum_gm_ic_calendar_add_on_gm_grey_24));
                return;
            case 2:
                akfb a = ((aaez) obj).a();
                zmj zmjVar = (zmj) this.a;
                zmjVar.m.C(a, zmjVar.k);
                return;
            case 3:
                Object obj2 = this.a;
                zmj zmjVar2 = (zmj) obj2;
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj;
                switchPreferenceCompat.L(((jbx) zmjVar2.f.get()).c());
                zmjVar2.c(switchPreferenceCompat, ((TwoStatePreference) switchPreferenceCompat).a);
                switchPreferenceCompat.n = new akvd(zmjVar2.e, "SmartsSettingsFragmentPeer:togglePantherEnabled", new zkr(obj2, switchPreferenceCompat, 2, null));
                return;
            case 4:
                PreferenceScreen preferenceScreen = (PreferenceScreen) obj;
                preferenceScreen.t = ((zmj) this.a).b.e(preferenceScreen.j);
                return;
            case 5:
                akfb a2 = ((jbr) obj).a();
                final zmj zmjVar3 = (zmj) this.a;
                zmjVar3.m.C(a2, new akgh<lqi>() { // from class: zmj.3
                    public AnonymousClass3() {
                    }

                    @Override // defpackage.akgh
                    public final void a(Throwable th) {
                        zmj zmjVar4 = zmj.this;
                        Optional b = zmjVar4.b(R.string.mc_enabled_pref_key);
                        PreferenceScreen d = zmjVar4.a.d();
                        d.getClass();
                        int i = 10;
                        b.ifPresent(new zmi(d, i));
                        zmj zmjVar5 = zmj.this;
                        Optional b2 = zmjVar5.b(R.string.experiment_badge_pref_key);
                        PreferenceScreen d2 = zmjVar5.a.d();
                        d2.getClass();
                        b2.ifPresent(new zmi(d2, i));
                    }

                    @Override // defpackage.akgh
                    public final /* bridge */ /* synthetic */ void c(Object obj3) {
                        zmj zmjVar4 = zmj.this;
                        Optional b = zmjVar4.b(R.string.mc_enabled_pref_key);
                        PreferenceScreen d = zmjVar4.a.d();
                        d.getClass();
                        int i = 10;
                        b.ifPresent(new zmi(d, i));
                        zmj zmjVar5 = zmj.this;
                        Optional b2 = zmjVar5.b(R.string.experiment_badge_pref_key);
                        PreferenceScreen d2 = zmjVar5.a.d();
                        d2.getClass();
                        b2.ifPresent(new zmi(d2, i));
                        zmj.this.d();
                    }

                    @Override // defpackage.akgh
                    public final /* synthetic */ void b() {
                    }
                });
                return;
            case 6:
                zmj zmjVar4 = (zmj) this.a;
                ((PreferenceScreen) obj).t = zmjVar4.b.d(zmjVar4.a.d().j);
                return;
            case 7:
                ((PreferenceGroup) this.a).af((Preference) obj);
                return;
            case 8:
                PreferenceScreen preferenceScreen2 = (PreferenceScreen) obj;
                Context context = preferenceScreen2.j;
                zmj zmjVar5 = (zmj) this.a;
                preferenceScreen2.t = zmjVar5.b.g(context);
                preferenceScreen2.H(zmjVar5.a(R.drawable.gs_auto_awesome_vd_theme_24));
                return;
            case 9:
                ((PreferenceGroup) this.a).af((PreferenceScreen) obj);
                return;
            case 10:
                ((PreferenceGroup) this.a).af((Preference) obj);
                return;
            case 11:
                this.a.a(obj);
                return;
            case 12:
                this.a.a(obj);
                return;
            case 13:
                this.a.a(obj);
                return;
            case 14:
                ((ViewGroup) this.a).removeViewInLayout((View) obj);
                return;
            case 15:
                ((ViewGroup) this.a).removeView((View) obj);
                return;
            case 16:
                ((zxq) obj).k(((zri) this.a).aw);
                return;
            case 17:
                inn innVar = (inn) obj;
                if (innVar.c() != ins.MAGIC_COMPOSE) {
                    zri zriVar = (zri) this.a;
                    if (zriVar.n.length() == 0 && (((Boolean) yig.ao.e()).booleanValue() || !((opm) zriVar.av.b()).a())) {
                        ((Optional) ((apxx) zriVar.as).a).ifPresent(new zrf(4));
                        ((Optional) ((apxx) zriVar.at).a).ifPresent(new zrf(5));
                        aktp.L(jce.a, zriVar.ar);
                        return;
                    }
                    ((Optional) ((apxx) zriVar.as).a).ifPresent(new zrf(7));
                    aktp.L(jbw.a, zriVar.ar);
                    return;
                }
                innVar.r(ins.IME, true, false);
                return;
            case 18:
                ((zxq) obj).b(((zri) this.a).aw);
                return;
            case 19:
                ((ComposeView) ((zri) this.a).x.b()).setVisibility(0);
                ((luf) obj).b();
                return;
            default:
                ((lyv) obj).b();
                ((zri) this.a).V();
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            case 6:
                return Consumer$CC.$default$andThen(this, consumer);
            case 7:
                return Consumer$CC.$default$andThen(this, consumer);
            case 8:
                return Consumer$CC.$default$andThen(this, consumer);
            case 9:
                return Consumer$CC.$default$andThen(this, consumer);
            case 10:
                return Consumer$CC.$default$andThen(this, consumer);
            case 11:
                return Consumer$CC.$default$andThen(this, consumer);
            case 12:
                return Consumer$CC.$default$andThen(this, consumer);
            case 13:
                return Consumer$CC.$default$andThen(this, consumer);
            case 14:
                return Consumer$CC.$default$andThen(this, consumer);
            case 15:
                return Consumer$CC.$default$andThen(this, consumer);
            case 16:
                return Consumer$CC.$default$andThen(this, consumer);
            case 17:
                return Consumer$CC.$default$andThen(this, consumer);
            case 18:
                return Consumer$CC.$default$andThen(this, consumer);
            case 19:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }
}

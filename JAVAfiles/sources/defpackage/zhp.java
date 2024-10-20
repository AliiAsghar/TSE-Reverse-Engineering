package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.messaging.R;
import defpackage.zhw;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zhp implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ zhp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.b) {
            case 0:
                PreferenceScreen preferenceScreen = (PreferenceScreen) obj;
                preferenceScreen.N(true);
                zhw zhwVar = (zhw) this.a;
                preferenceScreen.t = ((lzv) zhwVar.g.b()).r(zhwVar.f.d().j);
                return;
            case 1:
                vjs vjsVar = (vjs) ((zhw) this.a).D.b();
                Intent intent = new Intent("android.settings.APP_NOTIFICATION_BUBBLE_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", ((Context) vjsVar.a).getPackageName());
                intent.putExtra("app_uid", ((Context) vjsVar.a).getApplicationInfo().uid);
                ((PreferenceScreen) obj).t = intent;
                return;
            case 2:
                zhw zhwVar2 = (zhw) this.a;
                ((PreferenceScreen) obj).t = ((lzv) zhwVar2.g.b()).i(zhwVar2.f.d().j);
                return;
            case 3:
                akfb a = ((wol) obj).a();
                zhw zhwVar3 = (zhw) this.a;
                zhwVar3.as.D(a, akgd.FEW_SECONDS, new zhw.c());
                return;
            case 4:
                xze xzeVar = zhw.a;
                ((Preference) this.a).G(false);
                return;
            case 5:
                zhw zhwVar4 = (zhw) this.a;
                ahiy ahiyVar = (ahiy) zhwVar4.z.b();
                ajwt ajwtVar = zhwVar4.d;
                ajwtVar.getClass();
                zhwVar4.as.C(ahiyVar.A(ajwtVar), new zhu(zhwVar4, (Preference) obj));
                return;
            case 6:
                ((zhw) this.a).f.d().af((Preference) obj);
                return;
            case 7:
                xze xzeVar2 = zhw.a;
                this.a.getClass();
                return;
            case 8:
                Object obj2 = this.a;
                zhw zhwVar5 = (zhw) obj2;
                Preference preference = (Preference) obj;
                Context x = zhwVar5.f.x();
                x.getClass();
                if (lga.r(x)) {
                    preference.n = new lqp(obj2, 5);
                    return;
                } else {
                    zhwVar5.f.d().af(preference);
                    return;
                }
            case 9:
                Preference preference2 = (Preference) obj;
                boolean booleanValue = ((Boolean) ((utz) yig.Q.get()).e()).booleanValue();
                Object obj3 = this.a;
                if (booleanValue) {
                    zhw zhwVar6 = (zhw) obj3;
                    if (!zhwVar6.Q.isEmpty()) {
                        preference2.M(zhwVar6.f.S(R.string.gemini_settings_page_title));
                        preference2.t = ((lzv) zhwVar6.g.b()).c(zhwVar6.f.d().j);
                        return;
                    }
                }
                ((zhw) obj3).f.d().af(preference2);
                return;
            case 10:
                PreferenceScreen preferenceScreen2 = (PreferenceScreen) obj;
                boolean booleanValue2 = ((Boolean) ((utz) ibx.a.get()).e()).booleanValue();
                Object obj4 = this.a;
                if (booleanValue2) {
                    zhw zhwVar7 = (zhw) obj4;
                    if (!zhwVar7.C.isEmpty()) {
                        preferenceScreen2.L(((iby) zhwVar7.C.get()).c());
                        preferenceScreen2.t = hwr.k(zhwVar7.f.d().j);
                        return;
                    }
                }
                ((zhw) obj4).f.d().af(preferenceScreen2);
                return;
            case 11:
                ((zhw) this.a).f.d().af((Preference) obj);
                return;
            case 12:
                ((zhw) this.a).f.d().af((SwitchPreferenceCompat) obj);
                return;
            case 13:
                ((zhw) ((isj) this.a).a).f.d().af((SwitchPreferenceCompat) obj);
                return;
            case 14:
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj;
                switchPreferenceCompat.k(((zhd) this.a).b);
                switchPreferenceCompat.G(true);
                switchPreferenceCompat.N(true);
                return;
            case 15:
                ((zhw) ((isj) this.a).a).f.d().af((SwitchPreferenceCompat) obj);
                return;
            case 16:
                SwitchPreferenceCompat switchPreferenceCompat2 = (SwitchPreferenceCompat) obj;
                switchPreferenceCompat2.k(((yfq) this.a).e);
                switchPreferenceCompat2.G(true);
                switchPreferenceCompat2.N(true);
                return;
            case 17:
                SwitchPreferenceCompat switchPreferenceCompat3 = (SwitchPreferenceCompat) obj;
                switchPreferenceCompat3.k(((zxk) this.a).d);
                switchPreferenceCompat3.G(true);
                switchPreferenceCompat3.N(true);
                return;
            case 18:
                TwoStatePreference twoStatePreference = (TwoStatePreference) obj;
                twoStatePreference.G(true);
                twoStatePreference.k(((Boolean) this.a).booleanValue());
                return;
            case 19:
                Preference preference3 = (Preference) obj;
                if (((Boolean) this.a).booleanValue() && zhw.f()) {
                    preference3.J(R.string.notifications_pref_summary);
                    return;
                } else {
                    preference3.n("");
                    return;
                }
            default:
                ((TwoStatePreference) obj).k(!((Boolean) this.a).booleanValue());
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

package defpackage;

import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.messaging.R;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zjo implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ zjo(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.b) {
            case 0:
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj;
                zjp zjpVar = (zjp) this.a;
                switchPreferenceCompat.M(((zjn) zjpVar.a.b()).z().getString(R.string.nudge_enabled_pref_title));
                switchPreferenceCompat.n(((zjn) zjpVar.a.b()).z().getString(R.string.nudge_enabled_pref_summary));
                return;
            case 1:
                ((PreferenceGroup) this.a).af((SwitchPreferenceCompat) obj);
                return;
            case 2:
                ((SwitchPreferenceCompat) obj).n = new lqp(this.a, 9);
                return;
            case 3:
                ((SwitchPreferenceCompat) obj).n = new lqp(this.a, 10);
                return;
            case 4:
                SwitchPreferenceCompat switchPreferenceCompat2 = (SwitchPreferenceCompat) obj;
                switchPreferenceCompat2.k(((yiy) this.a).b);
                switchPreferenceCompat2.G(true);
                return;
            case 5:
                SwitchPreferenceCompat switchPreferenceCompat3 = (SwitchPreferenceCompat) obj;
                switchPreferenceCompat3.k(((yiy) this.a).d);
                switchPreferenceCompat3.G(true);
                return;
            case 6:
                SwitchPreferenceCompat switchPreferenceCompat4 = (SwitchPreferenceCompat) obj;
                switchPreferenceCompat4.k(!((Boolean) this.a).booleanValue());
                switchPreferenceCompat4.G(true);
                return;
            case 7:
                SwitchPreferenceCompat switchPreferenceCompat5 = (SwitchPreferenceCompat) obj;
                switchPreferenceCompat5.G(false);
                switchPreferenceCompat5.k(((Boolean) this.a).booleanValue());
                return;
            case 8:
                SwitchPreferenceCompat switchPreferenceCompat6 = (SwitchPreferenceCompat) obj;
                switchPreferenceCompat6.k(!((Boolean) this.a).booleanValue());
                switchPreferenceCompat6.G(true);
                return;
            case 9:
                SwitchPreferenceCompat switchPreferenceCompat7 = (SwitchPreferenceCompat) obj;
                switchPreferenceCompat7.G(false);
                switchPreferenceCompat7.k(((Boolean) this.a).booleanValue());
                return;
            case 10:
                ((TwoStatePreference) obj).n = new zkp(this.a, 4);
                return;
            case 11:
                ((TwoStatePreference) obj).n = new zkp(this.a, 3);
                return;
            case 12:
                ((TwoStatePreference) obj).n = new zkp(this.a, 2);
                return;
            case 13:
                ((TwoStatePreference) obj).k(((lef) this.a).c);
                return;
            case 14:
                ((TwoStatePreference) obj).k(((lef) this.a).a);
                return;
            case 15:
                ((TwoStatePreference) obj).k(((lef) this.a).b);
                return;
            case 16:
                ((TwoStatePreference) obj).k(!((Boolean) this.a).booleanValue());
                return;
            case 17:
                ((TwoStatePreference) obj).k(!((Boolean) this.a).booleanValue());
                return;
            case 18:
                ((TwoStatePreference) obj).k(!((Boolean) this.a).booleanValue());
                return;
            case 19:
                Preference preference = (Preference) obj;
                preference.H(((zmh) this.a).a(R.drawable.quantum_gm_ic_chat_vd_theme_24));
                preference.J(R.string.smart_reply_preference_summary);
                return;
            default:
                Preference preference2 = (Preference) obj;
                preference2.H(((zmh) this.a).a(R.drawable.quantum_gm_ic_sticker_vd_theme_24));
                preference2.I(7);
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

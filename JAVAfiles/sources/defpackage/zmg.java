package defpackage;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.SuggestionExamplePreference;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zmg implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ zmg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.b) {
            case 0:
                ((PreferenceScreen) obj).H(((zmh) this.a).a(R.drawable.quantum_gm_ic_calendar_add_on_gm_grey_24));
                return;
            case 1:
                ((PreferenceScreen) obj).H(((zmh) this.a).a(R.drawable.quantum_ic_alarm_vd_theme_24));
                return;
            case 2:
                ((Preference) obj).H(((zmh) this.a).a(R.drawable.quantum_gm_ic_calendar_add_on_gm_grey_24));
                return;
            case 3:
                PreferenceScreen preferenceScreen = (PreferenceScreen) obj;
                preferenceScreen.t = ((zmh) this.a).c.e(preferenceScreen.j);
                return;
            case 4:
                PreferenceScreen preferenceScreen2 = (PreferenceScreen) obj;
                Context context = preferenceScreen2.j;
                zmh zmhVar = (zmh) this.a;
                preferenceScreen2.t = zmhVar.c.g(context);
                preferenceScreen2.H(zmhVar.a(R.drawable.gs_auto_awesome_vd_theme_24));
                return;
            case 5:
                akfb a = ((aaez) obj).a();
                zmh zmhVar2 = (zmh) this.a;
                zmhVar2.l.C(a, zmhVar2.j);
                return;
            case 6:
                zmh zmhVar3 = (zmh) this.a;
                ((PreferenceScreen) obj).t = zmhVar3.c.d(zmhVar3.b.d().j);
                return;
            case 7:
                ((PreferenceGroup) this.a).af((Preference) obj);
                return;
            case 8:
                ((PreferenceGroup) this.a).af((PreferenceScreen) obj);
                return;
            case 9:
                ((PreferenceGroup) this.a).af((SuggestionExamplePreference) obj);
                return;
            case 10:
                ((SuggestionExamplePreference) obj).a = ((alob) this.a).g();
                return;
            case 11:
                ((SuggestionExamplePreference) obj).a = ((alob) this.a).g();
                return;
            case 12:
                Preference preference = (Preference) obj;
                preference.H(((zmh) this.a).a(R.drawable.assistant_logo));
                preference.J(R.string.assistant_preference_summary);
                preference.I(8);
                return;
            case 13:
                ((PreferenceGroup) this.a).af((SuggestionExamplePreference) obj);
                return;
            case 14:
                ((SuggestionExamplePreference) obj).a = ((alob) this.a).g();
                return;
            case 15:
                ((SuggestionExamplePreference) obj).a = ((alob) this.a).g();
                return;
            case 16:
                Preference preference2 = (Preference) obj;
                preference2.H(((zmj) this.a).a(R.drawable.assistant_logo));
                preference2.J(R.string.assistant_preference_summary);
                preference2.I(8);
                return;
            case 17:
                Preference preference3 = (Preference) obj;
                preference3.H(((zmj) this.a).a(R.drawable.quantum_gm_ic_chat_vd_theme_24));
                preference3.J(R.string.smart_reply_preference_summary);
                return;
            case 18:
                Preference preference4 = (Preference) obj;
                preference4.H(((zmj) this.a).a(R.drawable.quantum_gm_ic_sticker_vd_theme_24));
                preference4.I(7);
                return;
            case 19:
                ((PreferenceScreen) obj).H(((zmj) this.a).a(R.drawable.quantum_ic_alarm_vd_theme_24));
                return;
            default:
                zmj zmjVar = (zmj) this.a;
                ((Preference) obj).H(zmjVar.a(((jcf) zmjVar.g.get()).f()));
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

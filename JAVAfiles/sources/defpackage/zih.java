package defpackage;

import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zih implements Consumer {
    private final /* synthetic */ int a;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.a) {
            case 0:
                ((uvh) obj).a();
                return;
            case 1:
                ((yid) ((apwt) obj).b()).a();
                return;
            case 2:
                ((SwitchPreferenceCompat) obj).G(false);
                return;
            case 3:
                ((SwitchPreferenceCompat) obj).G(false);
                return;
            case 4:
                ((SwitchPreferenceCompat) obj).G(true);
                return;
            case 5:
                ((SwitchPreferenceCompat) obj).G(true);
                return;
            case 6:
                ((SwitchPreferenceCompat) obj).G(true);
                return;
            case 7:
                ((SwitchPreferenceCompat) obj).G(true);
                return;
            case 8:
                ((xbk) obj).a();
                return;
            case 9:
                ((TwoStatePreference) obj).G(true);
                return;
            case 10:
                ((TwoStatePreference) obj).G(false);
                return;
            case 11:
                ((TwoStatePreference) obj).N(true);
                return;
            case 12:
                ((TwoStatePreference) obj).N(true);
                return;
            case 13:
                ((TwoStatePreference) obj).G(false);
                return;
            case 14:
                ((TwoStatePreference) obj).G(false);
                return;
            case 15:
                ((TwoStatePreference) obj).G(false);
                return;
            case 16:
                ((TwoStatePreference) obj).G(true);
                return;
            case 17:
                ((TwoStatePreference) obj).G(true);
                return;
            case 18:
                ((TwoStatePreference) obj).G(true);
                return;
            case 19:
                ((TwoStatePreference) obj).N(true);
                return;
            default:
                ((TwoStatePreference) obj).G(false);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
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

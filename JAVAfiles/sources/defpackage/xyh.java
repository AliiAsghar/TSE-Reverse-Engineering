package defpackage;

import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;
import j$.util.function.Consumer$CC;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xyh implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ xyh(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.a) {
            case 0:
                int i = xyi.a;
                ((xye) obj).c();
                return;
            case 1:
                int i2 = xyi.a;
                ((xye) obj).g();
                return;
            case 2:
                int i3 = xyi.a;
                ((xye) obj).e();
                return;
            case 3:
                int i4 = xyi.a;
                ((xye) obj).c();
                return;
            case 4:
                int i5 = xyi.a;
                ((xye) obj).c();
                return;
            case 5:
                return;
            case 6:
                alwo alwoVar = zer.a;
                ((xbz) ((armf) obj).b()).a();
                return;
            case 7:
                ((iba) obj).a();
                return;
            case 8:
                xze xzeVar = zhw.a;
                ((Preference) obj).G(true);
                return;
            case 9:
                xze xzeVar2 = zhw.a;
                ajce.a.getClass();
                return;
            case 10:
                xze xzeVar3 = zhw.a;
                ((Preference) obj).G(true);
                return;
            case 11:
                ((ldm) obj).a();
                return;
            case 12:
                ((Preference) ((AtomicReference) obj).get()).G(true);
                return;
            case 13:
                ((Preference) ((AtomicReference) obj).get()).G(true);
                return;
            case 14:
                ((SwitchPreferenceCompat) obj).G(false);
                return;
            case 15:
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj;
                switchPreferenceCompat.G(true);
                switchPreferenceCompat.N(true);
                return;
            case 16:
                ((TwoStatePreference) obj).G(false);
                return;
            case 17:
                ((TwoStatePreference) obj).G(true);
                return;
            case 18:
                ((TwoStatePreference) obj).G(false);
                return;
            case 19:
                ((TwoStatePreference) obj).G(true);
                return;
            default:
                ((TwoStatePreference) obj).G(true);
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

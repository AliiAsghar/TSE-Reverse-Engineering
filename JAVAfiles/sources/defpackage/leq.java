package defpackage;

import android.database.MatrixCursor;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.messaging.R;
import j$.util.function.Consumer$CC;
import java.util.UUID;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class leq implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ leq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, arqr] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        int i = 2;
        int i2 = 0;
        switch (this.b) {
            case 0:
                this.a.a(obj);
                return;
            case 1:
                this.a.a(obj);
                return;
            case 2:
                this.a.a(obj);
                return;
            case 3:
                this.a.a(obj);
                return;
            case 4:
                this.a.a(obj);
                return;
            case 5:
                Object obj2 = this.a;
                ((Preference) obj).o = new akve(((lpj) obj2).d, "Notification Setting Clicked", new lpi(obj2, i2));
                return;
            case 6:
                ((TwoStatePreference) obj).k(!((Boolean) this.a).booleanValue());
                return;
            case 7:
                this.a.a(obj);
                return;
            case 8:
                TwoStatePreference twoStatePreference = (TwoStatePreference) obj;
                twoStatePreference.N(false);
                Object obj3 = this.a;
                lrh lrhVar = (lrh) obj3;
                twoStatePreference.M(lrhVar.b.S(R.string.user_toggle_for_etouffee_title));
                twoStatePreference.n = new akvd((akvf) lrhVar.e.b(), "Enable Etouffee Setting Changed", new lqp(obj3, i));
                return;
            case 9:
                TwoStatePreference twoStatePreference2 = (TwoStatePreference) obj;
                twoStatePreference2.k(((Boolean) this.a).booleanValue());
                twoStatePreference2.G(true);
                twoStatePreference2.N(true);
                return;
            case 10:
                TwoStatePreference twoStatePreference3 = (TwoStatePreference) obj;
                twoStatePreference3.k(!((Boolean) this.a).booleanValue());
                twoStatePreference3.G(true);
                return;
            case 11:
                TwoStatePreference twoStatePreference4 = (TwoStatePreference) obj;
                twoStatePreference4.N(false);
                Object obj4 = this.a;
                lrw lrwVar = (lrw) obj4;
                twoStatePreference4.M(lrwVar.b.S(R.string.etouffee_to_telephony_setting_title));
                twoStatePreference4.n = new akvd(lrwVar.d, "Etouffee Setting Changed", new lqp(obj4, 3));
                return;
            case 12:
                TwoStatePreference twoStatePreference5 = (TwoStatePreference) obj;
                twoStatePreference5.k(((Boolean) this.a).booleanValue());
                twoStatePreference5.G(true);
                twoStatePreference5.N(true);
                return;
            case 13:
                TwoStatePreference twoStatePreference6 = (TwoStatePreference) obj;
                twoStatePreference6.k(!((Boolean) this.a).booleanValue());
                twoStatePreference6.G(true);
                return;
            case 14:
                lul lulVar = (lul) obj;
                lulVar.getClass();
                lulVar.b(new luk((UUID) this.a));
                return;
            case 15:
                lzk lzkVar = (lzk) obj;
                String str = lzkVar.a;
                int i3 = lzkVar.b;
                lrf lrfVar = (lrf) this.a;
                ((MatrixCursor) lrfVar.c).newRow().add("rank", 0).add("xmlResId", Integer.valueOf(i3)).add("iconResId", 0).add("intentAction", "android.intent.action.MAIN").add("intentTargetPackage", lrfVar.b).add("intentTargetClass", str);
                return;
            case 16:
                ((tof) this.a).f((String) obj);
                return;
            case 17:
                String f = ((rve) obj).f();
                aozy aozyVar = (aozy) this.a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                amgx amgxVar = (amgx) aozyVar.b;
                amgx amgxVar2 = amgx.a;
                amgxVar.b = 2 | amgxVar.b;
                amgxVar.d = f;
                return;
            case 18:
                amil amilVar = (amil) obj;
                Object obj5 = this.a;
                aozy aozyVar2 = (aozy) obj5;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                amfr amfrVar = (amfr) ((amfq) obj5).b;
                amfr amfrVar2 = amfr.a;
                amilVar.getClass();
                amfrVar.r = amilVar;
                amfrVar.b |= 2048;
                return;
            case 19:
                this.a.a(obj);
                return;
            default:
                String bm = yyb.bm((String) obj);
                aozy aozyVar3 = (aozy) this.a;
                if (!aozyVar3.b.isMutable()) {
                    aozyVar3.u();
                }
                amkn amknVar = (amkn) aozyVar3.b;
                amkn amknVar2 = amkn.a;
                bm.getClass();
                amknVar.b |= 4;
                amknVar.e = bm;
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

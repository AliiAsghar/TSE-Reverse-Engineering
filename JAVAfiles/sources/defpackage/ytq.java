package defpackage;

import android.content.Intent;
import androidx.preference.Preference;
import com.google.android.apps.messaging.notifications.settings.NotificationSettingsActivity;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ytq implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ytq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, arqr] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.b) {
            case 0:
                String str = (String) obj;
                aozy aozyVar = (aozy) this.a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                yub yubVar = (yub) aozyVar.b;
                yub yubVar2 = yub.a;
                str.getClass();
                yubVar.e = str;
                return;
            case 1:
                alvi alviVar = ysj.a;
                String f = ((rve) obj).f();
                aozy aozyVar2 = (aozy) ((aojh) this.a).a;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                aqhr aqhrVar = (aqhr) aozyVar2.b;
                aqhr aqhrVar2 = aqhr.a;
                aqhrVar.e = f;
                return;
            case 2:
                aozb aozbVar = (aozb) obj;
                aozy aozyVar3 = (aozy) this.a;
                if (!aozyVar3.b.isMutable()) {
                    aozyVar3.u();
                }
                wxq wxqVar = (wxq) aozyVar3.b;
                wxq wxqVar2 = wxq.a;
                aozbVar.getClass();
                wxqVar.c = 2;
                wxqVar.d = aozbVar;
                return;
            case 3:
                wxp wxpVar = (wxp) obj;
                aozy aozyVar4 = (aozy) this.a;
                if (!aozyVar4.b.isMutable()) {
                    aozyVar4.u();
                }
                wxq wxqVar3 = (wxq) aozyVar4.b;
                wxq wxqVar4 = wxq.a;
                wxpVar.getClass();
                wxqVar3.d = wxpVar;
                wxqVar3.c = 3;
                return;
            case 4:
                this.a.a(obj);
                return;
            case 5:
                this.a.a(obj);
                return;
            case 6:
                Preference preference = (Preference) obj;
                Object obj2 = this.a;
                if (zhw.f()) {
                    preference.t = new Intent(((zhw) obj2).f.d().j, (Class<?>) NotificationSettingsActivity.class);
                    return;
                } else {
                    preference.o = new lpi(obj2, 6);
                    return;
                }
            case 7:
                ((Preference) obj).o = new lpi(this.a, 5);
                return;
            case 8:
                zhw zhwVar = (zhw) this.a;
                ((Preference) obj).t = ((lzv) zhwVar.g.b()).n(zhwVar.f.d().j);
                return;
            case 9:
                ((zhw) this.a).f.d().af((Preference) obj);
                return;
            case 10:
                zhw zhwVar2 = (zhw) this.a;
                ((Preference) obj).t = ((lzv) zhwVar2.g.b()).q(zhwVar2.f.d().j);
                return;
            default:
                ((zhw) this.a).f.d().af((Preference) obj);
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
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }
}

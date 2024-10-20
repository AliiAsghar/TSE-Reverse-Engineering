package defpackage;

import androidx.preference.TwoStatePreference;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zle implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ zle(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.a) {
            case 0:
                ((TwoStatePreference) obj).G(true);
                return;
            case 1:
                ((TwoStatePreference) obj).G(true);
                return;
            case 2:
                ((TwoStatePreference) obj).G(true);
                return;
            case 3:
                ((TwoStatePreference) obj).G(false);
                return;
            case 4:
                ((TwoStatePreference) obj).G(true);
                return;
            case 5:
                ((TwoStatePreference) obj).G(false);
                return;
            case 6:
                ((TwoStatePreference) obj).G(false);
                return;
            case 7:
                ((TwoStatePreference) obj).G(false);
                return;
            case 8:
                ((TwoStatePreference) obj).G(true);
                return;
            case 9:
                ((iba) obj).a();
                return;
            case 10:
                ((jca) obj).d();
                return;
            case 11:
                ((ihi) obj).b();
                return;
            case 12:
                xzb.i("Bugle", (Throwable) obj, "Failed to get media display uri to load the video");
                return;
            case 13:
                xze xzeVar = zri.a;
                return;
            case 14:
                xze xzeVar2 = zri.a;
                ((aaex) obj).a();
                return;
            case 15:
                xze xzeVar3 = zri.a;
                return;
            case 16:
                ((inn) obj).j();
                return;
            case 17:
                xze xzeVar4 = zri.a;
                ((aaex) obj).a();
                return;
            case 18:
                ((aaex) obj).d();
                return;
            case 19:
                ((lyv) obj).d();
                return;
            default:
                xze xzeVar5 = zri.a;
                ((aaex) obj).e();
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

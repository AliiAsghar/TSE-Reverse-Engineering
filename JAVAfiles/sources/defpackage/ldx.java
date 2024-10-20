package defpackage;

import android.util.Pair;
import androidx.preference.TwoStatePreference;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ldx implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ ldx(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r5v22, types: [yga, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.a) {
            case 0:
                xyo e = ldy.b.e();
                e.H("Threw during logReceivedMessageLinkAnnotationEvents()");
                e.r((Throwable) obj);
                return;
            case 1:
                xyo e2 = ldy.b.e();
                e2.H("Threw during logSentMessageLinkAnnotationEvents()");
                e2.r((Throwable) obj);
                return;
            case 2:
                ((TwoStatePreference) obj).G(true);
                return;
            case 3:
                ((TwoStatePreference) obj).G(true);
                return;
            case 4:
                ((TwoStatePreference) obj).G(false);
                return;
            case 5:
                ((TwoStatePreference) obj).G(true);
                return;
            case 6:
                ((TwoStatePreference) obj).G(false);
                return;
            case 7:
                ((TwoStatePreference) obj).G(true);
                return;
            case 8:
                ((TwoStatePreference) obj).G(false);
                return;
            case 9:
                ((TwoStatePreference) obj).G(true);
                return;
            case 10:
                ((TwoStatePreference) obj).G(false);
                return;
            case 11:
                ((TwoStatePreference) obj).G(false);
                return;
            case 12:
                ((TwoStatePreference) obj).G(true);
                return;
            case 13:
                ((acmr) obj).s();
                return;
            case 14:
                alwo alwoVar = mat.a;
                return;
            case 15:
                ((alwl) ((alwl) ((alwl) mat.a.h()).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "sendBugleEventToClearcut", 365, "BugleClearcutLoggerImpl.java")).q("Failed to log lastPassiveEventTime");
                return;
            case 16:
                xze xzeVar = mfo.a;
                ((ywg) ((armf) obj).b()).a();
                return;
            case 17:
                xze xzeVar2 = mfo.a;
                akul ag = aktp.ag(arnb.a);
                ag.getClass();
                qiu.h(ag);
                return;
            case 18:
                Pair pair = (Pair) obj;
                ((agmc) pair.second).a((sne) pair.first);
                return;
            case 19:
                ((mzr) obj).b.a();
                return;
            default:
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

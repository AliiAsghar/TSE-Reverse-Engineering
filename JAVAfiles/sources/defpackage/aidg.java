package defpackage;

import android.os.Parcel;
import android.text.TextUtils;
import android.util.Pair;
import j$.util.function.Consumer$CC;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aidg implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aidg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        boolean z = true;
        switch (this.b) {
            case 0:
                if (((aicv) obj).b != ((aicv) this.a).b) {
                    z = false;
                }
                d.t(z, "All the AggregateData must be for the same SystemProfile.");
                return;
            case 1:
                Object obj2 = this.a;
                agvz agvzVar = (agvz) obj2;
                AtomicBoolean atomicBoolean = agvzVar.n;
                agxa agxaVar = (agxa) obj;
                int i = agvzVar.r;
                if (!atomicBoolean.compareAndSet(false, true)) {
                    return;
                }
                albo.bR(agxaVar.e(), new agvw(obj2, agxaVar, i, 0), agtz.b);
                return;
            case 2:
                ((aozy) this.a).aF((aled) obj);
                return;
            case 3:
                ((aozy) this.a).aF((aled) obj);
                return;
            case 4:
                Pair pair = (Pair) obj;
                ((aifd) this.a).k((String) pair.first, (String) pair.second);
                return;
            case 5:
                Pair pair2 = (Pair) obj;
                boolean equals = "NS".equals(pair2.first);
                Object obj3 = this.a;
                if (equals) {
                    String str = (String) pair2.second;
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    String[] split = str.split(" ");
                    int length = split.length;
                    if (length == 1) {
                        advr.c("Setting default name space binding to: %s", str);
                        ((aifd) obj3).o("", str);
                        return;
                    } else {
                        if (length != 2) {
                            advr.q("Ignoring invalid name space binding: %s", str);
                            return;
                        }
                        String str2 = split[0];
                        String str3 = split[1];
                        if (str3.length() < 3) {
                            advr.q("Ignoring invalid name space binding: %s", str);
                            return;
                        } else {
                            ((aifd) obj3).o(str2, str3.substring(1, str3.length() - 1));
                            return;
                        }
                    }
                }
                ((aifd) obj3).m((String) pair2.first, (String) pair2.second);
                return;
            case 6:
                ((aozy) this.a).bb(agrk.f((InetSocketAddress) obj));
                return;
            case 7:
                ((aozy) this.a).bb(agrk.f((InetSocketAddress) obj));
                return;
            case 8:
                ((atlb) this.a).b = ((Integer) obj).intValue();
                return;
            case 9:
                ((atlb) this.a).c(((Integer) obj).intValue());
                return;
            case 10:
                ((atnk) this.a).b = new InetSocketAddress((InetAddress) obj, 0);
                return;
            case 11:
                ((atki) this.a).c = ((Integer) obj).intValue();
                return;
            case 12:
                ((atki) this.a).b = ((Integer) obj).intValue();
                return;
            case 13:
                ((atki) this.a).a.a = ((Integer) obj).intValue();
                return;
            case 14:
                ((aihw) this.a).d.add(new aihx((InetAddress) obj, aihw.a(), aihw.b()));
                return;
            case 15:
                ((aihw) this.a).e.add(new aihx((InetAddress) obj, aihw.a(), aihw.b()));
                return;
            case 16:
                aipi aipiVar = (aipi) obj;
                int i2 = aipl.d;
                try {
                    aipiVar.a((aipc) this.a);
                    return;
                } catch (Exception e) {
                    advr.i(e, "exception in ObservableStateMachine.onStateTransition observer", new Object[0]);
                    return;
                }
            case 17:
                abhi.j((Parcel) this.a, 4, ((aozb) obj).H(), false);
                return;
            case 18:
                abhi.j((Parcel) this.a, 5, ((aozb) obj).H(), false);
                return;
            case 19:
                abhi.j((Parcel) this.a, 4, ((aozb) obj).H(), false);
                return;
            default:
                abhi.j((Parcel) this.a, 4, ((aozb) obj).H(), false);
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

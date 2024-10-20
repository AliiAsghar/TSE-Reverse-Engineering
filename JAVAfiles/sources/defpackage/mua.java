package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mua implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ mua(Object obj, Object obj2, int i, int i2) {
        this.d = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [ajrm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, miz] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        this.b.a((Parcel) this.c, obj, this.a);
                        return;
                    }
                    Object obj2 = this.b;
                    Object obj3 = this.c;
                    wpj wpjVar = (wpj) obj;
                    int i2 = this.a - 1;
                    if (i2 != 1) {
                        if (i2 != 2) {
                            qvo qvoVar = (qvo) obj3;
                            if (!((yav) obj2).A(qvoVar)) {
                                wpjVar.a(qvoVar.c);
                                return;
                            }
                            return;
                        }
                        wpjVar.b(((qvo) obj3).c);
                        return;
                    }
                    qvo qvoVar2 = (qvo) obj3;
                    if (((yav) obj2).A(qvoVar2)) {
                        wpjVar.c(qvoVar2.c);
                        return;
                    }
                    return;
                }
                ((xbe) this.c).c = xbd.a(this.a, (String) obj, ((xbf) this.b).b);
                return;
            }
            int i3 = this.a;
            MessageCoreData messageCoreData = (MessageCoreData) obj;
            Object obj4 = this.c;
            Object obj5 = this.b;
            if (mlb.e(i3)) {
                ((mlb) obj4).b(messageCoreData, (amlg) obj5);
                return;
            }
            mkw a = mkz.a();
            a.c(messageCoreData.B());
            a.i(Instant.ofEpochMilli(messageCoreData.q()));
            a.f = Optional.of(mkx.a());
            a.g((amlg) obj5);
            ((mlb) obj4).c(messageCoreData, a.a());
            return;
        }
        mui muiVar = (mui) this.b;
        xcs xcsVar = (xcs) muiVar.l.b();
        xcsVar.j(((rve) obj).f(), ((kor) xcsVar.r.b()).n(this.c, muiVar.r, muiVar.s), this.a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                    return Consumer$CC.$default$andThen(this, consumer);
                }
                return Consumer$CC.$default$andThen(this, consumer);
            }
            return Consumer$CC.$default$andThen(this, consumer);
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ mua(mlb mlbVar, int i, amlg amlgVar, int i2) {
        this.d = i2;
        this.c = mlbVar;
        this.a = i;
        this.b = amlgVar;
    }

    public /* synthetic */ mua(yav yavVar, int i, qvo qvoVar, int i2) {
        this.d = i2;
        this.b = yavVar;
        this.a = i;
        this.c = qvoVar;
    }
}

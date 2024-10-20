package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vrw implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ vrw(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.a) {
            case 0:
                wam.D(obj);
                return;
            case 1:
                wam.D(obj);
                return;
            case 2:
                wam.A(obj);
                return;
            case 3:
                wam.B(obj);
                return;
            case 4:
                wam.A(obj);
                return;
            case 5:
                wam.C(obj);
                return;
            case 6:
                alwo alwoVar = vwy.a;
                return;
            case 7:
                ((woj) obj).d();
                return;
            case 8:
                xze xzeVar = wlc.a;
                ((xzu) ((armf) obj).b()).i();
                return;
            case 9:
                xze xzeVar2 = wod.a;
                qiu.h(((vyv) obj).a());
                return;
            case 10:
                woi.a.o("SMS received successfully");
                woi.a.k("SMS receiving END");
                return;
            case 11:
                woi.a.r("Failed to receive SMS", (Throwable) obj);
                woi.a.k("SMS receiving END");
                return;
            case 12:
                return;
            case 13:
                utz utzVar = wzw.d;
                ((xbz) ((armf) obj).b()).c();
                return;
            case 14:
                utz utzVar2 = wzw.d;
                ((xbz) ((armf) obj).b()).f();
                return;
            case 15:
                utz utzVar3 = wzw.d;
                ((xbz) ((armf) obj).b()).c();
                return;
            case 16:
                utz utzVar4 = wzw.d;
                ((xbz) ((armf) obj).b()).a();
                return;
            case 17:
                utz utzVar5 = wzw.d;
                ((xbz) ((armf) obj).b()).i();
                return;
            case 18:
                utz utzVar6 = wzw.d;
                ((xbz) ((armf) obj).b()).j();
                return;
            case 19:
                xac.c.p("ForwardSyncExecutionScheduler queued forward sync");
                return;
            default:
                ((xbk) obj).a();
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

package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ixe implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ ixe(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.a) {
            case 0:
                ((lyd) obj).a();
                return;
            case 1:
                lyn lynVar = (lyn) obj;
                lynVar.c();
                lynVar.b();
                return;
            case 2:
                ((lzb) obj).b();
                return;
            case 3:
                ((lzb) obj).a();
                return;
            case 4:
                throw null;
            case 5:
                yyb.aO(((woj) obj).a(), "Bugle", "Failed to dismiss triggered reminders");
                return;
            case 6:
                ((ihn) obj).b();
                return;
            case 7:
                ((abgi) obj).a();
                kuy.a.l("WelcomeFlowV1EntryPoint registered");
                return;
            case 8:
                ((lao) obj).c();
                return;
            case 9:
                ((ldn) obj).a();
                return;
            case 10:
                ((lqm) obj).g();
                return;
            case 11:
                ((lrz) obj).a();
                return;
            case 12:
                ((ihn) obj).c();
                return;
            case 13:
                ((lbc) obj).b();
                return;
            case 14:
                ((lbc) obj).a();
                return;
            case 15:
                ((lao) obj).d();
                return;
            case 16:
                ((kuo) obj).a();
                return;
            case 17:
                ((aaow) obj).b();
                return;
            case 18:
                ((iba) ((armf) obj).b()).a();
                return;
            case 19:
                ((kwp) obj).c();
                return;
            default:
                ((kwp) obj).d();
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

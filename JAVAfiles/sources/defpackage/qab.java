package defpackage;

import j$.util.function.Consumer$CC;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qab implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ qab(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                return;
            case 2:
                ((vpq) ((armf) obj).b()).j(amww.FILE_TRANSFER_CREDENTIALS_EXPIRED);
                return;
            case 3:
                qmv qmvVar = (qmv) obj;
                alwo alwoVar = qmn.a;
                qmvVar.getClass();
                qmvVar.b();
                return;
            case 4:
                ((qmv) obj).a();
                return;
            case 5:
                qmv qmvVar2 = (qmv) obj;
                alwo alwoVar2 = qmq.a;
                qmvVar2.getClass();
                qmvVar2.b();
                return;
            case 6:
                qmv qmvVar3 = (qmv) obj;
                alwo alwoVar3 = qmw.a;
                qmvVar3.getClass();
                qmvVar3.b();
                return;
            case 7:
                ((qmv) obj).a();
                return;
            case 8:
                qmv qmvVar4 = (qmv) obj;
                alwo alwoVar4 = qna.a;
                qmvVar4.getClass();
                qmvVar4.b();
                return;
            case 9:
                ((qmv) obj).a();
                return;
            case 10:
                qmv qmvVar5 = (qmv) obj;
                alwo alwoVar5 = qnd.a;
                qmvVar5.getClass();
                qmvVar5.b();
                return;
            case 11:
                ((qmv) obj).a();
                return;
            case 12:
                ((qmv) obj).b();
                return;
            case 13:
                return;
            case 14:
                int i = quu.f;
                ((qva) obj).getClass();
                return;
            case 15:
                return;
            case 16:
                return;
            case 17:
                return;
            case 18:
                AtomicBoolean atomicBoolean = qxn.a;
                ((xcl) ((armf) obj).b()).a();
                return;
            case 19:
                ((yqq) obj).a();
                return;
            default:
                ((xzu) obj).i();
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

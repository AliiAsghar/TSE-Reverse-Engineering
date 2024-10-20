package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uhb implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ uhb(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((ndj) obj).d();
                return;
            case 1:
                ((ndj) obj).c();
                return;
            case 2:
                alhr alhrVar = uhj.a;
                ((xzu) ((armf) obj).b()).i();
                return;
            case 3:
                ((xbz) obj).a();
                return;
            case 4:
                ((xzu) obj).i();
                return;
            case 5:
                return;
            case 6:
                xyo c = uux.a.c();
                c.H("Successfully handled firebase new token.");
                c.q();
                return;
            case 7:
                xyo b = uux.a.b();
                b.H("Failed to handle firebase new token.");
                b.r((Throwable) obj);
                return;
            case 8:
                xze xzeVar = vbm.a;
                ((lto) ((armf) obj).b()).a();
                return;
            case 9:
                ((vcu) obj).b();
                return;
            case 10:
                ((vcu) obj).b();
                return;
            case 11:
                xzb.l("BugleNetwork", "successfully revoked messages by sender.");
                return;
            case 12:
                xzb.l("BugleNetwork", "failed to revoke messages by sender.");
                return;
            case 13:
                ((vhe) obj).c();
                return;
            case 14:
                xze xzeVar2 = vqp.a;
                ((vae) obj).a();
                return;
            case 15:
                xze xzeVar3 = vqp.a;
                ((xbz) ((armf) obj).b()).g();
                return;
            case 16:
                uuf uufVar = vqw.c;
                ((MessagePartCoreData) obj).aw(null);
                return;
            case 17:
                wam.A(obj);
                return;
            case 18:
                aozy aozyVar = (aozy) obj;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                amkv amkvVar = (amkv) aozyVar.b;
                amkv amkvVar2 = amkv.a;
                amkvVar.h = 5;
                amkvVar.b |= 32;
                return;
            case 19:
                wam.B(obj);
                return;
            default:
                wam.C(obj);
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

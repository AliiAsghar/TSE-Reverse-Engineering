package defpackage;

import android.os.Bundle;
import com.google.android.ims.provisioning.config.Configuration;
import j$.util.function.Function$CC;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vmd implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ vmd(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.a) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            case 1:
                return Function$CC.$default$andThen(this, function);
            case 2:
                return Function$CC.$default$andThen(this, function);
            case 3:
                return Function$CC.$default$andThen(this, function);
            case 4:
                return Function$CC.$default$andThen(this, function);
            case 5:
                return Function$CC.$default$andThen(this, function);
            case 6:
                return Function$CC.$default$andThen(this, function);
            case 7:
                return Function$CC.$default$andThen(this, function);
            case 8:
                return Function$CC.$default$andThen(this, function);
            case 9:
                return Function$CC.$default$andThen(this, function);
            case 10:
                return Function$CC.$default$andThen(this, function);
            case 11:
                return Function$CC.$default$andThen(this, function);
            case 12:
                return Function$CC.$default$andThen(this, function);
            case 13:
                return Function$CC.$default$andThen(this, function);
            case 14:
                return Function$CC.$default$andThen(this, function);
            case 15:
                return Function$CC.$default$andThen(this, function);
            case 16:
                return Function$CC.$default$andThen(this, function);
            case 17:
                return Function$CC.$default$andThen(this, function);
            case 18:
                return Function$CC.$default$andThen(this, function);
            case 19:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object e;
        Object obj2;
        aozb w;
        boolean z = true;
        switch (this.a) {
            case 0:
                vla vlaVar = (vla) obj;
                if (vlaVar.c == 3) {
                    return (vmq) vlaVar.d;
                }
                return vmq.a;
            case 1:
                return ruy.b((String) obj);
            case 2:
                return rvc.b((String) obj);
            case 3:
                return vls.a((msh) obj);
            case 4:
                Bundle bundle = (Bundle) obj;
                String string = bundle.getString("extra_im_notification_conversation_id");
                long j = bundle.getLong("extra_im_notification_earliest_timestamp");
                string.getClass();
                aozy createBuilder = vmn.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                vmn vmnVar = (vmn) createBuilder.b;
                vmnVar.b = 1 | vmnVar.b;
                vmnVar.c = j;
                return new AbstractMap.SimpleEntry(string, (vmn) createBuilder.s());
            case 5:
                return (String) ((AbstractMap.SimpleEntry) obj).getKey();
            case 6:
                return (vmn) ((AbstractMap.SimpleEntry) obj).getValue();
            case 7:
                return (armf) ((Map.Entry) obj).getValue();
            case 8:
                return d.ar((smu) obj);
            case 9:
                xze xzeVar = vqp.a;
                String o = ((msh) obj).o(true);
                o.getClass();
                return o;
            case 10:
                return ((adit) obj).a;
            case 11:
                e = ((msh) obj).e();
                return e;
            case 12:
                uuf uufVar = vqw.c;
                if (((Configuration) obj).mInstantMessageConfiguration.mChatRevokeTimer <= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                obj2 = ((qei) obj).d;
                return obj2;
            case 14:
                return Integer.valueOf(((adix) obj).a);
            case 15:
                w = aozb.w(ByteBuffer.allocate(16).putLong(r8.getMostSignificantBits()).putLong(((UUID) obj).getLeastSignificantBits()).array());
                return w;
            case 16:
                return Integer.valueOf(((wxb) obj).d);
            case 17:
                return ((wxb) obj).c;
            case 18:
                return Integer.valueOf(((wxb) obj).d);
            case 19:
                return d.ar((smu) obj);
            default:
                return ((smu) obj).a;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 0:
                return Function$CC.$default$compose(this, function);
            case 1:
                return Function$CC.$default$compose(this, function);
            case 2:
                return Function$CC.$default$compose(this, function);
            case 3:
                return Function$CC.$default$compose(this, function);
            case 4:
                return Function$CC.$default$compose(this, function);
            case 5:
                return Function$CC.$default$compose(this, function);
            case 6:
                return Function$CC.$default$compose(this, function);
            case 7:
                return Function$CC.$default$compose(this, function);
            case 8:
                return Function$CC.$default$compose(this, function);
            case 9:
                return Function$CC.$default$compose(this, function);
            case 10:
                return Function$CC.$default$compose(this, function);
            case 11:
                return Function$CC.$default$compose(this, function);
            case 12:
                return Function$CC.$default$compose(this, function);
            case 13:
                return Function$CC.$default$compose(this, function);
            case 14:
                return Function$CC.$default$compose(this, function);
            case 15:
                return Function$CC.$default$compose(this, function);
            case 16:
                return Function$CC.$default$compose(this, function);
            case 17:
                return Function$CC.$default$compose(this, function);
            case 18:
                return Function$CC.$default$compose(this, function);
            case 19:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}

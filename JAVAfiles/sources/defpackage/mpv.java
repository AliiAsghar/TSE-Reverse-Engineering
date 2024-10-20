package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversation;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.HashMap;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mpv implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mpv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, arqr] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        alog n;
        int i = 0;
        switch (this.b) {
            case 0:
                String n2 = ((ResolvedRecipient) obj).f().n();
                aozy createBuilder = umk.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                ((umk) apagVar).b = n2;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                ((umk) createBuilder.b).d = a.am(4);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj2 = this.a;
                ((umk) createBuilder.b).c = a.an(4);
                ((lpg) ((RbmConversation) obj2).c.b()).F((umk) createBuilder.s(), new uta(n2, n2, null, null, null, null));
                return;
            case 1:
                ((mlx) this.a).e = (nfw) obj;
                return;
            case 2:
                String str = (String) obj;
                aozy aozyVar = (aozy) this.a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                msz mszVar = (msz) aozyVar.b;
                msz mszVar2 = msz.a;
                str.getClass();
                mszVar.g = str;
                return;
            case 3:
                String str2 = (String) obj;
                aozy aozyVar2 = (aozy) this.a;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                msz mszVar3 = (msz) aozyVar2.b;
                msz mszVar4 = msz.a;
                str2.getClass();
                mszVar3.j = str2;
                return;
            case 4:
                String str3 = (String) obj;
                aozy aozyVar3 = (aozy) this.a;
                if (!aozyVar3.b.isMutable()) {
                    aozyVar3.u();
                }
                msz mszVar5 = (msz) aozyVar3.b;
                msz mszVar6 = msz.a;
                str3.getClass();
                mszVar5.l = str3;
                return;
            case 5:
                qei qeiVar = (qei) obj;
                aozy aozyVar4 = (aozy) this.a;
                if (!aozyVar4.b.isMutable()) {
                    aozyVar4.u();
                }
                msz mszVar7 = (msz) aozyVar4.b;
                msz mszVar8 = msz.a;
                qeiVar.getClass();
                mszVar7.i = qeiVar;
                mszVar7.b |= 1;
                return;
            case 6:
                this.a.a(obj);
                return;
            case 7:
                this.a.a(obj);
                return;
            case 8:
                ResolvedRecipient resolvedRecipient = (ResolvedRecipient) obj;
                ((HashMap) ((ifs) this.a).e).put(resolvedRecipient.z().a, resolvedRecipient);
                return;
            case 9:
                Object obj3 = this.a;
                muw muwVar = (muw) obj3;
                alog alogVar = (alog) obj;
                synchronized (muwVar.e) {
                    n = alog.n(((muw) obj3).d);
                }
                int size = alogVar.size();
                while (i < size) {
                    alog alogVar2 = (alog) Collection.EL.stream(n).map(new mtl((mzi) alogVar.get(i), 10)).collect(alls.a);
                    if (!alogVar2.isEmpty()) {
                        qiu.h(aktp.aj(new ikm(alogVar2, 9), muwVar.b));
                    }
                    i++;
                }
                return;
            case 10:
                this.a.a(obj);
                return;
            case 11:
                alog alogVar3 = (alog) obj;
                int size2 = alogVar3.size();
                while (i < size2) {
                    mzv mzvVar = (mzv) this.a;
                    mzvVar.b.y(new ijm((mzi) alogVar3.get(i), 14), mzvVar.a);
                    i++;
                }
                return;
            case 12:
                int i2 = nbq.c;
                ((nbs) obj).H((mzc) this.a);
                return;
            case 13:
                this.a.a(obj);
                return;
            case 14:
                this.a.a(obj);
                return;
            case 15:
                this.a.a(obj);
                return;
            case 16:
                ((Uri.Builder) this.a).path((String) obj);
                return;
            case 17:
                alvi alviVar = prb.a;
                ((Uri.Builder) this.a).appendQueryParameter("ho", (String) obj);
                return;
            case 18:
                ((Uri.Builder) this.a).path((String) obj);
                return;
            case 19:
                ((Uri.Builder) this.a).appendQueryParameter("ho", (String) obj);
                return;
            default:
                xze xzeVar = psh.a;
                ((Uri.Builder) this.a).appendQueryParameter("ho", (String) obj);
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

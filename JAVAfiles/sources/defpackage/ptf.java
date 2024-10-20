package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.function.Consumer;
import org.chromium.net.CronetException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ptf implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ptf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r6v41, types: [arwe, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        akul c;
        int i = 10;
        switch (this.b) {
            case 0:
                ((qru) obj).a(qrw.RCS, (Map) Collection.EL.stream(this.a.entrySet()).collect(alls.a(new prj(i), new prj(11))));
                return;
            case 1:
                amur amurVar = (amur) obj;
                aozy aozyVar = (aozy) this.a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                amsv amsvVar = (amsv) aozyVar.b;
                amsv amsvVar2 = amsv.a;
                amurVar.getClass();
                amsvVar.e = amurVar;
                amsvVar.b |= 8;
                return;
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                ((pwo) this.a).a.addHeader((String) entry.getKey(), (String) entry.getValue());
                return;
            case 3:
                amur bH = yyb.bH((CronetException) obj);
                aozy aozyVar2 = (aozy) this.a;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                amrl amrlVar = (amrl) aozyVar2.b;
                amrl amrlVar2 = amrl.a;
                bH.getClass();
                amrlVar.g = bH;
                amrlVar.b |= 4;
                return;
            case 4:
                amur bH2 = yyb.bH((CronetException) obj);
                aozy aozyVar3 = (aozy) this.a;
                if (!aozyVar3.b.isMutable()) {
                    aozyVar3.u();
                }
                amrl amrlVar3 = (amrl) aozyVar3.b;
                amrl amrlVar4 = amrl.a;
                bH2.getClass();
                amrlVar3.g = bH2;
                amrlVar3.b |= 4;
                return;
            case 5:
                amur bH3 = yyb.bH((CronetException) obj);
                aozy aozyVar4 = (aozy) this.a;
                if (!aozyVar4.b.isMutable()) {
                    aozyVar4.u();
                }
                amrl amrlVar5 = (amrl) aozyVar4.b;
                amrl amrlVar6 = amrl.a;
                bH3.getClass();
                amrlVar5.g = bH3;
                amrlVar5.b |= 4;
                return;
            case 6:
                alwo alwoVar = pxl.a;
                StringBuilder sb = (StringBuilder) this.a;
                sb.append(", opaque=");
                sb.append(pxl.b((String) obj));
                return;
            case 7:
                d.au(this.a, (vae) obj);
                return;
            case 8:
                d.au(this.a, (vae) obj);
                return;
            case 9:
                d.au(this.a, (vae) obj);
                return;
            case 10:
                ((dtq) this.a).b((qeg) obj);
                return;
            case 11:
                ((aozy) this.a).H((qfw) obj);
                return;
            case 12:
                qei qeiVar = (qei) obj;
                aozy aozyVar5 = (aozy) this.a;
                if (!aozyVar5.b.isMutable()) {
                    aozyVar5.u();
                }
                qfi qfiVar = (qfi) aozyVar5.b;
                qfi qfiVar2 = qfi.a;
                qeiVar.getClass();
                qfiVar.e = qeiVar;
                qfiVar.b |= 4;
                return;
            case 13:
                int i2 = qbd.a;
                String str = ((SelfIdentityIdImpl) ((qwm) obj).g()).a;
                aozy aozyVar6 = (aozy) this.a;
                if (!aozyVar6.b.isMutable()) {
                    aozyVar6.u();
                }
                qfi qfiVar3 = (qfi) aozyVar6.b;
                qfi qfiVar4 = qfi.a;
                qfiVar3.b |= 8;
                qfiVar3.f = str;
                return;
            case 14:
                ((aozy) this.a).H((qfw) obj);
                return;
            case 15:
                qei qeiVar2 = (qei) obj;
                aozy aozyVar7 = (aozy) this.a;
                if (!aozyVar7.b.isMutable()) {
                    aozyVar7.u();
                }
                qfi qfiVar5 = (qfi) aozyVar7.b;
                qfi qfiVar6 = qfi.a;
                qeiVar2.getClass();
                qfiVar5.e = qeiVar2;
                qfiVar5.b |= 4;
                return;
            case 16:
                String b = ((SelfIdentityId) obj).b();
                aozy aozyVar8 = (aozy) this.a;
                if (!aozyVar8.b.isMutable()) {
                    aozyVar8.u();
                }
                qfi qfiVar7 = (qfi) aozyVar8.b;
                qfi qfiVar8 = qfi.a;
                qfiVar7.b |= 8;
                qfiVar7.f = b;
                return;
            case 17:
                qnu qnuVar = (qnu) obj;
                c = qjh.c(qnuVar.b, arpj.a, arwf.a, new mlg(qnuVar, new BugleConversationId((ConversationIdType) this.a), (arpe) null, 10));
                qiu.h(c);
                return;
            case 18:
                ((LocationInformation) this.a).e = ((Double) obj).doubleValue();
                return;
            case 19:
                ((LocationInformation) this.a).a = (String) obj;
                return;
            default:
                ((qdq) this.a).a((pwh) obj);
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

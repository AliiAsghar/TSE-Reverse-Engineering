package defpackage;

import android.hardware.Camera;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.verifiedsmsworkers.UpdateMessageVerificationStatusWork;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class wog implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ wog(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        String am;
        int i = 1;
        switch (this.c) {
            case 0:
                ret retVar = (ret) this.b;
                gti gtiVar = (gti) obj;
                String ag = albo.ag(retVar.b.M());
                MessageCoreData messageCoreData = retVar.a;
                if (messageCoreData == null) {
                    am = "";
                } else {
                    am = messageCoreData.am();
                }
                MessageIdType messageIdType = retVar.c;
                if (messageIdType.b()) {
                    rfa.b.m("Message ID was empty when appending verification work.");
                    return;
                }
                int i2 = this.a;
                ConversationIdType conversationIdType = retVar.d;
                String ag2 = albo.ag(am);
                hgi hgiVar = new hgi((char[]) null);
                hgiVar.p("vsms_sub_id", i2);
                hgiVar.n("vsms_message_id", messageIdType.a());
                hgiVar.n("vsms_conversation_id", conversationIdType.a());
                hgiVar.n("vsms_participant_id", ag);
                hgiVar.n("vsms_message_body", ag2);
                gsi j = hgiVar.j();
                gsz gszVar = new gsz(UpdateMessageVerificationStatusWork.class);
                gszVar.i(j);
                gszVar.c("verified_sms_work_manager_tag");
                kkc j2 = gszVar.j();
                rfa.b.l("Appending and enqueuing vSMS post-verification work.");
                aktp.aa(((gte) gtiVar.c(j2).a()).c, new pum(4), andi.a);
                return;
            case 1:
                iki ikiVar = (iki) obj;
                xze xzeVar = rsr.a;
                ?? r0 = this.b;
                int i3 = this.a;
                akrh e = aktp.e("MessageDataSource#RcsCapabilitiesDataSourceWrapper#UpdateSubId");
                try {
                    ListenableFuture a = ikiVar.j.a(akto.k(new mjw(ikiVar, i3, (SelfIdentityId) r0, i)), ikiVar.f);
                    e.b(a);
                    qiu.h(a);
                    e.close();
                    return;
                } catch (Throwable th) {
                    try {
                        e.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 2:
                yav yavVar = (yav) this.b;
                ((lgg) yavVar.j.b()).g(new mua(yavVar, this.a, (qvo) obj, 3));
                return;
            case 3:
                int i4 = this.a;
                ((aauz) this.b).a.m((Camera) obj, i4);
                return;
            case 4:
                ajpi ajpiVar = new ajpi(0);
                int i5 = this.a;
                ajro.p((Parcel) this.b, 5, (ajpk) obj, ajpiVar, i5);
                return;
            case 5:
                ajpi ajpiVar2 = new ajpi(2);
                int i6 = this.a;
                ajro.p((Parcel) this.b, 6, (ajpy) obj, ajpiVar2, i6);
                return;
            case 6:
                Parcelable parcelable = (Parcelable) obj;
                if (parcelable != null) {
                    parcelable.writeToParcel((Parcel) this.b, this.a);
                    return;
                }
                return;
            default:
                ajpi ajpiVar3 = new ajpi(16);
                int i7 = this.a;
                ajro.p((Parcel) this.b, 1, (ajpu) obj, ajpiVar3, i7);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.c) {
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
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }
}

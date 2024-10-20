package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.Collection;
import j$.util.Optional;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vqo implements algk {
    public final /* synthetic */ alog a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    public /* synthetic */ vqo(mmw mmwVar, ConversationIdType conversationIdType, alog alogVar, int i, Optional optional, qwm qwmVar, long j, int i2) {
        this.h = i2;
        this.e = mmwVar;
        this.d = conversationIdType;
        this.a = alogVar;
        this.c = i;
        this.g = optional;
        this.f = qwmVar;
        this.b = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        boolean z = false;
        if (this.h != 0) {
            mmw mmwVar = (mmw) this.e;
            ujv ujvVar = (ujv) mmwVar.f.b();
            boolean booleanValue = ((Boolean) obj).booleanValue();
            alog alogVar = this.a;
            boolean anyMatch = Collection.EL.stream(alogVar).anyMatch(new mmd(2));
            mlm mlmVar = new mlm(18);
            Optional optional = (Optional) this.g;
            int intValue = ((Integer) optional.map(mlmVar).orElse(Integer.valueOf(((qwm) this.f).e()))).intValue();
            int i = this.c;
            ConversationIdType conversationIdType = (ConversationIdType) this.d;
            int e = ujvVar.e(true, conversationIdType, booleanValue, anyMatch, i, intValue);
            if (e != 0) {
                z = true;
            }
            albo.T(z);
            ((ujv) mmwVar.f.b()).k(optional, conversationIdType, alogVar, e, this.b);
            return null;
        }
        boolean booleanValue2 = ((Boolean) obj).booleanValue();
        long j = this.b;
        ?? r5 = this.e;
        Object obj2 = this.d;
        if (booleanValue2) {
            int i2 = this.c;
            Object obj3 = this.g;
            return ((vqp) obj2).i(r5, (aknw) this.f, this.a, j, (String) obj3, i2);
        }
        for (MessagePartCoreData messagePartCoreData : r5.W()) {
            Uri t = messagePartCoreData.t();
            if (t != null) {
                vqp vqpVar = (vqp) obj2;
                ((rxc) vqpVar.g.b()).d(r5, messagePartCoreData, t, ydk.i(vqpVar.c, t, new File(vqpVar.c.getFilesDir(), "rcs_attachments"), messagePartCoreData.U(), null, vqpVar.d));
            }
        }
        vqp vqpVar2 = (vqp) obj2;
        ((ruq) vqpVar2.h.b()).a(r5.z(), false, tqc.UNARCHIVED);
        vqpVar2.m(r5, j);
        return null;
    }

    public /* synthetic */ vqo(vqp vqpVar, MessageCoreData messageCoreData, aknw aknwVar, alog alogVar, long j, String str, int i, int i2) {
        this.h = i2;
        this.d = vqpVar;
        this.e = messageCoreData;
        this.f = aknwVar;
        this.a = alogVar;
        this.b = j;
        this.g = str;
        this.c = i;
    }
}

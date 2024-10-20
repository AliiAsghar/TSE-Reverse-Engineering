package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.Consumer$CC;
import java.util.HashMap;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ixj implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ixj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v2, types: [lys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.util.List, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.b) {
            case 0:
                rvc.c(this.a);
                ((aaes) obj).d();
                return;
            case 1:
                this.a.b();
                ((lyc) obj).a();
                return;
            case 2:
                rsf rsfVar = (rsf) obj;
                izh izhVar = (izh) this.a;
                iyl iylVar = (iyl) izhVar.e.G().e("conversation_settings_base_fragment");
                iylVar.getClass();
                iyq iyqVar = iylVar.E().d;
                hg.a(new iyp(iyqVar.m(), iyqVar.F(rsfVar))).b(new gz(iyqVar));
                iyqVar.c = rsfVar;
                izl izlVar = izhVar.d;
                if (izlVar != null) {
                    izlVar.e(izlVar.Q, true);
                    return;
                }
                return;
            case 3:
                Object obj2 = this.a;
                iyn.a.r("Error getting options list data for settings options, conversationId: ".concat(String.valueOf(String.valueOf(((iyn) obj2).x))), (Throwable) obj);
                return;
            case 4:
                this.a.a(obj);
                return;
            case 5:
                this.a.a(obj);
                return;
            case 6:
                this.a.a(obj);
                return;
            case 7:
                this.a.a(obj);
                return;
            case 8:
                this.a.a(obj);
                return;
            case 9:
                this.a.a(obj);
                return;
            case 10:
                this.a.a(obj);
                return;
            case 11:
                this.a.a(obj);
                return;
            case 12:
                this.a.a(obj);
                return;
            case 13:
                this.a.a(obj);
                return;
            case 14:
                ((klf) obj).a((SpannableStringBuilder) this.a);
                return;
            case 15:
                ((HashMap) this.a).remove((ConversationIdType) obj);
                return;
            case 16:
                MessageCoreData messageCoreData = (MessageCoreData) obj;
                Uri t = messageCoreData.t();
                Object obj3 = this.a;
                if (t == null) {
                    ((knt) obj3).d.i("messageUri is null");
                } else {
                    knt kntVar = (knt) obj3;
                    if (kntVar.a.getContentResolver().delete(t, null, null) != 1) {
                        knl g = kntVar.d.g();
                        g.H("deleteTelephonyMessage failed");
                        g.z("messageUri", t);
                        g.q();
                    } else {
                        knl h = kntVar.d.h();
                        h.H("message deleted from telephony db");
                        h.z("messageUri", t);
                        h.q();
                    }
                }
                MessageIdType B = messageCoreData.B();
                if (B.b()) {
                    ((knt) obj3).d.i("messageId is null");
                    return;
                }
                knt kntVar2 = (knt) obj3;
                if (((uzo) kntVar2.b.b()).a(B) != 1) {
                    knl g2 = kntVar2.d.g();
                    g2.H("deleteLocalMessage failed");
                    g2.z("messageId", B);
                    g2.q();
                    return;
                }
                knl h2 = kntVar2.d.h();
                h2.H("message deleted from bugle db");
                h2.z("messageId", B);
                h2.q();
                return;
            case 17:
                this.a.add((String) obj);
                return;
            case 18:
                this.a.add((String) obj);
                return;
            case 19:
                this.a.add((String) obj);
                return;
            default:
                ((Intent) this.a).putExtra("report_issue_type_value_extra", ((amme) obj).o);
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

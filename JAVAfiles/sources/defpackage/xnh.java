package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xnh implements xhc {
    public static final /* synthetic */ int a = 0;
    private static final xze b = xze.g("Bugle", "CopyFileTelephonyPartsCallback");
    private static final xyw c = new xyw(TimeUnit.SECONDS.toMillis(10));
    private static final utz d = uuh.k(uuh.b, "delete_message_part_batch_size", 50);
    private final armf e;
    private final vyv f;
    private final vyv g;

    public xnh(vyv vyvVar, vyv vyvVar2, armf armfVar) {
        this.g = vyvVar;
        this.f = vyvVar2;
        this.e = armfVar;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [armf, java.lang.Object] */
    private final void e(tbn tbnVar) {
        if (tbnVar.getCount() > ((Integer) d.e()).intValue()) {
            xyo c2 = b.c();
            c2.H("Requested to delete more than 50 messages. Dividing work into batches of 50 messages.");
            c2.x("Total message count", tbnVar.getCount());
            c2.q();
        }
        aozy createBuilder = xgp.a.createBuilder();
        while (tbnVar.moveToNext()) {
            String R = tbnVar.R();
            if (R != null) {
                aozy createBuilder2 = xgo.a.createBuilder();
                String Q = tbnVar.Q();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar = createBuilder2.b;
                Q.getClass();
                ((xgo) apagVar).b = Q;
                if (!apagVar.isMutable()) {
                    createBuilder2.u();
                }
                ((xgo) createBuilder2.b).c = R;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                xgp xgpVar = (xgp) createBuilder.b;
                xgo xgoVar = (xgo) createBuilder2.s();
                xgoVar.getClass();
                apax apaxVar = xgpVar.b;
                if (!apaxVar.c()) {
                    xgpVar.b = apag.mutableCopy(apaxVar);
                }
                xgpVar.b.add(xgoVar);
                if (((xgp) createBuilder.b).b.size() == 100 || tbnVar.isLast()) {
                    ((uof) this.g.a.b()).a(upk.a("delete_parts_work_item", (xgp) createBuilder.s()));
                    if (!createBuilder.a.isMutable()) {
                        createBuilder.b = createBuilder.r();
                    } else {
                        throw new IllegalArgumentException("Default instance must be immutable.");
                    }
                }
            }
        }
    }

    @Override // defpackage.xhc
    public final void a(ConversationIdType conversationIdType) {
        xyo c2 = b.c();
        c2.H("onDeletingConversation");
        c2.z("conversationId", conversationIdType);
        c2.q();
        tbs d2 = PartsTable.d();
        d2.w("onDeletingConversation");
        d2.g(new xgt(conversationIdType, 17));
        d2.d(new xgv(17));
        tbn tbnVar = (tbn) d2.b().n();
        try {
            e(tbnVar);
            tbnVar.close();
        } catch (Throwable th) {
            try {
                tbnVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.xhc
    public final void b(ConversationIdType conversationIdType, List list) {
        xyo c2 = b.c();
        c2.H("App is deleting messages. Deleting related files from disk.");
        c2.z("conversationId", conversationIdType);
        c2.q();
        tbs d2 = PartsTable.d();
        d2.w("+onDeletingMessages");
        d2.g(new uzn(conversationIdType, list, 15, null));
        d2.d(new xgv(19));
        tbn tbnVar = (tbn) d2.b().n();
        try {
            e(tbnVar);
            tbnVar.close();
        } catch (Throwable th) {
            try {
                tbnVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.xhc
    public final void c(MessagePartCoreData messagePartCoreData) {
        if (messagePartCoreData.Z() == null) {
            xyo e = b.e();
            e.H("Invoked telephony callback. Part does not have id yet");
            e.z("part.getMessageId", messagePartCoreData.A());
            e.J(c, "missing_id");
            e.q();
            return;
        }
        Uri t = messagePartCoreData.t();
        if (t == null) {
            xyo c2 = b.c();
            c2.H("Inserted part has no URI, not copying to local cache");
            c2.z("partId", messagePartCoreData.Z());
            c2.J(c, "content_uri_null");
            c2.q();
            return;
        }
        if (!"mms".equals(t.getAuthority())) {
            xyo c3 = b.c();
            c3.H("Ignoring on part inserted. It was not inserting to telephony.");
            c3.z("messagePart.getContentUri().getAuthority()", t.getAuthority());
            c3.z("part.getMessageId", messagePartCoreData.A());
            c3.q();
            return;
        }
        xyo c4 = b.c();
        c4.H("Invoked telephony callback. Scheduling update.");
        c4.z("part.getContentUri().getAuthority()", t.getAuthority());
        c4.z("part.getMessageId", messagePartCoreData.A());
        c4.z("part.getPartId()", messagePartCoreData.Z());
        c4.J(c, "scheduling");
        c4.q();
        vyv vyvVar = this.f;
        String Z = messagePartCoreData.Z();
        aozy createBuilder = xgn.a.createBuilder();
        aozy createBuilder2 = xgm.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        xgm xgmVar = (xgm) createBuilder2.b;
        Z.getClass();
        xgmVar.b = Z;
        String uri = t.toString();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        xgm xgmVar2 = (xgm) createBuilder2.b;
        uri.getClass();
        xgmVar2.c = uri;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        xgn xgnVar = (xgn) createBuilder.b;
        xgm xgmVar3 = (xgm) createBuilder2.s();
        xgmVar3.getClass();
        apax apaxVar = xgnVar.b;
        if (!apaxVar.c()) {
            xgnVar.b = apag.mutableCopy(apaxVar);
        }
        Object obj = vyvVar.a;
        xgnVar.b.add(xgmVar3);
        ((uof) obj).a(upk.a("CopyFileTelephonyPartHandler", createBuilder.s()));
    }

    @Override // defpackage.xhc
    public final void d(String str) {
        MessagePartCoreData a2 = ((rxc) this.e.b()).a(str);
        if (a2 == null) {
            xyo b2 = b.b();
            b2.H("Unable to store attachment copy for non-existent part");
            b2.z("partId", str);
            b2.q();
            return;
        }
        c(a2);
    }
}

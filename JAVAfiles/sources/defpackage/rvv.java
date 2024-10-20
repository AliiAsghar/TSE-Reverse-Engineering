package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rvv {
    public static final xze a = xze.g("BugleDataModel", "ConversationMessageListDatabaseOperations");
    public final armf b;
    public final armf c;

    public rvv(armf armfVar, armf armfVar2) {
        this.b = armfVar;
        this.c = armfVar2;
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v0, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [armf, java.lang.Object] */
    public static List b(armf armfVar, sbd sbdVar) {
        akrh e = aktp.e("ConversationMessageListDatabaseOperations#bindConversationMessageDataCursor");
        try {
            vid vidVar = (vid) armfVar.b();
            ArrayList arrayList = new ArrayList(sbdVar.getCount());
            rry rryVar = null;
            rry rryVar2 = null;
            while (sbdVar.moveToNext()) {
                xvc xvcVar = (xvc) vidVar.i.b();
                xvcVar.getClass();
                rtb rtbVar = (rtb) vidVar.g.b();
                rtbVar.getClass();
                rvx rvxVar = (rvx) vidVar.b.b();
                rvxVar.getClass();
                trz trzVar = (trz) vidVar.f.b();
                trzVar.getClass();
                iew iewVar = (iew) vidVar.l.b();
                iewVar.getClass();
                msk mskVar = (msk) vidVar.j.b();
                mskVar.getClass();
                ?? b = vidVar.k.b();
                b.getClass();
                Object obj = vidVar.c;
                ?? r14 = vidVar.n;
                uli uliVar = (uli) vidVar.e.b();
                uliVar.getClass();
                ujx ujxVar = (ujx) vidVar.m.b();
                ujxVar.getClass();
                ?? r6 = vidVar.a;
                ?? b2 = vidVar.h.b();
                b2.getClass();
                rry rryVar3 = new rry(xvcVar, rtbVar, rvxVar, trzVar, iewVar, mskVar, b, r14, uliVar, ujxVar, r6, b2, vidVar.d, sbdVar, null);
                arrayList.add(rryVar3);
                if (rryVar2 != null) {
                    if (rryVar2.ax(rryVar3)) {
                        rryVar2.aY(rryVar3);
                        rryVar3.aX(rryVar2);
                    } else {
                        rryVar3.aY(rryVar2);
                        rryVar2.aX(rryVar3);
                        rryVar2 = rryVar3;
                    }
                }
                rryVar = rryVar3;
                rryVar2 = rryVar3;
            }
            if (rryVar != null) {
                rryVar.n = true;
            }
            e.close();
            return arrayList;
        } finally {
        }
    }

    public final List a(Collection collection) {
        akrh e = aktp.e("ConversationMessageListDatabaseOperations#loadConversationMessagesIn");
        try {
            xyl.h();
            xyl.q(collection.size());
            xyo a2 = a.a();
            a2.H("ConversationMessageListDatabaseOperations LoadConversationMessagesIn starts.");
            a2.q();
            sbd sbdVar = (sbd) ((ibi) this.c.b()).p((MessageIdType[]) collection.toArray(new MessageIdType[0])).n();
            try {
                List b = b(this.b, sbdVar);
                sbdVar.close();
                e.close();
                return b;
            } finally {
            }
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

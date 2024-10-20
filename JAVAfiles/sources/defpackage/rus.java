package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rus {
    private static final xze a = xze.g("BugleDataModel", "ConversationRecipientDatabaseOperations");
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;

    public rus(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List, java.lang.Object] */
    public final alog a(ConversationIdType conversationIdType, boolean z) {
        alog n;
        msh s;
        akrh e = aktp.e("ConversationRecipientDatabaseOperationsImpl#getRecipientsForConversation");
        try {
            xyl.h();
            List K = ((rtz) this.e.b()).K(conversationIdType);
            alob alobVar = new alob();
            alur it = ((alog) K).iterator();
            while (it.hasNext()) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                if (z) {
                    s = ((msk) this.d.b()).q(bindData);
                } else {
                    s = ((msk) this.d.b()).s(bindData);
                }
                if (!agkx.ae(s.m())) {
                    alobVar.h(s);
                }
            }
            if (((alsx) alobVar.g()).c < ((alsx) K).c) {
                ((mbl) this.b.b()).c("Bugle.Datamodel.Operations.EmptyRecipient.Found");
                alob alobVar2 = new alob();
                ugw ugwVar = (ugw) this.c.b();
                alog g = alobVar.g();
                aiut.b();
                Optional b = ugwVar.b(conversationIdType, ((alsx) K).c, ((alsx) g).c);
                if (b.isPresent()) {
                    n = ugwVar.a(b.get());
                    ugwVar.c(K, n);
                } else {
                    n = alog.n(g);
                }
                alobVar2.j(n);
                alobVar = alobVar2;
            }
            alog g2 = alobVar.g();
            e.close();
            return g2;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[SYNTHETIC] */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r0 = "ConversationRecipientDatabaseOperationsImpl#getRecipientsForConversationLegacy"
            akrh r0 = defpackage.aktp.e(r0)
            defpackage.xyl.h()     // Catch: java.lang.Throwable -> Lb5
            armf r1 = r7.e     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> Lb5
            rtz r1 = (defpackage.rtz) r1     // Catch: java.lang.Throwable -> Lb5
            java.util.List r1 = r1.K(r8)     // Catch: java.lang.Throwable -> Lb5
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb5
            r3 = r1
            alsx r3 = (defpackage.alsx) r3     // Catch: java.lang.Throwable -> Lb5
            int r3 = r3.c     // Catch: java.lang.Throwable -> Lb5
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lb5
            r3 = r1
            alog r3 = (defpackage.alog) r3     // Catch: java.lang.Throwable -> Lb5
            alur r3 = r3.iterator()     // Catch: java.lang.Throwable -> Lb5
        L26:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> Lb5
            if (r4 == 0) goto L6e
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> Lb5
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r4 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r4     // Catch: java.lang.Throwable -> Lb5
            if (r9 == 0) goto L40
            boolean r5 = defpackage.rxn.s(r4)     // Catch: java.lang.Throwable -> Lb5
            if (r5 == 0) goto L3b
            goto L40
        L3b:
            java.lang.String r5 = r4.O()     // Catch: java.lang.Throwable -> Lb5
            goto L4e
        L40:
            java.lang.String r5 = r4.P()     // Catch: java.lang.Throwable -> Lb5
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Lb5
            if (r6 == 0) goto L4e
            java.lang.String r5 = r4.O()     // Catch: java.lang.Throwable -> Lb5
        L4e:
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Lb5
            if (r6 == 0) goto L6a
            xze r5 = defpackage.rus.a     // Catch: java.lang.Throwable -> Lb5
            xyo r5 = r5.e()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r6 = "Found participant with empty destination."
            r5.H(r6)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r4 = r4.M()     // Catch: java.lang.Throwable -> Lb5
            r5.e(r4)     // Catch: java.lang.Throwable -> Lb5
            r5.q()     // Catch: java.lang.Throwable -> Lb5
            goto L26
        L6a:
            r2.add(r5)     // Catch: java.lang.Throwable -> Lb5
            goto L26
        L6e:
            int r9 = r2.size()     // Catch: java.lang.Throwable -> Lb5
            r3 = r1
            alsx r3 = (defpackage.alsx) r3     // Catch: java.lang.Throwable -> Lb5
            int r3 = r3.c     // Catch: java.lang.Throwable -> Lb5
            if (r9 >= r3) goto Lb1
            armf r9 = r7.b     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r9 = r9.b()     // Catch: java.lang.Throwable -> Lb5
            mbl r9 = (defpackage.mbl) r9     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r3 = "Bugle.Datamodel.Operations.EmptyRecipient.Found"
            r9.c(r3)     // Catch: java.lang.Throwable -> Lb5
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb5
            armf r3 = r7.c     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> Lb5
            ugw r3 = (defpackage.ugw) r3     // Catch: java.lang.Throwable -> Lb5
            defpackage.aiut.b()     // Catch: java.lang.Throwable -> Lb5
            r4 = r1
            alsx r4 = (defpackage.alsx) r4     // Catch: java.lang.Throwable -> Lb5
            int r4 = r4.c     // Catch: java.lang.Throwable -> Lb5
            int r5 = r2.size()     // Catch: java.lang.Throwable -> Lb5
            j$.util.Optional r8 = r3.b(r8, r4, r5)     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r8 = r8.orElse(r2)     // Catch: java.lang.Throwable -> Lb5
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> Lb5
            alog r2 = r3.a(r8)     // Catch: java.lang.Throwable -> Lb5
            r3.c(r1, r2)     // Catch: java.lang.Throwable -> Lb5
            r9.<init>(r8)     // Catch: java.lang.Throwable -> Lb5
            r2 = r9
        Lb1:
            r0.close()
            return r2
        Lb5:
            r8 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Lba
            goto Lbe
        Lba:
            r9 = move-exception
            r8.addSuppressed(r9)
        Lbe:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rus.b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, boolean):java.util.ArrayList");
    }
}

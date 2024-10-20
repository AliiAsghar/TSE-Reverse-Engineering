package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nby implements ncj {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingCompleteStatusHandler");
    private final xnv b;

    public nby(xnv xnvVar) {
        xnvVar.getClass();
        this.b = xnvVar;
    }

    private static final String b(Resources resources, MessagesTable.BindData bindData, int i) {
        String string = resources.getString(i);
        string.getClass();
        alvg alvgVar = (alvg) a.g().h("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingCompleteStatusHandler", "getAndLogString", 74, "OutgoingCompleteStatusHandler.kt");
        Object A = bindData.A();
        if (A == null) {
            A = -1;
        }
        alvgVar.D("Message with id %x has status %s", A, string);
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    @Override // defpackage.ncj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.nbv a(android.content.res.Resources r18, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData r19, defpackage.alog r20, defpackage.ifs r21, defpackage.mzx r22, defpackage.mll r23) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            r18.getClass()
            r19.getClass()
            r20.getClass()
            r21.getClass()
            r22.getClass()
            int r2 = r19.k()
            int r3 = r19.k()
            r4 = 1
            r5 = 0
            r6 = 3
            if (r3 != r6) goto L28
            boolean r3 = r23.F()
            if (r3 != 0) goto L28
            r11 = r4
            goto L29
        L28:
            r11 = r5
        L29:
            j$.time.Instant r3 = r23.y()
            int r7 = r19.k()
            if (r7 != r6) goto L56
            int r7 = r19.q()
            r8 = 14
            if (r7 == r8) goto L56
            if (r3 == 0) goto L56
            long r7 = r19.v()
            j$.time.Instant r7 = j$.time.Instant.ofEpochMilli(r7)
            boolean r3 = r7.isAfter(r3)
            if (r3 == 0) goto L56
            r3 = 2132019597(0x7f14098d, float:1.9677533E38)
            java.lang.String r0 = b(r0, r1, r3)
            r3 = r17
        L54:
            r8 = r0
            goto La5
        L56:
            int r3 = r19.k()
            r7 = 0
            if (r3 != r6) goto La2
            boolean r3 = r23.F()
            if (r3 != 0) goto La2
            boolean r3 = r23.D()
            if (r3 == 0) goto La2
            r3 = r17
            xnv r8 = r3.b
            j$.time.Instant r8 = r8.f()
            long r8 = r8.toEpochMilli()
            j$.time.Instant r8 = j$.time.Instant.ofEpochMilli(r8)
            uuf r9 = defpackage.ncu.b
            java.lang.Object r9 = r9.e()
            r9.getClass()
            java.lang.Number r9 = (java.lang.Number) r9
            long r9 = r9.longValue()
            j$.time.Instant r8 = r8.minusMillis(r9)
            long r9 = r19.v()
            j$.time.Instant r9 = j$.time.Instant.ofEpochMilli(r9)
            boolean r8 = r8.isAfter(r9)
            if (r8 == 0) goto La4
            r7 = 2132019595(0x7f14098b, float:1.967753E38)
            java.lang.String r0 = b(r0, r1, r7)
            goto L54
        La2:
            r3 = r17
        La4:
            r8 = r7
        La5:
            tqf r0 = r19.G()
            if (r0 != 0) goto Lad
            tqf r0 = defpackage.tqf.UNKNOWN
        Lad:
            tqf r1 = defpackage.tqf.CFS_AUTO_FALLBACK_ON_OUTGOING_FAILURE
            if (r0 != r1) goto Lb3
            r13 = r4
            goto Lb4
        Lb3:
            r13 = r5
        Lb4:
            if (r2 != r6) goto Lb8
            r10 = r4
            goto Lb9
        Lb8:
            r10 = r5
        Lb9:
            nbv r0 = new nbv
            r15 = 0
            r16 = 208(0xd0, float:2.91E-43)
            r9 = 1
            r12 = 0
            r14 = 0
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nby.a(android.content.res.Resources, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData, alog, ifs, mzx, mll):nbv");
    }
}

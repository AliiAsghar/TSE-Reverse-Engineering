package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class txc extends arpw implements arqv {
    Object a;
    int b;
    final /* synthetic */ txe c;
    final /* synthetic */ twz d;
    final /* synthetic */ ConversationIdType e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public txc(txe txeVar, twz twzVar, ConversationIdType conversationIdType, arpe arpeVar) {
        super(2, arpeVar);
        this.c = txeVar;
        this.d = twzVar;
        this.e = conversationIdType;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((txc) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x018d, code lost:
    
        if (r12.plusMillis(r5.longValue()).isBefore(((defpackage.xnv) r4.h.b()).f()) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01a0, code lost:
    
        if (r12 == r0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c1, code lost:
    
        if (r12 == r0) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0126  */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new txc(this.c, this.d, this.e, arpeVar);
    }
}

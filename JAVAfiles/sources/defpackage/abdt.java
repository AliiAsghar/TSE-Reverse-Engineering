package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abdt extends arpw implements arqv {
    int a;
    final /* synthetic */ abdv b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ long d;
    final /* synthetic */ int e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abdt(abdv abdvVar, ConversationIdType conversationIdType, long j, int i, arpe arpeVar, int i2) {
        super(2, arpeVar);
        this.f = i2;
        this.b = abdvVar;
        this.c = conversationIdType;
        this.d = j;
        this.e = i;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                return ((abdt) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }
            return ((abdt) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((abdt) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r3 != 1) goto L18;
     */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abdt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                return new abdt(this.b, this.c, this.d, this.e, arpeVar, 2, (char[]) null);
            }
            return new abdt(this.b, this.c, this.d, this.e, arpeVar, 1, (byte[]) null);
        }
        return new abdt(this.b, this.c, this.d, this.e, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abdt(abdv abdvVar, ConversationIdType conversationIdType, long j, int i, arpe arpeVar, int i2, byte[] bArr) {
        super(2, arpeVar);
        this.f = i2;
        this.b = abdvVar;
        this.c = conversationIdType;
        this.d = j;
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abdt(abdv abdvVar, ConversationIdType conversationIdType, long j, int i, arpe arpeVar, int i2, char[] cArr) {
        super(2, arpeVar);
        this.f = i2;
        this.b = abdvVar;
        this.c = conversationIdType;
        this.d = j;
        this.e = i;
    }
}

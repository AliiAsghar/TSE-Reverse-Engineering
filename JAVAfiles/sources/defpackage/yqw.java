package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yqw extends arpw implements arqv {
    Object a;
    int b;
    final /* synthetic */ MessageIdType c;
    final /* synthetic */ yqx d;
    final /* synthetic */ List e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqw(MessageIdType messageIdType, yqx yqxVar, List list, arpe arpeVar) {
        super(2, arpeVar);
        this.c = messageIdType;
        this.d = yqxVar;
        this.e = list;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yqw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008c, code lost:
    
        if (((java.lang.Boolean) r0).booleanValue() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x018b, code lost:
    
        if (r1.b(r0, r20) == r8) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01b0, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0082, code lost:
    
        if (r0 == r8) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x005b, code lost:
    
        if (r0 != r8) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0159  */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yqw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new yqw(this.c, this.d, this.e, arpeVar);
    }
}

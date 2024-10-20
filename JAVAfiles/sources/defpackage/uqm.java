package defpackage;

import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uqm extends arpw implements arqv {
    Object a;
    Object b;
    int c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqm(arwl arwlVar, uqo uqoVar, upr uprVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.g = i;
        this.d = arwlVar;
        this.e = uqoVar;
        this.f = uprVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.g;
        if (i != 0) {
            if (i != 1) {
                return ((uqm) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }
            return ((uqm) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((uqm) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a1, code lost:
    
        if (r7.n(r18) == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x018b, code lost:
    
        if (r8 == r1) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23, types: [ascv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2, types: [arwl] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uqm.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, arwl] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, arqr] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        int i = this.g;
        if (i != 0) {
            if (i != 1) {
                return new uqm((yyz) this.f, (List) this.d, (zbe) this.e, arpeVar, 2);
            }
            Object obj2 = this.e;
            return new uqm((IncomingDraft) obj2, (jrf) this.f, (arqr) this.d, arpeVar, 1);
        }
        return new uqm((arwl) this.d, (uqo) this.e, (upr) this.f, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqm(IncomingDraft incomingDraft, jrf jrfVar, arqr arqrVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.g = i;
        this.e = incomingDraft;
        this.f = jrfVar;
        this.d = arqrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqm(yyz yyzVar, List list, zbe zbeVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.g = i;
        this.f = yyzVar;
        this.d = list;
        this.e = zbeVar;
    }
}

package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lvl extends arpw implements arqr {
    Object a;
    int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvl(arsb arsbVar, eij eijVar, arrz arrzVar, arpe arpeVar, int i) {
        super(1, arpeVar);
        this.f = i;
        this.e = arsbVar;
        this.c = eijVar;
        this.d = arrzVar;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                arpe arpeVar = (arpe) obj;
                Object obj2 = this.c;
                return new lvl((lwh) obj2, (UUID) this.d, (arrz) this.e, arpeVar, 2).b(arnb.a);
            }
            arpe arpeVar2 = (arpe) obj;
            Object obj3 = this.e;
            Object obj4 = this.c;
            return new lvl((arsb) obj3, (eij) obj4, (arrz) this.d, arpeVar2, 1).b(arnb.a);
        }
        arpe arpeVar3 = (arpe) obj;
        Object obj5 = this.c;
        Object obj6 = this.d;
        return new lvl((lvu) obj5, (UUID) obj6, (arrz) this.e, arpeVar3, 0).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r7.l((java.util.UUID) r3, r4, r6) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010e, code lost:
    
        if (r7.l((java.util.UUID) r3, r4, r6) == r0) goto L60;
     */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lvl.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvl(lvu lvuVar, UUID uuid, arrz arrzVar, arpe arpeVar, int i) {
        super(1, arpeVar);
        this.f = i;
        this.c = lvuVar;
        this.d = uuid;
        this.e = arrzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvl(lwh lwhVar, UUID uuid, arrz arrzVar, arpe arpeVar, int i) {
        super(1, arpeVar);
        this.f = i;
        this.c = lwhVar;
        this.d = uuid;
        this.e = arrzVar;
    }
}

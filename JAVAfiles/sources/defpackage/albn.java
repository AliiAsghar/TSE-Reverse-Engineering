package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class albn extends arpw implements arqv {
    Object a;
    int b;
    final /* synthetic */ arqv c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public albn(ahlp ahlpVar, arqv arqvVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.d = ahlpVar;
        this.c = arqvVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((albn) c((asaj) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((albn) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:3|(1:(1:(3:7|8|9)(5:11|12|13|14|15))(1:21))(1:29)|22|23|(3:25|14|15)|17) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        if (r2.fv(r8, r7) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        r3 = r8;
        r8 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003e, code lost:
    
        if (r8.fv(r4, r7) != r0) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.albn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        if (this.f != 0) {
            albn albnVar = new albn(this.c, this.d, arpeVar, 1);
            albnVar.e = obj;
            return albnVar;
        }
        albn albnVar2 = new albn((ahlp) this.d, this.c, arpeVar, 0);
        albnVar2.e = obj;
        return albnVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public albn(arqv arqvVar, Object obj, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.c = arqvVar;
        this.d = obj;
    }
}

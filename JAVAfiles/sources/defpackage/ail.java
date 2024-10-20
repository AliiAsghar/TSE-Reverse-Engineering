package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ail extends arpv implements arqv<cqg, arpe<? super crc>, Object> {
    long a;
    int b;
    final /* synthetic */ crc c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ail(crc crcVar, arpe arpeVar) {
        super(arpeVar);
        this.c = crcVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ail) c((cqg) obj, (arpe) obj2)).b(arnb.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0032 -> B:4:0x0034). Please report as a decompilation issue!!! */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r6.b
            if (r1 == 0) goto L10
            long r1 = r6.a
            java.lang.Object r3 = r6.d
            cqg r3 = (defpackage.cqg) r3
            defpackage.aqil.P(r7)
            goto L34
        L10:
            defpackage.aqil.P(r7)
            java.lang.Object r7 = r6.d
            cqg r7 = (defpackage.cqg) r7
            crc r1 = r6.c
            deo r2 = r7.q()
            r2.h()
            long r1 = r1.b
            r3 = 40
            long r1 = r1 + r3
            r3 = r7
        L26:
            r6.d = r3
            r6.a = r1
            r7 = 1
            r6.b = r7
            r7 = 3
            java.lang.Object r7 = defpackage.aik.j(r3, r6, r7)
            if (r7 == r0) goto L3e
        L34:
            crc r7 = (defpackage.crc) r7
            long r4 = r7.b
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 >= 0) goto L3d
            goto L26
        L3d:
            return r7
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ail.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        ail ailVar = new ail(this.c, arpeVar);
        ailVar.d = obj;
        return ailVar;
    }
}

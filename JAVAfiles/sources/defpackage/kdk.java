package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdk extends arpw implements arqv {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    int g;
    final /* synthetic */ ascd h;
    final /* synthetic */ ascg i;
    final /* synthetic */ miz j;
    final /* synthetic */ iji k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdk(ascd ascdVar, ascg ascgVar, miz mizVar, iji ijiVar, arpe arpeVar) {
        super(2, arpeVar);
        this.h = ascdVar;
        this.i = ascgVar;
        this.j = mizVar;
        this.k = ijiVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((kdk) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x003e -> B:4:0x0041). Please report as a decompilation issue!!! */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r11.g
            if (r1 == 0) goto L16
            java.lang.Object r1 = r11.f
            java.lang.Object r2 = r11.e
            java.lang.Object r3 = r11.d
            java.lang.Object r4 = r11.c
            java.lang.Object r5 = r11.b
            java.lang.Object r6 = r11.a
            defpackage.aqil.P(r12)
            goto L41
        L16:
            defpackage.aqil.P(r12)
            ascd r12 = r11.h
            ascg r1 = r11.i
            miz r2 = r11.j
            iji r3 = r11.k
            r6 = r12
            r5 = r1
            r4 = r2
        L24:
            java.lang.Object r2 = r6.c()
            r1 = r2
            aexx r1 = (defpackage.aexx) r1
            r11.a = r6
            r11.b = r5
            r11.c = r4
            r11.d = r3
            r11.e = r2
            r11.f = r1
            r12 = 1
            r11.g = r12
            java.lang.Object r12 = defpackage.arrn.U(r5, r11)
            if (r12 != r0) goto L41
            return r0
        L41:
            ueu r12 = (defpackage.ueu) r12
            r7 = 0
            if (r12 == 0) goto L49
            java.lang.String r8 = r12.a
            goto L4a
        L49:
            r8 = r7
        L4a:
            if (r12 == 0) goto L4e
            android.net.Uri r7 = r12.b
        L4e:
            if (r8 == 0) goto L79
            if (r7 == 0) goto L79
            r12 = r3
            iji r12 = (defpackage.iji) r12
            java.lang.Object r12 = r12.c
            alvi r9 = defpackage.khp.a
            r4.getClass()
            aexy r9 = new aexy
            mje r10 = r4.c()
            android.content.Context r12 = (android.content.Context) r12
            java.lang.String r12 = defpackage.khp.a(r10, r12)
            aeyb r10 = new aeyb
            r10.<init>(r7)
            r9.<init>(r12, r8, r10)
            aexx r1 = (defpackage.aexx) r1
            arqg r12 = r1.b
            aexx r1 = new aexx
            r1.<init>(r9, r12)
        L79:
            boolean r12 = r6.g(r2, r1)
            if (r12 != 0) goto L80
            goto L24
        L80:
            arnb r12 = defpackage.arnb.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kdk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new kdk(this.h, this.i, this.j, this.k, arpeVar);
    }
}

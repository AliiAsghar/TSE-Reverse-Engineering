package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aill extends ailp implements Comparable {
    public final atmb a;
    public final atng b;
    private final String c;
    private final String d;
    private final ailo e;

    public aill(atmb atmbVar, atng atngVar, String str, String str2, ailo ailoVar) {
        atmbVar.getClass();
        this.a = atmbVar;
        atngVar.getClass();
        this.b = atngVar;
        str.getClass();
        this.c = str;
        str2.getClass();
        this.d = str2;
        this.e = ailoVar;
    }

    @Override // defpackage.ailp
    public final int a() {
        return this.b.c;
    }

    @Override // defpackage.ailp
    public final ailh b() {
        String atmkVar = this.b.f.toString();
        advp advpVar = ailk.a;
        if (atmkVar.startsWith("_sip._udp")) {
            return ailh.UDP;
        }
        if (atmkVar.startsWith("_sip._tcp")) {
            return ailh.TCP;
        }
        if (atmkVar.startsWith("_sips._tcp")) {
            return ailh.TLS;
        }
        advr.r(ailk.a, "NAPTR response contains unknown protocol: %s", atmkVar);
        return null;
    }

    @Override // defpackage.ailp
    public final String c() {
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r1.equals(r7.b()) != false) goto L15;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ int compareTo(java.lang.Object r7) {
        /*
            r6 = this;
            aill r7 = (defpackage.aill) r7
            if (r6 != r7) goto L7
            r7 = 0
            goto L7c
        L7:
            r0 = -1
            if (r7 != 0) goto Ld
        La:
            r7 = r0
            goto L7c
        Ld:
            ailo r1 = r6.e
            ailh r2 = r6.b()
            ailh r3 = r7.b()
            boolean r2 = j$.util.Objects.equals(r2, r3)
            r3 = 1
            if (r2 != 0) goto L37
            ailh r1 = r1.c
            ailh r2 = r6.b()
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L2b
            goto La
        L2b:
            ailh r2 = r7.b()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L37
        L35:
            r7 = r3
            goto L7c
        L37:
            ailo r1 = r6.e
            boolean r1 = r1.b
            if (r1 == 0) goto L4f
            boolean r1 = r6.e()
            boolean r2 = r7.e()
            if (r1 == r2) goto L4f
            boolean r7 = r6.e()
            if (r7 != 0) goto L4e
            goto L35
        L4e:
            return r0
        L4f:
            atmb r1 = r6.a
            atmb r2 = r7.a
            int r4 = r1.a
            int r5 = r2.a
            if (r4 == r5) goto L5c
            int r7 = r4 - r5
            goto L7c
        L5c:
            int r1 = r1.b
            int r2 = r2.b
            if (r1 == r2) goto L65
            int r7 = r1 - r2
            goto L7c
        L65:
            atng r1 = r6.b
            atng r7 = r7.b
            int r2 = r1.a
            int r4 = r7.a
            if (r2 == r4) goto L72
            int r7 = r2 - r4
            goto L7c
        L72:
            int r1 = r1.b
            int r7 = r7.b
            if (r1 > 0) goto L79
            goto L35
        L79:
            if (r7 > 0) goto L7d
            goto La
        L7c:
            return r7
        L7d:
            int r7 = r7 - r1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aill.compareTo(java.lang.Object):int");
    }

    @Override // defpackage.ailp
    public final String d() {
        return this.c;
    }
}

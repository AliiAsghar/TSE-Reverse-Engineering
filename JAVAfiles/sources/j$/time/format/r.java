package j$.time.format;

import j$.time.temporal.TemporalField;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class r implements InterfaceC0086f {
    private final TemporalField a;
    private final H b;
    private final C c;
    private volatile j d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(TemporalField temporalField, H h, C c) {
        this.a = temporalField;
        this.b = h;
        this.c = c;
    }

    @Override // j$.time.format.InterfaceC0086f
    public final boolean n(z zVar, StringBuilder sb) {
        String f;
        Long e = zVar.e(this.a);
        if (e == null) {
            return false;
        }
        j$.time.chrono.m mVar = (j$.time.chrono.m) zVar.d().D(j$.time.temporal.j.e());
        if (mVar != null && mVar != j$.time.chrono.t.d) {
            f = this.c.e(mVar, this.a, e.longValue(), this.b, zVar.c());
        } else {
            f = this.c.f(this.a, e.longValue(), this.b, zVar.c());
        }
        if (f == null) {
            if (this.d == null) {
                this.d = new j(this.a, 1, 19, G.NORMAL);
            }
            return this.d.n(zVar, sb);
        }
        sb.append(f);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r0 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r0.hasNext() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r2 = (java.util.Map.Entry) r0.next();
        r4 = (java.lang.String) r2.getKey();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (r12.s(r4, 0, r13, r14, r4.length()) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        return r12.o(r11.a, ((java.lang.Long) r2.getValue()).longValue(), r14, r4.length() + r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        if (r3 != j$.time.temporal.ChronoField.ERA) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if (r12.l() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        r0 = r1.T().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        if (r0.hasNext() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        r8 = ((j$.time.chrono.n) r0.next()).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
    
        if (r12.s(r8, 0, r13, r14, r8.length()) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        return r12.o(r11.a, r1.getValue(), r14, r8.length() + r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b7, code lost:
    
        if (r12.l() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ba, code lost:
    
        return ~r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bd, code lost:
    
        if (r11.d != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bf, code lost:
    
        r11.d = new j$.time.format.j(r11.a, 1, 19, j$.time.format.G.NORMAL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
    
        return r11.d.t(r12, r13, r14);
     */
    @Override // j$.time.format.InterfaceC0086f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int t(j$.time.format.w r12, java.lang.CharSequence r13, int r14) {
        /*
            r11 = this;
            int r0 = r13.length()
            if (r14 < 0) goto Ld4
            if (r14 > r0) goto Ld4
            boolean r0 = r12.l()
            if (r0 == 0) goto L11
            j$.time.format.H r0 = r11.b
            goto L12
        L11:
            r0 = 0
        L12:
            j$.time.chrono.m r1 = r12.h()
            j$.time.format.C r2 = r11.c
            j$.time.temporal.TemporalField r3 = r11.a
            if (r1 == 0) goto L2a
            j$.time.chrono.t r4 = j$.time.chrono.t.d
            if (r1 != r4) goto L21
            goto L2a
        L21:
            java.util.Locale r4 = r12.i()
            java.util.Iterator r0 = r2.g(r1, r3, r0, r4)
            goto L32
        L2a:
            java.util.Locale r4 = r12.i()
            java.util.Iterator r0 = r2.h(r3, r0, r4)
        L32:
            if (r0 == 0) goto Lbb
        L34:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            int r10 = r4.length()
            r7 = 0
            r5 = r12
            r6 = r4
            r8 = r13
            r9 = r14
            boolean r5 = r5.s(r6, r7, r8, r9, r10)
            if (r5 == 0) goto L34
            java.lang.Object r13 = r2.getValue()
            java.lang.Long r13 = (java.lang.Long) r13
            long r7 = r13.longValue()
            int r13 = r4.length()
            int r10 = r13 + r14
            j$.time.temporal.TemporalField r6 = r11.a
            r5 = r12
            r9 = r14
            int r12 = r5.o(r6, r7, r9, r10)
            return r12
        L6e:
            j$.time.temporal.ChronoField r0 = j$.time.temporal.ChronoField.ERA
            if (r3 != r0) goto Lb3
            boolean r0 = r12.l()
            if (r0 != 0) goto Lb3
            java.util.List r0 = r1.T()
            java.util.Iterator r0 = r0.iterator()
        L80:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb3
            java.lang.Object r1 = r0.next()
            j$.time.chrono.n r1 = (j$.time.chrono.n) r1
            java.lang.String r8 = r1.toString()
            int r7 = r8.length()
            r4 = 0
            r2 = r12
            r3 = r8
            r5 = r13
            r6 = r14
            boolean r2 = r2.s(r3, r4, r5, r6, r7)
            if (r2 == 0) goto L80
            int r13 = r1.getValue()
            long r2 = (long) r13
            int r13 = r8.length()
            int r5 = r13 + r14
            j$.time.temporal.TemporalField r1 = r11.a
            r0 = r12
            r4 = r14
            int r12 = r0.o(r1, r2, r4, r5)
            return r12
        Lb3:
            boolean r0 = r12.l()
            if (r0 == 0) goto Lbb
            int r12 = ~r14
            return r12
        Lbb:
            j$.time.format.j r0 = r11.d
            if (r0 != 0) goto Lcd
            j$.time.format.j r0 = new j$.time.format.j
            j$.time.temporal.TemporalField r1 = r11.a
            j$.time.format.G r2 = j$.time.format.G.NORMAL
            r3 = 1
            r4 = 19
            r0.<init>(r1, r3, r4, r2)
            r11.d = r0
        Lcd:
            j$.time.format.j r0 = r11.d
            int r12 = r0.t(r12, r13, r14)
            return r12
        Ld4:
            java.lang.IndexOutOfBoundsException r12 = new java.lang.IndexOutOfBoundsException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.r.t(j$.time.format.w, java.lang.CharSequence, int):int");
    }

    public final String toString() {
        H h = H.FULL;
        TemporalField temporalField = this.a;
        H h2 = this.b;
        if (h2 == h) {
            return "Text(" + String.valueOf(temporalField) + ")";
        }
        return "Text(" + String.valueOf(temporalField) + "," + String.valueOf(h2) + ")";
    }
}

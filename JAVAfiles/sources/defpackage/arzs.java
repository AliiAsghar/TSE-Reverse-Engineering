package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arzs extends arzf {
    private final int g;
    private final int h;

    public arzs(int i, int i2) {
        super(i);
        this.g = i;
        this.h = i2;
        if (i2 != 1) {
            if (i > 0) {
                return;
            } else {
                throw new IllegalArgumentException(a.cb(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
            }
        }
        int i3 = arsc.a;
        throw new IllegalArgumentException("This implementation does not support suspension for senders, use " + new arrh(arzf.class).c() + " instead");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return defpackage.arnb.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object E(java.lang.Object r15) {
        /*
            r14 = this;
            asfn r8 = defpackage.arzh.d
            arve r0 = r14.c
            java.lang.Object r0 = r0.a
            arzo r0 = (defpackage.arzo) r0
        L8:
            arvd r1 = r14.a
            long r1 = r1.b()
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = super.z(r1)
            int r1 = defpackage.arzh.b
            long r1 = (long) r1
            long r3 = r9 / r1
            long r1 = r9 % r1
            int r12 = (int) r1
            long r1 = r0.b
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L3c
            arzo r1 = super.s(r3, r0)
            if (r1 != 0) goto L3a
            if (r11 == 0) goto L8
            java.lang.Throwable r15 = r14.q()
            arzl r0 = new arzl
            r0.<init>(r15)
            goto L9a
        L3a:
            r13 = r1
            goto L3d
        L3c:
            r13 = r0
        L3d:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = super.b(r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto L95
            r1 = 1
            if (r0 == r1) goto L92
            r1 = 2
            if (r0 == r1) goto L78
            r1 = 3
            if (r0 == r1) goto L70
            r1 = 4
            if (r0 == r1) goto L5b
            r13.p()
            r0 = r13
            goto L8
        L5b:
            long r0 = r14.g()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L66
            r13.p()
        L66:
            java.lang.Throwable r15 = r14.q()
            arzl r0 = new arzl
            r0.<init>(r15)
            goto L9a
        L70:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            r15.<init>(r0)
            throw r15
        L78:
            if (r11 == 0) goto L87
            r13.s()
            java.lang.Throwable r15 = r14.q()
            arzl r0 = new arzl
            r0.<init>(r15)
            goto L9a
        L87:
            long r0 = r13.b
            int r15 = defpackage.arzh.b
            long r2 = (long) r15
            long r0 = r0 * r2
            long r2 = (long) r12
            long r0 = r0 + r2
            r14.t(r0)
        L92:
            arnb r0 = defpackage.arnb.a
            goto L9a
        L95:
            r13.p()
            arnb r0 = defpackage.arnb.a
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arzs.E(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arzf
    protected final boolean A() {
        if (this.h == 2) {
            return true;
        }
        return false;
    }

    @Override // defpackage.arzf, defpackage.arzx
    public final Object a(Object obj, arpe arpeVar) {
        Object E = E(obj);
        if (!(E instanceof arzl)) {
            return arnb.a;
        }
        arzn.b(E);
        throw q();
    }

    @Override // defpackage.arzf, defpackage.arzx
    public final Object c(Object obj) {
        return E(obj);
    }
}

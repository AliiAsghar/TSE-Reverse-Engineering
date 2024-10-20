package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vva extends unp {
    private final vuz a;

    public vva(vuz vuzVar) {
        this.a = vuzVar;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("UpdateRcsGroupNameHandler");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (defpackage.apds.a(r7) >= 0) goto L16;
     */
    @Override // defpackage.unp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final /* bridge */ /* synthetic */ defpackage.akul d(defpackage.uns r7, defpackage.apbt r8) {
        /*
            r6 = this;
            vvb r8 = (defpackage.vvb) r8
            java.lang.String r7 = r8.h
            boolean r7 = r7.isEmpty()
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L17
            java.lang.String r7 = r8.c
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L15
            goto L17
        L15:
            r7 = r0
            goto L18
        L17:
            r7 = r1
        L18:
            java.lang.String r2 = "Conversation ID and RCS group ID are empty"
            defpackage.d.t(r7, r2)
            int r7 = r8.b
            r7 = r7 & r1
            if (r7 == 0) goto L32
            apct r7 = r8.f
            if (r7 != 0) goto L28
            apct r7 = defpackage.apct.a
        L28:
            long r2 = defpackage.apds.a(r7)
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L33
        L32:
            r0 = r1
        L33:
            java.lang.String r7 = "The timestamp provided is negative"
            defpackage.d.t(r0, r7)
            vuz r7 = r6.a
            akul r7 = r7.f(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vva.d(uns, apbt):akul");
    }

    @Override // defpackage.unx
    public final apca e() {
        return vvb.a.getParserForType();
    }
}

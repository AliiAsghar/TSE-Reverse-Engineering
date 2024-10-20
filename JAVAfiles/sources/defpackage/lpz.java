package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lpz extends arpv implements arqv {
    int a;
    final /* synthetic */ Cursor b;
    final /* synthetic */ arqr c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpz(Cursor cursor, arqr arqrVar, arpe arpeVar) {
        super(arpeVar);
        this.b = cursor;
        this.c = arqrVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lpz) c((artz) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0018, code lost:
    
        if (r3.b != null) goto L16;
     */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r3.a
            if (r1 == 0) goto Le
            java.lang.Object r1 = r3.d
            artz r1 = (defpackage.artz) r1
            defpackage.aqil.P(r4)
            goto L1a
        Le:
            defpackage.aqil.P(r4)
            java.lang.Object r4 = r3.d
            r1 = r4
            artz r1 = (defpackage.artz) r1
            android.database.Cursor r4 = r3.b
            if (r4 == 0) goto L36
        L1a:
            android.database.Cursor r4 = r3.b
            boolean r4 = r4.moveToNext()
            if (r4 == 0) goto L36
            arqr r4 = r3.c
            android.database.Cursor r2 = r3.b
            java.lang.Object r4 = r4.a(r2)
            r3.d = r1
            r2 = 1
            r3.a = r2
            java.lang.Object r4 = r1.a(r4, r3)
            if (r4 != r0) goto L1a
            return r0
        L36:
            arnb r4 = defpackage.arnb.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lpz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        lpz lpzVar = new lpz(this.b, this.c, arpeVar);
        lpzVar.d = obj;
        return lpzVar;
    }
}

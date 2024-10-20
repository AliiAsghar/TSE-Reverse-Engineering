package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class afhc extends arpw implements arqv {
    Object a;
    int b;
    final /* synthetic */ List c;
    final /* synthetic */ afhd d;
    final /* synthetic */ arqr e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afhc(List list, afhd afhdVar, arqr arqrVar, arpe arpeVar) {
        super(2, arpeVar);
        this.c = list;
        this.d = afhdVar;
        this.e = arqrVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afhc) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0036 -> B:4:0x0039). Please report as a decompilation issue!!! */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r8.b
            if (r1 == 0) goto Lc
            java.lang.Object r1 = r8.a
            defpackage.aqil.P(r9)
            goto L39
        Lc:
            defpackage.aqil.P(r9)
            java.util.List r9 = r8.c
            java.util.Iterator r9 = r9.iterator()
            r1 = r9
        L16:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L63
            java.lang.Object r9 = r1.next()
            r3 = r9
            android.net.Uri r3 = (android.net.Uri) r3
            afhd r9 = r8.d
            afgf r4 = defpackage.afgf.a
            r8.a = r1
            r2 = 1
            r8.b = r2
            afdl r2 = r9.b
            r5 = 1
            aezo r6 = defpackage.aezo.h
            r7 = r8
            java.lang.Object r9 = r2.c(r3, r4, r5, r6, r7)
            if (r9 != r0) goto L39
            return r0
        L39:
            boolean r2 = r9 instanceof defpackage.aftr
            if (r2 == 0) goto L40
            aftr r9 = (defpackage.aftr) r9
            goto L41
        L40:
            r9 = 0
        L41:
            if (r9 == 0) goto L49
            arqr r2 = r8.e
            r2.a(r9)
            goto L16
        L49:
            alvi r9 = defpackage.afhd.a
            alvw r9 = r9.h()
            java.lang.String r2 = "invokeSuspend"
            r3 = 60
            java.lang.String r4 = "com/google/android/libraries/compose/cameragallery/ui/gallery/GalleryUiAdapter$getUiData$1$1$1"
            java.lang.String r5 = "GalleryUiAdapter.kt"
            alvw r9 = r9.h(r4, r2, r3, r5)
            alvg r9 = (defpackage.alvg) r9
            java.lang.String r2 = "System content picker media was not resolved as local visual media."
            r9.q(r2)
            goto L16
        L63:
            arnb r9 = defpackage.arnb.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afhc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new afhc(this.c, this.d, this.e, arpeVar);
    }
}

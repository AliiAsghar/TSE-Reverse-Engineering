package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mm implements Comparator {
    private final /* synthetic */ int a;

    public mm(int i) {
        this.a = i;
    }

    private static final long a(xlb xlbVar) {
        xky xkyVar;
        xkx xkxVar;
        if (xlbVar == null) {
            return 0L;
        }
        if (yyb.bU(xlbVar)) {
            return 1L;
        }
        if (yyb.bV(xlbVar)) {
            if (xlbVar.c == 4) {
                xkxVar = (xkx) xlbVar.d;
            } else {
                xkxVar = xkx.a;
            }
            apct apctVar = xkxVar.c;
            if (apctVar == null) {
                apctVar = apct.a;
            }
            return apctVar.b;
        }
        if (!yyb.bW(xlbVar)) {
            return 0L;
        }
        if (xlbVar.c == 5) {
            xkyVar = (xky) xlbVar.d;
        } else {
            xkyVar = xky.a;
        }
        apct apctVar2 = xkyVar.f;
        if (apctVar2 == null) {
            apctVar2 = apct.a;
        }
        return apctVar2.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (defpackage.arro.a(r5, r6) >= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        if (r8 >= r9) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        if (r0 < r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009a, code lost:
    
        if (r8 < r9) goto L30;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ int compare(java.lang.Object r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mm.compare(java.lang.Object, java.lang.Object):int");
    }
}

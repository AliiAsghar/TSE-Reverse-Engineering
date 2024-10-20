package defpackage;

import java.util.List;

/* compiled from: PG */
@armg
/* loaded from: classes.dex */
public final class gig extends gke {
    public ghm a;
    public final List b;
    public final gie c;
    public final String d = "86254750241babac4b8d52996a675549";
    public final String e = "1cbd3130fa23b59692c061c594c16cc0";

    public gig(ghm ghmVar, gie gieVar) {
        this.b = ghmVar.d;
        this.a = ghmVar;
        this.c = gieVar;
    }

    public static final void b(gkd gkdVar) {
        gkdVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        gkdVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x005a A[EDGE_INSN: B:82:0x005a->B:66:0x005a BREAK  A[LOOP:3: B:44:0x0018->B:67:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x003f  */
    /* JADX WARN: Type inference failed for: r0v9, types: [gkd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.gke
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.gkd r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gig.a(gkd, int, int):void");
    }
}

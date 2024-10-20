package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class boe implements bsc {
    public final bsd a;
    public final arqg b;
    public final cpz c = new cpz() { // from class: boe.1
        @Override // defpackage.cpz
        public final long a(long j, long j2, int i) {
            if (((Boolean) boe.this.b.a()).booleanValue()) {
                if (cjn.c(j) == brg.a && cjn.c(j2) > brg.a) {
                    boe.this.a.d(brg.a);
                    return 0L;
                }
                bsd bsdVar = boe.this.a;
                bsdVar.d(bsdVar.b() + cjn.c(j));
                return 0L;
            }
            return 0L;
        }

        @Override // defpackage.cpz
        public final /* synthetic */ long b(long j, int i) {
            return 0L;
        }

        @Override // defpackage.cpz
        public final /* synthetic */ Object c(long j, long j2, arpe arpeVar) {
            return new drp(0L);
        }

        @Override // defpackage.cpz
        public final /* synthetic */ Object d(long j, arpe arpeVar) {
            return new drp(0L);
        }
    };

    public boe(bsd bsdVar, arqg arqgVar) {
        this.a = bsdVar;
        this.b = arqgVar;
    }

    @Override // defpackage.bsc
    public final zr a() {
        return null;
    }

    @Override // defpackage.bsc
    public final aag b() {
        return null;
    }

    @Override // defpackage.bsc
    public final bsd c() {
        return this.a;
    }

    @Override // defpackage.bsc
    public final boolean d() {
        return true;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvq extends dvk {
    public int ao;
    private int ap;
    private dvz aq;

    public dvq(dvo dvoVar) {
        super(dvoVar, 5);
    }

    @Override // defpackage.dvk, defpackage.dve, defpackage.dvl
    public final void e() {
        x();
        int i = this.ao;
        int i2 = i - 1;
        if (i != 0) {
            int i3 = 0;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 == 5) {
                                    i3 = 3;
                                }
                            } else {
                                i3 = 2;
                            }
                        }
                    }
                }
                i3 = 1;
            }
            dvz dvzVar = this.aq;
            dvzVar.a = i3;
            dvzVar.c = this.ap;
            return;
        }
        throw null;
    }

    @Override // defpackage.dve
    public final void o(int i) {
        this.ap = i;
    }

    @Override // defpackage.dve
    public final void w(Object obj) {
        this.ap = this.al.a(obj);
    }

    @Override // defpackage.dvk
    public final dwh x() {
        if (this.aq == null) {
            this.aq = new dvz();
        }
        return this.aq;
    }
}

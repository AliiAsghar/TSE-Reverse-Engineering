package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hex implements hfe {
    public final List a;

    public hex(List list) {
        this.a = list;
    }

    @Override // defpackage.hfe
    public final hcw a() {
        if (((hie) this.a.get(0)).e()) {
            return new hdg(this.a);
        }
        return new hdf(this.a);
    }

    @Override // defpackage.hfe
    public final List b() {
        return this.a;
    }

    @Override // defpackage.hfe
    public final boolean c() {
        if (this.a.size() != 1 || !((hie) this.a.get(0)).e()) {
            return false;
        }
        return true;
    }
}

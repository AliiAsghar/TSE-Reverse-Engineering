package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cuo implements cue {
    private final cun a;

    public cuo(cun cunVar) {
        this.a = cunVar;
    }

    @Override // defpackage.cue
    public final int a(ctd ctdVar, List list, int i) {
        return this.a.a(ctdVar, cyf.a(ctdVar), i);
    }

    @Override // defpackage.cue
    public final int b(ctd ctdVar, List list, int i) {
        return this.a.b(ctdVar, cyf.a(ctdVar), i);
    }

    @Override // defpackage.cue
    public final int c(ctd ctdVar, List list, int i) {
        return this.a.c(ctdVar, cyf.a(ctdVar), i);
    }

    @Override // defpackage.cue
    public final int d(ctd ctdVar, List list, int i) {
        return this.a.d(ctdVar, cyf.a(ctdVar), i);
    }

    @Override // defpackage.cue
    public final cuf e(cuh cuhVar, List list, long j) {
        return this.a.e(cuhVar, cyf.a(cuhVar), j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof cuo) && d.F(this.a, ((cuo) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ')';
    }
}

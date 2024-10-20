package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahne implements ahlx {
    private final int a;

    public ahne() {
        throw null;
    }

    @Override // defpackage.ahlx
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.ahlx
    public final boolean b() {
        int i = this.a;
        if (i == 3 || i == 1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahne)) {
            return false;
        }
        int i = this.a;
        if (i != ((ahne) obj).a) {
            z = false;
        }
        if (i != 0) {
            return z;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.a;
        a.aS(i);
        return i ^ 1000003;
    }

    public final String toString() {
        return "PrimesProfilingV2Configurations{enablement=" + ahly.a(this.a) + "}";
    }

    public ahne(int i) {
        this.a = i;
    }
}

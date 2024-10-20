package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nge implements ngi {
    public static final nge a = new nge();

    private nge() {
    }

    @Override // defpackage.ngi
    public final int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.ngi
    public final int b() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.ngi
    public final int c() {
        return 104857600;
    }

    @Override // defpackage.ngi
    public final int d() {
        return Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nge)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1315564555;
    }

    public final String toString() {
        return "DefaultRcsConfig";
    }
}

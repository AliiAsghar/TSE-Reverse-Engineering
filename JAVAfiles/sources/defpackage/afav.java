package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afav {
    private final boolean a;
    private final boolean b;

    public afav() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afav)) {
            return false;
        }
        afav afavVar = (afav) obj;
        boolean z = afavVar.a;
        boolean z2 = afavVar.b;
        return true;
    }

    public final int hashCode() {
        return 39584;
    }

    public final String toString() {
        return "Flags(addViewIdToDropdownMenu=false, showIconsForOverflowActions=false)";
    }

    public /* synthetic */ afav(byte[] bArr) {
        this.a = false;
        this.b = false;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aenu {
    private final boolean a;

    public aenu() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aenu)) {
            return false;
        }
        boolean z = ((aenu) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1237;
    }

    public final String toString() {
        return "Flags(enableFixForComposeRowHeaderTalkback=false)";
    }

    public /* synthetic */ aenu(byte[] bArr) {
        this.a = false;
    }
}

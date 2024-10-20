package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aepd {
    private final boolean a;

    public aepd() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aepd)) {
            return false;
        }
        boolean z = ((aepd) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        return "ShortcutsInputUiData(isEnabled=true)";
    }

    public /* synthetic */ aepd(byte[] bArr) {
        this.a = true;
    }
}

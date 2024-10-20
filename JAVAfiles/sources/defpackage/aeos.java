package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeos {
    private final boolean a;

    public aeos() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeos)) {
            return false;
        }
        boolean z = ((aeos) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        return "EmotiveInputUiData(isEnabled=true)";
    }

    public /* synthetic */ aeos(byte[] bArr) {
        this.a = true;
    }
}

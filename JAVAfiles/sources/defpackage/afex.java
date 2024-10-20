package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afex {
    public final boolean a;

    public afex() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof afex) && this.a == ((afex) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.v(this.a);
    }

    public final String toString() {
        return "AudioFlags(ignoreEmptyAudioOutputAfterRecording=" + this.a + ")";
    }

    public afex(boolean z) {
        this.a = z;
    }

    public /* synthetic */ afex(byte[] bArr) {
        this(false);
    }
}

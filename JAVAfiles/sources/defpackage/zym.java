package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zym {
    public final alog a;

    public zym(alog alogVar) {
        this.a = alogVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zym) && d.F(this.a, ((zym) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EncryptionUiData(actions=" + this.a + ")";
    }
}

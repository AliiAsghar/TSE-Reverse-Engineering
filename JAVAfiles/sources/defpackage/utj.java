package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class utj {
    public final String a;

    public utj(String str) {
        this.a = str;
    }

    public static final utj a(String str) {
        if (str != null) {
            return new utj(str);
        }
        return null;
    }

    public static final String b(utj utjVar) {
        if (utjVar != null) {
            return utjVar.a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof utj) && d.F(this.a, ((utj) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EncryptionId(value=" + this.a + ")";
    }
}

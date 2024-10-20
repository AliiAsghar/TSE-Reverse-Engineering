package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aiam implements Parcelable {
    public final String a;
    public final Long b;
    public final Integer c;

    public aiam() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiam) {
            aiam aiamVar = (aiam) obj;
            if (this.a.equals(aiamVar.a) && this.b.equals(aiamVar.b) && this.c.equals(aiamVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "Money{currencyCode=" + this.a + ", units=" + this.b + ", nanos=" + this.c + "}";
    }

    public aiam(String str, Long l, Integer num) {
        if (str == null) {
            throw new NullPointerException("Null currencyCode");
        }
        this.a = str;
        this.b = l;
        this.c = num;
    }
}

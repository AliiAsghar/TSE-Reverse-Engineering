package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aibh implements Parcelable {
    public final String a;
    public final String b;

    public aibh() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aibh) {
            aibh aibhVar = (aibh) obj;
            if (this.a.equals(aibhVar.a) && this.b.equals(aibhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SubDestination{id=" + this.a + ", name=" + this.b + "}";
    }

    public aibh(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
        if (str2 != null) {
            this.b = str2;
            return;
        }
        throw new NullPointerException("Null name");
    }
}

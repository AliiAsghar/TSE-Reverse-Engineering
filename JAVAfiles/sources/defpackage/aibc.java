package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aibc implements Parcelable {
    public final String a;
    public final String b;

    public aibc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aibc) {
            aibc aibcVar = (aibc) obj;
            String str = this.a;
            if (str != null ? str.equals(aibcVar.a) : aibcVar.a == null) {
                String str2 = this.b;
                String str3 = aibcVar.b;
                if (str2 != null ? str2.equals(str3) : str3 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i;
    }

    public final String toString() {
        return "PlusCode{compoundCode=" + this.a + ", globalCode=" + this.b + "}";
    }

    public aibc(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}

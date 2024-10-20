package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ucn {
    public final String a;
    public final List b;

    public ucn() {
        throw null;
    }

    public static ucn a(String str, String[] strArr) {
        List asList;
        if (strArr == null) {
            asList = Arrays.asList(new String[0]);
        } else {
            asList = Arrays.asList(strArr);
        }
        return new ucn(str, asList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ucn) {
            ucn ucnVar = (ucn) obj;
            String str = this.a;
            if (str != null ? str.equals(ucnVar.a) : ucnVar.a == null) {
                if (this.b.equals(ucnVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SqlAndArgs{sql=" + this.a + ", args=" + this.b.toString() + "}";
    }

    public ucn(String str, List list) {
        this.a = str;
        if (list == null) {
            throw new NullPointerException("Null args");
        }
        this.b = list;
    }
}

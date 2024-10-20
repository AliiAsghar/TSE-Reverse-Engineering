package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akcw {
    public final String a;
    public final int b;

    public akcw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akcw) {
            akcw akcwVar = (akcw) obj;
            if (this.a.equals(akcwVar.a) && this.b == akcwVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        int i = this.b;
        a.aS(i);
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        String str;
        int i = this.b;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "CANCEL_AND_REENQUEUE";
                } else {
                    str = "UPDATE";
                }
            } else {
                str = "KEEP";
            }
        } else {
            str = "REPLACE";
        }
        return "UniqueWorkSpec{uniquenessKey=" + this.a + ", existingWorkPolicy=" + str + "}";
    }

    public akcw(String str, int i) {
        this.a = str;
        this.b = i;
    }
}

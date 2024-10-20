package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anjt {
    public final String a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final int e;

    public anjt() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof anjt)) {
            return false;
        }
        anjt anjtVar = (anjt) obj;
        int i = this.e;
        int i2 = anjtVar.e;
        if (i != 0) {
            if (i == i2 && this.a.equals(anjtVar.a) && this.b.equals(anjtVar.b) && this.c.equals(anjtVar.c) && this.d.equals(anjtVar.d)) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.e;
        a.bm(i);
        return ((((((((i ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String str;
        int i = this.e;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "null";
                    } else {
                        str = "VERBOSE";
                    }
                } else {
                    str = "INFO";
                }
            } else {
                str = "WARNING";
            }
        } else {
            str = "ERROR";
        }
        Optional optional = this.b;
        Optional optional2 = this.c;
        Optional optional3 = this.d;
        return "LogEvent{severity=" + str + ", text=" + this.a + ", messageId=" + String.valueOf(optional) + ", throwable=" + String.valueOf(optional2) + ", contentType=" + String.valueOf(optional3) + "}";
    }

    public anjt(int i, String str, Optional optional, Optional optional2, Optional optional3) {
        this.e = i;
        this.a = str;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
    }
}

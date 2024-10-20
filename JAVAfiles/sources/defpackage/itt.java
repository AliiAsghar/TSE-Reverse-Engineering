package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class itt {
    public final rry a;
    public final boolean b;
    public final boolean c;
    public final int d;

    public itt() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof itt) {
            itt ittVar = (itt) obj;
            if (this.a.equals(ittVar.a) && this.d == ittVar.d && this.b == ittVar.b && this.c == ittVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        int i2 = this.d;
        a.aS(i2);
        int i3 = 1237;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i4 = ((((hashCode * 1000003) ^ i2) * 1000003) ^ i) * 1000003;
        if (true == this.c) {
            i3 = 1231;
        }
        return i4 ^ i3;
    }

    public final String toString() {
        String str;
        int i = this.d;
        String obj = this.a.toString();
        if (i != 1) {
            if (i != 2) {
                str = "UNKNOWN";
            } else {
                str = "ON_MESSAGE_ROW";
            }
        } else {
            str = "ON_BUBBLE_VIEW";
        }
        return "MessageTapArgs{data=" + obj + ", area=" + str + ", is1On1Conversation=" + this.b + ", isMessageOutgoingFailed=" + this.c + "}";
    }

    public itt(rry rryVar, int i, boolean z, boolean z2) {
        if (rryVar == null) {
            throw new NullPointerException("Null data");
        }
        this.a = rryVar;
        this.d = i;
        this.b = z;
        this.c = z2;
    }
}

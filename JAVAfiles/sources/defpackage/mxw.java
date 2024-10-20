package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxw {
    public final String a;
    public final int b;

    public mxw() {
        throw null;
    }

    public static atkv a() {
        atkv atkvVar = new atkv((byte[]) null);
        atkvVar.a = 1;
        return atkvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mxw)) {
            return false;
        }
        mxw mxwVar = (mxw) obj;
        int i = this.b;
        int i2 = mxwVar.b;
        if (i != 0) {
            if (i == i2 && this.a.equals(mxwVar.a)) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        a.aS(i);
        return ((i ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String str;
        switch (this.b) {
            case 1:
                str = "UNDEFINED";
                break;
            case 2:
                str = "LINK_PREVIEW";
                break;
            case 3:
                str = "ENCRYPTED";
                break;
            case 4:
                str = "UNENCRYPTED";
                break;
            case 5:
                str = "LOST_ENCRYPTION";
                break;
            case 6:
                str = "PENPAL_CONVERSATION_NOTICE";
                break;
            case 7:
                str = "THEME_CHANGE";
                break;
            case 8:
                str = "INITIAL";
                break;
            case 9:
                str = "PENPAL_PROACTIVE_MESSAGE";
                break;
            default:
                str = "null";
                break;
        }
        return "BugleTombstoneTextLineContent{type=" + str + ", text=" + this.a + "}";
    }

    public mxw(int i, String str) {
        this.b = i;
        this.a = str;
    }
}

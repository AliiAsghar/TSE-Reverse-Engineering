package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class prl {
    public final String a;
    public final String b;
    public final int c;
    private final String d;

    public prl(String str, int i, String str2, String str3) {
        this.a = str;
        this.c = i;
        this.b = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof prl)) {
            return false;
        }
        prl prlVar = (prl) obj;
        if (d.F(this.a, prlVar.a) && this.c == prlVar.c && d.F(this.b, prlVar.b) && d.F(this.d, prlVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int aV = (((hashCode2 + a.aV(this.c)) * 31) + hashCode) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return aV + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("RbmBusinessInfoDownloadParameters(botId=");
        sb.append(this.a);
        sb.append(", requestSource=");
        int i = this.c;
        if (i != 2) {
            if (i != 3) {
                if (i != 5) {
                    str = "CHATBOT_DIRECTORY";
                } else {
                    str = "INCOMING_MESSAGE_DOWNLOAD_POSTPONED";
                }
            } else {
                str = "CONVERSATION_UPDATE";
            }
        } else {
            str = "INCOMING_MESSAGE";
        }
        sb.append((Object) str);
        sb.append(", messageId=");
        sb.append(this.b);
        sb.append(", shortCode=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public prl(String str, int i) {
        this(str, i, null, null);
        str.getClass();
    }
}

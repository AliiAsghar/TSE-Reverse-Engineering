package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihf {
    public final String a;
    public final String b;

    public ihf() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ihf) {
            ihf ihfVar = (ihf) obj;
            if (this.a.equals(ihfVar.a)) {
                String str = this.b;
                String str2 = ihfVar.b;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    public final String toString() {
        return "LighterConversationTarget{conversationId=" + this.a + ", businessName=" + this.b + "}";
    }

    public ihf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}

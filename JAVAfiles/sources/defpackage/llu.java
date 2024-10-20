package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class llu implements lkf {
    public final miu a;
    public final int b;
    public final int c;
    public final lfx d;

    public llu(miu miuVar, lfx lfxVar, int i, int i2) {
        miuVar.getClass();
        this.a = miuVar;
        this.d = lfxVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llu)) {
            return false;
        }
        llu lluVar = (llu) obj;
        if (d.F(this.a, lluVar.a) && d.F(this.d, lluVar.d) && this.b == lluVar.b && this.c == lluVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.d.hashCode();
        int i = this.c;
        a.bm(i);
        return (((hashCode * 31) + this.b) * 31) + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ConversationDetails(conversationProperties=");
        sb.append(this.a);
        sb.append(", composeController=");
        sb.append(this.d);
        sb.append(", conversationSettingsLaunchSource=");
        sb.append(this.b);
        sb.append(", cdpOpeningSource=");
        if (this.c != 1) {
            str = "CONVERSATION_OVERFLOW_MENU_DETAILS";
        } else {
            str = "CONVERSATION_TOP_APPBAR_AVATAR_CLICK";
        }
        sb.append((Object) str);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ llu(miu miuVar, lfx lfxVar, int i) {
        this(miuVar, lfxVar, i, 2);
    }
}

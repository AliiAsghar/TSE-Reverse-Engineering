package defpackage;

import android.text.TextUtils;
import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aims {
    public final aiks a;
    public final String b;
    private final String c = "SIP/2.0";

    public aims(String str, aiks aiksVar) {
        this.b = str;
        this.a = aiksVar;
    }

    public final void a(StringBuffer stringBuffer) {
        String str = this.b;
        if (str != null) {
            stringBuffer.append(str);
            stringBuffer.append(" ");
        }
        stringBuffer.append(this.a.c());
        stringBuffer.append(" ");
        stringBuffer.append(this.c.concat(VCardBuilder.VCARD_END_OF_LINE));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof aims)) {
            return false;
        }
        aims aimsVar = (aims) obj;
        if (!TextUtils.equals(this.c, aimsVar.c) || !TextUtils.equals(this.b, aimsVar.b) || !this.a.equals(aimsVar.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        if (!TextUtils.isEmpty(this.b)) {
            i = this.b.hashCode();
        } else {
            i = 0;
        }
        if (!TextUtils.isEmpty(this.c)) {
            i = (i * 37) + this.c.hashCode();
        }
        return (i * 37) + this.a.hashCode();
    }
}

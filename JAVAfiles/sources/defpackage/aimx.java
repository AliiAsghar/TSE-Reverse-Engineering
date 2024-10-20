package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aimx {
    public final int a;
    public final String b;

    public aimx(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        b(stringBuffer);
        return stringBuffer.toString();
    }

    public final void b(StringBuffer stringBuffer) {
        stringBuffer.append("SIP/2.0");
        stringBuffer.append(" ");
        stringBuffer.append(this.a);
        if (this.b != null) {
            stringBuffer.append(" ");
            stringBuffer.append(this.b);
        }
        stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof aimx) || this.a != ((aimx) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a();
    }
}

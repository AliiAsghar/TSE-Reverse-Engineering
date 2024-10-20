package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aijq extends aijm {
    public static final aijq a = new aijq(0);
    public final int b;

    public aijq(int i) {
        this.b = i;
    }

    @Override // defpackage.aijm
    public final void b(StringBuilder sb) {
        sb.append("v=");
        sb.append(this.b);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof aijq) || this.b != ((aijq) obj).b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b;
    }
}

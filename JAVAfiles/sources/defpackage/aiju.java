package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiju extends aijm {
    public static final aiju a = new aiju(0, 0);
    private final long b;
    private final long c;

    public aiju(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.aijm
    public final void b(StringBuilder sb) {
        sb.append("t=");
        sb.append(this.b);
        sb.append(" ");
        sb.append(this.c);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof aiju)) {
            return false;
        }
        aiju aijuVar = (aiju) obj;
        if (this.b != aijuVar.b || this.c != aijuVar.c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((int) this.b) * 37) + ((int) this.c);
    }
}

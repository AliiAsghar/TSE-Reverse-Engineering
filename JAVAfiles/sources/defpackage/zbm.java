package defpackage;

import com.google.android.apps.messaging.startchat.chip.ChipData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zbm {
    public final ChipData a;
    public final boolean b;
    public final boolean c;

    public zbm(ChipData chipData, boolean z, boolean z2) {
        chipData.getClass();
        this.a = chipData;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbm)) {
            return false;
        }
        zbm zbmVar = (zbm) obj;
        if (d.F(this.a, zbmVar.a) && this.b == zbmVar.b && this.c == zbmVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + a.v(this.b)) * 31) + a.v(this.c);
    }

    public final String toString() {
        return "GroupChatCapability(chipData=" + this.a + ", hasRcs=" + this.b + ", hasE2ee=" + this.c + ")";
    }
}

package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzx implements jzj {
    public final aeul a;
    public final aetv b;
    public final miz c;
    public final jzv d;
    public final jzw e;
    public final String f;
    private final MessageId g;

    public jzx(aeul aeulVar, aetv aetvVar, miz mizVar, jzv jzvVar, jzw jzwVar) {
        aetvVar.getClass();
        this.a = aeulVar;
        this.b = aetvVar;
        this.c = mizVar;
        this.d = jzvVar;
        this.e = jzwVar;
        String a = mizVar.b().a();
        a.getClass();
        this.f = a;
        this.g = mizVar.b();
        lga.bI(mizVar);
    }

    public static /* synthetic */ jzx c(jzx jzxVar, aeul aeulVar, aetv aetvVar, int i) {
        if ((i & 1) != 0) {
            aeulVar = jzxVar.a;
        }
        aeul aeulVar2 = aeulVar;
        miz mizVar = jzxVar.c;
        jzv jzvVar = jzxVar.d;
        jzw jzwVar = jzxVar.e;
        aeulVar2.getClass();
        return new jzx(aeulVar2, aetvVar, mizVar, jzvVar, jzwVar);
    }

    @Override // defpackage.jzj
    public final MessageId a() {
        return this.g;
    }

    @Override // defpackage.aetq
    public final String b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzx)) {
            return false;
        }
        jzx jzxVar = (jzx) obj;
        if (d.F(this.a, jzxVar.a) && d.F(this.b, jzxVar.b) && d.F(this.c, jzxVar.c) && d.F(this.d, jzxVar.d) && d.F(this.e, jzxVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        jzv jzvVar = this.d;
        if (jzvVar == null) {
            hashCode = 0;
        } else {
            hashCode = jzvVar.hashCode();
        }
        return (((hashCode2 * 31) + hashCode) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "BugleMessageBubbleUiData(containerUiData=" + this.a + ", contentUiData=" + this.b + ", message=" + this.c + ", animateParameters=" + this.d + ", flags=" + this.e + ")";
    }

    public /* synthetic */ jzx(aeul aeulVar, aetv aetvVar, miz mizVar) {
        this(aeulVar, aetvVar, mizVar, null, new jzw(null));
    }
}

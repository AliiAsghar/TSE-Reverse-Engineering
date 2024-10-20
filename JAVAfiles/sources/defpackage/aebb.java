package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aebb extends adcx {
    public final aote a;
    public final byte[] b;
    public final aozb c;
    public final boolean d;
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aebb(aote aoteVar, byte[] bArr) {
        super(null, null);
        aoteVar.getClass();
        this.a = aoteVar;
        this.b = bArr;
        this.c = null;
        this.d = true;
        this.e = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aebb)) {
            return false;
        }
        aebb aebbVar = (aebb) obj;
        if (!d.F(this.a, aebbVar.a) || !d.F(this.b, aebbVar.b)) {
            return false;
        }
        aozb aozbVar = aebbVar.c;
        if (!d.F(null, null)) {
            return false;
        }
        boolean z = aebbVar.d;
        String str = aebbVar.e;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        byte[] bArr = this.b;
        if (bArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(bArr);
        }
        return (((hashCode2 + hashCode) * 961) + a.v(true)) * 31;
    }
}

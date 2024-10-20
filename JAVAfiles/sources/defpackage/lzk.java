package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lzk {
    public final String a;
    public final int b;
    public final Supplier c;

    public lzk() {
        throw null;
    }

    public static abzv a() {
        abzv abzvVar = new abzv();
        abzvVar.b = new lct(20);
        return abzvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lzk) {
            lzk lzkVar = (lzk) obj;
            if (this.a.equals(lzkVar.a) && this.b == lzkVar.b && d$$ExternalSyntheticApiModelOutline0.m(this.c, lzkVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ d$$ExternalSyntheticApiModelOutline0.m(this.c);
    }

    public final String toString() {
        return "SettingsSearchEntry{className=" + this.a + ", xmlResId=" + this.b + ", enabled=" + String.valueOf(this.c) + "}";
    }

    public lzk(String str, int i, Supplier supplier) {
        this.a = str;
        this.b = i;
        this.c = supplier;
    }
}

package defpackage;

import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adtb {
    public String b;
    public adyb d;
    public adyt e;
    public List f;
    public final armf g;
    public final armf h;
    public final armf i;
    public String a = aikx.a();
    public long c = System.currentTimeMillis();

    public adtb(armf armfVar, armf armfVar2, armf armfVar3) {
        this.g = armfVar;
        this.h = armfVar2;
        this.i = armfVar3;
    }

    public final adyb a() {
        if (this.d == null) {
            this.d = (adyb) this.i.b();
        }
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adtb)) {
            return false;
        }
        adtb adtbVar = (adtb) obj;
        if (!Objects.equals(this.b, adtbVar.b) || !Objects.equals(this.d, adtbVar.a())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        String str = this.b;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        adyb adybVar = this.d;
        if (adybVar != null) {
            i2 = adybVar.hashCode();
        }
        return (i * 31) + i2;
    }
}

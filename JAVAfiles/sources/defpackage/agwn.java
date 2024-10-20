package defpackage;

import j$.util.Collection;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agwn extends agwv {
    static final int a = 2992509;
    public static final /* synthetic */ int g = 0;
    final int b;
    final int c;
    final String d;
    final alog e;
    final boolean f;

    public agwn(int i, int i2, String str, alog alogVar, boolean z) {
        super(c(a, i, i2));
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = alogVar;
        this.f = z;
    }

    @Override // defpackage.agwv
    public final int a() {
        return a;
    }

    public final boolean b(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        if (!this.d.contentEquals(charSequence) && !Collection.EL.stream(this.e).anyMatch(new agol(charSequence, 4))) {
            return false;
        }
        return true;
    }

    @Override // defpackage.agwv
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agwn)) {
            return false;
        }
        agwn agwnVar = (agwn) obj;
        if (super.equals(obj) && this.b == agwnVar.b && this.c == agwnVar.c && this.d.equals(agwnVar.d) && alzz.at(this.e, agwnVar.e) && this.f == agwnVar.f) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agwv
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, Integer.valueOf(this.e.hashCode()), Boolean.valueOf(this.f)});
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.g("id", this.h);
        aj.f("categoryIndex", this.b);
        aj.f("idInCategory", this.c);
        aj.b("primary", this.d);
        aj.b("secondaries", this.e);
        aj.h("useStickyVariant", this.f);
        return aj.toString();
    }
}

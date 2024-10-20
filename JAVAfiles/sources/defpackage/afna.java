package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afna extends afnb {
    private final aflp a;

    public afna(aflp aflpVar) {
        this.a = aflpVar;
    }

    @Override // defpackage.afnb
    public final aflp a() {
        return this.a;
    }

    public final aflv b(aflr aflrVar) {
        String a;
        afnd afndVar = afne.a;
        StringBuilder sb = afne.a.get();
        sb.append(((aflo) this.a).a);
        afnc afncVar = aflrVar.h;
        if (afncVar != null && (a = afncVar.a()) != null) {
            sb.append(a);
        }
        return new aflv(sb.toString(), this.a, aflrVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof afna) && d.F(this.a, ((afna) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.afnb
    public final Set f() {
        arml armlVar = aflr.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet(afwv.S().size());
        for (aflr aflrVar : afwv.S()) {
            aflrVar.getClass();
            linkedHashSet.add(b(aflrVar));
        }
        return linkedHashSet;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SkinToneSet(base=" + this.a + ")";
    }
}

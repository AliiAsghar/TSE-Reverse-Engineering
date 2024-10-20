package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afmv extends afmx {
    private final afln a;
    private final Set b;

    public afmv(afln aflnVar) {
        this.a = aflnVar;
        this.b = aflnVar.b;
    }

    @Override // defpackage.afnb
    public final /* synthetic */ aflp a() {
        return this.a;
    }

    @Override // defpackage.afmx
    public final aflu b(aflq aflqVar, aflr aflrVar) {
        aflqVar.getClass();
        aflrVar.getClass();
        afnd afndVar = afne.a;
        StringBuilder sb = afne.a.get();
        sb.append(aflqVar.f.a());
        afnc afncVar = aflrVar.h;
        if (afncVar != null) {
            sb.append(afncVar.a());
        }
        sb.append(aflw.c.a());
        sb.append(this.a.a);
        sb.append(aflw.d.a());
        return new aflu(sb.toString(), this.a, aflqVar, aflrVar);
    }

    @Override // defpackage.afmx
    public final Set c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof afmv) && d.F(this.a, ((afmv) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WithPersonComposedBase(base=" + this.a + ")";
    }
}

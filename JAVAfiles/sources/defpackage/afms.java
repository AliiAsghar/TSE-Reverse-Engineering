package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afms extends afmu {
    private final afln b;
    private final aflq c;
    private final aflq d;
    private final Set e;

    public afms(afln aflnVar, aflq aflqVar, aflq aflqVar2, Set set) {
        aflqVar.getClass();
        aflqVar2.getClass();
        this.b = aflnVar;
        this.c = aflqVar;
        this.d = aflqVar2;
        this.e = set;
    }

    @Override // defpackage.afnb
    public final /* synthetic */ aflp a() {
        return this.b;
    }

    @Override // defpackage.afmu
    public final aflq b() {
        return this.c;
    }

    @Override // defpackage.afmu
    public final aflq c() {
        return this.d;
    }

    @Override // defpackage.afmu
    public final afls d(aflr aflrVar, aflr aflrVar2) {
        afnd afndVar = afne.a;
        StringBuilder sb = afne.a.get();
        afmu.h(aflrVar, aflrVar2, this.c, this.d, sb);
        return new afls(sb.toString(), this.b, aflrVar, aflrVar2);
    }

    @Override // defpackage.afmu
    public final Set e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afms)) {
            return false;
        }
        afms afmsVar = (afms) obj;
        if (d.F(this.b, afmsVar.b) && this.c == afmsVar.c && this.d == afmsVar.d && d.F(this.e, afmsVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "WithPersonComposedBase(base=" + this.b + ", gender1=" + this.c + ", gender2=" + this.d + ", supportedSkinTones=" + this.e + ")";
    }
}

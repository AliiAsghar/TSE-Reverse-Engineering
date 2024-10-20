package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afmt extends afmu {
    private final aflo b;
    private final aflq c;
    private final aflq d;
    private final Set e;

    public afmt(aflo afloVar, aflq aflqVar, aflq aflqVar2, Set set) {
        aflqVar.getClass();
        aflqVar2.getClass();
        this.b = afloVar;
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
        aflq aflqVar;
        aflq aflqVar2;
        afnd afndVar = afne.a;
        StringBuilder sb = afne.a.get();
        if (g()) {
            aflqVar = aflq.c;
        } else {
            aflqVar = this.c;
        }
        if (g()) {
            aflqVar2 = aflq.d;
        } else {
            aflqVar2 = this.d;
        }
        if (aflrVar == aflrVar2) {
            sb.append((String) afmu.a.get(new armo(aflqVar, aflqVar2)));
            afnc afncVar = aflrVar.h;
            if (afncVar != null) {
                sb.append(afncVar.a());
            }
        } else {
            h(aflrVar, aflrVar2, aflqVar, aflqVar2, sb);
        }
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
        if (!(obj instanceof afmt)) {
            return false;
        }
        afmt afmtVar = (afmt) obj;
        if (d.F(this.b, afmtVar.b) && this.c == afmtVar.c && this.d == afmtVar.d && d.F(this.e, afmtVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "WithPlainBase(base=" + this.b + ", gender1=" + this.c + ", gender2=" + this.d + ", supportedSkinTones=" + this.e + ")";
    }
}

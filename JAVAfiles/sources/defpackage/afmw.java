package defpackage;

import java.util.EnumSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afmw extends afmx {
    private final aflo a;
    private final EnumSet b;

    public afmw(aflo afloVar) {
        this.a = afloVar;
        arml armlVar = aflq.a;
        this.b = afwv.T();
    }

    @Override // defpackage.afnb
    public final /* synthetic */ aflp a() {
        return this.a;
    }

    @Override // defpackage.afmx
    public final aflu b(aflq aflqVar, aflr aflrVar) {
        CharSequence sb;
        aflqVar.getClass();
        aflrVar.getClass();
        if (aflrVar.h == null && aflqVar.e == null) {
            sb = this.a.a;
        } else {
            StringBuilder sb2 = new StringBuilder(this.a.a);
            afnc afncVar = aflrVar.h;
            if (afncVar != null) {
                sb2.append(afncVar.a());
            }
            afnc afncVar2 = aflqVar.e;
            if (afncVar2 != null) {
                sb2.append(aflw.c.a());
                sb2.append(afncVar2.a());
                sb2.append(aflw.d.a());
            }
            sb = sb2.toString();
        }
        return new aflu(sb, this.a, aflqVar, aflrVar);
    }

    @Override // defpackage.afmx
    public final /* synthetic */ Set c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof afmw) && d.F(this.a, ((afmw) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WithPlainBase(base=" + this.a + ")";
    }
}

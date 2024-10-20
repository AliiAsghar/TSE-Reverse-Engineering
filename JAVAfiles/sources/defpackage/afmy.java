package defpackage;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afmy extends afnb {
    public final EnumSet a;
    private final aflo b;

    public afmy() {
        throw null;
    }

    @Override // defpackage.afnb
    public final /* synthetic */ aflp a() {
        return this.b;
    }

    public final aflt b(aflq aflqVar) {
        aflqVar.getClass();
        afnd afndVar = afne.a;
        StringBuilder sb = afne.a.get();
        sb.append(this.b.a);
        afnc afncVar = aflqVar.e;
        if (afncVar != null) {
            sb.append(aflw.c.a());
            sb.append(afncVar.a());
            sb.append(aflw.d.a());
        }
        return new aflt(sb.toString(), this.b, aflqVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof afmy) && d.F(this.b, ((afmy) obj).b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.afnb
    public final Set f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.a.size());
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(b((aflq) it.next()));
        }
        return linkedHashSet;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "WithPlainBase(base=" + this.b + ")";
    }

    public afmy(aflo afloVar) {
        this.b = afloVar;
        arml armlVar = aflq.a;
        this.a = afwv.T();
    }
}

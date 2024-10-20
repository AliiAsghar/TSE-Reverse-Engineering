package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aijr extends aijm {
    public aijl e;
    public aijs g;
    public aijf h;
    public aije i;
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public aijq d = aijq.a;
    public aijt f = aijt.a;

    public final void a(aiji aijiVar) {
        this.c.add(aijiVar);
    }

    @Override // defpackage.aijm
    public final void b(StringBuilder sb) {
        this.d.b(sb);
        aijl aijlVar = this.e;
        if (aijlVar != null) {
            aijlVar.b(sb);
        }
        this.f.b(sb);
        aijs aijsVar = this.g;
        if (aijsVar != null) {
            aijsVar.b(sb);
        }
        aijf aijfVar = this.h;
        if (aijfVar != null) {
            aijfVar.b(sb);
        }
        aije aijeVar = this.i;
        if (aijeVar != null) {
            aijeVar.b(sb);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((aiju) it.next()).b(sb);
        }
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            ((aijg) it2.next()).b(sb);
        }
        Iterator it3 = this.c.iterator();
        while (it3.hasNext()) {
            ((aiji) it3.next()).b(sb);
        }
    }

    public final void c(aiju aijuVar) {
        this.a.add(aijuVar);
    }

    public final boolean d() {
        if (this.h != null) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof aijr)) {
            return false;
        }
        aijr aijrVar = (aijr) obj;
        if (!this.d.equals(aijrVar.d) || !this.f.equals(aijrVar.f)) {
            return false;
        }
        aijl aijlVar = this.e;
        if (aijlVar == null && aijrVar.e != null) {
            return false;
        }
        if (aijlVar != null && !aijlVar.equals(aijrVar.e)) {
            return false;
        }
        aijs aijsVar = this.g;
        if (aijsVar == null && aijrVar.g != null) {
            return false;
        }
        if (aijsVar != null && !aijsVar.equals(aijrVar.g)) {
            return false;
        }
        aijf aijfVar = this.h;
        if (aijfVar == null && aijrVar.h != null) {
            return false;
        }
        if (aijfVar != null && !aijfVar.equals(aijrVar.h)) {
            return false;
        }
        aije aijeVar = this.i;
        if (aijeVar == null && aijrVar.i != null) {
            return false;
        }
        if ((aijeVar != null && !aijeVar.equals(aijrVar.i)) || !this.b.equals(aijrVar.b) || !this.a.equals(aijrVar.a) || !this.c.equals(aijrVar.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (((((((this.b.hashCode() * 37) + this.c.hashCode()) * 37) + this.a.hashCode()) * 37) + this.f.hashCode()) * 37) + this.d.b;
        aije aijeVar = this.i;
        if (aijeVar != null) {
            hashCode = (hashCode * 37) + aijeVar.hashCode();
        }
        aijf aijfVar = this.h;
        if (aijfVar != null) {
            hashCode = (hashCode * 37) + aijfVar.hashCode();
        }
        aijl aijlVar = this.e;
        if (aijlVar != null) {
            hashCode = (hashCode * 37) + aijlVar.hashCode();
        }
        aijs aijsVar = this.g;
        if (aijsVar != null) {
            return (hashCode * 37) + aijsVar.hashCode();
        }
        return hashCode;
    }
}

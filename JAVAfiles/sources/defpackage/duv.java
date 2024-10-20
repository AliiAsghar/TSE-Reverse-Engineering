package defpackage;

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class duv extends duw {
    public ArrayList a;

    public duv(char[] cArr) {
        super(cArr);
        this.a = new ArrayList();
    }

    public final float a(int i) {
        duw h = h(i);
        if (h != null) {
            return h.t();
        }
        throw new dvb(a.bV(i, "no float at index "), this);
    }

    public final float b(String str) {
        duw i = i(str);
        i.getClass();
        return i.t();
    }

    public final int c(int i) {
        duw h = h(i);
        if (h != null) {
            return h.u();
        }
        throw new dvb(a.bV(i, "no int at index "), this);
    }

    public final int d() {
        return this.a.size();
    }

    public final duu e(String str) {
        duw k = k(str);
        if (k instanceof duu) {
            return (duu) k;
        }
        return null;
    }

    @Override // defpackage.duw
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof duv)) {
            return false;
        }
        return this.a.equals(((duv) obj).a);
    }

    @Override // defpackage.duw
    /* renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public duv g() {
        duv duvVar = (duv) super.g();
        ArrayList arrayList = new ArrayList(this.a.size());
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            duw g = ((duw) arrayList2.get(i)).g();
            g.d = duvVar;
            arrayList.add(g);
        }
        duvVar.a = arrayList;
        return duvVar;
    }

    public final duw h(int i) {
        if (i >= 0 && i < this.a.size()) {
            return (duw) this.a.get(i);
        }
        throw new dvb(a.bV(i, "no element at index "), this);
    }

    @Override // defpackage.duw
    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(super.hashCode()));
    }

    public final duw i(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            dux duxVar = (dux) ((duw) arrayList.get(i));
            i++;
            if (duxVar.v().equals(str)) {
                return duxVar.A();
            }
        }
        throw new dvb(a.bW(str, "no element for key <", ">"), this);
    }

    public final duw j(int i) {
        if (i < this.a.size()) {
            return (duw) this.a.get(i);
        }
        return null;
    }

    public final duw k(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            dux duxVar = (dux) ((duw) arrayList.get(i));
            i++;
            if (duxVar.v().equals(str)) {
                return duxVar.A();
            }
        }
        return null;
    }

    public final dva l(String str) {
        duw k = k(str);
        if (k instanceof dva) {
            return (dva) k;
        }
        return null;
    }

    public final String m(int i) {
        duw h = h(i);
        if (h instanceof dvc) {
            return h.v();
        }
        throw new dvb(a.bV(i, "no string at index "), this);
    }

    public final String n(String str) {
        String str2;
        duw i = i(str);
        if (i instanceof dvc) {
            return i.v();
        }
        if (i != null) {
            str2 = i.w();
        } else {
            str2 = null;
        }
        throw new dvb("no string found for key <" + str + ">, found [" + str2 + "] : " + i, this);
    }

    public final String o(String str) {
        duw k = k(str);
        if (k instanceof dvc) {
            return k.v();
        }
        return null;
    }

    public final ArrayList p() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            duw duwVar = (duw) arrayList2.get(i);
            if (duwVar instanceof dux) {
                arrayList.add(((dux) duwVar).v());
            }
        }
        return arrayList;
    }

    public final void q(duw duwVar) {
        this.a.add(duwVar);
    }

    public final void r(String str, duw duwVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            dux duxVar = (dux) ((duw) arrayList.get(i));
            i++;
            if (duxVar.v().equals(str)) {
                duxVar.B(duwVar);
                return;
            }
        }
        dux duxVar2 = new dux(str.toCharArray());
        duxVar2.z();
        duxVar2.x(str.length() - 1);
        duxVar2.B(duwVar);
        this.a.add(duxVar2);
    }

    public final boolean s(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            duw duwVar = (duw) arrayList.get(i);
            if ((duwVar instanceof dux) && ((dux) duwVar).v().equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.duw
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            duw duwVar = (duw) arrayList.get(i);
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(duwVar);
        }
        return super.toString() + " = <" + ((Object) sb) + " >";
    }
}

package defpackage;

import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aila extends aiku implements Cloneable, Iterable {
    public final Vector a = new Vector();
    public String b = ";";

    public aila() {
    }

    public final aikz a(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.US);
            for (int i = 0; i < this.a.size(); i++) {
                aikz aikzVar = (aikz) this.a.elementAt(i);
                aikzVar.a();
                if (aikzVar.a().toLowerCase(Locale.US).equals(lowerCase)) {
                    return aikzVar;
                }
            }
            return null;
        }
        throw new NullPointerException("null arg!");
    }

    public final Object b(String str) {
        aikz a = a(str);
        if (a != null) {
            return a.e;
        }
        return null;
    }

    @Override // defpackage.aiku
    public final String c() {
        if (this.a.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.a.size(); i++) {
            Object elementAt = this.a.elementAt(i);
            if (elementAt instanceof aiku) {
                sb.append(((aiku) elementAt).c());
            } else {
                sb.append(elementAt.toString());
            }
            if (i >= this.a.size() - 1) {
                break;
            }
            sb.append(this.b);
        }
        return sb.toString();
    }

    @Override // defpackage.aiku
    public final Object clone() {
        aila ailaVar = new aila();
        ailaVar.b = this.b;
        for (int i = 0; i < this.a.size(); i++) {
            ailaVar.e((aikz) ((aikz) this.a.elementAt(i)).clone());
        }
        return ailaVar;
    }

    public final String d(String str) {
        Object b = b(str);
        if (b == null) {
            return null;
        }
        if (b instanceof aiku) {
            return ((aiku) b).c();
        }
        return b.toString();
    }

    public final void e(aikz aikzVar) {
        this.a.addElement(aikzVar);
    }

    public final boolean equals(Object obj) {
        aikz a;
        if (!(obj instanceof aila)) {
            return false;
        }
        aila ailaVar = (aila) obj;
        if (this.a.size() != ailaVar.a.size()) {
            return false;
        }
        for (int i = 0; i < this.a.size(); i++) {
            aikz aikzVar = (aikz) this.a.elementAt(i);
            String str = aikzVar.d;
            if (str == null) {
                a = null;
            } else {
                a = ailaVar.a(str);
            }
            if (a == null || !a.equals(aikzVar)) {
                return false;
            }
        }
        return true;
    }

    public final void f(String str, Object obj) {
        e(new aikz(str, obj));
    }

    public final void g(aikz aikzVar) {
        String str = aikzVar.d;
        if (str != null) {
            i(str);
        }
        e(aikzVar);
    }

    public final boolean h() {
        if (this.a.size() == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 187654;
    }

    public final void i(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        int i = 0;
        while (i < this.a.size()) {
            aikz aikzVar = (aikz) this.a.elementAt(i);
            aikzVar.a();
            if (aikzVar.a().toLowerCase(Locale.US).equals(lowerCase)) {
                break;
            } else {
                i++;
            }
        }
        if (i < this.a.size()) {
            this.a.removeElementAt(i);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<aikz> iterator() {
        return this.a.iterator();
    }

    public final String toString() {
        return c();
    }

    public aila(byte[] bArr) {
    }
}

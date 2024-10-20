package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class atmu implements Serializable {
    private static final long serialVersionUID = -3270249290171239695L;
    private List a;
    private short b;
    private short c;

    public atmu() {
        this.a = new ArrayList(1);
        this.b = (short) 0;
        this.c = (short) 0;
    }

    private final synchronized Iterator a(boolean z, boolean z2) {
        int i;
        int i2;
        int size = this.a.size();
        if (z) {
            i = size - this.b;
        } else {
            i = this.b;
        }
        if (i == 0) {
            return Collections.EMPTY_LIST.iterator();
        }
        if (z) {
            if (!z2) {
                i2 = 0;
            } else {
                i2 = this.c;
                if (i2 >= i) {
                    i2 = 0;
                }
                this.c = (short) (i2 + 1);
            }
        } else {
            i2 = size - this.b;
        }
        ArrayList arrayList = new ArrayList(i);
        if (z) {
            arrayList.addAll(this.a.subList(i2, i));
            if (i2 != 0) {
                arrayList.addAll(this.a.subList(0, i2));
            }
        } else {
            arrayList.addAll(this.a.subList(i2, size));
        }
        return arrayList.iterator();
    }

    private final void b(atmx atmxVar) {
        if (!(atmxVar instanceof atmt)) {
            if (this.b == 0) {
                this.a.add(atmxVar);
                return;
            } else {
                List list = this.a;
                list.add(list.size() - this.b, atmxVar);
                return;
            }
        }
        this.a.add(atmxVar);
        this.b = (short) (this.b + 1);
    }

    private static final String j(Iterator it) {
        StringBuffer stringBuffer = new StringBuffer();
        while (it.hasNext()) {
            atmx atmxVar = (atmx) it.next();
            stringBuffer.append("[");
            stringBuffer.append(atmxVar.a());
            stringBuffer.append("]");
            if (it.hasNext()) {
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();
    }

    public final int c() {
        return h().g();
    }

    public final int d() {
        return h().h;
    }

    public final synchronized long e() {
        return h().i;
    }

    public final synchronized Iterator f() {
        return a(true, true);
    }

    public final atmk g() {
        return h().f;
    }

    public final synchronized atmx h() {
        if (this.a.size() != 0) {
        } else {
            throw new IllegalStateException("rrset is empty");
        }
        return (atmx) this.a.get(0);
    }

    public final synchronized void i(atmx atmxVar) {
        if (this.a.size() == 0) {
            b(atmxVar);
            return;
        }
        atmx h = h();
        if (atmxVar.g() == h.g() && atmxVar.h == h.h && atmxVar.f.equals(h.f)) {
            long j = atmxVar.i;
            long j2 = h.i;
            if (j != j2) {
                if (j > j2) {
                    atmxVar = atmxVar.j();
                    atmxVar.i = h.i;
                } else {
                    for (int i = 0; i < this.a.size(); i++) {
                        atmx j3 = ((atmx) this.a.get(i)).j();
                        j3.i = atmxVar.i;
                        this.a.set(i, j3);
                    }
                }
            }
            if (!this.a.contains(atmxVar)) {
                b(atmxVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("record does not match rrset");
    }

    public String toString() {
        if (this.a.size() == 0) {
            return "{empty}";
        }
        StringBuffer stringBuffer = new StringBuffer("{ ");
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(g());
        stringBuffer2.append(" ");
        stringBuffer.append(stringBuffer2.toString());
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(e());
        stringBuffer3.append(" ");
        stringBuffer.append(stringBuffer3.toString());
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append(atkp.a(d()));
        stringBuffer4.append(" ");
        stringBuffer.append(stringBuffer4.toString());
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append(atnu.a(c()));
        stringBuffer5.append(" ");
        stringBuffer.append(stringBuffer5.toString());
        stringBuffer.append(j(a(true, false)));
        if (this.b > 0) {
            stringBuffer.append(" sigs: ");
            stringBuffer.append(j(a(false, false)));
        }
        stringBuffer.append(" }");
        return stringBuffer.toString();
    }

    public atmu(atmu atmuVar) {
        synchronized (atmuVar) {
            this.a = (List) ((ArrayList) atmuVar.a).clone();
            this.b = atmuVar.b;
            this.c = atmuVar.c;
        }
    }

    public atmu(atmx atmxVar) {
        this.a = new ArrayList(1);
        this.b = (short) 0;
        this.c = (short) 0;
        b(atmxVar);
    }
}

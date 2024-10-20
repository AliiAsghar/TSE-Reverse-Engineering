package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class arwb extends arpa implements arpf {
    public static final arpb l = new arpb(arpf.k, arua.e);

    public arwb() {
        super(arpf.k);
    }

    public abstract void a(arpi arpiVar, Runnable runnable);

    @Override // defpackage.arpf
    public final arpe e(arpe arpeVar) {
        return new aset(this, arpeVar);
    }

    public boolean ey(arpi arpiVar) {
        return true;
    }

    @Override // defpackage.arpf
    public final void f(arpe arpeVar) {
        arvp arvpVar;
        aset asetVar = (aset) arpeVar;
        do {
        } while (asetVar.f.a == aseu.b);
        Object obj = asetVar.f.a;
        if (obj instanceof arvp) {
            arvpVar = (arvp) obj;
        } else {
            arvpVar = null;
        }
        if (arvpVar != null) {
            arvpVar.y();
        }
    }

    @Override // defpackage.arpa, defpackage.arpg, defpackage.arpi
    public final <E extends arpg> E get(arph<E> arphVar) {
        arphVar.getClass();
        if (arphVar instanceof arpb) {
            arpb arpbVar = (arpb) arphVar;
            if (arpbVar.b(getKey())) {
                E e = (E) arpbVar.a(this);
                if (e instanceof arpg) {
                    return e;
                }
                return null;
            }
            return null;
        }
        if (arpf.k == arphVar) {
            return this;
        }
        return null;
    }

    public void h(arpi arpiVar, Runnable runnable) {
        a(arpiVar, runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        if (defpackage.arpf.k == r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r2.a(r1) != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        return defpackage.arpj.a;
     */
    @Override // defpackage.arpa, defpackage.arpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.arpi minusKey(defpackage.arph<?> r2) {
        /*
            r1 = this;
            r2.getClass()
            boolean r0 = r2 instanceof defpackage.arpb
            if (r0 == 0) goto L1a
            arpb r2 = (defpackage.arpb) r2
            arph r0 = r1.getKey()
            boolean r0 = r2.b(r0)
            if (r0 == 0) goto L21
            arpg r2 = r2.a(r1)
            if (r2 == 0) goto L21
            goto L1e
        L1a:
            akty r0 = defpackage.arpf.k
            if (r0 != r2) goto L21
        L1e:
            arpj r2 = defpackage.arpj.a
            return r2
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arwb.minusKey(arph):arpi");
    }

    public String toString() {
        return arwi.a(this) + "@" + arwi.b(this);
    }
}

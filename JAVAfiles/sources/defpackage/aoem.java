package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoem {
    public String a = null;
    public int b;
    public aoep c;
    private final Set d;
    private final Set e;
    private int f;
    private final Set g;

    @SafeVarargs
    public aoem(aofg aofgVar, aofg... aofgVarArr) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.f = 0;
        this.b = 0;
        this.g = new HashSet();
        hashSet.add(aofgVar);
        for (aofg aofgVar2 : aofgVarArr) {
            d.aB(aofgVar2, "Null interface");
        }
        Collections.addAll(this.d, aofgVarArr);
    }

    public final aoen a() {
        boolean z;
        if (this.c != null) {
            z = true;
        } else {
            z = false;
        }
        aode.ap(z, "Missing required property: factory.");
        Set set = this.d;
        return new aoen(this.a, new HashSet(set), new HashSet(this.e), this.f, this.b, this.c, this.g);
    }

    public final void b(aoev aoevVar) {
        if (!this.d.contains(aoevVar.a)) {
            this.e.add(aoevVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public final void c() {
        boolean z;
        if (1 != (this.f ^ 1)) {
            z = false;
        } else {
            z = true;
        }
        aode.ap(z, "Instantiation type has already been set.");
        this.f = 1;
    }

    @SafeVarargs
    public aoem(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.f = 0;
        this.b = 0;
        this.g = new HashSet();
        hashSet.add(new aofg(aoff.class, cls));
        for (Class cls2 : clsArr) {
            d.aB(cls2, "Null interface");
            this.d.add(new aofg(aoff.class, cls2));
        }
    }
}

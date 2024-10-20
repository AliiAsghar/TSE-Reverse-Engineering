package defpackage;

import defpackage.agmh;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class agmh<R2 extends agmh<R2>> implements agpj {
    public final agmk a;

    public agmh(agmk agmkVar) {
        this.a = agmkVar;
    }

    public abstract agoz a();

    @Override // defpackage.agpj
    public final String ad(agpo agpoVar) {
        return this.a.a;
    }

    @Override // defpackage.agpj
    public final String ae(agpo agpoVar, List list) {
        return this.a.a;
    }

    @Override // defpackage.agpj
    public final void af(adwp adwpVar) {
        String[] split = this.a.a.split("\\.", 2);
        adwpVar.n(split[0], split[1]);
    }

    public final agmh c() {
        Object obj;
        Supplier supplier = this.a.g;
        if (supplier == null) {
            return null;
        }
        obj = supplier.get();
        return (agmh) obj;
    }

    public final String d() {
        String[] split = this.a.a.split("\\.", 2);
        if (split.length > 1) {
            return split[1];
        }
        return null;
    }

    public final String e() {
        return this.a.a.split("\\.", 2)[0];
    }

    public final boolean f() {
        return this.a.c;
    }

    public final String toString() {
        return this.a.a;
    }
}

package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyz implements ecf {
    private final hyy a;
    private final hzb b;
    private final ecf c;

    public hyz(ecf ecfVar, hyy hyyVar, hzb hzbVar) {
        this.c = ecfVar;
        this.a = hyyVar;
        this.b = hzbVar;
    }

    @Override // defpackage.ecf
    public final Object a() {
        Object a = this.c.a();
        if (a == null) {
            a = this.a.a();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new ".concat(String.valueOf(String.valueOf(a.getClass()))));
            }
        }
        if (a instanceof hza) {
            ((hza) a).f().a = false;
        }
        return a;
    }

    @Override // defpackage.ecf
    public final boolean b(Object obj) {
        if (obj instanceof hza) {
            ((hza) obj).f().a = true;
        }
        this.b.a(obj);
        return this.c.b(obj);
    }
}

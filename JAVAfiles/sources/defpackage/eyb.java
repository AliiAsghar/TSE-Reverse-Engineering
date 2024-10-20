package defpackage;

import android.content.Context;
import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyb {
    public final Context a;
    public final eqd b;
    public final eqp c;
    public final ezc d;
    public final ext e;
    public final SparseArray f;
    public exw g;
    public eyw h;

    public eyb(Context context, eqd eqdVar, eqp eqpVar, ezc ezcVar, ext extVar, boolean z) {
        this.a = context;
        this.b = eqdVar;
        this.c = eqpVar;
        this.d = ezcVar;
        this.e = extVar;
        SparseArray sparseArray = new SparseArray();
        this.f = sparseArray;
        eya eyaVar = new eya(new exm(eqpVar, ezcVar, z));
        sparseArray.put(1, eyaVar);
        sparseArray.put(4, eyaVar);
        sparseArray.put(2, new eya(new ewv(eqpVar, ezcVar)));
        sparseArray.put(3, new eya(new eyv(eqpVar, ezcVar)));
    }

    public final eyw a() {
        eyw eywVar = this.h;
        dzg.h(eywVar);
        return eywVar;
    }

    public final boolean b() {
        if (this.h != null) {
            return true;
        }
        return false;
    }
}

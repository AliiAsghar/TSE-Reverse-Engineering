package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import defpackage.apxm;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aklx implements apxq {
    private volatile Object a;
    private final Object b = new Object();
    private final View c;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public final class a extends apxm.a {
        public a(Context context, cg cgVar) {
            super(context, cgVar);
        }

        public a(LayoutInflater layoutInflater, cg cgVar) {
            super(layoutInflater, cgVar);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface b {
        grn r();
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface c {
        kse d();
    }

    public aklx(View view) {
        this.c = view;
    }

    private final Context a(Class cls) {
        boolean z;
        Context b2 = b(this.c.getContext(), cls);
        if (b2 != b(b2.getApplicationContext(), apxq.class)) {
            z = true;
        } else {
            z = false;
        }
        albo.X(z, "%s, Sting view cannot be created using the application context. Use a Sting Fragment or Activity context.", this.c.getClass());
        return b2;
    }

    private static Context b(Context context, Class cls) {
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    @Override // defpackage.apxq
    public final Object aS() {
        Object kqvVar;
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    Context a2 = a(apxm.a.class);
                    if (a2 instanceof a) {
                        grn r = ((b) ((apxq) ((apxm.a) a2).a()).aS()).r();
                        r.e = this.c;
                        apzj.f(r.e, View.class);
                        Object obj = r.c;
                        Object obj2 = r.b;
                        kqh kqhVar = (kqh) r.d;
                        kqvVar = new kqr((krv) obj, (kqp) obj2, kqhVar, (kql) r.a, (View) r.e);
                    } else if (a2 instanceof apxm.a) {
                        albo.X(true, "%s, Account views may only attach to account fragments.", this.c.getClass());
                        kse d = ((c) ((apxq) ((apxm.a) a2).a()).aS()).d();
                        d.b = this.c;
                        apzj.f(d.b, View.class);
                        kqvVar = new kqv(d.a, d.c, d.d, d.b);
                    } else {
                        Context a3 = a(apxq.class);
                        albo.Z(!(a3 instanceof apxq), "%s, @WithFragmentBindings Sting view must be attached to an @Sting Fragment. Was attached to context: %s", this.c.getClass(), a3.getClass().getName());
                        throw new IllegalStateException(String.format("%s, Sting view must be attached to an @Sting Fragment or Activity. Was attached to context: %s", this.c.getClass(), a3.getClass().getName()));
                    }
                    this.a = kqvVar;
                }
            }
        }
        return this.a;
    }
}

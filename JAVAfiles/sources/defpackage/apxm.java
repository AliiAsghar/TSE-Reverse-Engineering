package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apxm implements apxq {
    private volatile Object a;
    private final Object b = new Object();
    private final View c;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface b {
        ktk P();
    }

    public apxm(View view) {
        this.c = view;
    }

    @Override // defpackage.apxq
    public final Object aS() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    Context context = this.c.getContext();
                    while ((context instanceof ContextWrapper) && !apxq.class.isInstance(context)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    Application p = aowt.p(context.getApplicationContext());
                    Object obj = context;
                    if (context == p) {
                        apzj.g(false, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", this.c.getClass());
                        obj = null;
                    }
                    if (obj instanceof apxq) {
                        ktk P = ((b) aovp.m((apxq) obj, b.class)).P();
                        P.c = this.c;
                        apzj.f(P.c, View.class);
                        this.a = new kqs((krv) P.b, (kqj) P.a);
                    } else {
                        throw new IllegalStateException(String.format("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", this.c.getClass()));
                    }
                }
            }
        }
        return this.a;
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class a extends ContextWrapper {
        public cg a;
        public LayoutInflater b;
        public LayoutInflater c;
        private final enk d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, cg cgVar) {
            super(context);
            apzj.h(context);
            rb rbVar = new rb(this, 7, null);
            this.d = rbVar;
            this.b = null;
            this.a = cgVar;
            cgVar.N().c(rbVar);
        }

        public final cg a() {
            d.aB(this.a, "The fragment has already been destroyed.");
            return this.a;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Object getSystemService(String str) {
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            if (this.c == null) {
                if (this.b == null) {
                    this.b = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.c = this.b.cloneInContext(this);
            }
            return this.c;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(android.view.LayoutInflater r4, defpackage.cg r5) {
            /*
                r3 = this;
                defpackage.apzj.h(r4)
                android.content.Context r0 = r4.getContext()
                defpackage.apzj.h(r0)
                r3.<init>(r0)
                rb r0 = new rb
                r1 = 7
                r2 = 0
                r0.<init>(r3, r1, r2)
                r3.d = r0
                r3.b = r4
                r3.a = r5
                enh r4 = r5.N()
                r4.c(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: apxm.a.<init>(android.view.LayoutInflater, cg):void");
        }
    }
}

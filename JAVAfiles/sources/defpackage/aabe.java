package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.ui.conversation.compose.PlainTextEditText;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabe {
    static final uuf a = uuh.o(174653768);
    public final abdc b;
    public boolean c = false;
    public boolean d = false;
    public int e = 1;
    public final aabp f;
    public final Context g;
    public final Runnable h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final lex l;

    public aabe(Context context, aabp aabpVar, lex lexVar, abdc abdcVar) {
        xyl.l(aabpVar);
        this.f = aabpVar;
        this.b = abdcVar;
        this.h = new zom(this, 19, null);
        this.i = false;
        this.j = false;
        this.k = false;
        this.g = context;
        this.l = lexVar;
    }

    public final void a(boolean z) {
        PlainTextEditText v = ((zrb) this.f.b).v();
        if (v == null) {
            return;
        }
        aabp aabpVar = this.f;
        aabpVar.l.removeCallbacks(this.h);
        this.f.l();
        if (z && (this.j || this.k)) {
            this.l.x(48);
            if (this.j) {
                this.f.q();
            }
            if (!((Boolean) utw.g.e()).booleanValue() ? this.k : !(!this.k || this.f.n)) {
                this.f.p(-1, false);
                this.f.B(true);
            }
        } else if (!this.f.v()) {
            this.l.x(16);
        }
        this.b.i(v.getContext(), v);
        this.k = false;
        this.j = false;
    }

    public final void b() {
        PlainTextEditText v;
        boolean z = false;
        this.k = false;
        this.j = false;
        this.e = 1;
        aacb aacbVar = this.f.b;
        if (aacbVar != null && (v = ((zrb) aacbVar).v()) != null) {
            v.requestFocus();
            boolean z2 = this.b.b;
            if (!this.d && !z2 && !this.f.m) {
                z = true;
            }
            this.l.x(48);
            this.f.l.removeCallbacks(this.h);
            this.f.l();
            this.f.p(-1, z);
            if (z2) {
                this.b.i(v.getContext(), v);
            }
            this.f.B(true);
            if (!z) {
                aacbVar.S();
            }
        }
    }

    public final void c() {
        this.l.x(48);
    }
}

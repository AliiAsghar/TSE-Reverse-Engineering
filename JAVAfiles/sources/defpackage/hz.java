package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hz implements iv {
    protected final Context a;
    public Context b;
    public ij c;
    public final LayoutInflater d;
    public iu e;
    public ix f;

    public hz(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
    }

    public View a(im imVar, View view, ViewGroup viewGroup) {
        throw null;
    }

    @Override // defpackage.iv
    public void b(Context context, ij ijVar) {
        throw null;
    }

    @Override // defpackage.iv
    public void c(ij ijVar, boolean z) {
        throw null;
    }

    @Override // defpackage.iv
    public final void d(iu iuVar) {
        throw null;
    }

    @Override // defpackage.iv
    public boolean e() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [ij] */
    @Override // defpackage.iv
    public boolean f(jc jcVar) {
        iu iuVar = this.e;
        jc jcVar2 = jcVar;
        if (iuVar != null) {
            if (jcVar == null) {
                jcVar2 = this.c;
            }
            return iuVar.b(jcVar2);
        }
        return false;
    }

    @Override // defpackage.iv
    public final boolean g(im imVar) {
        return false;
    }

    @Override // defpackage.iv
    public final boolean h(im imVar) {
        return false;
    }

    @Override // defpackage.iv
    public void i() {
        throw null;
    }
}

package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class akle extends cg implements akrw {
    protected final akqf a = new akqf(this);

    @Override // defpackage.cg
    public final void W(Bundle bundle) {
        aksa c = this.a.c();
        try {
            super.W(bundle);
            armd.i(c, null);
        } finally {
        }
    }

    @Override // defpackage.cg
    public final void X(int i, int i2, Intent intent) {
        aksa f = this.a.f();
        try {
            super.X(i, i2, intent);
            armd.i(f, null);
        } finally {
        }
    }

    @Override // defpackage.cg
    public final boolean aC(MenuItem menuItem) {
        armd.i(this.a.j(), null);
        return false;
    }

    @Override // defpackage.cg
    public final void aH(int i, int i2) {
        armd.i(this.a.h(i, i2), null);
    }

    public aktr aW() {
        throw null;
    }

    public void aY(aktr aktrVar, boolean z) {
        throw null;
    }

    public void aZ(aktr aktrVar) {
        throw null;
    }

    @Override // defpackage.cg
    public final void aa() {
        aksa b = this.a.b();
        try {
            super.aa();
            armd.i(b, null);
        } finally {
        }
    }

    @Override // defpackage.cg
    public final void ad() {
        aksa c = this.a.c();
        try {
            super.ad();
            armd.i(c, null);
        } finally {
        }
    }

    @Override // defpackage.cg
    public final void af() {
        aksa b = this.a.b();
        try {
            super.af();
            armd.i(b, null);
        } finally {
        }
    }

    @Override // defpackage.cg
    public final void ag(View view, Bundle bundle) {
        view.getClass();
        armd.i(this.a.c(), null);
    }

    @Override // defpackage.cg
    public void f(Context context) {
        super.f(context);
        eoz eozVar = this.E;
        if (eozVar instanceof akrw) {
            akqf akqfVar = this.a;
            if (akqfVar.a == null) {
                akqfVar.e(((akrw) eozVar).aW(), true);
            }
        }
        this.a.d();
    }

    @Override // defpackage.cg
    public final void g(Bundle bundle) {
        aksa c = this.a.c();
        try {
            super.g(bundle);
            armd.i(c, null);
        } finally {
        }
    }

    @Override // defpackage.cg
    public final void h() {
        aksa b = this.a.b();
        try {
            super.h();
            armd.i(b, null);
        } finally {
        }
    }

    @Override // defpackage.cg
    public final void j(Bundle bundle) {
        armd.i(this.a.c(), null);
    }

    @Override // defpackage.cg
    public final void k() {
        aksa c = this.a.c();
        try {
            super.k();
            armd.i(c, null);
        } finally {
        }
    }

    @Override // defpackage.cg
    public final void l() {
        aksa c = this.a.c();
        try {
            super.l();
            armd.i(c, null);
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void p() {
        super.i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        super.K(layoutInflater, viewGroup, bundle);
    }

    @Override // defpackage.cg
    public final Animator w(int i, boolean z, int i2) {
        armd.i(this.a.h(i, i2), null);
        return null;
    }
}

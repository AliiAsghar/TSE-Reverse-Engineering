package defpackage;

import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajgt implements ajhc {
    final /* synthetic */ ajhc a;
    final /* synthetic */ ajhc b;
    final /* synthetic */ ExtendedFloatingActionButton c;

    public ajgt(ExtendedFloatingActionButton extendedFloatingActionButton, ajhc ajhcVar, ajhc ajhcVar2) {
        this.a = ajhcVar;
        this.b = ajhcVar2;
        this.c = extendedFloatingActionButton;
    }

    @Override // defpackage.ajhc
    public final int a() {
        int i = this.c.v;
        if (i == -1) {
            return this.a.a();
        }
        if (i != 0 && i != -2) {
            return i;
        }
        return this.b.a();
    }

    @Override // defpackage.ajhc
    public final int b() {
        return this.c.q;
    }

    @Override // defpackage.ajhc
    public final int c() {
        return this.c.p;
    }

    @Override // defpackage.ajhc
    public final int d() {
        int i = this.c.u;
        if (i == -1) {
            return this.a.d();
        }
        if (i != 0 && i != -2) {
            return i;
        }
        return this.b.d();
    }

    @Override // defpackage.ajhc
    public final ViewGroup.LayoutParams e() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        int i = extendedFloatingActionButton.u;
        int i2 = -2;
        if (i == 0) {
            i = -2;
        }
        int i3 = extendedFloatingActionButton.v;
        if (i3 != 0) {
            i2 = i3;
        }
        return new ViewGroup.LayoutParams(i, i2);
    }
}

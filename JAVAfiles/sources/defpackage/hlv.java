package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlv {
    public final hlw a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ hlx d;

    public hlv(hlx hlxVar, hlw hlwVar) {
        boolean[] zArr;
        this.d = hlxVar;
        this.a = hlwVar;
        if (hlwVar.e) {
            zArr = null;
        } else {
            zArr = new boolean[hlxVar.d];
        }
        this.b = zArr;
    }

    public final void a() {
        this.d.a(this, false);
    }

    public final void b() {
        if (!this.c) {
            try {
                a();
            } catch (IOException unused) {
            }
        }
    }
}

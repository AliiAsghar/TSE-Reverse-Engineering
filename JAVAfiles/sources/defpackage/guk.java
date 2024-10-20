package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class guk implements gui {
    private final gui a;
    private final Object b = new Object();

    public guk(gui guiVar) {
        this.a = guiVar;
    }

    @Override // defpackage.gui
    public final List a(String str) {
        List a;
        str.getClass();
        synchronized (this.b) {
            a = this.a.a(str);
        }
        return a;
    }

    @Override // defpackage.gui
    public final boolean b(gyg gygVar) {
        boolean b;
        synchronized (this.b) {
            b = this.a.b(gygVar);
        }
        return b;
    }

    @Override // defpackage.gui
    public final hgi c(gyg gygVar) {
        hgi c;
        synchronized (this.b) {
            c = this.a.c(gygVar);
        }
        return c;
    }

    @Override // defpackage.gui
    public final hgi d(gyg gygVar) {
        hgi d;
        synchronized (this.b) {
            d = this.a.d(gygVar);
        }
        return d;
    }

    @Override // defpackage.gui
    public final /* synthetic */ hgi e(gys gysVar) {
        return gvf.aG(this, gysVar);
    }
}

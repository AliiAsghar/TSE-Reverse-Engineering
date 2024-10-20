package defpackage;

import android.view.ActionMode;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbs implements dec {
    public ActionMode a;
    private final View b;
    private final dfp c = new dfp(new AnonymousClass1(), 62);
    private ded d = ded.b;

    /* compiled from: PG */
    /* renamed from: dbs$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<arnb> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            dbs.this.a = null;
            return arnb.a;
        }
    }

    public dbs(View view) {
        this.b = view;
    }

    @Override // defpackage.dec
    public final ded a() {
        return this.d;
    }

    @Override // defpackage.dec
    public final void b() {
        this.d = ded.b;
        ActionMode actionMode = this.a;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.a = null;
    }

    @Override // defpackage.dec
    public final void c(cjp cjpVar, arqg arqgVar, arqg arqgVar2, arqg arqgVar3, arqg arqgVar4) {
        dfp dfpVar = this.c;
        dfpVar.b = cjpVar;
        dfpVar.c = arqgVar;
        dfpVar.e = arqgVar3;
        dfpVar.d = arqgVar2;
        dfpVar.f = arqgVar4;
        ActionMode actionMode = this.a;
        if (actionMode == null) {
            this.d = ded.a;
            this.a = this.b.startActionMode(new dfn(this.c), 1);
        } else {
            actionMode.invalidate();
        }
    }
}

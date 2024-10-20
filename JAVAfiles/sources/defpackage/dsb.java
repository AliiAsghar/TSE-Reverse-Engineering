package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsb extends arrp implements arqg<cxn> {
    final /* synthetic */ Context a;
    final /* synthetic */ arqr b;
    final /* synthetic */ bwr c;
    final /* synthetic */ cee d;
    final /* synthetic */ int e;
    final /* synthetic */ View f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsb(Context context, arqr arqrVar, bwr bwrVar, cee ceeVar, int i, View view) {
        super(0);
        this.a = context;
        this.b = arqrVar;
        this.c = bwrVar;
        this.d = ceeVar;
        this.e = i;
        this.f = view;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        KeyEvent.Callback callback = this.f;
        callback.getClass();
        arqr arqrVar = this.b;
        Context context = this.a;
        czb czbVar = (czb) callback;
        return new dsn(context, this.c, (View) arqrVar.a(context), new cqa(), this.d, this.e, czbVar).v;
    }
}

package defpackage;

import android.view.inputmethod.BaseInputConnection;

/* compiled from: PG */
/* loaded from: classes.dex */
final class doo extends arrp implements arqg<BaseInputConnection> {
    final /* synthetic */ don a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doo(don donVar) {
        super(0);
        this.a = donVar;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        return new BaseInputConnection(this.a.a, false);
    }
}

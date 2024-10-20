package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jn extends ml {
    final /* synthetic */ jo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn(jo joVar, View view) {
        super(view);
        this.a = joVar;
    }

    @Override // defpackage.ml
    public final iz a() {
        jp jpVar = this.a.a.i;
        if (jpVar == null) {
            return null;
        }
        return jpVar.a();
    }

    @Override // defpackage.ml
    public final boolean b() {
        this.a.a.n();
        return true;
    }

    @Override // defpackage.ml
    public final boolean c() {
        jq jqVar = this.a.a;
        if (jqVar.k != null) {
            return false;
        }
        jqVar.l();
        return true;
    }
}

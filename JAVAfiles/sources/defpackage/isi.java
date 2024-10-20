package defpackage;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class isi implements arqg {
    final /* synthetic */ itb a;

    public isi(itb itbVar) {
        this.a = itbVar;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        cg cgVar = this.a.f;
        if (cgVar == null) {
            return -1;
        }
        Context x = cgVar.x();
        x.getClass();
        return Integer.valueOf(x.getResources().getConfiguration().orientation);
    }
}

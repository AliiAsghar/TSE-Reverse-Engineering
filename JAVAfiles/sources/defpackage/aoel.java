package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aoel implements aoep {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aoel(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.aoep
    public final Object a(aoeo aoeoVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return new aogo((Context) aoeoVar.e(Context.class), ((aodi) aoeoVar.e(aodi.class)).f(), aode.l(aoeoVar, aogp.class), aoeoVar.b(aojm.class), (Executor) aoeoVar.d((aofg) this.a));
            }
            return this.a;
        }
        return this.a;
    }
}

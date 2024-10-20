package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ajan implements ajab {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ajan(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ajab
    public final void a(agrk agrkVar) {
        if (this.b != 0) {
            Object obj = this.a;
            ajbm d = ((aizv) obj).d();
            if (d == null) {
                Log.w("SurveyMultiSelectFrag", "Activity was null, finishing or destroyed while attempting to navigate to the next page. Likely the user rotated the device before the Runnable executed.");
                return;
            }
            if (!agrkVar.s()) {
                d.r(false);
                return;
            }
            aizy aizyVar = (aizy) obj;
            aizyVar.e = agrkVar;
            aizyVar.d.a();
            d.q(aizyVar.aN(), (cg) obj);
            return;
        }
        boolean s = agrkVar.s();
        Object obj2 = this.a;
        if (!s) {
            ((ajap) obj2).f(false);
            return;
        }
        ajap ajapVar = (ajap) obj2;
        ajapVar.o = agrkVar;
        ajapVar.g.a();
        ajapVar.f(true);
    }
}

package defpackage;

import android.util.Log;
import com.google.android.libraries.hats20.SurveyPromptActivity;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agrc implements agsd {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ agre d;

    public agrc(agre agreVar, String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = agreVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agsd
    public final void a(int i) {
        agre agreVar = this.d;
        agreVar.j = Integer.toString(i);
        agreVar.i.b();
        aozy createBuilder = aors.a.createBuilder();
        agre agreVar2 = this.d;
        if (agreVar2.i.e()) {
            long a = agreVar2.i.a();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aors aorsVar = (aors) createBuilder.b;
            aorsVar.b |= 2;
            aorsVar.e = a;
            boolean d = agreVar2.i.d();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aors aorsVar2 = (aors) createBuilder.b;
            aorsVar2.b |= 1;
            aorsVar2.c = d;
            String str = agreVar2.j;
            if (str != null) {
                createBuilder.aX(str);
                Log.d("HatsLibSurveyActivity", "Selected response: ".concat(String.valueOf(agreVar2.j)));
            }
        }
        aors aorsVar3 = (aors) createBuilder.s();
        if (aorsVar3 != null) {
            agreVar2.d.d(0, aorsVar3, (aocl) agreVar2.f.b.get(0));
            List list = agreVar2.d.b;
            if (agri.b(0, aorsVar3.e)) {
                aozy builder = aorsVar3.toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                aors.a((aors) builder.b);
                aorsVar3 = (aors) builder.s();
            }
            list.add(aorsVar3);
        }
        agre agreVar3 = this.d;
        SurveyPromptActivity.D(agreVar3.a.a(), this.a, agreVar3.e, agreVar3.f, agreVar3.d, Integer.valueOf(this.b), agreVar3.g, agreVar3.h, this.c);
        this.d.k = true;
        this.d.a.dismissAllowingStateLoss();
    }
}

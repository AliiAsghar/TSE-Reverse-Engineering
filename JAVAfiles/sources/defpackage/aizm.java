package defpackage;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aizm extends ClickableSpan {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    public aizm(Context context, String str, String str2) {
        this.a = context;
        this.b = str;
        this.c = str2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        asgf asgfVar = new asgf();
        String str = this.b;
        if (str == null) {
            str = "https://www.google.com/policies/terms/";
        }
        ahnz.Q(this.a, str);
        ahnz ahnzVar = aizp.c;
        if (!aizp.c(aqpe.b(aizp.b))) {
            return;
        }
        aizq a = aizq.a();
        aozy createBuilder = appi.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((appi) createBuilder.b).b = a.ap(2);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        String str2 = this.c;
        Context context = this.a;
        ((appi) createBuilder.b).c = a.aj(5);
        a.d((appi) createBuilder.s(), asgfVar.b(), asgfVar.a(), context, str2);
    }
}

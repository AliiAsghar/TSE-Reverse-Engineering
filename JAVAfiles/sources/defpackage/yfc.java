package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yfc {
    final /* synthetic */ yet a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ aoij d;

    public yfc(aoij aoijVar, yet yetVar, View view, Drawable drawable) {
        this.a = yetVar;
        this.b = view;
        this.c = drawable;
        this.d = aoijVar;
    }

    public final void a(aiyt aiytVar) {
        if (((Boolean) ((utz) yfd.b.get()).e()).booleanValue()) {
            maq maqVar = (maq) ((yfd) this.d.a).c.b();
            amfq amfqVar = (amfq) amfr.a.createBuilder();
            aozy createBuilder = amlb.a.createBuilder();
            aozy createBuilder2 = amkz.a.createBuilder();
            String str = aiytVar.a;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            String ag = albo.ag(str);
            amkz amkzVar = (amkz) createBuilder2.b;
            amkzVar.b |= 1;
            amkzVar.c = ag;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amlb amlbVar = (amlb) createBuilder.b;
            amkz amkzVar2 = (amkz) createBuilder2.s();
            amkzVar2.getClass();
            amlbVar.f = amkzVar2;
            amlbVar.b |= 8;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar = (amfr) amfqVar.b;
            amlb amlbVar2 = (amlb) createBuilder.s();
            amlbVar2.getClass();
            amfrVar.aE = amlbVar2;
            amfrVar.e |= 262144;
            amfp amfpVar = amfp.BUGLE_HATS_NEXT_CLIENT_EVENT;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar2 = (amfr) amfqVar.b;
            amfrVar2.i = amfpVar.dg;
            amfrVar2.b |= 1;
            maqVar.j(amfqVar);
        }
        this.b.setBackground(this.c);
    }

    public final void b(aiyt aiytVar) {
        if (((Boolean) ((utz) yfd.b.get()).e()).booleanValue()) {
            maq maqVar = (maq) ((yfd) this.d.a).c.b();
            amfq amfqVar = (amfq) amfr.a.createBuilder();
            aozy createBuilder = amlb.a.createBuilder();
            aozy createBuilder2 = amla.a.createBuilder();
            String str = aiytVar.a;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            String ag = albo.ag(str);
            amla amlaVar = (amla) createBuilder2.b;
            amlaVar.b |= 1;
            amlaVar.c = ag;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amlb amlbVar = (amlb) createBuilder.b;
            amla amlaVar2 = (amla) createBuilder2.s();
            amlaVar2.getClass();
            amlbVar.e = amlaVar2;
            amlbVar.b |= 4;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar = (amfr) amfqVar.b;
            amlb amlbVar2 = (amlb) createBuilder.s();
            amlbVar2.getClass();
            amfrVar.aE = amlbVar2;
            amfrVar.e |= 262144;
            amfp amfpVar = amfp.BUGLE_HATS_NEXT_CLIENT_EVENT;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar2 = (amfr) amfqVar.b;
            amfrVar2.i = amfpVar.dg;
            amfrVar2.b |= 1;
            maqVar.j(amfqVar);
        }
        aajb aajbVar = (aajb) this.a;
        aajbVar.e = true;
        long epochMilli = aajbVar.c.f().toEpochMilli();
        ykw ykwVar = (ykw) aajbVar.a.b();
        if (ykwVar.e("last_saw_survey_time", 0L) + TimeUnit.DAYS.toMillis(1L) < epochMilli) {
            ((mbl) aajbVar.b.b()).c("Bugle.UI.HaTS.Shown");
            ykwVar.k("last_saw_survey_time", epochMilli);
        }
    }
}

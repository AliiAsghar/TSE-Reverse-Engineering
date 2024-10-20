package defpackage;

import android.graphics.Typeface;
import android.text.Spannable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpv extends arrp implements arqw<dip, Integer, Integer, arnb> {
    final /* synthetic */ Spannable a;
    final /* synthetic */ arqx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpv(Spannable spannable, arqx arqxVar) {
        super(3);
        this.a = spannable;
        this.b = arqxVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        dip dipVar = (dip) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        dli dliVar = dipVar.f;
        dlx dlxVar = dipVar.c;
        if (dlxVar == null) {
            dlxVar = dlx.e;
        }
        dls dlsVar = dipVar.d;
        if (dlsVar != null) {
            i = dlsVar.a;
        } else {
            i = 0;
        }
        dls dlsVar2 = new dls(i);
        dlt dltVar = dipVar.e;
        if (dltVar != null) {
            i2 = dltVar.a;
        } else {
            i2 = 65535;
        }
        this.a.setSpan(new dkw((Typeface) this.b.a(dliVar, dlxVar, dlsVar2, new dlt(i2))), intValue, intValue2, 33);
        return arnb.a;
    }
}

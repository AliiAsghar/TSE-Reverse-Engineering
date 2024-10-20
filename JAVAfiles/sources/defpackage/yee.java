package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yee implements alcn {
    public static final xze a = xze.g("Bugle", "TenorService");
    public static final alvi b = alvi.m("com/google/android/apps/messaging/shared/util/gif/search/tenor/TenorService");
    public static final alvz c = new alvz("status", Integer.class, false, false);
    public static final String[] d = {"gif", "mediumgif", "tinygif", "nanogif"};
    public final yea e;
    public final Context f;
    public final anen g;
    public final xyt h;
    private final anen i;

    public yee(Context context, yea yeaVar, anen anenVar, anen anenVar2, xyt xytVar) {
        this.i = anenVar;
        this.e = yeaVar;
        this.f = context;
        this.g = anenVar2;
        this.h = xytVar;
    }

    public static apzw b(yel yelVar) {
        aozy createBuilder = apzw.a.createBuilder();
        String str = yelVar.a;
        if (str != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((apzw) createBuilder.b).c = str;
        }
        aozy createBuilder2 = aqaa.a.createBuilder();
        if (yelVar.b() != null) {
            Integer b2 = yelVar.b();
            b2.getClass();
            int intValue = b2.intValue();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            ((aqaa) createBuilder2.b).b = intValue;
        }
        if (yelVar.a() != null) {
            Integer a2 = yelVar.a();
            a2.getClass();
            int intValue2 = a2.intValue();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            ((aqaa) createBuilder2.b).c = intValue2;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apzw apzwVar = (apzw) createBuilder.b;
        aqaa aqaaVar = (aqaa) createBuilder2.s();
        aqaaVar.getClass();
        apzwVar.d = aqaaVar;
        apzwVar.b |= 1;
        return (apzw) createBuilder.s();
    }

    public static String c(Locale locale) {
        return locale.getLanguage() + "_" + locale.getCountry();
    }

    @Override // defpackage.alcn
    public final ListenableFuture a(apzx apzxVar) {
        SettableFuture create = SettableFuture.create();
        albo.bR(this.e.b(yea.a, apzxVar.c, 50, c(yhx.b(this.f)), (String) ydz.b.e()), new yed(this, create), this.i);
        return create;
    }
}

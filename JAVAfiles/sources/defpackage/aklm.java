package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aklm extends ContextWrapper implements aklg {
    private static final alvi a = alvi.m("com/google/apps/tiktok/inject/peer/FragmentContextWrapper");
    private final alhr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aklm(cg cgVar, Context context) {
        super(context);
        context.getClass();
        b(context, a(cgVar));
        this.b = albo.D(new ahsz(this, 18));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Locale a(cg cgVar) {
        Locale aX;
        if ((cgVar instanceof aklk) && (aX = ((aklk) cgVar).aX()) != null) {
            return aX;
        }
        cg cgVar2 = cgVar.E;
        if (cgVar2 != null) {
            return a(cgVar2);
        }
        return null;
    }

    private static void b(Context context, Locale locale) {
        if (locale != null) {
            ((alvg) ((alvg) a.d()).h("com/google/apps/tiktok/inject/peer/FragmentContextWrapper", "maybeApplyCustomLocale", 46, "FragmentContextWrapper.java")).t("applying customLocale = %s", locale);
            Configuration configuration = new Configuration();
            configuration.locale = locale;
            Resources resources = context.getResources();
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        return this.b.get();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aklm(defpackage.cg r2, android.view.LayoutInflater r3) {
        /*
            r1 = this;
            android.content.Context r0 = r3.getContext()
            r0.getClass()
            java.util.Locale r2 = a(r2)
            b(r0, r2)
            r1.<init>(r0)
            akll r2 = new akll
            r0 = 0
            r2.<init>(r1, r3, r0)
            alhr r2 = defpackage.albo.D(r2)
            r1.b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aklm.<init>(cg, android.view.LayoutInflater):void");
    }
}

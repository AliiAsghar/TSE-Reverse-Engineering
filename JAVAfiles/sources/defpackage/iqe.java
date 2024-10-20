package defpackage;

import android.app.Activity;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iqe {
    public static final aauj a;
    public final /* synthetic */ iqj b;

    static {
        aozy createBuilder = amqj.a.createBuilder();
        createBuilder.getClass();
        akec.X(amqh.FILE, createBuilder);
        akec.Y(amqi.EXPANDED, createBuilder);
        a = new aauj(akec.W(createBuilder));
    }

    public iqe(Activity activity, gqg gqgVar, arpi arpiVar, mci mciVar, rys rysVar, ydh ydhVar, arqg arqgVar, Supplier supplier) {
        this.b = gqgVar.a(amqh.FILE, new sh(), ipf.g, new iqd(activity, arqgVar, arpiVar, mciVar, rysVar, supplier, ydhVar));
    }
}

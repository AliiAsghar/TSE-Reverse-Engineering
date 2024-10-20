package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfc implements jcu {
    private final asai a;
    private final Set b;

    public jfc(Context context, lkd lkdVar) {
        context.getClass();
        lkdVar.getClass();
        String string = context.getString(R.string.action_advanced_feedback);
        string.getClass();
        Object e = ktf.a.e();
        e.getClass();
        this.a = new aghw(new aehz(string, null, false, true, ((Boolean) e).booleanValue(), false, null, null, new ixz(lkdVar, 15), 998), 9);
        this.b = aqjn.e(khe.a);
    }

    @Override // defpackage.jcu
    public final Set a() {
        return this.b;
    }

    @Override // defpackage.jcu
    public final asai b() {
        return this.a;
    }
}

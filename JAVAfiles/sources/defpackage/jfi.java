package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfi implements jcu {
    public final armf a;
    public final armf b;
    public final asai c;
    private final Set d;

    public jfi(Context context, armf armfVar, armf armfVar2) {
        context.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.a = armfVar;
        this.b = armfVar2;
        String string = context.getString(R.string.rbm_verification_icon_content_description);
        string.getClass();
        this.c = new aghw(new aehz(string, aerb.dz, false, false, true, false, null, null, new ixz(this, 17), 996), 9);
        this.d = aqjn.e(khe.a);
    }

    @Override // defpackage.jcu
    public final Set a() {
        return this.d;
    }

    @Override // defpackage.jcu
    public final asai b() {
        return this.c;
    }
}

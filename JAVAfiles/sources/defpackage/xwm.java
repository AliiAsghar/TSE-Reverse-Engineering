package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xwm implements yjo {
    private final Context a;
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;

    public xwm(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        this.a = context;
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = armfVar5;
    }

    @Override // defpackage.yjo
    public final int a() {
        return ((yep) this.d.b()).b("bugle_min_phone_number_length_to_format", 7);
    }

    @Override // defpackage.yjo
    public final String b() {
        return ((adve) this.c.b()).e();
    }

    @Override // defpackage.yjo
    public final String c(int i) {
        String f;
        if (((Boolean) zke.a.e()).booleanValue()) {
            f = (String) ((zbl) this.f.b()).a(i).j().orElse("");
        } else {
            f = ((zxy) this.b.b()).x(i).f(this.a.getString(R.string.mms_phone_number_pref_key), null);
        }
        if (TextUtils.isEmpty(f)) {
            return null;
        }
        return f;
    }

    @Override // defpackage.yjo
    public final boolean d() {
        return ((yck) this.e.b()).t;
    }
}

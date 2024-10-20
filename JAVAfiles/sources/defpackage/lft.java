package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.multishare.MultiShareActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lft extends lfu {
    public final MultiShareActivity a;
    public final armf b;
    public final armf c;
    private final armf e;

    public lft(MultiShareActivity multiShareActivity, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        this.a = multiShareActivity;
        this.e = armfVar;
        this.b = armfVar2;
        this.c = armfVar4;
        ajyt b = ajyu.b(multiShareActivity);
        b.b(akag.class);
        b.b(akaa.class);
        Bundle extras = multiShareActivity.getIntent().getExtras();
        extras = extras == null ? new Bundle() : extras;
        hld.B(extras, jhq.b);
        ((ajxd) armfVar.b()).c(new yys(this, extras, 1));
        ((ajxd) armfVar.b()).d(b.a());
    }
}

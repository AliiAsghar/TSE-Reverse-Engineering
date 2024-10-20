package defpackage;

import com.google.android.apps.messaging.ui.appsettings.SettingsActivity;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zlg extends zlh {
    public final SettingsActivity a;
    public final lzv b;
    public final yjy c;
    private final armf e;

    public zlg(SettingsActivity settingsActivity, lzv lzvVar, yjy yjyVar, armf armfVar, armf armfVar2, armf armfVar3, Optional optional) {
        this.a = settingsActivity;
        this.b = lzvVar;
        this.c = yjyVar;
        this.e = armfVar3;
        if (kpt.a()) {
            ajxd ajxdVar = (ajxd) armfVar.b();
            ajyt b = ajyu.b(settingsActivity);
            b.b(akag.class);
            ajxdVar.c(new akaf((akag) armfVar2.b(), 0));
            b.b(akaa.class);
            ajxdVar.d(b.a());
            ajxdVar.c(a());
            return;
        }
        ajxd ajxdVar2 = (ajxd) armfVar.b();
        ajyt b2 = ajyu.b(settingsActivity);
        b2.b(ibc.class);
        ajxdVar2.c(a());
        ajxdVar2.d(b2.a());
        optional.ifPresent(new zle(9));
    }

    private final ajyk a() {
        return new zlb(this, this.e, 2);
    }
}

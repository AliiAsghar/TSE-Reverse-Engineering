package defpackage;

import android.content.Context;
import com.google.android.ims.provisioning.config.Configuration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adqh implements adpx {
    private final adqa a;
    private final acoc b;

    public adqh(adqa adqaVar, acoc acocVar) {
        this.a = adqaVar;
        this.b = acocVar;
    }

    @Override // defpackage.adpx
    public final adpw a(adew adewVar, adqg adqgVar, adwe adweVar, Configuration configuration, adrx adrxVar, Context context) {
        return new adqb(adewVar, adqgVar, this.a, adweVar, context, this.b);
    }
}

package defpackage;

import android.content.Context;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adek {
    public final Object a;
    public final Object b;
    public final Object c;
    private final Object d;
    private final Object e;

    public adek(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.d = armfVar4;
        this.e = armfVar5;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [armf, java.lang.Object] */
    public final adeb a(UpdateGroupRequest updateGroupRequest) {
        updateGroupRequest.getClass();
        return new adeb(updateGroupRequest, (Context) this.a.b(), (ajtk) this.b.b(), (aniz) this.c.b(), (armf) this.d, (anen) this.e.b(), 4);
    }

    public final boolean b() {
        boolean z;
        Configuration f = ((adnk) this.e).f(((adtn) this.d).l());
        if (f.m() && f.mConfigState == 1 && !f.mReconfigRequested) {
            z = true;
        } else {
            z = false;
        }
        advr.c("isRcsSignedUp: %b", Boolean.valueOf(z));
        return z;
    }

    public adek(Context context, adtl adtlVar, adtn adtnVar, adnk adnkVar, wwn wwnVar) {
        this.a = context;
        this.c = adtlVar;
        this.d = adtnVar;
        this.e = adnkVar;
        this.b = wwnVar;
        adwq.b(context);
    }
}

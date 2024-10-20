package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xkh {
    private static final xze b = xze.g("Bugle", "PwqForwardSyncEngineStarter");
    public final armf a;
    private final arpi c;

    public xkh(armf armfVar, arpi arpiVar) {
        armfVar.getClass();
        arpiVar.getClass();
        this.a = armfVar;
        this.c = arpiVar;
    }

    public final Object a(xlb xlbVar, amvm amvmVar, arpe arpeVar) {
        int i;
        String str;
        UUID uuid;
        aozb aozbVar;
        if (xlbVar == null && amvmVar == null) {
            b.o("PwqForwardSyncEngine started without an explicit request.");
        } else {
            xze xzeVar = b;
            if (xlbVar != null) {
                i = yyb.ca(xlbVar);
            } else {
                i = 0;
            }
            if (amvmVar != null) {
                str = amvmVar.name();
            } else {
                str = null;
            }
            if (xlbVar != null && (aozbVar = xlbVar.e) != null) {
                uuid = yyb.bY(aozbVar);
            } else {
                uuid = null;
            }
            xzeVar.o("Starting PwqForwardSyncEngine for request: \nSyncType: [" + ((Object) yyb.cb(i)) + "]\nSyncReason: [" + str + "]\nSyncId: [" + uuid + "]");
        }
        Object q = arro.q(this.c, new uxs(this, (arpe) null, 13), arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }
}

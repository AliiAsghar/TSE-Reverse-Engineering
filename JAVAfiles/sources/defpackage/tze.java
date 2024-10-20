package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tze {
    public tze(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        armfVar2.getClass();
    }

    public static final tzf a(int i) {
        if (i != 20) {
            if (i != 30) {
                if (i == 40) {
                    return tzf.d;
                }
            } else {
                return tzf.c;
            }
        } else if (oic.a()) {
            return tzf.b;
        }
        return tzf.a;
    }

    public static final tzf b(MessageCoreData messageCoreData) {
        if (messageCoreData.cI() && messageCoreData.cn()) {
            return tzf.d;
        }
        if (messageCoreData.cI()) {
            return tzf.c;
        }
        if (messageCoreData.cB() && oic.a()) {
            return tzf.b;
        }
        return tzf.a;
    }

    public static final sec c(qei qeiVar) {
        sec secVar;
        see a = seg.a();
        a.w("ConversationEncryptionStatus#getRemoteInstanceBindData");
        a.c(new tkg(qeiVar, 18));
        agmq n = a.b().n();
        try {
            sea seaVar = (sea) n;
            if (seaVar.moveToFirst()) {
                secVar = (sec) seaVar.cK();
            } else {
                secVar = null;
            }
            armd.i(n, null);
            return secVar;
        } finally {
        }
    }

    public static agmh[] d() {
        return (agmh[]) sxc.d.c;
    }
}

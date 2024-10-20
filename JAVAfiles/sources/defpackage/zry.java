package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zry {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/ui/conversation/MessageSender");
    public final armf b;
    public final armf c;
    public final mho d;
    public final xbf e;
    public final ydc f;
    public final mcr g;
    public final lzz h;
    public final anen i;
    public final armf j;
    public final Optional k;
    public final armf l;
    public final armf m;
    public final armf n;
    public final armf o;
    public final znj p;

    public zry(armf armfVar, armf armfVar2, mho mhoVar, xbf xbfVar, ydc ydcVar, mcr mcrVar, lzz lzzVar, znj znjVar, anen anenVar, armf armfVar3, Optional optional, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        this.b = armfVar;
        this.c = armfVar2;
        this.d = mhoVar;
        this.e = xbfVar;
        this.f = ydcVar;
        this.g = mcrVar;
        this.h = lzzVar;
        this.p = znjVar;
        this.i = anenVar;
        this.j = armfVar3;
        this.k = optional;
        this.l = armfVar4;
        this.m = armfVar5;
        this.n = armfVar6;
        this.o = armfVar7;
    }

    public static boolean a(MessageCoreData messageCoreData) {
        if (messageCoreData.cI() && messageCoreData.W().size() > 1) {
            return true;
        }
        return false;
    }
}

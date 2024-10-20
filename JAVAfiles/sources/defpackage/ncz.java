package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Collection;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ncz implements ncv {
    public static final alwo a = alwo.o("BugleRcs");
    public final nfx b;
    public final xyt c;
    public final anen d;
    public final anen e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final qzz i;
    public final ahmn j = new ahmn((short[]) null);
    public final uie k;
    private final anen l;
    private final ykw m;
    private final oef n;
    private final armf o;

    public ncz(uie uieVar, nfx nfxVar, xyt xytVar, anen anenVar, anen anenVar2, anen anenVar3, ykw ykwVar, qzz qzzVar, armf armfVar, armf armfVar2, armf armfVar3, oef oefVar, armf armfVar4) {
        this.k = uieVar;
        this.b = nfxVar;
        this.c = xytVar;
        this.d = anenVar;
        this.e = anenVar2;
        this.l = anenVar3;
        this.m = ykwVar;
        this.i = qzzVar;
        this.f = armfVar;
        this.g = armfVar2;
        this.h = armfVar3;
        this.n = oefVar;
        this.o = armfVar4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c5, code lost:
    
        if (defpackage.rve.a(r0).k() != true) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d9, code lost:
    
        ((defpackage.alwl) defpackage.ncz.a.m().h("com/google/android/apps/messaging/shared/api/messaging/protocol/fallback/RcsFallbackControllerImpl", "attemptClientSideFallback", 126, "RcsFallbackControllerImpl.java")).q("Message edits not allowed in fallback");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fb, code lost:
    
        return defpackage.aktp.ag(new defpackage.ncw(r9.B(), 9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d7, code lost:
    
        if (defpackage.wam.i(r9.V(), defpackage.vxt.RCS_EDIT_NAMESPACE, "Edited-Message-Id").isPresent() != false) goto L35;
     */
    @Override // defpackage.ncv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.akul a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r9, defpackage.amfd r10) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ncz.a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, amfd):akul");
    }

    @Override // defpackage.ncv
    public final akul b(MessageIdType messageIdType, amfd amfdVar) {
        return aktp.aj(new ncx(this, messageIdType, amfdVar, 0), this.l);
    }

    @Override // defpackage.ncv
    public final alog c(alog alogVar, amfd amfdVar) {
        Stream map = Collection.EL.stream(alogVar).map(new mut(this, amfdVar, 5, null));
        int i = alog.d;
        return (alog) map.collect(alls.a);
    }

    @Override // defpackage.ncv
    public final boolean d() {
        return this.m.q("auto_fallback_rcs", false);
    }
}

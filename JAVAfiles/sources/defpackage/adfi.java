package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adfi implements adfc {
    private static final alog a = alog.s(1, 0);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.adfc
    public final adey a(adey[] adeyVarArr) {
        advr.c("Selecting non-vpn ImsNetworkInterface.", new Object[0]);
        alog alogVar = a;
        int i = ((alsx) alogVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            adey adeyVar = adeyVarArr[((Integer) alogVar.get(i2)).intValue()];
            if (adeyVar != null && adeyVar.h()) {
                return adeyVar;
            }
        }
        return null;
    }
}

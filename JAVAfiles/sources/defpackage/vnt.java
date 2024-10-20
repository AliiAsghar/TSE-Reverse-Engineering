package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vnt implements ajsn {
    public final armf a;
    private final arwe b;

    public vnt(armf armfVar, arwe arweVar) {
        armfVar.getClass();
        arweVar.getClass();
        this.a = armfVar;
        this.b = arweVar;
    }

    @Override // defpackage.ajsn
    public final /* synthetic */ void a(apbt apbtVar, ajsm ajsmVar) {
        int i;
        vss vssVar;
        vsn vsnVar = (vsn) apbtVar;
        if (((Boolean) ((utz) yig.as.get()).e()).booleanValue() && !((Optional) ((apxx) this.a).a).isEmpty() && (i = vsnVar.b) == 14) {
            if (i == 14) {
                vssVar = (vss) vsnVar.c;
            } else {
                vssVar = vss.a;
            }
            String str = vssVar.b;
            str.getClass();
            if (str.length() > 0) {
                qjh.l(this.b, null, new uwn(this, str, (arpe) null, 12), 3);
            }
        }
    }
}

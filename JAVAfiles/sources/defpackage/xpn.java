package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xpn implements xps {
    public static final alwo a = alwo.o("BugleFileTransfer");
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final anen g;
    public final pyh h;

    public xpn(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, anen anenVar, pyh pyhVar) {
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = armfVar5;
        this.g = anenVar;
        this.h = pyhVar;
    }

    public static xqn a(aozb aozbVar) {
        try {
            return (xqn) apag.parseFrom(xqn.a, aozbVar, aozs.a());
        } catch (apba e) {
            throw new xpt(false, "Failed to parse file download extras.", xoc.FILE_TRANSFER_FAILURE_REASON_INVALID_MESSAGE, (Throwable) e);
        }
    }
}

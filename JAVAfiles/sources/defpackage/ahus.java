package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahus implements abnp {
    public final adef a;

    public ahus(adef adefVar) {
        this.a = adefVar;
    }

    @Override // defpackage.abnp
    public final void a(abnq abnqVar) {
        if (((abnr) abnqVar.a).e()) {
            return;
        }
        byte[] bArr = null;
        adef.l(abnqVar, new ylq(this, abnqVar, 17, bArr), new abdo(this, abnqVar, 15, bArr));
        adef.l(abnqVar, new ylq(this, abnqVar, 18, bArr), new agui(this.a, 5));
    }
}
